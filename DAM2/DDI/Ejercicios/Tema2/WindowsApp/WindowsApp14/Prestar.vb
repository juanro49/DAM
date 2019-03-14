Public Class Prestar
    Dim existe As Boolean = False
    Dim lleno As Boolean = True
    Dim usu As Integer

    Private Sub Prestar_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Panel1.Hide()
        Panel2.Hide()
    End Sub

    Private Sub btnBuscar_Click(sender As Object, e As EventArgs) Handles btnBuscar.Click
        For i As Integer = 0 To Biblioteca.cont - 1
            If (Val(txtCarnet.Text) = Biblioteca.usuarios(i).getCarnet()) Then
                MsgBox("Usuario encontrado")
                existe = True
                usu = i

                labNom.Text = Biblioteca.usuarios(i).getNombre()
                Panel1.Show()

                labLibpres1.Text = Biblioteca.usuarios(i).getLibros().GetValue(0).ToString()
                labLibpres2.Text = Biblioteca.usuarios(i).getLibros().GetValue(1).ToString()
                labLibpres3.Text = Biblioteca.usuarios(i).getLibros().GetValue(2).ToString()

                For j As Integer = 0 To Biblioteca.usuarios(i).getLibros().Length - 1
                    If (Biblioteca.usuarios(i).getLibros().GetValue(j).ToString().Equals(" ")) Then
                        lleno = False
                    End If
                Next j
            End If
        Next i

        If (lleno = False) Then
            Panel2.Show()
        End If

        If (existe = False) Then
            MsgBox("No existe el usuario")
        End If


    End Sub

    Private Sub btnPrestar_Click(sender As Object, e As EventArgs) Handles btnPrestar.Click

        Biblioteca.usuarios(usu).setLibro(txtTitulo.Text + " de " + txtAutor.Text)
        MsgBox("El libro " + txtTitulo.Text + " de " + txtAutor.Text + " se ha prestado al usuario " + Biblioteca.usuarios(usu).getNombre())

        labLibpres1.Text = Biblioteca.usuarios(usu).getLibros().GetValue(0).ToString()
        labLibpres2.Text = Biblioteca.usuarios(usu).getLibros().GetValue(1).ToString()
        labLibpres3.Text = Biblioteca.usuarios(usu).getLibros().GetValue(2).ToString()

        If Not labLibpres3.Text.Equals(" ") Then
            Panel2.Hide()
        End If
    End Sub
End Class