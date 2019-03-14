Public Class Ingresar
    Public cont As Integer = Biblioteca.contU
    Public carnet As Integer = 1

    Private Sub btnIngres_Click(sender As Object, e As EventArgs) Handles btnIngres.Click
        Dim existe As Boolean = False

        If (Biblioteca.usuarios.sizeUsuarios() > 0) Then
            Dim nodo As nodoUsu
            nodo = Biblioteca.usuarios.getPrimerUsuario()

            While (nodo IsNot Nothing)
                If (txtDni.Text = nodo.getUsuario().getDni()) Then
                    MsgBox("El usuario " + nodo.getUsuario().getNombre() + " " + nodo.getUsuario().getApellidos() + " ya existe, no se añade")
                    existe = True
                End If

                nodo = nodo.getSig()
            End While

            If (txtEdad.Text < 18) Then
                MsgBox("Usuario menor de edad")
            End If

            If (existe = False And Val(txtEdad.Text) >= 18) Then
                Biblioteca.usuarios.insertarUsuario(txtDni.Text, txtNom.Text, txtApe.Text, txtProf.Text, Val(txtEdad.Text), txtCorreo.Text)
                MsgBox("Usuario añadido correctamente")

                If (Not txtCorreo.Text = "") Then
                    enviarCorreo("Bienvenido a la biblioteca " + txtNom.Text + " " + txtApe.Text, "Bienvenida", txtCorreo.Text)
                End If
            End If
        Else
            Biblioteca.usuarios.insertarUsuario(txtDni.Text, txtNom.Text, txtApe.Text, txtProf.Text, Val(txtEdad.Text), txtCorreo.Text)
            MsgBox("Usuario añadido correctamente")

            If (Not txtCorreo.Text = "") Then
                enviarCorreo("Bienvenido a la biblioteca " + txtNom.Text + " " + txtApe.Text, "Bienvenida", txtCorreo.Text)
            End If
        End If

        Biblioteca.contU = cont

        txtDni.Text = Nothing
        txtNom.Text = Nothing
        txtApe.Text = Nothing
        txtProf.Text = Nothing
        txtEdad.Text = Nothing
        txtCorreo.Text = Nothing
    End Sub
End Class