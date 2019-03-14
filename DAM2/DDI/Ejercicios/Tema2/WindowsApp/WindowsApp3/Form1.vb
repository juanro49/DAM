Public Class Form1
    Private Sub txtNota4_KeyPress(sender As Object, e As KeyPressEventArgs) Handles txtNota4.KeyPress
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

    Private Sub txtNota3_KeyPress(sender As Object, e As KeyPressEventArgs) Handles txtNota3.KeyPress
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

    Private Sub txtNota2_KeyPress(sender As Object, e As KeyPressEventArgs) Handles txtNota2.KeyPress
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

    Private Sub txtNota1_KeyPress(sender As Object, e As KeyPressEventArgs) Handles txtNota1.KeyPress
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

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Dim mayor, menor, media As Double
        Dim b As Boolean

        b = True
        mayor = Val(txtNota1.Text)
        menor = mayor

        'If (txtNota1.Text.Contains("," Or "..") Or txtNota2.Text.Contains("," Or "..") Or txtNota3.Text.Contains("," Or "..") Or txtNota4.Text.Contains("," Or "..")) Then
        'b = False
        'End If

        If (txtNota1.Text = "" Or txtNota2.Text = "" Or txtNota3.Text = "" Or txtNota4.Text = "") Then
            b = False
        End If

        'Comprobar que las notas no son mayores a 10'
        If (Val(txtNota1.Text) > 10 Or Val(txtNota2.Text) > 10 Or Val(txtNota3.Text) > 10 Or Val(txtNota4.Text) > 10) Then
            b = False
        End If

        'Comprobar que las notas no son menores a 0'
        If (Val(txtNota1.Text) < 0 Or Val(txtNota2.Text) < 0 Or Val(txtNota3.Text) < 0 Or Val(txtNota4.Text) < 0) Then
            b = False
        End If

        If (b = False) Then
            MsgBox("Todas las notas tienen que estar entre 0 y 10")
        Else
            'Calcular mayor'
            If (mayor < Val(txtNota2.Text)) Then
                mayor = Val(txtNota2.Text)
            End If

            If (mayor < Val(txtNota3.Text)) Then
                mayor = Val(txtNota3.Text)
            End If

            If (mayor < Val(txtNota4.Text)) Then
                mayor = Val(txtNota4.Text)
            End If

            'Calcular menor'
            If (menor > Val(txtNota2.Text)) Then
                menor = Val(txtNota2.Text)
            End If

            If (menor > Val(txtNota3.Text)) Then
                menor = Val(txtNota3.Text)
            End If

            If (menor > Val(txtNota4.Text)) Then
                menor = Val(txtNota4.Text)
            End If

            'Calcular media'
            media = (Val(txtNota1.Text) + Val(txtNota2.Text) + Val(txtNota3.Text) + Val(txtNota4.Text)) / 4

            'Mostrar todo'
            labMayor.Text = mayor
            labMenor.Text = menor
            labMedia.Text = media
        End If
    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        txtNota1.Text = ""
        txtNota2.Text = ""
        txtNota3.Text = ""
        txtNota4.Text = ""
        labMayor.Text = ""
        labMenor.Text = ""
        labMedia.Text = ""
    End Sub

    Private Sub Button3_Click(sender As Object, e As EventArgs) Handles Button3.Click
        End
    End Sub
End Class
