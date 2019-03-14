Imports System.IO

Public Class DelEmp
    Private Sub DelEmp_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        mostrarEmpleados()
    End Sub

    Private Sub BynEliminar_Click(sender As Object, e As EventArgs) Handles bynEliminar.Click
        Dim emp As String
        For i As Integer = 0 To Principal.numEmp - 1
            If (listaEmp.SelectedItems(0).SubItems(0).Text.Equals(Principal.empleados(i).getUsuario())) Then
                Principal.empleados(i) = Nothing
                Principal.numEmp -= 1

                emp = "delEmp#" + listaEmp.SelectedItems(0).SubItems(0).Text + vbCrLf
                guardarEmpleado(emp)
            End If
        Next i

        alinearEmpleados()

        mostrarEmpleados()
    End Sub

    Private Sub mostrarEmpleados()
        Dim emp As String
        Dim linea As String()
        Dim item As ListViewItem

        Principal.empleados = MostrarEmp.ordenarEmp()

        listaEmp.Clear()

        listaEmp.View = View.Details
        listaEmp.GridLines = True
        listaEmp.FullRowSelect = True
        listaEmp.Columns.Add("Usuario", 80, HorizontalAlignment.Left)
        listaEmp.Columns.Add("Tipo", 80, HorizontalAlignment.Left)
        listaEmp.Columns.Add("Correo", 80, HorizontalAlignment.Left)

        For i As Integer = 0 To Principal.numEmp - 1
            If (Principal.empleados(i) IsNot Nothing) Then
                emp = Principal.empleados(i).getUsuario() + "," + Principal.empleados(i).getTipo() + "," + Principal.empleados(i).getCorreo()

                linea = emp.Split(",")
                item = New ListViewItem(linea)
                listaEmp.Items.Add(item)
            End If
        Next

        listaEmp.AutoResizeColumns(ColumnHeaderAutoResizeStyle.ColumnContent)
    End Sub

    Private Sub alinearEmpleados()
        For i As Integer = 0 To Principal.empleados.Length - 1
            If i < Principal.empleados.Length - 1 Then
                If (Principal.empleados(i) Is Nothing And Principal.empleados(i + 1) IsNot Nothing) Then
                    Principal.empleados(i) = Principal.empleados(i + 1)
                    Principal.empleados(i + 1) = Nothing
                End If
            End If
        Next i
    End Sub

    Public Sub guardarEmpleado(emp As String)
        Dim escritor As StreamWriter

        escritor = New StreamWriter("..\..\Ficheros\cambios.txt", True)

        escritor.Write(emp)
        escritor.Flush()
        escritor.Close()

        MsgBox("Empleado eliminado correctamente")
    End Sub
End Class