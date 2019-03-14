Public Class Form1
    Dim sx As String
    Dim ed As String
    Private Sub RadioButton1_CheckedChanged(sender As Object, e As EventArgs) Handles RadioButton1.CheckedChanged
        sx = "Hombre"
    End Sub
    Private Sub RadioButton2_CheckedChanged(sender As Object, e As EventArgs) Handles RadioButton2.CheckedChanged
        sx = "Mujer"
    End Sub

    Private Sub CheckBox1_CheckedChanged(sender As Object, e As EventArgs)

    End Sub

    Private Sub CheckedListBox1_SelectedIndexChanged(sender As Object, e As EventArgs) Handles CheckedListBox1.SelectedIndexChanged
        If CheckedListBox1.GetItemChecked(0) Then
            ed = "AAA"
        ElseIf CheckedListBox1.GetItemChecked(1) Then
            ed = "BBB"
        Else
            ed = "CCC"
        End If
    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        TextBox2.Text = TextBox1.Text + "-- " + sx + "-- " + "-- " + ed + "-- " + ComboBox1.SelectedItem + "-- " + DateTimePicker1.Value + "---" + TrackBar1.Value.ToString
    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        If MsgBox("Está seguro que desea salir de la aplicación", vbQuestion + vbYesNo, "Responda") = vbYes Then
            End
        End If
    End Sub

    Private Sub ComboBox1_SelectedIndexChanged(sender As Object, e As EventArgs) Handles ComboBox1.SelectedIndexChanged

    End Sub

    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Timer1.Start()
    End Sub

    Private Sub Timer1_Tick(sender As Object, e As EventArgs) Handles Timer1.Tick
        Label7.Text = TimeOfDay
        Label8.Text = TimeOfDay.Second
    End Sub
    Private Sub Label8_TextChanged(sender As Object, e As EventArgs) Handles Label8.TextChanged
        Dim segundos As VariantType
        segundos = Label8.Text
        Select Case segundos
            Case 0 To 20
                PictureBox1.BackgroundImage = My.Resources.images1
            Case 20 To 40
                PictureBox1.BackgroundImage = My.Resources.images2
            Case 40 To 60
                PictureBox1.BackgroundImage = My.Resources.social3
        End Select
    End Sub

    Private Sub TrackBar1_Scroll(sender As Object, e As EventArgs) Handles TrackBar1.Scroll
        Label9.Text = TrackBar1.Value

    End Sub
End Class
