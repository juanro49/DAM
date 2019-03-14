Public Class MostrarEmp
    Private Sub MostrarEmp_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Dim emp As String
        Dim linea As String()
        Dim item As ListViewItem

        Principal.empleados = ordenarEmp()

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

    Function ordenarEmp() As Empleado()
        Dim v(2) As Empleado
        Dim aux As New Empleado

        v = Principal.empleados

        For i As Integer = 1 To Principal.numEmp - 1
            For j As Integer = 0 To Principal.numEmp - 2
                Dim pos As Integer = String.Compare(v(j).getUsuario(), v(j + 1).getUsuario(), True)
                If (pos > 0) Then
                    aux = v(j)
                    v(j) = v(j + 1)
                    v(j + 1) = aux
                End If
            Next j
        Next i

        Return v
    End Function
End Class