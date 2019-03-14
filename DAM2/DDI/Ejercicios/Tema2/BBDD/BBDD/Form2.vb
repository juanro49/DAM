Imports MySql.Data.MySqlClient

Public Class Form2
    Private Sub Form2_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        DataGridView1.Visible = False
    End Sub

    Private Sub mVer_Click(sender As Object, e As EventArgs) Handles mVer.Click
        Dim dA As New MySqlDataAdapter
        Dim dt As New DataTable
        Dim consulta As String

        consulta = "select id, nombre, tipo from alumnos"

        Try
            dA = New MySqlDataAdapter(consulta, Form1.conexion)
            dA.Fill(dt)

            If (dt.Rows.Count = 0) Then
                MsgBox("Usuario no dado de alta en el sistema")
            Else
                DataGridView1.Visible = True
                DataGridView1.DataSource = dt
            End If
        Catch ex As Exception
            MsgBox(ex.ToString)
        End Try
    End Sub

    Private Sub mIngresar_Click(sender As Object, e As EventArgs) Handles mIngresar.Click
        Ingresar.Visible = True
    End Sub

    Private Sub mBorrar_Click(sender As Object, e As EventArgs) Handles mBorrar.Click
        Borrar.Visible = True
    End Sub
End Class