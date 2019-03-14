Public Class Form1
    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        labLong.Text = txtFrase.Text.Length

        labNletra.Text = txtFrase.Text



        Dim pos, cont As Integer
        cont = 0
        For pos = 0 To txtFrase.Text.Length - 1
            If (txtFrase.Text.Chars(pos) = txtLetra.Text) Then
                cont += 1
            End If
        Next pos

        labNletra.Text = cont

        txtFrase.Text = txtFrase.Text.Replace(txtSus1.Text, txtSus2.Text)

    End Sub
End Class
