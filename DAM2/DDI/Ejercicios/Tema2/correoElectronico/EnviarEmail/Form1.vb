Imports System.Net.Mail

Public Class Form1

    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load

    End Sub

    Private Sub btnEnviar_Click(sender As Object, e As EventArgs) Handles btnEnviar.Click
        Dim destinatario As String = TextBox1.Text

        btnEnviar.Enabled = False
        Dim Smtp_Server As New SmtpClient("smtp.gmail.com")
        Dim e_mail As New MailMessage
        Smtp_Server.UseDefaultCredentials = False
        Smtp_Server.Credentials = New Net.NetworkCredential("xxxxxxxxxxxxxxxx@gmail.com", "ccccccc") 'cuenta de origen y su contraseña de acceso
        Smtp_Server.Port = 587
        Smtp_Server.EnableSsl = True
        Smtp_Server.Host = "smtp.gmail.com"

        e_mail = New MailMessage
        e_mail.From = New MailAddress(destinatario)
        e_mail.To.Add(destinatario) 'correo destino
        e_mail.Subject = txtAsunto.Text
        e_mail.IsBodyHtml = False
        e_mail.Body = txtMensaje.Text
        Smtp_Server.Send(e_mail)
        MsgBox("email enviado")
        btnEnviar.Enabled = True

        txtAsunto.Text = ""
        txtMensaje.Text = ""

    End Sub

    Private Sub Label4_Click(sender As Object, e As EventArgs) Handles Label4.Click

    End Sub
End Class
