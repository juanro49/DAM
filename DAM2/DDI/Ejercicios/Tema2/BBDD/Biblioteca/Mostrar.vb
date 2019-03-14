Public Class Mostrar
    Dim cont As Integer = 0
    Dim nodo As nodoUsu
    Dim existencias As Boolean = True

    Private Sub Mostrar_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        nodo = Biblioteca.usuarios.getPrimerUsuario()

        If (nodo IsNot Nothing) Then
            labNom.Text = nodo.getUsuario().getNombre()
            labDni.Text = nodo.getUsuario().getDni()
            labProf.Text = nodo.getUsuario().getProfesion()
            labEdad.Text = nodo.getUsuario().getEdad()
            labCorreo.Text = nodo.getUsuario().getCorreo()

            If (nodo.getUsuario().getLibros().GetValue(0) IsNot Nothing) Then
                labLibpres1.Text = nodo.getUsuario().getLibros().GetValue(0).getTitulo() + " de " + nodo.getUsuario().getLibros().GetValue(0).getAutor()
            Else
                labLibpres1.Text = ""
            End If

            If (nodo.getUsuario().getLibros().GetValue(1) IsNot Nothing) Then
                labLibpres2.Text = nodo.getUsuario().getLibros().GetValue(1).getTitulo() + " de " + nodo.getUsuario().getLibros().GetValue(1).getAutor()
            Else
                labLibpres2.Text = ""
            End If

            If (nodo.getUsuario().getLibros().GetValue(2) IsNot Nothing) Then
                labLibpres3.Text = nodo.getUsuario().getLibros().GetValue(2).getTitulo() + " de " + nodo.getUsuario().getLibros().GetValue(2).getAutor()
            Else
                labLibpres3.Text = ""
            End If

            lbLibro.Text = (cont + 1).ToString + "/" + Biblioteca.usuarios.sizeUsuarios().ToString
            cont = cont + 1
        Else
            MsgBox("No hay usuarios")
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
            labNom.Text = nodo.getUsuario().getNombre()
            labDni.Text = nodo.getUsuario().getDni()
            labProf.Text = nodo.getUsuario().getProfesion()
            labEdad.Text = nodo.getUsuario().getEdad()
            labCorreo.Text = nodo.getUsuario().getCorreo()

            If (nodo.getUsuario().getLibros().GetValue(0) IsNot Nothing) Then
                labLibpres1.Text = nodo.getUsuario().getLibros().GetValue(0).getTitulo() + " de " + nodo.getUsuario().getLibros().GetValue(0).getAutor()
            Else
                labLibpres1.Text = ""
            End If

            If (nodo.getUsuario().getLibros().GetValue(1) IsNot Nothing) Then
                labLibpres2.Text = nodo.getUsuario().getLibros().GetValue(1).getTitulo() + " de " + nodo.getUsuario().getLibros().GetValue(1).getAutor()
            Else
                labLibpres2.Text = ""
            End If

            If (nodo.getUsuario().getLibros().GetValue(2) IsNot Nothing) Then
                labLibpres3.Text = nodo.getUsuario().getLibros().GetValue(2).getTitulo() + " de " + nodo.getUsuario().getLibros().GetValue(2).getAutor()
            Else
                labLibpres3.Text = ""
            End If

            lbLibro.Text = (cont + 1).ToString + "/" + Biblioteca.usuarios.sizeUsuarios().ToString
            cont = cont + 1
        Else
            MsgBox("No hay mas usuarios")
        End If
    End Sub
End Class