Public Class Form1
    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles btnComprobar.Click
        Dim reverse, frase As String

        txtReverse.Text = StrReverse(txtFrase.Text)

        frase = txtFrase.Text.ToLower.Replace(" ", "").Replace(".", "").Replace(",", "")
        reverse = StrReverse(frase.ToLower)

        If (frase.Equals(reverse)) Then
            labPal.Text = "Es palíndromo"
        Else
            labPal.Text = "No es palíndromo"
        End If
    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles btnSalir.Click
        End
    End Sub
End Class
