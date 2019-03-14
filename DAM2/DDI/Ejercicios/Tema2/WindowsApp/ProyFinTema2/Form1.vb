Public Class Form1

    Dim resul As Nullable(Of Double) = Nothing
    Dim n As Nullable(Of Double) = Nothing
    Dim op As String

    Private Sub txtNum_KeyPress(sender As Object, e As KeyPressEventArgs) Handles txtNum.KeyPress
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

    Private Sub btn0_Click(sender As Object, e As EventArgs) Handles btn0.Click
        txtNum.Text &= btn0.Text

        If (txtFormula.ToString.Last = "=") Then
            txtFormula.Text = ""
        End If
    End Sub

    Private Sub btn1_Click(sender As Object, e As EventArgs) Handles btn1.Click
        txtNum.Text &= btn1.Text

        If (txtFormula.ToString.Last = "=") Then
            txtFormula.Text = ""
        End If
    End Sub

    Private Sub btn2_Click(sender As Object, e As EventArgs) Handles btn2.Click
        txtNum.Text &= btn2.Text

        If (txtFormula.ToString.Last = "=") Then
            txtFormula.Text = ""
        End If
    End Sub

    Private Sub btn3_Click(sender As Object, e As EventArgs) Handles btn3.Click
        txtNum.Text &= btn3.Text

        If (txtFormula.ToString.Last = "=") Then
            txtFormula.Text = ""
        End If
    End Sub

    Private Sub btn4_Click(sender As Object, e As EventArgs) Handles btn4.Click
        txtNum.Text &= btn4.Text

        If (txtFormula.ToString.Last = "=") Then
            txtFormula.Text = ""
        End If
    End Sub

    Private Sub btn5_Click(sender As Object, e As EventArgs) Handles btn5.Click
        txtNum.Text &= btn5.Text

        If (txtFormula.ToString.Last = "=") Then
            txtFormula.Text = ""
        End If
    End Sub

    Private Sub btn6_Click(sender As Object, e As EventArgs) Handles btn6.Click
        txtNum.Text &= btn6.Text

        If (txtFormula.ToString.Last = "=") Then
            txtFormula.Text = ""
        End If
    End Sub

    Private Sub btn7_Click(sender As Object, e As EventArgs) Handles btn7.Click
        txtNum.Text &= btn7.Text

        If (txtFormula.ToString.Last = "=") Then
            txtFormula.Text = ""
        End If
    End Sub

    Private Sub btn8_Click(sender As Object, e As EventArgs) Handles btn8.Click
        txtNum.Text &= btn8.Text

        If (txtFormula.ToString.Last = "=") Then
            txtFormula.Text = ""
        End If
    End Sub

    Private Sub btn9_Click(sender As Object, e As EventArgs) Handles btn9.Click
        txtNum.Text &= btn9.Text

        If (txtFormula.ToString.Last = "=") Then
            txtFormula.Text = ""
        End If
    End Sub

    Private Sub btnDec_Click(sender As Object, e As EventArgs) Handles btnDec.Click
        If (Not txtNum.Text.Contains(".")) Then
            txtNum.Text &= btnDec.Text
        End If
    End Sub

    Private Sub btnPi_Click(sender As Object, e As EventArgs) Handles btnPi.Click
        txtNum.Text = Math.PI.ToString.Replace(",", ".")

        If (txtFormula.ToString.Last = "=") Then
            txtFormula.Text = ""
        End If
    End Sub

    Private Sub btnDelete_Click(sender As Object, e As EventArgs) Handles btnDelete.Click
        If (txtNum.Text.Count <> 0) Then
            txtNum.Text = txtNum.Text.Remove(txtNum.Text.Length - 1, 1)
        End If
    End Sub

    Private Sub btnSuma_Click(sender As Object, e As EventArgs) Handles btnSuma.Click
        txtFormula.AppendText(txtNum.Text + " + ")

        Calcular()
        op = btnSuma.Text
    End Sub

    Private Sub btnResta_Click(sender As Object, e As EventArgs) Handles btnResta.Click
        txtFormula.AppendText(txtNum.Text + " - ")

        Calcular()
        op = btnResta.Text
    End Sub

    Private Sub btnMulti_Click(sender As Object, e As EventArgs) Handles btnMulti.Click
        txtFormula.AppendText(txtNum.Text + " * ")

        Calcular()
        op = btnMulti.Text
    End Sub

    Private Sub btnDivi_Click(sender As Object, e As EventArgs) Handles btnDivi.Click
        txtFormula.AppendText(txtNum.Text + " / ")

        Calcular()
        op = btnDivi.Text
    End Sub

    Private Sub btnResto_Click(sender As Object, e As EventArgs) Handles btnResto.Click
        txtFormula.AppendText(txtNum.Text + " Resto ")

        Calcular()
        op = btnResto.Text
    End Sub

    Private Sub btnPot_Click(sender As Object, e As EventArgs) Handles btnPot.Click
        txtFormula.AppendText(txtNum.Text + " ^ ")

        Calcular()
        op = btnPot.Text
    End Sub

    Private Sub btnRaizC_Click(sender As Object, e As EventArgs) Handles btnRaizC.Click
        txtFormula.AppendText(" √ ")

        Calcular()
        op = btnRaizC.Text
    End Sub

    Private Sub btnResul_Click(sender As Object, e As EventArgs) Handles btnResul.Click
        If (txtFormula.Text.Last <> "=") Then
            txtFormula.AppendText(txtNum.Text + " =")
            Calcular()
            op = btnResul.Text
        End If

        txtNum.Text = txtNum.Text.Replace(",", ".")

        n = Nothing
        resul = Nothing
    End Sub

    Private Sub btnPorcen_Click(sender As Object, e As EventArgs) Handles btnPorcen.Click
        txtFormula.AppendText(txtNum.Text + " % ")

        Calcular()
        op = btnPorcen.Text
    End Sub

    Public Sub Calcular()
        n = Val(txtNum.Text)

        If resul Is Nothing Then
            resul = n
        Else
            Select Case op
                Case "+"
                    resul += n
                Case "-"
                    resul -= n
                Case "*"
                    resul *= n
                Case "/"
                    resul /= n
                Case "Resto"
                    resul = resul Mod n
                Case "aⁿ"
                    resul = Math.Pow(resul, n)
                Case "√"
                    resul = Math.Sqrt(resul)
                Case "%"
                    resul = resul * n / 100
                Case "Sen"
                    resul = Math.Sin(resul)
                Case "Cos"
                    resul = Math.Cos(resul)
                Case "Tan"
                    resul = Math.Tan(resul)
                Case "log"
                    resul = Math.Log10(resul)
                Case "ln"
                    resul = Math.Log(resul)
                Case "$-€"
                    resul = resul * 0.8674
                Case "€-$"
                    resul = resul * 1.1528
                Case "¥-€"
                    resul = resul * 0.1251
                Case "€-¥"
                    resul = resul * 7.9885

            End Select

            txtNum.Text = resul
        End If
    End Sub

    Private Sub SalirToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles SalirToolStripMenuItem.Click
        If MsgBox("¿Seguro que deseas salir?", vbQuestion + vbYesNo, "Responda") = vbYes Then
            End
        End If
    End Sub

    Private Sub BásicoToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles BásicoToolStripMenuItem.Click
        btnPot.Visible = False
        btnRaizC.Visible = False
        btnResto.Visible = False
        btnPorcen.Visible = False
        btnSen.Visible = False
        btnCos.Visible = False
        btnTan.Visible = False
        btnLog.Visible = False
        btnlLn.Visible = False
        btnPi.Visible = False
        btnDaE.Visible = False
        btnEaD.Visible = False
        btnYaE.Visible = False
        btnEaY.Visible = False
    End Sub

    Private Sub AvanzadoToolStripMenuItem1_Click(sender As Object, e As EventArgs) Handles AvanzadoToolStripMenuItem1.Click
        btnPot.Visible = True
        btnRaizC.Visible = True
        btnResto.Visible = True
        btnPorcen.Visible = True
        btnSen.Visible = True
        btnCos.Visible = True
        btnTan.Visible = True
        btnLog.Visible = True
        btnlLn.Visible = True
        btnPi.Visible = True
        btnDaE.Visible = True
        btnEaD.Visible = True
        btnYaE.Visible = True
        btnEaY.Visible = True
    End Sub

    Private Sub Form1_Activated(sender As Object, e As EventArgs) Handles MyBase.Activated
        BásicoToolStripMenuItem_Click(sender, e)
    End Sub

    Private Sub btnSen_Click(sender As Object, e As EventArgs) Handles btnSen.Click
        txtFormula.AppendText(" Sen ")

        Calcular()
        op = btnSen.Text
    End Sub

    Private Sub btnCos_Click(sender As Object, e As EventArgs) Handles btnCos.Click
        txtFormula.AppendText(" Cos ")

        Calcular()
        op = btnCos.Text
    End Sub

    Private Sub btnTan_Click(sender As Object, e As EventArgs) Handles btnTan.Click
        txtFormula.AppendText(" Tan ")

        Calcular()
        op = btnTan.Text
    End Sub

    Private Sub btnNeg_Click(sender As Object, e As EventArgs) Handles btnNeg.Click
        If (txtNum.Text.StartsWith("-")) Then
            txtNum.Text = -Val(txtNum.Text)
        Else
            txtNum.Text = -Val(txtNum.Text)
        End If
    End Sub

    Private Sub btnLog_Click(sender As Object, e As EventArgs) Handles btnLog.Click
        txtFormula.AppendText(" log ")

        Calcular()
        op = btnLog.Text
    End Sub

    Private Sub btnlLn_Click(sender As Object, e As EventArgs) Handles btnlLn.Click
        txtFormula.AppendText(" ln ")

        Calcular()
        op = btnlLn.Text
    End Sub

    Private Sub btnBin_Click(sender As Object, e As EventArgs) Handles btnDaE.Click
        txtFormula.AppendText(" $-€ ")

        Calcular()
        op = btnDaE.Text
    End Sub

    Private Sub btnEaD_Click(sender As Object, e As EventArgs) Handles btnEaD.Click
        txtFormula.AppendText(" €-$ ")

        Calcular()
        op = btnEaD.Text
    End Sub

    Private Sub btnEaY_Click(sender As Object, e As EventArgs) Handles btnEaY.Click
        txtFormula.AppendText(" €-¥ ")

        Calcular()
        op = btnEaY.Text
    End Sub

    Private Sub btnYaE_Click(sender As Object, e As EventArgs) Handles btnYaE.Click
        txtFormula.AppendText(" ¥-€ ")

        Calcular()
        op = btnYaE.Text
    End Sub
End Class
