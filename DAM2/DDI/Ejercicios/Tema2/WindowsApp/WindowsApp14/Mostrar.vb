Public Class Mostrar
    Dim cont As Integer = 0
    Private Sub Mostrar_Load(sender As Object, e As EventArgs) Handles MyBase.Load

        If (cont <= Biblioteca.cont - 1) Then

            Biblioteca.usuarios = ordenarEdad()
            labNom.Text = Biblioteca.usuarios(cont).getNombre()
            labDni.Text = Biblioteca.usuarios(cont).getDni()
            labProf.Text = Biblioteca.usuarios(cont).getProfesion()
            labEdad.Text = Biblioteca.usuarios(cont).getEdad()
            labLibpres1.Text = Biblioteca.usuarios(cont).getLibros().GetValue(0).ToString()
            labLibpres2.Text = Biblioteca.usuarios(cont).getLibros().GetValue(1).ToString()
            labLibpres3.Text = Biblioteca.usuarios(cont).getLibros().GetValue(2).ToString()

            cont = cont + 1
        Else
            MsgBox("No hay usuarios")
        End If
    End Sub

    Private Sub btnSig_Click(sender As Object, e As EventArgs) Handles btnSig.Click

        If (cont <= Biblioteca.cont - 1) Then
            labNom.Text = Biblioteca.usuarios(cont).getNombre()
            labDni.Text = Biblioteca.usuarios(cont).getDni()
            labProf.Text = Biblioteca.usuarios(cont).getProfesion()
            labEdad.Text = Biblioteca.usuarios(cont).getEdad()
            labLibpres1.Text = Biblioteca.usuarios(cont).getLibros().GetValue(0).ToString()
            labLibpres2.Text = Biblioteca.usuarios(cont).getLibros().GetValue(1).ToString()
            labLibpres3.Text = Biblioteca.usuarios(cont).getLibros().GetValue(2).ToString()

            cont = cont + 1
        Else
            MsgBox("No hay mas usuarios")
        End If
    End Sub

    Function ordenarEdad() As usuarios()
        Dim v(10) As usuarios
        Dim aux As New usuarios

        v = Biblioteca.usuarios

        For i As Integer = 1 To Biblioteca.cont - 1
            For j As Integer = 0 To Biblioteca.cont - 2
                If (v(j).getEdad() > v(j + 1).getEdad()) Then
                    aux = v(j)
                    v(j) = v(j + 1)
                    v(j + 1) = aux
                End If
            Next j
        Next i

        Return v
    End Function
End Class