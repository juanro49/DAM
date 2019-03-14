Imports System.IO

Public Class ModCoche

    Dim nodo As nodoCoche
    Private Sub BtnBuscar_Click(sender As Object, e As EventArgs) Handles btnBuscar.Click
        Dim existe As Boolean = False

        If (txtMatri.Text IsNot Nothing) Then
            nodo = Principal.coches.getPrimerCoche()

            While (nodo IsNot Nothing And existe = False)

                If (txtMatri.Text.ToUpper.Equals(nodo.getCoche.getMatricula())) Then
                    existe = True

                    txtNmatri.Text = nodo.getCoche.getMatricula()
                    txtNmarca.Text = nodo.getCoche.getMarca()
                    txtnModelo.Text = nodo.getCoche.getModelo()
                    txtNprecio.Text = nodo.getCoche.getPrecioDia()

                    Panel1.Show()
                End If

                If (existe = False) Then
                    nodo = nodo.getSig()
                End If

            End While

            If (existe = False) Then
                MsgBox("No existe ese coche")
            End If
        Else
            MsgBox("Introduce una matrícula")
        End If


    End Sub

    Private Sub ModCoche_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Panel1.Hide()
    End Sub

    Private Sub BtnMod_Click(sender As Object, e As EventArgs) Handles btnMod.Click
        Dim existe As Boolean = False
        Dim coche As String

        If (comprobarDatos()) Then
            Dim nodo1 As nodoCoche
            nodo1 = Principal.coches.getPrimerCoche()

            While (nodo1 IsNot Nothing And existe = False)
                If (txtNmatri.Text.ToUpper = nodo1.getCoche.getMatricula()) Then
                    MsgBox("La matrícula " + nodo1.getCoche.getMatricula() + " ya existe, no se modifica")
                    existe = True
                End If

                nodo1 = nodo1.getSig()
            End While

            If (existe = False) Then
                nodo.getCoche.setMatricula(txtNmatri.Text.ToUpper)
                nodo.getCoche.setMarca(txtNmarca.Text)
                nodo.getCoche.setModelo(txtnModelo.Text)
                nodo.getCoche.setPrecioDia(txtNprecio.Text)

                coche = "modCoche#" + txtMatri.Text.ToUpper + "#" + txtNmatri.Text.ToUpper + "#" + txtNmarca.Text + "#" + txtnModelo.Text + "#" + txtNprecio.Text & vbCrLf
                guardarCoche(coche)
            End If
        End If
    End Sub

    Public Sub guardarCoche(coche As String)
        Dim escritor As StreamWriter

        escritor = New StreamWriter("..\..\Ficheros\cambios.txt", True)

        escritor.Write(coche)
        escritor.Flush()
        escritor.Close()

        MsgBox("Coche modificado correctamente")
    End Sub

    Function comprobarDatos() As Boolean

        If (txtNmatri.Text = Nothing) Then
            MsgBox("La matrícula es obligatoria")
            Return False
        End If

        If (txtNmarca.Text = Nothing) Then
            MsgBox("La marca es obligatoria")
            Return False
        End If

        If (txtnModelo.Text = Nothing) Then
            MsgBox("El modelo es obligatorio")
            Return False
        End If

        If (txtNprecio.Text = Nothing) Then
            MsgBox("El precio es obligatorio")
            Return False
        End If

        Return True
    End Function
End Class