Public Class Form1
    Private Sub btnInver_Click(sender As Object, e As EventArgs) Handles btnInver.Click
        txtTexinver.Text = StrReverse(txtTexto.Text)

    End Sub

    Private Sub btnSalir_Click(sender As Object, e As EventArgs) Handles btnSalir.Click
        End
    End Sub

    Private Sub btnLimpiar_Click(sender As Object, e As EventArgs) Handles btnLimpiar.Click
        txtTexinver.Text = Nothing
        txtTexto.Text = Nothing
    End Sub
End Class
