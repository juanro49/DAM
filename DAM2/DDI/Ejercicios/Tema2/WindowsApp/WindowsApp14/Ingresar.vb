Public Class Ingresar
    Public cont As Integer = 0
    Dim carnet As Integer = 1

    Private Sub btnIngres_Click(sender As Object, e As EventArgs) Handles btnIngres.Click
        Dim usuario As New usuarios(carnet, txtDni.Text, txtNom.Text, txtApe.Text, txtProf.Text, Val(txtEdad.Text))
        Dim existe As Boolean = False
        If (cont <> 0) Then
            For i As Integer = 0 To cont - 1
                If (txtDni.Text.Equals(Biblioteca.usuarios(i).getDni())) Then
                    MsgBox("El usuario ya existe")
                    existe = True
                End If
            Next i

            If (existe = False) Then
                Biblioteca.usuarios(cont) = usuario
                cont = cont + 1
                carnet = carnet + 1
                MsgBox("Usuario añadido correctamente")
            End If
        Else
            Biblioteca.usuarios(cont) = usuario
            cont = cont + 1
            carnet = carnet + 1
            MsgBox("Usuario añadido correctamente")
        End If

        Biblioteca.cont = cont

        txtDni.Text = Nothing
        txtNom.Text = Nothing
        txtApe.Text = Nothing
        txtProf.Text = Nothing
        txtEdad.Text = Nothing
    End Sub
End Class