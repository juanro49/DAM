Imports System.IO

Public Class DevCoche
    Dim existe As Boolean = False
    Dim nodoU As nodoUsu
    Private Sub BtnBuscar_Click(sender As Object, e As EventArgs) Handles btnBuscar.Click
        existe = False
        nodoU = Principal.usuarios.getPrimerUsuario()

        While (nodoU IsNot Nothing And existe = False)
            If (txtDni.Text.ToUpper = nodoU.getUsuario().getDni()) Then
                MsgBox("Usuario encontrado")
                existe = True
            End If

            If (existe = False) Then
                nodoU = nodoU.getSig()
            End If
        End While

        If (existe = True) Then
            Panel1.Show()
            mostrarAlquileres()
        Else
            Panel1.Hide()

            MsgBox("No existe el usuario")
        End If
    End Sub

    Private Sub mostrarAlquileres()
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
        listaCoche.Columns.Add("F_Alquiler", 80, HorizontalAlignment.Left)
        listaCoche.Columns.Add("F_Devolución", 80, HorizontalAlignment.Left)
        listaCoche.Columns.Add("Precio", 80, HorizontalAlignment.Left)

        If (nodoU.getUsuario.getCoche IsNot Nothing) Then
            coche = nodoU.getUsuario.getCoche().getMatricula() + "," + nodoU.getUsuario.getCoche().getMarca() + "," + nodoU.getUsuario.getCoche().getModelo() + "," + nodoU.getUsuario.getCoche().getFalquiler.ToString("dd/MM/yyyy") + "," + nodoU.getUsuario.getCoche().getFdevolucion.ToString("dd/MM/yyyy") + "," + nodoU.getUsuario.getCoche().getPrecio().ToString

            linea = coche.Split(",")
            item = New ListViewItem(linea)
            listaCoche.Items.Add(item)

            listaCoche.AutoResizeColumns(ColumnHeaderAutoResizeStyle.ColumnContent)
            listaCoche.AutoResizeColumn(0, ColumnHeaderAutoResizeStyle.HeaderSize)
            listaCoche.AutoResizeColumn(4, ColumnHeaderAutoResizeStyle.HeaderSize)
            listaCoche.AutoResizeColumn(5, ColumnHeaderAutoResizeStyle.HeaderSize)
        Else
            Panel1.Hide()
            MsgBox("El usuario no tiene ningún alquiler")
        End If
    End Sub

    Private Sub BtnDevolver_Click(sender As Object, e As EventArgs) Handles btnDevolver.Click
        Dim dev As String
        Dim nodo As nodoCoche
        nodo = Principal.coches.getPrimerCoche()

        While (nodo IsNot Nothing)
            If (nodo.getCoche.getMatricula().Equals(listaCoche.SelectedItems.Item(0).SubItems(0).Text)) Then
                nodo.getCoche.setEstado("libre")
            End If

            nodo = nodo.getSig()
        End While

        nodoU.getUsuario.setCoche(Nothing)

        dev = "devCoche#" + listaCoche.SelectedItems.Item(0).SubItems(0).Text + "#" + nodoU.getUsuario().getDni() + vbCrLf
        guardarDevolucion(dev)
        mostrarAlquileres()
    End Sub

    Private Sub DevCoche_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Panel1.Hide()
    End Sub

    Public Sub guardarDevolucion(dev As String)
        Dim escritor As StreamWriter

        escritor = New StreamWriter("..\..\Ficheros\cambios.txt", True)

        escritor.Write(dev)
        escritor.Flush()
        escritor.Close()

        MsgBox("Coche devuelto correctamente")
    End Sub
End Class