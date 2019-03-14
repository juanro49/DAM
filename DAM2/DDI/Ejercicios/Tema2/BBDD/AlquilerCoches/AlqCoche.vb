Imports System.IO

Public Class AlqCoche
    Dim existe As Boolean = False
    Dim nodoU As nodoUsu
    Private Sub AlqCoche_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        mostrarCoches()
        Panel1.Hide()
    End Sub

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
        Else
            Panel1.Hide()

            MsgBox("No existe el usuario")
        End If
    End Sub

    Private Sub BtnAlquilar_Click(sender As Object, e As EventArgs) Handles btnAlquilar.Click
        Dim alq As String

        Try
            If (nodoU.getUsuario.getCoche() Is Nothing) Then
                If (listaCoche.SelectedItems.Item(0).SubItems(3).Text.Equals("libre")) Then
                    Dim alquiler = New Alquiler(listaCoche.SelectedItems.Item(0).SubItems(0).Text, listaCoche.SelectedItems.Item(0).SubItems(1).Text, listaCoche.SelectedItems.Item(0).SubItems(2).Text, Date.Now, dtFecha.Value, Val(labTotal.Text))
                    nodoU.getUsuario.setCoche(alquiler)

                    Dim nodo As nodoCoche
                    nodo = Principal.coches.getPrimerCoche()

                    While (nodo IsNot Nothing)
                        If (nodo.getCoche.getMatricula().Equals(listaCoche.SelectedItems.Item(0).SubItems(0).Text)) Then
                            nodo.getCoche.setEstado("prestado")
                        End If

                        nodo = nodo.getSig()
                    End While

                    alq = "alqCoche" + "#" + nodoU.getUsuario.getDni() + "#" + listaCoche.SelectedItems.Item(0).SubItems(0).Text + "#" + listaCoche.SelectedItems.Item(0).SubItems(1).Text + "#" + listaCoche.SelectedItems.Item(0).SubItems(2).Text + "#" + Date.Now.ToString("yyyy-MM-dd") + "#" + dtFecha.Value.ToString("yyyy-MM-dd") + "#" + labTotal.Text & vbCrLf
                    guardarAlquiler(alq)
                    MsgBox("El coche con matrícula " + listaCoche.SelectedItems.Item(0).SubItems(0).Text + " se ha alquilado al usuario con DNI " + nodoU.getUsuario.getDni())
                Else
                    MsgBox("Este coche ya está alquilado")
                End If
            Else
                MsgBox("Este usuario ya tiene un coche alquilado")
            End If
        Catch ex As Exception
            MsgBox("Selecciona un coche")
        End Try

        mostrarCoches()
    End Sub

    Private Sub DtFecha_ValueChanged(sender As Object, e As EventArgs) Handles dtFecha.ValueChanged
        Try
            labTotal.Text = (dtFecha.Value.DayOfYear - Date.Now.DayOfYear) * Val(listaCoche.SelectedItems.Item(0).SubItems(4).Text)
        Catch ex As Exception
            MsgBox("Selecciona un coche")
        End Try
    End Sub

    Private Sub ListaCoche_MouseClick(sender As Object, e As MouseEventArgs) Handles listaCoche.MouseClick
        Try
            labTotal.Text = (dtFecha.Value.DayOfYear - Date.Now.DayOfYear) * Val(listaCoche.SelectedItems.Item(0).SubItems(4).Text)
        Catch ex As Exception
            MsgBox("Selecciona un coche")
        End Try
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

    Public Sub guardarAlquiler(alq As String)
        Dim escritor As StreamWriter

        escritor = New StreamWriter("..\..\Ficheros\cambios.txt", True)

        escritor.Write(alq)
        escritor.Flush()
        escritor.Close()
    End Sub
End Class