Public Class Form1
    Private Sub btnSalir_Click(sender As Object, e As EventArgs) Handles btnSalir.Click
        End
    End Sub

    Private Sub btnProcesar_Click(sender As Object, e As EventArgs) Handles btnProcesar.Click
        txtLong.Text = txtFrase.Text.Length

        txtPrimer.Text = txtFrase.Text.First

        txtUlti.Text = txtFrase.Text.Last

        If (txtFrase.Text.Length < 6) Then
            txt2a6.Text = txtFrase.Text.Substring(1)
        Else
            txt2a6.Text = txtFrase.Text.Substring(1, 5)
        End If

        If (txtFrase.Text.Contains("A")) Then
            txtPosA.Text = Val(txtFrase.Text.IndexOf("A")) + 1
        Else
            txtPosA.Text = "No hay A"
        End If

        txtMinus.Text = txtFrase.Text.ToLower

        txtMayus.Text = txtFrase.Text.ToUpper

        txt1mayus.Text = txtFrase.Text.Substring(0, 1).ToUpper + txtFrase.Text.ToLower.Substring(1)
    End Sub

    Private Sub btnLimpiar_Click(sender As Object, e As EventArgs) Handles btnLimpiar.Click
        txtFrase.Text = Nothing
        txtLong.Text = Nothing
        txtPrimer.Text = Nothing
        txtUlti.Text = Nothing
        txt2a6.Text = Nothing
        txtPosA.Text = Nothing
        txtMinus.Text = Nothing
        txtMayus.Text = Nothing
        txt1mayus.Text = Nothing
    End Sub
End Class
