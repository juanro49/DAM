Public Class Form3
    Dim x As Integer = Form2.veces

    Private Sub TextBox1_TextChanged(sender As Object, e As EventArgs) Handles TextBox1.TextChanged
        TextBox1.Text = Val(x)
    End Sub

    Private Sub Label2_Click(sender As Object, e As EventArgs)

    End Sub
End Class