Public Class Form1
    Dim estudiantes(100) As usuarios
    Dim cont As Integer = 0

    Private Sub btnSalir_Click(sender As Object, e As EventArgs) Handles btnSalir.Click
        For i As Integer = 0 To cont - 1
            MsgBox("Usuario " + (i + 1).ToString + ":" + vbNewLine + "Carnet: " + estudiantes(i).getCarnet() + vbNewLine + "Contraseña: " + estudiantes(i).getContrasena() + vbNewLine + "Sede: " + estudiantes(i).getSede() + vbNewLine + vbNewLine)
        Next i
        End
    End Sub

    Private Sub btnLimpiar_Click(sender As Object, e As EventArgs) Handles btnLimpiar.Click
        txtCarnet.Text = Nothing
        txtContr.Text = Nothing
        cbSede.ResetText()
    End Sub

    Private Sub btnIngresar_Click(sender As Object, e As EventArgs) Handles btnIngresar.Click
        Dim estu As New usuarios(txtCarnet.Text, txtContr.Text, cbSede.SelectedItem.ToString)
        Dim existe As Boolean = False

        If (cont <> 0) Then
            For i As Integer = 0 To cont - 1
                If (txtCarnet.Text.Equals(estudiantes(i).getCarnet())) Then
                    MsgBox("El usuario ya existe")
                    existe = True
                End If
            Next i

            If (existe = False) Then
                estudiantes(cont) = estu
                cont = cont + 1
            End If
        Else
            estudiantes(cont) = estu
            cont = cont + 1
        End If
    End Sub
End Class
