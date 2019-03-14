Public Class Form1

    Dim factual As Date
    Dim fnac As Date

    Private Sub btnSalir_Click(sender As Object, e As EventArgs) Handles btnSalir.Click
        Me.Close()
    End Sub

    Private Sub btnCalc_Click(sender As Object, e As EventArgs) Handles btnCalc.Click
        factual = Today
        fnac = txtFnac.Text

        txtEdad.Text = Cedad()
        txtHoras.Text = DateDiff(DateInterval.Hour, fnac, factual, FirstDayOfWeek.Monday, FirstWeekOfYear.Jan1)
        txtVividos.Text = DateDiff(DateInterval.DayOfYear, fnac, factual, FirstDayOfWeek.Monday, FirstWeekOfYear.Jan1)

    End Sub

    Function Cedad() As Integer
        Dim edad As Integer
        edad = factual.Year - fnac.Year

        If (fnac > factual.AddYears(-edad)) Then
            edad -= 1
        End If

        Return edad
    End Function
End Class
