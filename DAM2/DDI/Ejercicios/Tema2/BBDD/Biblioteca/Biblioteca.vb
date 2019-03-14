Imports System.IO
Imports MySql.Data.MySqlClient

Public Class Biblioteca
    Public usuarios As New lista
    Public libros As New lista
    Public contU As Integer = 0
    Dim fichero As System.IO.StreamReader
    Public conexion As New MySqlConnection

    Private Sub Biblioteca_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        tiempo.Start()
        lbFecha.Text = DateTime.Now.ToString("dd/MM/yyyy")

        If (conectarBBDD() = 1) Then
            cargarUsuarios()
            cargarLibros()
            cargarPrestamos()
        Else
            End
        End If
    End Sub

    Function conectarBBDD() As Integer
        If conexion.State() = 0 Then
            Try
                conexion.ConnectionString = "server = localhost; database = biblioteca; user id = root; password=;"
                conexion.Open()
                MsgBox("Conexión realizada con éxito")
                Return 1
            Catch ex As Exception
                MsgBox("No se ha podido conectar a la base de datos, se cerrará el programa")
                Return 0
            End Try
        Else
            Return 1
        End If
    End Function

    Public Sub cargarUsuarios()
        Dim nom, ape, dni, prof, correo, consulta As String
        Dim edad As Integer
        Dim leer As MySqlDataReader

        'Con BBDD

        consulta = "select * from socios"

        Dim comando As New MySqlCommand(consulta, conexion)

        leer = comando.ExecuteReader()

        While (leer.Read())
            dni = leer.Item(0)
            nom = leer.Item(1)
            ape = leer.Item(2)
            edad = leer.Item(3)
            prof = leer.Item(4)
            correo = leer.Item(5)

            usuarios.insertarUsuario(dni, nom, ape, prof, edad, correo)
        End While

        leer.Close()
        MsgBox("Usuarios cargados")


        'Eliminar datos de usuarios añadidos en la sesión anterior
        Dim escritor As StreamWriter

        escritor = New StreamWriter("..\..\Ficheros\backUsu.txt", False)

        escritor.Write("")
        escritor.Flush()
        escritor.Close()
    End Sub

    Public Sub cargarLibros()
        Dim tit, aut, consulta As String
        Dim isbn, cant As Integer
        Dim leer As MySqlDataReader

        'Con BBDD

        consulta = "select * from libros"

        Dim comando As New MySqlCommand(consulta, conexion)

        leer = comando.ExecuteReader()

        While (leer.Read())
            tit = leer.Item(0)
            aut = leer.Item(1)
            isbn = leer.Item(2)
            cant = leer.Item(3)

            libros.insertarLibro(tit, aut, isbn, cant)
        End While

        leer.Close()
        MsgBox("Libros cargados")
    End Sub

    Public Sub cargarPrestamos()
        Dim tit, aut, socio, consulta As String
        Dim isbn As Integer
        Dim fecha As DateTime
        Dim leer As MySqlDataReader

        'Con BBDD

        consulta = "select * from prestamos"

        Dim comando As New MySqlCommand(consulta, conexion)

        leer = comando.ExecuteReader()

        While (leer.Read())
            Dim existe As Boolean = False
            Dim lleno As Boolean = True
            Dim disponible As Boolean = False

            socio = leer.Item(0)
            tit = leer.Item(1)
            aut = leer.Item(2)
            isbn = leer.Item(3)
            fecha = leer.Item(4)

            Dim nodoU As nodoUsu
            nodoU = usuarios.getPrimerUsuario()

            While (nodoU IsNot Nothing)
                If (socio.Equals(nodoU.getUsuario().getDni())) Then
                    existe = True
                    lleno = True

                    For j As Integer = 0 To nodoU.getUsuario().getLibros().Length - 1
                        If (nodoU.getUsuario().getLibros().GetValue(j) Is Nothing) Then
                            lleno = False
                        End If
                    Next j


                    Dim nodoL As nodoLibro
                    nodoL = libros.getPrimerLibro()

                    While (nodoL IsNot Nothing)
                        If (isbn = nodoL.getLibro().getIsbn() And nodoL.getLibro().getCantidad > 0 And lleno = False) Then
                            nodoL.getLibro().setCantidad(nodoL.getLibro().getCantidad() - 1)
                            disponible = True
                        End If

                        nodoL = nodoL.getSig()
                    End While

                    If (lleno) Then
                        MsgBox("Al usuario " + nodoU.getUsuario().getNombre() + " " + nodoU.getUsuario().getApellidos() + " no se le pueden asignar mas libros")
                    ElseIf (disponible) Then
                        Dim prestamo

                        prestamo = New prestamos(tit, aut, isbn, fecha)
                        nodoU.getUsuario().setLibro(prestamo)
                    Else
                        MsgBox("No hay mas existencias del libro " + tit + " de " + aut)
                    End If
                End If

                nodoU = nodoU.getSig()
            End While

            If (existe = False) Then
                MsgBox("No existe el usuario con el carnet " + socio.ToString)
            End If
        End While

        leer.Close()
        MsgBox("Préstamos cargados")

        'Eliminar datos de préstamso realizados en la sesión anterior
        Dim escritor As StreamWriter

        escritor = New StreamWriter("..\..\Ficheros\backPres.txt", False)

        escritor.Write("")
        escritor.Flush()
        escritor.Close()
    End Sub

    Private Sub Tiempo_Tick(sender As Object, e As EventArgs) Handles tiempo.Tick
        Select Case TimeOfDay.Second
            Case 0 To 29
                pbImagen.BackgroundImage = My.Resources.Biblioteca1
            Case 30 To 59
                pbImagen.BackgroundImage = My.Resources.Biblioteca2
        End Select
    End Sub

    Private Sub SalidaToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles SalidaToolStripMenuItem.Click
        backUsuarios()
        backPrestamos()
        enviarCorreos()
        End
    End Sub

    Private Sub IngresarToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles IngresarToolStripMenuItem.Click
        Ingresar.Show()
    End Sub

    Private Sub MostrarToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles MostrarToolStripMenuItem.Click
        Mostrar.Show()
    End Sub

    Private Sub PrestarToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles PrestarToolStripMenuItem.Click
        Prestar.Show()
    End Sub

    Private Sub LibrosToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles LibrosToolStripMenuItem.Click
        MostrarLibros.Show()
    End Sub

    Public Sub backUsuarios()
        Dim dA As New MySqlDataAdapter
        Dim dt As New DataTable
        Dim consulta As String
        Dim fin As Boolean = False

        Try
            fichero = My.Computer.FileSystem.OpenTextFileReader("..\..\Ficheros\backUsu.txt")
        Catch ex As Exception
            MsgBox(ex.Message)
        End Try

        While fin = False
            Dim linea As String = ""
            Dim campo As String()
            Dim nif, nom, ape, edad, prof, correo As String

            linea = fichero.ReadLine()

            If linea IsNot Nothing Then
                campo = linea.Split("#")

                nif = campo(0)
                nom = campo(1)
                ape = campo(2)
                prof = campo(3)
                edad = campo(4)
                correo = campo(5)

                consulta = "insert into socios(nif, nombre, apellido, edad, profesion, correo) values ('" + nif + "', '" + nom + "', '" + ape + "', '" + edad + "', '" + prof + "', '" + correo + "');"

                Try
                    dA = New MySqlDataAdapter(consulta, conexion)
                    dA.Fill(dt)
                Catch ex As Exception
                    MsgBox(ex.ToString)
                End Try
            Else
                fin = True
                MsgBox("Usuarios añadidos a la base de datos")
            End If
        End While
    End Sub

    Public Sub backPrestamos()
        Dim dA As New MySqlDataAdapter
        Dim dt As New DataTable
        Dim consulta As String
        Dim fin As Boolean = False

        Try
            fichero = My.Computer.FileSystem.OpenTextFileReader("..\..\Ficheros\backPres.txt")
        Catch ex As Exception
            MsgBox(ex.Message)
        End Try

        While fin = False
            Dim linea As String = ""
            Dim campo As String()
            Dim socio, titulo, autor, libro, fecha As String

            linea = fichero.ReadLine()

            If linea IsNot Nothing Then
                campo = linea.Split("#")

                fecha = campo(0)
                socio = campo(1)
                titulo = campo(2)
                autor = campo(3)
                libro = campo(4)

                If (campo(0).Equals("devolucion")) Then
                    consulta = "delete from prestamos where socio = " + socio + " and libro = " + libro
                Else
                    consulta = "insert into prestamos(socio, titulo, autor, libro, fecha) values ('" + socio + "', '" + titulo + "', '" + autor + "', '" + libro + "', '" + fecha + "');"
                End If

                Try
                    dA = New MySqlDataAdapter(consulta, conexion)
                    dA.Fill(dt)
                Catch ex As Exception
                    MsgBox(ex.ToString)
                End Try
            Else
                fin = True
                MsgBox("Préstamos actualizados en la base de datos")
            End If
        End While
    End Sub

    Private Sub enviarCorreos()
        Dim nodoU As nodoUsu
        nodoU = usuarios.getPrimerUsuario()

        While (nodoU IsNot Nothing)
            For i As Integer = 0 To nodoU.getUsuario().getLibros().Length - 1
                If (nodoU.getUsuario().getLibros().GetValue(i) IsNot Nothing) Then
                    If (Not nodoU.getUsuario().getCorreo() = "" And (DateTime.Now.DayOfYear - nodoU.getUsuario().getLibros().GetValue(i).getFecha().DayOfYear) >= 5) Then
                        enviarCorreo("Tiene prestado el libro " + nodoU.getUsuario().getLibros().GetValue(i).getTitulo() + " de " + nodoU.getUsuario().getLibros().GetValue(i).getAutor() + " durante 5 o mas días, por favor, pase a devolverlo a la biblioteca", "Devolver Libro", nodoU.getUsuario().getCorreo())
                    End If
                End If
            Next i

            nodoU = nodoU.getSig()
        End While
    End Sub
End Class
