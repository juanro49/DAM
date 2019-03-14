Public Class Form1
    Private Sub btnBuscar_Click(sender As Object, e As EventArgs) Handles btnBuscar.Click
        Dim usuario As String

        usuario = "Cédula: " + txtCedula.Text + vbNewLine + "Nombre: " + txtNombre.Text + vbNewLine + "Apellido: " + txtApellido.Text + vbNewLine + "Sexo: " + lbSexo.SelectedItem.ToString + vbNewLine + "Telefono: " + txtTel.Text + vbNewLine + "Correo: " + txtCorreo.Text + vbNewLine + "Nivel: " + cbNivel.SelectedItem.ToString

        MsgBox(usuario)
    End Sub
End Class
