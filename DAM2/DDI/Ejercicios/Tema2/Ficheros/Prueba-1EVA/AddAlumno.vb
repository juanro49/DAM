Public Class AddAlumno
    Private Sub btnAdd_Click(sender As Object, e As EventArgs) Handles btnAdd.Click

        Principal.alumnos.insertar(txtNom.Text, txtApe1.Text, txtApe2.Text, txtCurso.Text, Val(txtNota.Text))

        txtNom.Text = Nothing
        txtApe1.Text = Nothing
        txtApe2.Text = Nothing
        txtCurso.Text = Nothing
        txtNota.Text = Nothing
    End Sub
End Class