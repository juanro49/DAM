Imports System.IO

Public Class Principal
    Public alumnos As New lista
    Dim fichero As System.IO.StreamReader
    Dim escritor As StreamWriter

    Private Sub SalirToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles SalirToolStripMenuItem.Click
        escribir()
        Me.Close()
    End Sub

    Private Sub Principal_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        cargarAlumnos()
    End Sub

    Public Sub cargarAlumnos()
        Dim nom, ape1, ape2, curso As String
        Dim nota As Integer
        Dim fin As Boolean = False

        Try
            fichero = My.Computer.FileSystem.OpenTextFileReader("F:\alumnos.txt")
        Catch ex As Exception
            MsgBox("Error al cargar los alumnos")
        End Try

        While fin = False
            Dim existe As Boolean = False
            Dim linea As String = ""
            Dim campo As String()

            linea = fichero.ReadLine()

            If linea IsNot Nothing Then
                campo = linea.Split("#")

                nom = campo(0)
                ape1 = campo(1)
                ape2 = campo(2)
                curso = campo(3)
                nota = Val(campo(4))

                alumnos.insertar(nom, ape1, ape2, curso, nota)
            Else
                fin = True
                MsgBox("Alumnos cargados")
            End If
        End While
    End Sub

    Private Sub AñadirToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles AñadirToolStripMenuItem.Click
        AddAlumno.Show()
    End Sub

    Private Sub ListarAlumnosDeUnCursoToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles ListarAlumnosDeUnCursoToolStripMenuItem.Click
        ListaCurso.Show()
    End Sub

    Public Sub escribir()
        Dim aux As nodo = alumnos.getPrimero()
        escritor = New StreamWriter("F:\salida.txt", True)

        Dim linea As String


        While (aux IsNot Nothing)
            linea = aux.getAlumno.getNombre() + "#" + aux.getAlumno.getApellido1() + "#" + aux.getAlumno.getApellido2() + "#" + aux.getAlumno.getCurso() + "#" + aux.getAlumno.getNota().ToString & vbCrLf
            escritor.Write(linea)
            escritor.Flush()

            aux = aux.getSig()
        End While

        escritor.Close()
    End Sub
End Class
