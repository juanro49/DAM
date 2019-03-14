Imports System.IO

Public Class AddCoche
    Private Sub BtnAdd_Click(sender As Object, e As EventArgs) Handles btnAdd.Click
        Dim existe As Boolean = False
        Dim coche As String

        If (comprobarDatos()) Then
            Dim nodo As nodoCoche
            nodo = Principal.coches.getPrimerCoche()

            If (nodo Is Nothing) Then
                Principal.usuarios.insertarCoche(txtMatri.Text.ToUpper, txtMarca.Text, txtModelo.Text, "libre", txtPrecio.Text)

                coche = "addCoche" + "#" + txtMatri.Text.ToUpper + "#" + txtMarca.Text + "#" + txtModelo.Text + "#" + txtPrecio.Text & vbCrLf
                guardarCoche(coche)
            Else
                While (nodo IsNot Nothing And existe = False)
                    If (txtMatri.Text.ToUpper = nodo.getCoche.getMatricula()) Then
                        MsgBox("La matrícula " + nodo.getCoche.getMatricula() + " ya existe, no se añade")
                        existe = True
                    End If

                    nodo = nodo.getSig()
                End While

                If (existe = False) Then
                    Principal.coches.insertarCoche(txtMatri.Text.ToUpper, txtMarca.Text, txtModelo.Text, "libre", txtPrecio.Text)

                    coche = "addCoche" + "#" + txtMatri.Text.ToUpper + "#" + txtMarca.Text + "#" + txtModelo.Text + "#" + txtPrecio.Text & vbCrLf
                    guardarCoche(coche)
                End If
            End If
        End If

        txtMatri.Text = Nothing
        txtMarca.Text = Nothing
        txtModelo.Text = Nothing
        txtPrecio.Text = Nothing
    End Sub

    Public Sub guardarCoche(coche As String)
        Dim escritor As StreamWriter

        escritor = New StreamWriter("..\..\Ficheros\cambios.txt", True)

        escritor.Write(coche)
        escritor.Flush()
        escritor.Close()

        MsgBox("Coche añadido correctamente")
    End Sub

    Function comprobarDatos() As Boolean

        If (txtMatri.Text = Nothing) Then
            MsgBox("La matrícula es obligatoria")
            Return False
        End If

        If (txtMarca.Text = Nothing) Then
            MsgBox("La marca es obligatoria")
            Return False
        End If

        If (txtModelo.Text = Nothing) Then
            MsgBox("El modelo es obligatorio")
            Return False
        End If

        If (txtPrecio.Text = Nothing) Then
            MsgBox("El precio es obligatorio")
            Return False
        End If

        Return True
    End Function
End Class