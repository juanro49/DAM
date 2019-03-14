Public Class usuarios
    Private carnet, contr, sede As String

    Public Sub New(carnet As String, contr As String, sede As String)
        Me.setCarnet(carnet)
        Me.setContrasena(contr)
        Me.setSede(sede)
    End Sub

    Public Sub setCarnet(car As String)
        Me.carnet = car
    End Sub

    Public Sub setContrasena(con As String)
        Me.contr = con
    End Sub

    Public Sub setSede(se As String)
        Me.sede = se
    End Sub

    Function getCarnet() As String
        Return Me.carnet
    End Function

    Function getContrasena() As String
        Return Me.contr
    End Function

    Function getSede() As String
        Return Me.sede
    End Function
End Class
