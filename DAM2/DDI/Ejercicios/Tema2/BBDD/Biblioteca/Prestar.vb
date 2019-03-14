Imports System.Globalization
Imports System.IO

Public Class Prestar
    Dim existe As Boolean = False
    Dim lleno As Boolean = True
    Dim nodoU As nodoUsu
    Dim pres As String

    Private Sub Prestar_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Panel1.Hide()
        Panel2.Hide()
        listarLibros()
    End Sub

    Private Sub btnBuscar_Click(sender As Object, e As EventArgs) Handles btnBuscar.Click
        existe = False

        nodoU = Biblioteca.usuarios.getPrimerUsuario()
        While (nodoU IsNot Nothing And existe = False)
            If (txtCarnet.Text = nodoU.getUsuario().getDni()) Then
                MsgBox("Usuario encontrado")
                existe = True

                labNom.Text = nodoU.getUsuario().getNombre()
                Panel1.Show()

                If (nodoU.getUsuario().getLibros().GetValue(0) IsNot Nothing) Then
                    labLibpres1.Text = nodoU.getUsuario().getLibros().GetValue(0).getTitulo() + " de " + nodoU.getUsuario().getLibros().GetValue(0).getAutor()
                    labPresfech1.Text = nodoU.getUsuario().getLibros().GetValue(0).getFecha()
                Else
                    labLibpres1.Text = ""
                    labPresfech1.Text = ""
                End If

                If (nodoU.getUsuario().getLibros().GetValue(1) IsNot Nothing) Then
                    labLibpres2.Text = nodoU.getUsuario().getLibros().GetValue(1).getTitulo() + " de " + nodoU.getUsuario().getLibros().GetValue(1).getAutor()
                    labPresfech2.Text = nodoU.getUsuario().getLibros().GetValue(1).getFecha()
                Else
                    labLibpres2.Text = ""
                    labPresfech2.Text = ""
                End If

                If (nodoU.getUsuario().getLibros().GetValue(2) IsNot Nothing) Then
                    labLibpres3.Text = nodoU.getUsuario().getLibros().GetValue(2).getTitulo() + " de " + nodoU.getUsuario().getLibros().GetValue(2).getAutor()
                    labPresfech3.Text = nodoU.getUsuario().getLibros().GetValue(2).getFecha()
                Else
                    labLibpres3.Text = ""
                    labPresfech3.Text = ""
                End If

                For j As Integer = 0 To nodoU.getUsuario().getLibros().Length - 1 And lleno = True
                    If (nodoU.getUsuario().getLibros().GetValue(j) Is Nothing) Then
                        lleno = False
                    End If
                Next j
            End If

            If (existe = False) Then
                nodoU = nodoU.getSig()
            End If
        End While

        If (existe = True) Then
            Panel2.Show()
        Else
            Panel2.Hide()
            MsgBox("No existe el usuario")
        End If
    End Sub

    Private Sub btnPrestar_Click(sender As Object, e As EventArgs) Handles btnPrestar.Click
        Dim disponible As Boolean = False
        lleno = True

        For j As Integer = 0 To nodoU.getUsuario().getLibros().Length - 1 And lleno = True
            If (nodoU.getUsuario().getLibros().GetValue(j) Is Nothing) Then
                lleno = False
            End If
        Next j

        Dim nodoL As nodoLibro
        nodoL = Biblioteca.libros.getPrimerLibro()

        While (nodoL IsNot Nothing)
            If (listaLibros.SelectedItems.Item(0).SubItems(0).Text = nodoL.getLibro().getIsbn().ToString And nodoL.getLibro().getCantidad > 0 And lleno = False) Then
                nodoL.getLibro().setCantidad(nodoL.getLibro().getCantidad() - 1)
                disponible = True
            End If

            nodoL = nodoL.getSig()
        End While

        If (lleno) Then
            MsgBox("Al usuario " + nodoU.getUsuario().getNombre() + " " + nodoU.getUsuario().getApellidos() + " no se le pueden asignar mas libros")
        ElseIf (disponible) Then
            Dim fecha As DateTime

            fecha = DateTime.ParseExact(InputBox("Introduce la fecha del préstamo en formato dd/MM/aaaa", "Fecha préstamo", DateTime.Now.ToString("dd/MM/yyyy")), "dd/MM/yyyy", CultureInfo.CurrentCulture)

            Dim prestamo = New prestamos(listaLibros.SelectedItems.Item(0).SubItems(1).Text, listaLibros.SelectedItems.Item(0).SubItems(2).Text, listaLibros.SelectedItems.Item(0).SubItems(0).Text, fecha)
            nodoU.getUsuario().setLibro(prestamo)


            pres = fecha.ToString("yyyy-MM-dd") + "#" + nodoU.getUsuario.getDni + "#" + listaLibros.SelectedItems.Item(0).SubItems(1).Text + "#" + listaLibros.SelectedItems.Item(0).SubItems(2).Text + "#" + listaLibros.SelectedItems.Item(0).SubItems(0).Text & vbCrLf
            guardarPrestamo(pres)
        Else
            MsgBox("No hay mas existencias del libro " + listaLibros.SelectedItems.Item(0).SubItems(1).Text + " de " + listaLibros.SelectedItems.Item(0).SubItems(2).Text)
        End If

        If (nodoU.getUsuario().getLibros().GetValue(0) IsNot Nothing) Then
            labLibpres1.Text = nodoU.getUsuario().getLibros().GetValue(0).getTitulo() + " de " + nodoU.getUsuario().getLibros().GetValue(0).getAutor()
            labPresfech1.Text = nodoU.getUsuario().getLibros().GetValue(0).getFecha()
        Else
            labLibpres1.Text = ""
            labPresfech1.Text = ""
        End If

        If (nodoU.getUsuario().getLibros().GetValue(1) IsNot Nothing) Then
            labLibpres2.Text = nodoU.getUsuario().getLibros().GetValue(1).getTitulo() + " de " + nodoU.getUsuario().getLibros().GetValue(1).getAutor()
            labPresfech2.Text = nodoU.getUsuario().getLibros().GetValue(1).getFecha()
        Else
            labLibpres2.Text = ""
            labPresfech2.Text = ""
        End If

        If (nodoU.getUsuario().getLibros().GetValue(2) IsNot Nothing) Then
            labLibpres3.Text = nodoU.getUsuario().getLibros().GetValue(2).getTitulo() + " de " + nodoU.getUsuario().getLibros().GetValue(2).getAutor()
            labPresfech3.Text = nodoU.getUsuario().getLibros().GetValue(2).getFecha()
        Else
            labLibpres3.Text = ""
            labPresfech3.Text = ""
        End If

        listarLibros()
    End Sub


    Private Sub btnDevolver_Click(sender As Object, e As EventArgs) Handles btnDevolver.Click
        Dim nombre As String = listaLibros.SelectedItems.Item(0).SubItems(1).Text + " de " + listaLibros.SelectedItems.Item(0).SubItems(2).Text

        If (nodoU.getUsuario().delLibro(nombre)) Then
            Dim nodoL As nodoLibro
            nodoL = Biblioteca.libros.getPrimerLibro()

            While (nodoL IsNot Nothing)
                If (listaLibros.SelectedItems.Item(0).SubItems(0).Text = nodoL.getLibro().getIsbn().ToString) Then
                    nodoL.getLibro().setCantidad(nodoL.getLibro().getCantidad() + 1)

                    pres = "devolucion#" + nodoU.getUsuario.getDni + "#" + listaLibros.SelectedItems.Item(0).SubItems(1).Text + "#" + listaLibros.SelectedItems.Item(0).SubItems(2).Text + "#" + listaLibros.SelectedItems.Item(0).SubItems(0).Text & vbCrLf
                    guardarPrestamo(pres)
                End If

                nodoL = nodoL.getSig()
            End While
        End If

        If (nodoU.getUsuario().getLibros().GetValue(0) IsNot Nothing) Then
            labLibpres1.Text = nodoU.getUsuario().getLibros().GetValue(0).getTitulo() + " de " + nodoU.getUsuario().getLibros().GetValue(0).getAutor()
            labPresfech1.Text = nodoU.getUsuario().getLibros().GetValue(0).getFecha()
        Else
            labLibpres1.Text = ""
            labPresfech1.Text = ""
        End If

        If (nodoU.getUsuario().getLibros().GetValue(1) IsNot Nothing) Then
            labLibpres2.Text = nodoU.getUsuario().getLibros().GetValue(1).getTitulo() + " de " + nodoU.getUsuario().getLibros().GetValue(1).getAutor()
            labPresfech2.Text = nodoU.getUsuario().getLibros().GetValue(1).getFecha()
        Else
            labLibpres2.Text = ""
            labPresfech2.Text = ""
        End If

        If (nodoU.getUsuario().getLibros().GetValue(2) IsNot Nothing) Then
            labLibpres3.Text = nodoU.getUsuario().getLibros().GetValue(2).getTitulo() + " de " + nodoU.getUsuario().getLibros().GetValue(2).getAutor()
            labPresfech3.Text = nodoU.getUsuario().getLibros().GetValue(2).getFecha()
        Else
            labLibpres3.Text = ""
            labPresfech3.Text = ""
        End If

        listarLibros()
    End Sub

    Private Sub listarLibros()
        Dim libro As String
        Dim linea As String()
        Dim item As ListViewItem

        listaLibros.Clear()

        listaLibros.View = View.Details
        listaLibros.GridLines = True
        listaLibros.FullRowSelect = True
        listaLibros.Columns.Add("ISBN", 80, HorizontalAlignment.Left)
        listaLibros.Columns.Add("Titulo", 150, HorizontalAlignment.Left)
        listaLibros.Columns.Add("Autor", 150, HorizontalAlignment.Left)
        listaLibros.Columns.Add("Cantidad", 80, HorizontalAlignment.Left)

        Dim nodo As nodoLibro
        nodo = Biblioteca.libros.getPrimerLibro()

        While (nodo IsNot Nothing)
            libro = nodo.getLibro.getIsbn().ToString + "," + nodo.getLibro.getTitulo() + "," + nodo.getLibro.getAutor() + "," + nodo.getLibro.getCantidad().ToString

            linea = libro.Split(",")
            item = New ListViewItem(linea)

            listaLibros.Items.Add(item)

            nodo = nodo.getSig()
        End While
    End Sub

    Public Sub guardarPrestamo(pres As String)
        Dim escritor As StreamWriter
        Dim campo() As String = pres.Split("#")
        escritor = New StreamWriter("..\..\Ficheros\backPres.txt", True)

        escritor.Write(pres)
        escritor.Flush()
        escritor.Close()

        If (campo(0).Equals("devolucion")) Then
            MsgBox("Libro devuelto")
        Else
            MsgBox("Libro prestado")
        End If
    End Sub
End Class