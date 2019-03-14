Public Class Form2
    Private Sub btnSalir_Click(sender As Object, e As EventArgs) Handles btnSalir.Click
        If MsgBox("¿Seguro que deseas salir?", vbQuestion + vbYesNo, "Responda") = vbYes Then
            End
        Else
            Me.Hide()
        End If
    End Sub
End Class