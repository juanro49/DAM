Public Class MostrarUsu
    Private Sub MostrarUsu_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Dim usu As String
        Dim linea As String()
        Dim item As ListViewItem

        listaUsu.Clear()

        listaUsu.View = View.Details
        listaUsu.GridLines = True
        listaUsu.FullRowSelect = True
        listaUsu.Columns.Add("DNI", 80, HorizontalAlignment.Left)
        listaUsu.Columns.Add("Nombre", 80, HorizontalAlignment.Left)
        listaUsu.Columns.Add("Apellido", 80, HorizontalAlignment.Left)
        listaUsu.Columns.Add("Teléfono", 80, HorizontalAlignment.Left)
        listaUsu.Columns.Add("Correo", 80, HorizontalAlignment.Left)
        listaUsu.Columns.Add("Alquiler", 80, HorizontalAlignment.Left)

        Dim nodo As nodoUsu
        nodo = Principal.usuarios.getPrimerUsuario()

        While (nodo IsNot Nothing)
            If (nodo.getUsuario.getCoche() IsNot Nothing) Then
                usu = nodo.getUsuario.getDni + "," + nodo.getUsuario.getNombre + "," + nodo.getUsuario.getApellido + "," + nodo.getUsuario.getTelefono.ToString + "," + nodo.getUsuario.getCorreo + "," + nodo.getUsuario.getCoche.getMatricula() + " " + nodo.getUsuario.getCoche.getMarca() + " " + nodo.getUsuario.getCoche.getModelo()
            Else
                usu = nodo.getUsuario.getDni + "," + nodo.getUsuario.getNombre + "," + nodo.getUsuario.getApellido + "," + nodo.getUsuario.getTelefono.ToString + "," + nodo.getUsuario.getCorreo
            End If

            linea = usu.Split(",")
            item = New ListViewItem(linea)
            listaUsu.Items.Add(item)

            nodo = nodo.getSig()
        End While

        listaUsu.AutoResizeColumns(ColumnHeaderAutoResizeStyle.ColumnContent)
    End Sub
End Class