Public Class Form1

    Private Sub btnSalir_Click(sender As Object, e As EventArgs) Handles btnSalir.Click
        End
    End Sub

    Private Sub btnLimp_Click(sender As Object, e As EventArgs) Handles btnLimp.Click
        txtTexto.Text = Nothing
        txtNum.Text = Nothing
        txtCifrado.Text = Nothing
        rbDer.Checked = False
        rbIzq.Checked = False
    End Sub

    Private Sub btnCifrar_Click(sender As Object, e As EventArgs) Handles btnCifrar.Click
        Dim abc As Array
        Dim texto As String
        Dim pos As Integer

        abc = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"}

        texto = txtTexto.Text.ToLower
        txtCifrado.Text = Nothing

        For cont1 = 0 To (texto.Length - 1)
            If (Asc(texto.Chars(cont1)) <> 241) Then
                If (Asc(texto.Chars(cont1)) < 97 Or Asc(texto.Chars(cont1)) > 122) Then
                    txtCifrado.AppendText(texto.Chars(cont1))
                End If
            End If

            For cont2 = 0 To (abc.Length - 1)
                If (rbDer.Checked) Then
                    pos = cont2 + Val(txtNum.Text)

                    If (pos > abc.Length - 1) Then
                        pos = pos - abc.Length
                    End If

                ElseIf (rbIzq.Checked) Then
                    pos = cont2 - Val(txtNum.Text)

                    If (pos < 0) Then
                        pos = abc.Length + pos
                    End If
                End If

                If (texto.Chars(cont1).ToString.Equals(abc.GetValue(cont2).ToString)) Then
                    txtCifrado.AppendText(abc.GetValue(pos))
                End If
            Next cont2
        Next cont1
    End Sub
End Class