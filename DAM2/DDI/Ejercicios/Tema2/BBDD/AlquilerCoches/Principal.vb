Imports System.IO
Imports MySql.Data.MySqlClient

Public Class Principal
    Public usuarios As New lista
    Public coches As New lista
    Public empleados(2) As Empleado
    Public numEmp As Integer = 0

    Private Sub Principal_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        limpiarRegistro()
        cargarEmpleados()
        cargarCoches()
        cargarUsuarios()
        cargarAlquileres()
    End Sub

    Public Sub cargarEmpleados()
        Dim usu, cont, tipo, correo, consulta As String
        Dim leer As MySqlDataReader

        consulta = "select * from empleados"

        Dim comando As New MySqlCommand(consulta, Conectar.conexion)

        leer = comando.ExecuteReader()

        While (leer.Read())
            Dim add As Boolean = False

            usu = leer.Item(0)
            cont = leer.Item(1)
            tipo = leer.Item(2)
            correo = leer.Item(3)

            Dim emp As New Empleado(usu, cont, tipo, correo)

            For i As Integer = 0 To empleados.Length - 1
                If (empleados(i) Is Nothing And add = False) Then
                    empleados(i) = emp
                    numEmp += 1
                    add = True
                End If
            Next i
        End While

        leer.Close()
        MsgBox("Empleados cargados")

    End Sub

    Public Sub cargarCoches()
        Dim matri, marca, modelo, est, consulta As String
        Dim precio As Integer
        Dim leer As MySqlDataReader

        consulta = "select * from coches"

        Dim comando As New MySqlCommand(consulta, Conectar.conexion)

        leer = comando.ExecuteReader()

        While (leer.Read())
            matri = leer.Item(0)
            marca = leer.Item(1)
            modelo = leer.Item(2)
            precio = leer.Item(3)
            est = "libre"

            coches.insertarCoche(matri, marca, modelo, est, precio)
        End While

        leer.Close()
        MsgBox("Coches cargados")

    End Sub

    Public Sub cargarUsuarios()
        Dim nom, ape, dni, correo, consulta As String
        Dim tfno As Integer
        Dim leer As MySqlDataReader

        'Con BBDD

        consulta = "select * from usuarios"

        Dim comando As New MySqlCommand(consulta, Conectar.conexion)

        leer = comando.ExecuteReader()

        While (leer.Read())
            dni = leer.Item(0)
            nom = leer.Item(1)
            ape = leer.Item(2)
            tfno = leer.Item(3)
            correo = leer.Item(4)

            usuarios.insertarUsuario(dni, nom, ape, tfno, correo)
        End While

        leer.Close()
        MsgBox("Usuarios cargados")

    End Sub

    Public Sub cargarAlquileres()
        Dim usu, matri, marca, modelo, consulta As String
        Dim precio As Integer
        Dim fAlq, fDev As Date
        Dim leer As MySqlDataReader

        'Con BBDD

        consulta = "select * from alquileres"

        Dim comando As New MySqlCommand(consulta, Conectar.conexion)

        leer = comando.ExecuteReader()

        While (leer.Read())
            Dim existe As Boolean = False
            Dim lleno As Boolean = True
            Dim disponible As Boolean = False

            usu = leer.Item(0)
            matri = leer.Item(1)
            marca = leer.Item(2)
            modelo = leer.Item(3)
            fAlq = leer.Item(4)
            fDev = leer.Item(5)
            precio = leer.Item(6)

            Dim nodoU As nodoUsu
            nodoU = usuarios.getPrimerUsuario()

            While (nodoU IsNot Nothing)
                If (usu.Equals(nodoU.getUsuario().getDni())) Then
                    existe = True
                    lleno = True

                    If (nodoU.getUsuario.getCoche Is Nothing) Then
                        lleno = False
                    End If

                    Dim nodoC As nodoCoche
                    nodoC = coches.getPrimerCoche()

                    While (nodoC IsNot Nothing)
                        If (matri = nodoC.getCoche.getMatricula And nodoC.getCoche.getEstado.Equals("libre") And lleno = False) Then
                            nodoC.getCoche.setEstado("prestado")
                            disponible = True
                        End If

                        nodoC = nodoC.getSig()
                    End While

                    If (lleno) Then
                        MsgBox("El usuario " + nodoU.getUsuario().getNombre() + " " + nodoU.getUsuario().getApellido() + " ya tiene un coche prestado")
                    ElseIf (disponible) Then
                        Dim alquiler = New Alquiler(matri, marca, modelo, fAlq, fDev, precio)
                        nodoU.getUsuario().setCoche(alquiler)
                    Else
                        MsgBox("El coche " + marca + " " + modelo + " ya está alquilado")
                    End If
                End If

                nodoU = nodoU.getSig()
            End While

            If (existe = False) Then
                MsgBox("No existe el usuario con el DNI " + usu.ToString)
            End If
        End While

        leer.Close()
        MsgBox("Alquileres cargados")

    End Sub

    Private Sub MAddusu_Click(sender As Object, e As EventArgs) Handles mAddusu.Click
        AddUsu.Show()
    End Sub

    Private Sub MMostUsu_Click(sender As Object, e As EventArgs) Handles mMostUsu.Click
        MostrarUsu.Show()
    End Sub

    Private Sub Principal_FormClosing(sender As Object, e As FormClosingEventArgs) Handles MyBase.FormClosing
        End
    End Sub

    Private Sub MAddCoche_Click(sender As Object, e As EventArgs) Handles mAddCoche.Click
        AddCoche.Show()
    End Sub

    Private Sub MMostCoches_Click(sender As Object, e As EventArgs) Handles mMostCoches.Click
        MostrarCoche.Show()
    End Sub

    Private Sub MAlqCoche_Click(sender As Object, e As EventArgs) Handles mAlqCoche.Click
        AlqCoche.Show()
    End Sub

    Private Sub MDevCoche_Click(sender As Object, e As EventArgs) Handles mDevCoche.Click
        DevCoche.Show()
    End Sub

    Private Sub MMosEmp_Click(sender As Object, e As EventArgs) Handles mMosEmp.Click
        MostrarEmp.Show()
    End Sub

    Private Sub MDelUsu_Click(sender As Object, e As EventArgs) Handles mDelUsu.Click
        DelUsu.Show()
    End Sub

    Private Sub MDelCoche_Click(sender As Object, e As EventArgs) Handles mDelCoche.Click
        DelCoche.Show()
    End Sub

    Private Sub MAddEmp_Click(sender As Object, e As EventArgs) Handles mAddEmp.Click
        AddEmp.Show()
    End Sub

    Private Sub MDelEmp_Click(sender As Object, e As EventArgs) Handles mDelEmp.Click
        DelEmp.Show()
    End Sub

    Private Sub MSalir_Click(sender As Object, e As EventArgs) Handles mSalir.Click
        actualizarBBDD()
        End
    End Sub

    Private Sub actualizarBBDD()
        Dim fichero As StreamReader
        Dim dA As New MySqlDataAdapter
        Dim dt As New DataTable
        Dim consulta As String
        Dim fin As Boolean = False

        Try
            fichero = My.Computer.FileSystem.OpenTextFileReader("..\..\Ficheros\cambios.txt")
        Catch ex As Exception
            MsgBox(ex.Message)
        End Try

        While fin = False
            Dim linea As String = ""
            Dim campo As String()

            linea = fichero.ReadLine()

            If linea IsNot Nothing Then
                campo = linea.Split("#")

                Select Case campo(0)
                    Case "addEmp"
                        consulta = "insert into empleados(usuario, contrasena, tipo, correo) values ('" + campo(1) + "', '" + campo(2) + "', '" + campo(3) + "', '" + campo(4) + "');"

                        Try
                            dA = New MySqlDataAdapter(consulta, Conectar.conexion)
                            dA.Fill(dt)
                        Catch ex As Exception
                            MsgBox(ex.ToString)
                        End Try

                    Case "addCoche"
                        consulta = "insert into coches(matricula, marca, modelo, precio_dia) values ('" + campo(1) + "', '" + campo(2) + "', '" + campo(3) + "', '" + campo(4) + "');"

                        Try
                            dA = New MySqlDataAdapter(consulta, Conectar.conexion)
                            dA.Fill(dt)
                        Catch ex As Exception
                            MsgBox(ex.ToString)
                        End Try

                    Case "addUsu"
                        consulta = "insert into usuarios(dni, nombre, apellido, telefono, correo) values ('" + campo(1) + "', '" + campo(2) + "', '" + campo(3) + "', '" + campo(4) + "', '" + campo(5) + "');"

                        Try
                            dA = New MySqlDataAdapter(consulta, Conectar.conexion)
                            dA.Fill(dt)
                        Catch ex As Exception
                            MsgBox(ex.ToString)
                        End Try

                    Case "alqCoche"
                        consulta = "insert into alquileres(usuario, matricula, marca, modelo, f_alquiler, f_devolucion, precio) values ('" + campo(1) + "', '" + campo(2) + "', '" + campo(3) + "', '" + campo(4) + "', '" + campo(5) + "', '" + campo(6) + "', '" + campo(7) + "');"

                        Try
                            dA = New MySqlDataAdapter(consulta, Conectar.conexion)
                            dA.Fill(dt)
                        Catch ex As Exception
                            MsgBox(ex.ToString)
                        End Try

                    Case "delEmp"
                        consulta = "delete from empleados where usuario = '" + campo(1) + "'"

                        Try
                            dA = New MySqlDataAdapter(consulta, Conectar.conexion)
                            dA.Fill(dt)
                        Catch ex As Exception
                            MsgBox(ex.ToString)
                        End Try
                    Case "delCoche"
                        consulta = "delete from coches where matricula = '" + campo(1) + "'"

                        Try
                            dA = New MySqlDataAdapter(consulta, Conectar.conexion)
                            dA.Fill(dt)
                        Catch ex As Exception
                            MsgBox(ex.ToString)
                        End Try

                    Case "delUsu"
                        consulta = "delete from usuarios where dni = '" + campo(1) + "'"

                        Try
                            dA = New MySqlDataAdapter(consulta, Conectar.conexion)
                            dA.Fill(dt)
                        Catch ex As Exception
                            MsgBox(ex.ToString)
                        End Try

                    Case "devCoche"
                        consulta = "delete from alquileres where matricula = '" + campo(1) + "' and usuario = '" + campo(2) + "'"

                        Try
                            dA = New MySqlDataAdapter(consulta, Conectar.conexion)
                            dA.Fill(dt)
                        Catch ex As Exception
                            MsgBox(ex.ToString)
                        End Try

                    Case "modCoche"
                        consulta = "update coches set matricula = '" + campo(2) + "', marca = '" + campo(3) + "', modelo = '" + campo(4) + "', precio_dia = '" + campo(5) + "' where matricula = '" + campo(1) + "'"

                        Try
                            dA = New MySqlDataAdapter(consulta, Conectar.conexion)
                            dA.Fill(dt)
                        Catch ex As Exception
                            MsgBox(ex.ToString)
                        End Try

                    Case "modUsu"
                        consulta = "update usuarios set nombre = '" + campo(2) + "', apellido = '" + campo(3) + "', telefono = '" + campo(4) + "', correo = '" + campo(5) + "' where dni = '" + campo(1) + "'"

                        Try
                            dA = New MySqlDataAdapter(consulta, Conectar.conexion)
                            dA.Fill(dt)
                        Catch ex As Exception
                            MsgBox(ex.ToString)
                        End Try
                End Select
            Else
                fin = True
                MsgBox("Cambios añadidos a la base de datos")
            End If
        End While
    End Sub

    Private Sub limpiarRegistro()
        Dim escritor As StreamWriter

        escritor = New StreamWriter("..\..\Ficheros\cambios.txt", False)

        escritor.Write("")
        escritor.Flush()
        escritor.Close()
    End Sub

    Private Sub ModificarCocheToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles ModificarCocheToolStripMenuItem.Click
        ModCoche.Show()
    End Sub

    Private Sub ToolStripMenuItem1_Click(sender As Object, e As EventArgs) Handles ToolStripMenuItem1.Click
        ModUsu.Show()
    End Sub
End Class