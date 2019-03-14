Imports System.IO

Public Class Biblioteca
    Public usuarios As New lista
    Public libros As New lista
    Public contU As Integer = 0
    Dim fichero As System.IO.StreamReader

    Private Sub Biblioteca_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        tiempo.Start()
        lbFecha.Text = DateTime.Now.ToString("dd/MM/yyyy")
        cargarUsuarios()
        cargarLibros()
        cargarPrestamos()
    End Sub

    Public Sub cargarUsuarios()
        Dim nom, ape, dni, prof, correo As String
        Dim edad As Integer
        Dim fin As Boolean = False

        Try
            fichero = My.Computer.FileSystem.OpenTextFileReader("..\..\Ficheros\socios.txt")
        Catch ex As Exception
            MsgBox(ex.Message)
        End Try

        While fin = False
            Dim existe As Boolean = False
            Dim linea As String = ""
            Dim campo As String()

            linea = fichero.ReadLine()

            If linea IsNot Nothing Then
                campo = linea.Split("#")

                nom = campo(0)
                ape = campo(1)
                dni = campo(2)
                edad = Val(campo(3))
                prof = campo(4)

                If (campo.Count > 5) Then
                    correo = campo(5)
                Else
                    correo = ""
                End If


                If (usuarios.sizeUsuarios() > 0) Then
                    Dim nodo As nodoUsu
                    nodo = usuarios.getPrimerUsuario()

                    While (nodo IsNot Nothing)
                        If (dni.Equals(nodo.getUsuario().getDni())) Then
                            MsgBox("El usuario " + nodo.getUsuario().getNombre() + " " + nodo.getUsuario().getApellidos() + " ya existe, no se añade")
                            existe = True
                        End If

                        nodo = nodo.getSig()
                    End While

                    If (existe = False) Then
                        usuarios.insertarUsuario(dni, nom, ape, prof, edad, Correo)
                    End If
                Else
                    usuarios.insertarUsuario(dni, nom, ape, prof, edad, correo)
                End If
            Else
                fin = True
                MsgBox("Usuarios cargados")
            End If
        End While
    End Sub

    Public Sub cargarLibros()
        Dim tit, aut As String
        Dim isbn, cant As Integer
        Dim fin As Boolean = False

        Try
            fichero = My.Computer.FileSystem.OpenTextFileReader("..\..\Ficheros\libros.txt")
        Catch ex As Exception
            MsgBox(ex.Message)
        End Try

        While fin = False
            Dim existe As Boolean = False
            Dim linea As String = ""
            Dim campo As String()

            linea = fichero.ReadLine()

            If linea IsNot Nothing Then
                campo = linea.Split("#")

                tit = campo(0)
                aut = campo(1)
                isbn = Val(campo(2))
                cant = Val(campo(3))

                If (libros.sizeLibros() > 0) Then
                    Dim nodo As nodoLibro
                    nodo = libros.getPrimerLibro()

                    While (nodo IsNot Nothing)
                        If (isbn = nodo.getLibro().getIsbn()) Then
                            MsgBox("El libro " + nodo.getLibro().getTitulo() + " de " + nodo.getLibro().getAutor() + " ya existe, no se añade")
                            existe = True
                        End If

                        nodo = nodo.getSig()
                    End While

                    If (existe = False) Then
                        libros.insertarLibro(tit, aut, isbn, cant)
                    End If
                Else
                    libros.insertarLibro(tit, aut, isbn, cant)
                End If
            Else
                fin = True
                MsgBox("Libros cargados")
            End If
        End While
    End Sub

    Public Sub cargarPrestamos()
        Dim tit, aut, socio As String
        Dim isbn As Integer
        Dim fecha As DateTime
        Dim fin As Boolean = False

        Try
            fichero = My.Computer.FileSystem.OpenTextFileReader("..\..\Ficheros\prestamos.txt")
        Catch ex As Exception
            MsgBox(ex.Message)
        End Try

        While fin = False
            Dim existe As Boolean = False
            Dim lleno As Boolean = True
            Dim disponible As Boolean = False
            Dim linea As String = ""
            Dim campo As String()

            linea = fichero.ReadLine()

            If linea IsNot Nothing Then
                campo = linea.Split("#")

                socio = campo(0)
                tit = campo(1)
                aut = campo(2)
                isbn = Val(campo(3))

                If (campo.Count = 5) Then
                    fecha = campo(4)
                End If

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

                            If (campo.Count = 5) Then
                                prestamo = New prestamos(tit, aut, isbn, fecha)
                            Else
                                prestamo = New prestamos(tit, aut, isbn, DateTime.Now)
                            End If

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
                Else
                    fin = True
                MsgBox("Préstamos cargados")
            End If
        End While
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
        backLibros()
        backUsuarios()
        backPrestamos()
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
        Dim escritor As StreamWriter
        Dim linea As String
        Dim aux As nodoUsu = usuarios.getPrimerUsuario()

        escritor = New StreamWriter("..\..\Ficheros\backUsu.txt", False)

        While (aux IsNot Nothing)
            linea = aux.getUsuario().getNombre() + "#" + aux.getUsuario().getApellidos() + "#" + aux.getUsuario().getDni() + "#" + aux.getUsuario().getEdad().ToString + "#" + aux.getUsuario().getProfesion() + "#" + aux.getUsuario().getCorreo() & vbCrLf
            escritor.Write(linea)
            escritor.Flush()

            aux = aux.getSig()
        End While

        escritor.Close()
        MsgBox("Usuarios guardados")
    End Sub

    Public Sub backLibros()
        Dim escritor As StreamWriter
        Dim linea As String
        Dim aux As nodoLibro = libros.getPrimerLibro()

        escritor = New StreamWriter("..\..\Ficheros\backLibros.txt", False)

        While (aux IsNot Nothing)
            linea = aux.getLibro.getTitulo() + "#" + aux.getLibro.getAutor() + "#" + aux.getLibro.getIsbn().ToString + "#" + aux.getLibro.getCantidad().ToString & vbCrLf
            escritor.Write(linea)
            escritor.Flush()

            aux = aux.getSig()
        End While

        escritor.Close()
        MsgBox("Libros guardados")
    End Sub

    Public Sub backPrestamos()
        Dim escritor As StreamWriter

        Dim encontrado As Boolean = False

        escritor = New StreamWriter("..\..\Ficheros\backPres.txt", False)

        Dim linea As String

        Dim nodoU As nodoUsu
        nodoU = usuarios.getPrimerUsuario()

        While (nodoU IsNot Nothing)
            For i As Integer = 0 To nodoU.getUsuario().getLibros().Length - 1
                If (nodoU.getUsuario().getLibros().GetValue(i) IsNot Nothing) Then
                    linea = nodoU.getUsuario().getDni() + "#" + nodoU.getUsuario().getLibros().GetValue(i).getTitulo() + "#" + nodoU.getUsuario().getLibros().GetValue(i).getAutor() + "#" + nodoU.getUsuario().getLibros().GetValue(i).getIsbn().ToString + "#" + nodoU.getUsuario().getLibros().GetValue(i).getFecha() & vbCrLf
                    escritor.Write(linea)
                    escritor.Flush()

                    If (Not nodoU.getUsuario().getCorreo() = "" And (DateTime.Now.DayOfYear - nodoU.getUsuario().getLibros().GetValue(i).getFecha().DayOfYear) >= 5) Then
                        enviarCorreo("Tiene prestado el libro " + nodoU.getUsuario().getLibros().GetValue(i).getTitulo() + " de " + nodoU.getUsuario().getLibros().GetValue(i).getAutor() + " durante 5 o mas días, por favor, pase a devolverlo a la biblioteca", "Devolver Libro", nodoU.getUsuario().getCorreo())
                    End If
                End If
            Next i

            nodoU = nodoU.getSig()
        End While

        escritor.Close()
        MsgBox("Préstamos guardados")
    End Sub
End Class
