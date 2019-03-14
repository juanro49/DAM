Public Class Form2
    Public veces As Integer = 0

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        If TextBox1.Text = "maria" And TextBox2.Text = "maria01" Then
            Me.Hide()
            Form3.Show()
            Form3.TextBox1.Text = "ddddddddd"
        Else
            MsgBox("Contraseña o ombre de usuario incorrectos")
            veces += 1
            If veces >= 2 Then
                End
            End If

        End If

    End Sub



    Private Sub TextBox2_KeyPress(sender As Object, e As KeyPressEventArgs) Handles TextBox2.KeyPress
        If Asc(e.KeyChar) = 13 Then
            If TextBox1.Text = "maria" And TextBox2.Text = "maria01" Then
                Me.Hide()
                Form3.Show()
                Form3.TextBox1.Text = "ddddddddd"
            Else
                MsgBox("Contraseña o ombre de usuario incorrectos")
                veces += 1
                If veces >= 2 Then
                    End
                End If

            End If
        End If

    End Sub
End Class