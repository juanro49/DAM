Imports MySql.Data.MySqlClient

Public Class Ingresar
    Private Sub btnIngresar_Click(sender As Object, e As EventArgs) Handles btnIngresar.Click
        Dim dA As New MySqlDataAdapter
        Dim dt As New DataTable
        Dim consulta As String

        consulta = "insert into alumnos(nombre, contraseña, tipo) values ('" + txtNombre.Text + "', '" + txtCont.Text + "', '" + txtTipo.Text + "');"

        Try
            dA = New MySqlDataAdapter(consulta, Form1.conexion)
            dA.Fill(dt)

            MsgBox("Usuario dado de alta en el sistema")
        Catch ex As Exception
            MsgBox(ex.ToString)
        End Try
    End Sub
End Class