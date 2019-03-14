Public Class Alquiler
    Private matricula, marca, modelo As String
    Private fAlquiler, fDevolucion As Date
    Private precio As Integer

    Public Sub New(matricula As String, marca As String, modelo As String, fAlquiler As Date, fDevolucion As Date, precio As Integer)
        Me.matricula = matricula
        Me.marca = marca
        Me.modelo = modelo
        Me.fAlquiler = fAlquiler
        Me.fDevolucion = fDevolucion
        Me.precio = precio
    End Sub

    Public Sub setMatricula(matri As String)
        Me.matricula = matri
    End Sub

    Function getMatricula() As String
        Return Me.matricula
    End Function

    Public Sub setMarca(mar As String)
        Me.marca = mar
    End Sub

    Function getMarca() As String
        Return Me.marca
    End Function

    Public Sub setModelo(modelo As String)
        Me.modelo = modelo
    End Sub

    Function getModelo() As String
        Return Me.modelo
    End Function

    Public Sub setFalquiler(fAlqui As Date)
        Me.fAlquiler = fAlqui
    End Sub

    Function getFalquiler() As Date
        Return Me.fAlquiler
    End Function

    Public Sub setFdevolucion(fDev As Date)
        Me.fDevolucion = fDev
    End Sub

    Function getFdevolucion() As Date
        Return Me.fDevolucion
    End Function

    Public Sub setPrecio(pre As Integer)
        Me.precio = pre
    End Sub

    Function getPrecio() As Integer
        Return Me.precio
    End Function
End Class
