Public Class MostrarCoche
    Private Sub MostrarCoche_Load(sender As Object, e As EventArgs) Handles MyBase.Load
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
End Class