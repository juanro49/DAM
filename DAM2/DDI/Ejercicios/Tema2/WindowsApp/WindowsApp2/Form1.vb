Public Class Form1
    Private Sub btnSuma_Click(sender As Object, e As EventArgs) Handles btnSuma.Click
        txtResul.Text = Val(txtN1.Text) + Val(txtN2.Text)
    End Sub

    Private Sub btnSalir_Click(sender As Object, e As EventArgs) Handles btnSalir.Click
        If MsgBox("¿Seguro que deseas salir?", vbQuestion + vbYesNo, "Responda") = vbYes Then
            End
        Else
            txtN1.Text = ""
            txtN2.Text = ""
            txtResul.Text = ""
        End If
    End Sub
End Class
