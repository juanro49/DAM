Public Class MostrarLibros
    Dim cont As Integer = 0
    Dim nodo As nodoLibro
    Dim existencias As Boolean = True

    Private Sub MostrarLibros_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        nodo = Biblioteca.libros.getPrimerLibro()

        If (nodo IsNot Nothing) Then
            labTit.Text = nodo.getLibro().getTitulo()
            labAut.Text = nodo.getLibro().getAutor()
            labIsbn.Text = nodo.getLibro().getIsbn()
            labCant.Text = nodo.getLibro().getCantidad()

            lbLibro.Text = (cont + 1).ToString + "/" + Biblioteca.libros.sizeLibros().ToString
            cont = cont + 1
        Else
            MsgBox("No hay libros")
            existencias = False
        End If

        If existencias = False Then
            btnSig.Enabled = 0
        End If
    End Sub

    Private Sub btnSig_Click(sender As Object, e As EventArgs) Handles btnSig.Click
        If (nodo IsNot Nothing) Then
            nodo = nodo.getSig()
        End If

        If (nodo IsNot Nothing) Then
            labTit.Text = nodo.getLibro().getTitulo()
            labAut.Text = nodo.getLibro().getAutor()
            labIsbn.Text = nodo.getLibro().getIsbn()
            labCant.Text = nodo.getLibro().getCantidad()

            lbLibro.Text = (cont + 1).ToString + "/" + Biblioteca.libros.sizeLibros().ToString
            cont = cont + 1
        Else
            MsgBox("No hay mas libros")
        End If
    End Sub
End Class