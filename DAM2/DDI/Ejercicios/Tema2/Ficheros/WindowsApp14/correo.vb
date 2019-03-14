Imports System.Net
Imports System.Net.Mail

Module Correo

    Private correo As New MailMessage
    Private server As New SmtpClient

    Sub enviarCorreo(ByVal mensaje As String, ByVal asunto As String, ByVal destinatario As String)
        Try
            Dim emisor, password As String

            emisor = "correo"
            password = "contraseña"

            correo = New MailMessage
            correo.To.Clear()
            correo.Body = ""
            correo.Subject = ""
            correo.Body = mensaje
            correo.Subject = asunto
            correo.IsBodyHtml = False
            correo.To.Add(Trim(destinatario))
            correo.From = New MailAddress(emisor)

            'Datos importantes no modificables para tener acceso a las cuentas

            server.Credentials = New NetworkCredential(emisor, password)
            server.Host = "smtp.gmail.com"
            server.Port = 587
            server.EnableSsl = True
            server.Send(correo)
            MsgBox("El mensaje fue enviado correctamente. ", MsgBoxStyle.Information, "Mensaje")

        Catch ex As Exception
            MessageBox.Show(ex.Message, "Mensajeria 1.0 vb.net ®", MessageBoxButtons.OK, MessageBoxIcon.Error)
        End Try

    End Sub


End Module

