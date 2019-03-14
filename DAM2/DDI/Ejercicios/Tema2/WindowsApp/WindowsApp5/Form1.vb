Public Class Form1
    Private Sub btnSalir_Click(sender As Object, e As EventArgs) Handles btnSalir.Click
        Me.Close()
    End Sub

    Private Sub brnNuevo_Click(sender As Object, e As EventArgs) Handles brnNuevo.Click
        txtMetros.Text = ""
        txtResul.Text = ""
    End Sub

    Private Sub brnConvertir_Click(sender As Object, e As EventArgs) Handles brnConvertir.Click
        If (rbMm.Checked) Then
            txtResul.Text = Val(txtMetros.Text) * 1000
        ElseIf (rbCm.Checked) Then
            txtResul.Text = Val(txtMetros.Text) * 100
        ElseIf (rbDm.Checked) Then
            txtResul.Text = Val(txtMetros.Text) * 10
        ElseIf (rbKm.Checked) Then
            txtResul.Text = Val(txtMetros.Text) / 1000
        End If
    End Sub

    Private Sub txtMetros_KeyPress(sender As Object, e As KeyPressEventArgs) Handles txtMetros.KeyPress
        If Char.IsNumber(e.KeyChar) Then
            e.Handled = False
        ElseIf Char.IsControl(e.KeyChar) Then
            e.Handled = False
        ElseIf Char.IsPunctuation(e.KeyChar) Then
            e.Handled = False
        Else
            e.Handled = True
        End If
    End Sub
End Class
