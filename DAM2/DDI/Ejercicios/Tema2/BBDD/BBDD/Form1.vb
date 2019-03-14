Imports MySql.Data.MySqlClient

Public Class Form1
    Public conexion As New MySqlConnection

    Private Sub btnConectar_Click(sender As Object, e As EventArgs) Handles btnConectar.Click
        Dim conectado As Integer = conectar()
        Dim s As String = comprobar(txtUsu.Text, txtCont.Text)

        If (s.Equals("admin")) Then
            Me.Hide()
            Form2.Show()
        Else
            If (Not s.Equals("No")) Then
                Me.Hide()
                Form2.mIngresar.Visible = False
                Form2.mBorrar.Visible = False
                Form2.Show()
            End If
        End If
    End Sub

    Function conectar() As Integer
        If conexion.State() = 0 Then
            Try
                conexion.ConnectionString = "server = localhost; database = prueba; user id = root; password=;"
                conexion.Open()
                MsgBox("Conexión realizada con éxito")
                Return 1
            Catch ex As Exception
                MsgBox("No se ha podido realizar la conexion")
                Return 0
            End Try
        Else
            Return 1
        End If
    End Function

    Function comprobar(usuario As String, contrasena As String) As String
        Dim dataAdapter As New MySqlDataAdapter
        Dim dt As New DataTable
        Dim consulta As String

        consulta = "select tipo from alumnos where nombre = '" + usuario + "' and contraseña = '" + contrasena + "'"

        dataAdapter = New MySqlDataAdapter(consulta, conexion)
        dataAdapter.Fill(dt)

        If (dt.Rows.Count = 0) Then
            MsgBox("Usuario no dado de alta en el Sistema")
            Return "No"
        Else
            Dim s As String = Convert.ToString(dt.Rows(0)("tipo"))
            Return s
        End If
    End Function
End Class
