Public Class Biblioteca
    Public usuarios(10) As usuarios
    Public cont As Integer

    Private Sub Biblioteca_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        tiempo.Start()
    End Sub

    Private Sub Tiempo_Tick(sender As Object, e As EventArgs) Handles tiempo.Tick
        Select Case TimeOfDay.Second
            Case 0 To 29
                pbImagen.BackgroundImage = My.Resources.Biblioteca1
            Case 30 To 59
                pbImagen.BackgroundImage = My.Resources.Biblioteca2
        End Select
    End Sub

    Private Sub SalidaToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles SalidaToolStripMenuItem.Click
        End
    End Sub

    Private Sub IngresarToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles IngresarToolStripMenuItem.Click
        Ingresar.Show()
    End Sub

    Private Sub MostrarToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles MostrarToolStripMenuItem.Click
        Mostrar.Show()
    End Sub

    Private Sub PrestarToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles PrestarToolStripMenuItem.Click
        Prestar.Show()
    End Sub

    Private Sub pbImagen_Click(sender As Object, e As EventArgs) Handles pbImagen.Click

    End Sub
End Class
