Public Class Form1

    Private Sub txtLado1_KeyPress(sender As Object, e As KeyPressEventArgs) Handles txtLado1.KeyPress
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

    Private Sub txtLado2_KeyPress(sender As Object, e As KeyPressEventArgs) Handles txtLado2.KeyPress
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

    Private Sub txtBase_KeyPress(sender As Object, e As KeyPressEventArgs) Handles txtBase.KeyPress
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

    Private Sub txtAltura_KeyPress(sender As Object, e As KeyPressEventArgs) Handles txtAltura.KeyPress
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

    Private Sub txtRadio_KeyPress(sender As Object, e As KeyPressEventArgs) Handles txtRadio.KeyPress
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

    Private Sub rbCuadrado_CheckedChanged(sender As Object, e As EventArgs) Handles rbCuadrado.CheckedChanged
        labArea.Text = "-"
        txtLado1.Text = ""
        txtLado2.Text = ""
        panCuad.Show()
        PanCir.Hide()
        panTri.Hide()
    End Sub

    Private Sub rbRect_CheckedChanged(sender As Object, e As EventArgs) Handles rbRect.CheckedChanged
        labArea.Text = "-"
        txtLado1.Text = ""
        txtLado2.Text = ""
        panCuad.Show()
        PanCir.Hide()
        panTri.Hide()
    End Sub

    Private Sub rbTrian_CheckedChanged(sender As Object, e As EventArgs) Handles rbTrian.CheckedChanged
        labArea.Text = "-"
        txtBase.Text = ""
        txtAltura.Text = ""
        panCuad.Hide()
        PanCir.Hide()
        panTri.Show()
    End Sub

    Private Sub rbCirc_CheckedChanged(sender As Object, e As EventArgs) Handles rbCirc.CheckedChanged
        labArea.Text = "-"
        txtRadio.Text = ""
        panCuad.Hide()
        PanCir.Show()
        panTri.Hide()
    End Sub

    Private Sub btnCalcular_Click(sender As Object, e As EventArgs) Handles btnCalcular.Click

        If (rbCuadrado.Checked Or rbRect.Checked) Then
            labArea.Text = Val(txtLado1.Text) * Val(txtLado2.Text)
        ElseIf (rbTrian.Checked) Then
            labArea.Text = Val(txtBase.Text) * Val(txtAltura.Text) / 2
        ElseIf (rbCirc.Checked) Then
            labArea.Text = 3.14 * (Val(txtRadio.Text) + Val(txtRadio.Text))
        End If

    End Sub

    Private Sub panCuad_Paint(sender As Object, e As PaintEventArgs) Handles panCuad.Paint
        If (rbCuadrado.Checked Or rbRect.Checked) Then
            panCuad.Show()
        Else
            panCuad.Hide()
        End If
    End Sub

    Private Sub panTri_Paint(sender As Object, e As PaintEventArgs) Handles panTri.Paint
        If (rbTrian.Checked) Then
            panTri.Show()
        Else
            panTri.Hide()
        End If
    End Sub

    Private Sub PanCir_Paint(sender As Object, e As PaintEventArgs) Handles PanCir.Paint
        If (rbCirc.Checked) Then
            PanCir.Show()
        Else
            PanCir.Hide()
        End If
    End Sub
End Class
