Imports System.IO

Public Class DelCoche
    Private Sub DelCoche_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        mostrarCoches()
    End Sub

    Private Sub BynEliminar_Click(sender As Object, e As EventArgs) Handles bynEliminar.Click
        Dim coche As String

        If (Principal.coches.eliminarCoche(listaCoche.SelectedItems(0).SubItems(0).Text)) Then
            coche = "delCoche#" + listaCoche.SelectedItems(0).SubItems(0).Text + vbCrLf
            guardarCoche(coche)
        Else
            MsgBox("No se puede eliminar un coche que está alquilado")
        End If

        mostrarCoches()
    End Sub

    Private Sub mostrarCoches()
        Dim coche As String
        Dim linea As String()
        Dim item As ListViewItem

        listaCoche.Clear()

        listaCoche.View = View.Details
        listaCoche.GridLines = True
        listaCoche.FullRowSelect = True
        listaCoche.Columns.Add("Matrícula", 80, HorizontalAlignment.Left)
        listaCoche.Columns.Add("Marca", 80, HorizontalAlignment.Left)
        listaCoche.Columns.Add("Modelo", 80, HorizontalAlignment.Left)
        listaCoche.Columns.Add("Estado", 80, HorizontalAlignment.Left)
        listaCoche.Columns.Add("Precio/Día", 80, HorizontalAlignment.Left)

        Dim nodo As nodoCoche
        nodo = Principal.coches.getPrimerCoche()

        While (nodo IsNot Nothing)
            coche = nodo.getCoche.getMatricula() + "," + nodo.getCoche.getMarca() + "," + nodo.getCoche.getModelo() + "," + nodo.getCoche.getEstado() + "," + nodo.getCoche.getPrecioDia().ToString

            linea = coche.Split(",")
            item = New ListViewItem(linea)
            listaCoche.Items.Add(item)

            nodo = nodo.getSig()
        End While

        listaCoche.AutoResizeColumns(ColumnHeaderAutoResizeStyle.ColumnContent)
        listaCoche.AutoResizeColumn(0, ColumnHeaderAutoResizeStyle.HeaderSize)
        listaCoche.AutoResizeColumn(4, ColumnHeaderAutoResizeStyle.HeaderSize)
    End Sub

    Public Sub guardarCoche(coche As String)
        Dim escritor As StreamWriter

        escritor = New StreamWriter("..\..\Ficheros\cambios.txt", True)

        escritor.Write(coche)
        escritor.Flush()
        escritor.Close()

        MsgBox("Coche eliminado correctamente")
    End Sub
End Class