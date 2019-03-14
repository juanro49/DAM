Imports System.IO

Public Class ModUsu
    Dim nodo As nodoUsu
    Private Sub ModUsu_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Panel1.Hide()
    End Sub

    Private Sub BtnBuscar_Click(sender As Object, e As EventArgs) Handles btnBuscar.Click
        Dim existe As Boolean = False

        If (txtDni.Text IsNot Nothing) Then
            nodo = Principal.usuarios.getPrimerUsuario()

            While (nodo IsNot Nothing And existe = False)

                If (txtDni.Text.ToUpper.Equals(nodo.getUsuario.getDni())) Then
                    existe = True

                    txtNom.Text = nodo.getUsuario.getNombre()
                    txtApe.Text = nodo.getUsuario.getApellido()
                    txtTfno.Text = nodo.getUsuario.getTelefono()
                    txtCorreo.Text = nodo.getUsuario.getCorreo()

                    Panel1.Show()
                End If

                If (existe = False) Then
                    nodo = nodo.getSig()
                End If

            End While

            If (existe = False) Then
                MsgBox("Usuario no dado de alta")
            End If
        Else
            MsgBox("Introduce un DNI")
        End If
    End Sub

    Private Sub BtnMod_Click(sender As Object, e As EventArgs) Handles btnMod.Click
        Dim existe As Boolean = False
        Dim usu As String

        If (comprobarDatos()) Then

            If (existe = False) Then
                nodo.getUsuario.setNombre(txtNom.Text)
                nodo.getUsuario.setApellido(txtApe.Text)
                nodo.getUsuario.setTelefono(txtTfno.Text)
                nodo.getUsuario.setCorreo(txtCorreo.Text)

                usu = "modUsu" + "#" + txtDni.Text.ToUpper + "#" + txtNom.Text + "#" + txtApe.Text + "#" + txtTfno.Text + "#" + txtCorreo.Text & vbCrLf
                guardarUsuario(usu)
            End If
        End If
    End Sub

    Public Sub guardarUsuario(usu As String)
        Dim escritor As StreamWriter

        escritor = New StreamWriter("..\..\Ficheros\cambios.txt", True)

        escritor.Write(usu)
        escritor.Flush()
        escritor.Close()

        MsgBox("Usuario modificado correctamente")
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