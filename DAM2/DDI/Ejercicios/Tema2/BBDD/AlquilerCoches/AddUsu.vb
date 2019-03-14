Imports System.IO

Public Class AddUsu
    Private Sub BtnAdd_Click(sender As Object, e As EventArgs) Handles btnAdd.Click
        Dim existe As Boolean = False
        Dim usu As String

        If (comprobarDatos()) Then
            Dim nodo As nodoUsu
            nodo = Principal.usuarios.getPrimerUsuario()

            If (nodo Is Nothing) Then
                Principal.usuarios.insertarUsuario(txtDni.Text.ToUpper, txtNom.Text, txtApe.Text, txtTfno.Text, txtCorreo.Text)

                usu = "addUsu" + "#" + txtDni.Text.ToUpper + "#" + txtNom.Text + "#" + txtApe.Text + "#" + txtTfno.Text + "#" + txtCorreo.Text & vbCrLf
                guardarUsuario(usu)
            Else
                While (nodo IsNot Nothing And existe = False)
                    If (txtDni.Text.ToUpper.Equals(nodo.getUsuario().getDni())) Then
                        MsgBox("El usuario ya existe, no se añade")
                        existe = True
                    End If

                    nodo = nodo.getSig()
                End While

                If (existe = False) Then
                    Principal.usuarios.insertarUsuario(txtDni.Text.ToUpper, txtNom.Text, txtApe.Text, txtTfno.Text, txtCorreo.Text)

                    usu = "addUsu" + "#" + txtDni.Text.ToUpper + "#" + txtNom.Text + "#" + txtApe.Text + "#" + txtTfno.Text + "#" + txtCorreo.Text & vbCrLf
                    guardarUsuario(usu)
                End If
            End If
        End If

        txtDni.Text = Nothing
        txtNom.Text = Nothing
        txtApe.Text = Nothing
        txtTfno.Text = Nothing
        txtCorreo.Text = Nothing
    End Sub

    Public Sub guardarUsuario(usu As String)
        Dim escritor As StreamWriter

        escritor = New StreamWriter("..\..\Ficheros\cambios.txt", True)

        escritor.Write(usu)
        escritor.Flush()
        escritor.Close()

        MsgBox("Usuario añadido correctamente")
    End Sub

    Function comprobarDatos() As Boolean

        If (txtDni.Text = Nothing) Then
            MsgBox("El DNI es obligatorio")
            Return False
        End If

        If (txtNom.Text = Nothing) Then
            MsgBox("El nombre es obligatorio")
            Return False
        End If

        If (txtApe.Text = Nothing) Then
            MsgBox("El apellido es obligatorio")
            Return False
        End If

        If (txtTfno.Text = Nothing) Then
            MsgBox("El teléfono es obligatorio")
            Return False
        End If

        Return True
    End Function
End Class