Public Class Form1

    Dim n As Integer

    Private Sub btnSalir_Click(sender As Object, e As EventArgs) Handles btnSalir.Click
        Me.Close()
    End Sub

    Private Sub btnOtro_Click(sender As Object, e As EventArgs) Handles btnOtro.Click
        txtMayor.Text = ""
        txtMenor.Text = ""
        txtNdigit.Text = ""
        txtNumero.Text = ""
        txtSimp.Text = ""
        txtSpar.Text = ""
        txtStotal.Text = ""
        txtDivisores.Text = ""
    End Sub

    Private Sub btnAnalisis_Click(sender As Object, e As EventArgs) Handles btnAnalisis.Click
        'Número de dígitos'
        txtNdigit.Text = numDigit()

        'Suma impares'
        txtSimp.Text = sumImp()

        'Suma pares'
        txtSpar.Text = sumPar()

        'Suma total'
        txtStotal.Text = sumTot()

        'Dígito mayor'
        txtMayor.Text = dMayor()

        'Dígito menor'
        txtMenor.Text = dMenor()

        'Divisores'
        txtDivisores.Multiline = True
        txtDivisores.Text = divisores()

    End Sub

    Function numDigit() As Integer
        Dim cont As Integer

        cont = 0
        n = Val(txtNumero.Text)

        While (n / 10 <> 0)
            n = Math.Truncate(n / 10)
            cont += 1
        End While

        Return cont
    End Function

    Function sumImp() As Integer
        Dim sum As Integer
        Dim resto As Integer
        Dim impar As Integer
        sum = 0
        n = Val(txtNumero.Text)

        While (n / 10 <> 0)
            resto = n Mod 10
            impar = resto Mod 2
            If (impar <> 0) Then
                sum += resto
            End If

            n = Math.Truncate(n / 10)
        End While

        Return sum
    End Function

    Function sumPar() As Integer
        Dim sum As Integer
        Dim resto As Integer
        Dim par As Integer

        sum = 0
        n = Val(txtNumero.Text)

        While (n / 10 <> 0)
            resto = n Mod 10
            par = resto Mod 2
            If (par = 0) Then
                sum += resto
            End If

            n = Math.Truncate(n / 10)
        End While

        Return sum
    End Function

    Function sumTot() As Integer
        Dim sum As Integer
        sum = 0
        n = Val(txtNumero.Text)

        While (n / 10 <> 0)
            sum += n Mod 10
            n = Math.Truncate(n / 10)
        End While

        Return sum
    End Function

    Function dMayor() As Integer
        Dim mayor As Integer
        n = Val(txtNumero.Text)
        mayor = n Mod 10

        While (n / 10 <> 0)
            If (mayor < n Mod 10) Then
                mayor = n Mod 10
            End If

            n = Math.Truncate(n / 10)
        End While

        Return mayor
    End Function

    Function dMenor() As Integer
        Dim menor As Integer
        n = Val(txtNumero.Text)
        menor = n Mod 10

        While (n / 10 <> 0)
            If (menor > n Mod 10) Then
                menor = n Mod 10
            End If

            n = Math.Truncate(n / 10)
        End While

        Return menor
    End Function

    Function divisores() As String
        Dim divi As String
        Dim cont As Integer

        divi = ""
        n = Val(txtNumero.Text)

        For cont = n To 1 Step -1
            If (n Mod cont = 0) Then
                divi += cont.ToString + vbNewLine
            End If
        Next cont

        Return divi
    End Function

    Private Sub txtNumero_KeyPress(sender As Object, e As KeyPressEventArgs) Handles txtNumero.KeyPress
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
