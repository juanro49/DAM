Imports MySql.Data.MySqlClient

Public Class Conectar
    Public conexion As New MySqlConnection

    Private Sub BtnConectar_Click(sender As Object, e As EventArgs) Handles btnConectar.Click
        Dim conectado As Boolean = conectar()

        If conectado Then
            Dim tipo As String = comprobar(txtUsu.Text, txtCont.Text)

            If (tipo.ToLower.Equals("jefe")) Then
                Me.Hide()

                Principal.lbUsu.Text = txtUsu.Text.ToUpper
                Principal.Show()
            Else
                If (Not tipo.Equals("No")) Then
                    Me.Hide()
                    Principal.mAddEmp.Visible = False
                    Principal.mDelEmp.Visible = False
                    Principal.mAddCoche.Visible = False
                    Principal.mDelCoche.Visible = False

                    Principal.lbUsu.Text = txtUsu.Text.ToUpper
                    Principal.Show()
                End If
            End If
        End If
    End Sub

    Function conectar() As Boolean
        If conexion.State() = 0 Then
            Try
                conexion.ConnectionString = "server = localhost; database = alquiler_coches; user id = root; password=;"
                conexion.Open()
                MsgBox("Conexión realizada con éxito")
                Return True
            Catch ex As Exception
                MsgBox("No se ha podido realizar la conexion")
                Return False
            End Try
        Else
            Return True
        End If
    End Function

    Function comprobar(usuario As String, contrasena As String) As String
        Dim dataAdapter As New MySqlDataAdapter
        Dim dt As New DataTable
        Dim consulta As String

        consulta = "select tipo from empleados where usuario = '" + usuario + "' and contrasena = '" + contrasena + "'"

        dataAdapter = New MySqlDataAdapter(consulta, conexion)
        dataAdapter.Fill(dt)

        If (dt.Rows.Count = 0) Then
            MsgBox("Usuario no dado de alta en el Sistema")
            Return "No"
        Else
            Dim tipo As String = Convert.ToString(dt.Rows(0)("tipo"))
            Return tipo
        End If
    End Function

    Private Sub CbMosCont_CheckedChanged(sender As Object, e As EventArgs) Handles cbMosCont.CheckedChanged
        txtCont.UseSystemPasswordChar = Not cbMosCont.Checked
    End Sub
End Class