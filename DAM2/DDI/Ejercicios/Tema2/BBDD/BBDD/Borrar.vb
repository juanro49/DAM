Imports MySql.Data.MySqlClient

Public Class Borrar
    Private Sub btnBorrar_Click(sender As Object, e As EventArgs) Handles btnBorrar.Click
        Dim dA As New MySqlDataAdapter
        Dim dt As New DataTable
        Dim consulta As String

        consulta = "delete from alumnos where id = '" + txtId.Text + "'"

        Try
            dA = New MySqlDataAdapter(consulta, Form1.conexion)
            dA.Fill(dt)

            MsgBox("Usuario eliminado del sistema")
        Catch ex As Exception
            MsgBox(ex.ToString)
        End Try
    End Sub
End Class