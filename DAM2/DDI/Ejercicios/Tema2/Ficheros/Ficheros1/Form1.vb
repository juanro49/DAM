Imports System

Public Class Form1

    Dim fichero As System.IO.StreamReader

    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Try
            fichero = My.Computer.FileSystem.OpenTextFileReader("G:\DAM\DAM2\DDI\Tema2\socios.txt")
        Catch ex As Exception
            MsgBox(ex.Message)
        End Try

        Me.btnSig_Click("", e)
    End Sub

    Private Sub btnSig_Click(sender As Object, e As EventArgs) Handles btnSig.Click
        Dim linea As String = ""
        Dim campo As String()

        linea = fichero.ReadLine()

        If linea IsNot Nothing Then
            campo = linea.Split("#")

            txtNombre.Text = campo(0)
            txtApellido.Text = campo(1)
            txtDni.Text = campo(2)
            txtEdad.Text = campo(3)
            txtProfesion.Text = campo(4)
        Else
            MsgBox("Fin del documento")
        End If
    End Sub
End Class
