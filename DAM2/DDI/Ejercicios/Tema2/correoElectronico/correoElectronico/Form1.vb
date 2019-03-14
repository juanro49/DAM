Public Class Form1

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Dim emisor As String = "xxxxxxxxxxx001@gmail.com"
        Dim contraseña As String = "XXXXXXXXX"
        enviarCorreo(emisor, contraseña, TextBox3.Text, TextBox2.Text, TextBox1.Text)
    End Sub
End Class
