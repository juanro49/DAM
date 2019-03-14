Imports System.IO

Public Class Ingresar
    Public cont As Integer = Biblioteca.contU
    Public carnet As Integer = 1

    Private Sub btnIngres_Click(sender As Object, e As EventArgs) Handles btnIngres.Click
        Dim existe As Boolean = False
        Dim usu As String

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

                usu = txtDni.Text + "#" + txtNom.Text + "#" + txtApe.Text + "#" + txtProf.Text + "#" + txtEdad.Text + "#" + txtCorreo.Text & vbCrLf
                guardarUsuario(usu)

                If (Not txtCorreo.Text = "") Then
                    enviarCorreo("Bienvenido a la biblioteca " + txtNom.Text + " " + txtApe.Text, "Bienvenida", txtCorreo.Text)
                End If
            End If
        Else
            If (txtEdad.Text < 18) Then
                MsgBox("Usuario menor de edad")
            Else
                Biblioteca.usuarios.insertarUsuario(txtDni.Text, txtNom.Text, txtApe.Text, txtProf.Text, Val(txtEdad.Text), txtCorreo.Text)

                usu = txtDni.Text + "#" + txtNom.Text + "#" + txtApe.Text + "#" + txtProf.Text + "#" + txtEdad.Text + "#" + txtCorreo.Text & vbCrLf
                guardarUsuario(usu)
            End If

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

    Public Sub guardarUsuario(usu As String)
        Dim escritor As StreamWriter

        escritor = New StreamWriter("..\..\Ficheros\backUsu.txt", True)

        escritor.Write(usu)
        escritor.Flush()
        escritor.Close()

        MsgBox("Usuario añadido correctamente")
    End Sub
End Class