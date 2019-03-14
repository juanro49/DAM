Imports System.IO

Public Class DelUsu
    Private Sub DelUsu_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        mostrarUsuarios()
    End Sub

    Private Sub BynEliminar_Click(sender As Object, e As EventArgs) Handles bynEliminar.Click
        Dim usu As String

        If (Principal.usuarios.eliminarUsuario(listaUsu.SelectedItems(0).SubItems(0).Text)) Then
            usu = "delUsu#" + listaUsu.SelectedItems(0).SubItems(0).Text + vbCrLf
            guardarUsuario(usu)
        Else
            MsgBox("No se puede eliminar un usuario con un coche alquilado")
        End If

        mostrarUsuarios()
    End Sub

    Private Sub mostrarUsuarios()
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

    Public Sub guardarUsuario(usu As String)
        Dim escritor As StreamWriter

        escritor = New StreamWriter("..\..\Ficheros\cambios.txt", True)

        escritor.Write(usu)
        escritor.Flush()
        escritor.Close()

        MsgBox("Usuario eliminado correctamente")
    End Sub
End Class