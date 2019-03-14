Public Class ListaCurso
    Dim curso As lista = New lista
    Dim nodo As nodo
    Dim contenido As Boolean = True

    Private Sub ListaCurso_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Panel2.Hide()
    End Sub

    Private Sub btnListar_Click(sender As Object, e As EventArgs) Handles btnListar.Click
        cargarCurso()

        nodo = curso.getPrimero()

        If (nodo IsNot Nothing) Then
            txtNom.Text = nodo.getAlumno().getNombre()
            txtApe1.Text = nodo.getAlumno().getApellido1()
            txtApe2.Text = nodo.getAlumno().getApellido2()
            txtCurso.Text = nodo.getAlumno().getCurso()
            txtNota.Text = nodo.getAlumno().getNota()

            nodo = nodo.getSig()
            contenido = True
        Else
            MsgBox("No hay alumnos")
            contenido = False
        End If

        If contenido = False Then
            btnSig.Enabled = False
        Else
            btnSig.Enabled = True
        End If

        Panel2.Show()
    End Sub

    Private Sub btnSig_Click(sender As Object, e As EventArgs) Handles btnSig.Click
        If (nodo IsNot Nothing) Then
            txtNom.Text = nodo.getAlumno().getNombre()
            txtApe1.Text = nodo.getAlumno().getApellido1()
            txtApe2.Text = nodo.getAlumno().getApellido2()
            txtCurso.Text = nodo.getAlumno().getCurso()
            txtNota.Text = nodo.getAlumno().getNota()

            nodo = nodo.getSig()
        Else
            MsgBox("No hay mas alumnos")
        End If
    End Sub

    Public Sub cargarCurso()
        Dim aux As nodo = curso.getPrimero()
        Dim aux2 As nodo = Principal.alumnos.getPrimero()

        While (aux2 IsNot Nothing)
            If (aux2.getAlumno().getCurso().ToString = txtCursoL.Text.ToString) Then
                ' si la lista está vacia
                If (aux Is Nothing) Then
                    curso.setPrimero(aux2)
                    aux = curso.getPrimero()
                Else 'sino
                    aux.setSig(aux2)
                    aux = aux.getSig()

                    'Dim aux3 As nodo
                    'aux3 = curso.getPrimero()

                    ' While (aux3.getSig() IsNot Nothing)
                    'aux3 = aux3.getSig()
                    'End While

                    'aux3.setSig(aux2)
                End If
            End If

            aux2 = aux2.getSig()
        End While
    End Sub
End Class