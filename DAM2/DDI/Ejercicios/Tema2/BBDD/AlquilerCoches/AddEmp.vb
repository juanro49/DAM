Imports System.IO

Public Class AddEmp
    Private Sub BtnAdd_Click(sender As Object, e As EventArgs) Handles btnAdd.Click
        Dim add As Boolean = False
        Dim existe As Boolean = False
        Dim empleado As String

        If (comprobarDatos()) Then
            For i As Integer = 0 To Principal.numEmp - 1
                If (Principal.empleados(i).getUsuario.ToUpper.Equals(txtUsu.Text.ToUpper)) Then
                    existe = True
                    MsgBox("El usuario ya existe")
                End If
            Next i

            If (Not existe) Then
                For i As Integer = 0 To Principal.empleados.Length - 1
                    If (Principal.empleados(i) Is Nothing And add = False) Then
                        Dim emp As New Empleado(txtUsu.Text, txtCont.Text, cbTipo.SelectedItem.ToString, txtCorreo.Text)

                        Principal.empleados(i) = emp
                        empleado = "addEmp" + "#" + txtUsu.Text + "#" + txtCont.Text + "#" + cbTipo.SelectedItem.ToString + "#" + txtCorreo.Text + vbCrLf
                        guardarEmpleado(empleado)

                        Principal.numEmp += 1
                        add = True
                    End If
                Next i
            End If
        End If
    End Sub

    Public Sub guardarEmpleado(emp As String)
        Dim escritor As StreamWriter

        escritor = New StreamWriter("..\..\Ficheros\cambios.txt", True)

        escritor.Write(emp)
        escritor.Flush()
        escritor.Close()

        MsgBox("Empleado dado de alta")
    End Sub
    Function comprobarDatos() As Boolean

        If (txtUsu.Text = Nothing) Then
            MsgBox("El usuario es obligatorio")
            Return False
        End If

        If (txtCont.Text = Nothing) Then
            MsgBox("La contraseña es obligatoria")
            Return False
        End If

        If (txtRcont.Text = Nothing) Then
            MsgBox("Repite la contraseña")
            Return False
        End If

        If (cbTipo.SelectedItem = Nothing) Then
            MsgBox("El tipo es obligatorio")
            Return False
        End If

        If (Not txtCont.Text.Equals(txtRcont.Text)) Then
            MsgBox("Las contraseñas no coinciden")
            Return False
        End If

        If (Principal.numEmp = 3) Then
            MsgBox("No se pueden contratar mas empleados")
            Return False
        End If

        Return True
    End Function
End Class