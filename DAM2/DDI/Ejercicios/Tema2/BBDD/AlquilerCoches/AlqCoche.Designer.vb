<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class AlqCoche
    Inherits System.Windows.Forms.Form

    'Form reemplaza a Dispose para limpiar la lista de componentes.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Requerido por el Diseñador de Windows Forms
    Private components As System.ComponentModel.IContainer

    'NOTA: el Diseñador de Windows Forms necesita el siguiente procedimiento
    'Se puede modificar usando el Diseñador de Windows Forms.  
    'No lo modifique con el editor de código.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.listaCoche = New System.Windows.Forms.ListView()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.txtDni = New System.Windows.Forms.TextBox()
        Me.btnAlquilar = New System.Windows.Forms.Button()
        Me.btnBuscar = New System.Windows.Forms.Button()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.dtFecha = New System.Windows.Forms.DateTimePicker()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.labTotal = New System.Windows.Forms.Label()
        Me.Panel1 = New System.Windows.Forms.Panel()
        Me.Panel1.SuspendLayout()
        Me.SuspendLayout()
        '
        'listaCoche
        '
        Me.listaCoche.Dock = System.Windows.Forms.DockStyle.Top
        Me.listaCoche.Location = New System.Drawing.Point(0, 0)
        Me.listaCoche.Name = "listaCoche"
        Me.listaCoche.Size = New System.Drawing.Size(345, 247)
        Me.listaCoche.TabIndex = 4
        Me.listaCoche.UseCompatibleStateImageBehavior = False
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(40, 24)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(152, 13)
        Me.Label1.TabIndex = 5
        Me.Label1.Text = "Introduce el DNI de un usuario"
        '
        'txtDni
        '
        Me.txtDni.Location = New System.Drawing.Point(43, 49)
        Me.txtDni.Name = "txtDni"
        Me.txtDni.Size = New System.Drawing.Size(149, 20)
        Me.txtDni.TabIndex = 6
        '
        'btnAlquilar
        '
        Me.btnAlquilar.Location = New System.Drawing.Point(214, 304)
        Me.btnAlquilar.Name = "btnAlquilar"
        Me.btnAlquilar.Size = New System.Drawing.Size(75, 23)
        Me.btnAlquilar.TabIndex = 7
        Me.btnAlquilar.Text = "Alquilar"
        Me.btnAlquilar.UseVisualStyleBackColor = True
        '
        'btnBuscar
        '
        Me.btnBuscar.Location = New System.Drawing.Point(222, 47)
        Me.btnBuscar.Name = "btnBuscar"
        Me.btnBuscar.Size = New System.Drawing.Size(75, 23)
        Me.btnBuscar.TabIndex = 8
        Me.btnBuscar.Text = "Buscar"
        Me.btnBuscar.UseVisualStyleBackColor = True
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(16, 268)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(95, 13)
        Me.Label2.TabIndex = 9
        Me.Label2.Text = "Fecha devolución:"
        '
        'dtFecha
        '
        Me.dtFecha.Format = System.Windows.Forms.DateTimePickerFormat.[Short]
        Me.dtFecha.Location = New System.Drawing.Point(127, 263)
        Me.dtFecha.Name = "dtFecha"
        Me.dtFecha.Size = New System.Drawing.Size(92, 20)
        Me.dtFecha.TabIndex = 10
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(236, 268)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(34, 13)
        Me.Label3.TabIndex = 11
        Me.Label3.Text = "Total:"
        '
        'labTotal
        '
        Me.labTotal.AutoSize = True
        Me.labTotal.Location = New System.Drawing.Point(276, 268)
        Me.labTotal.Name = "labTotal"
        Me.labTotal.Size = New System.Drawing.Size(13, 13)
        Me.labTotal.TabIndex = 12
        Me.labTotal.Text = "0"
        '
        'Panel1
        '
        Me.Panel1.Controls.Add(Me.listaCoche)
        Me.Panel1.Controls.Add(Me.labTotal)
        Me.Panel1.Controls.Add(Me.btnAlquilar)
        Me.Panel1.Controls.Add(Me.Label3)
        Me.Panel1.Controls.Add(Me.Label2)
        Me.Panel1.Controls.Add(Me.dtFecha)
        Me.Panel1.Dock = System.Windows.Forms.DockStyle.Bottom
        Me.Panel1.Location = New System.Drawing.Point(0, 107)
        Me.Panel1.Name = "Panel1"
        Me.Panel1.Size = New System.Drawing.Size(345, 343)
        Me.Panel1.TabIndex = 13
        '
        'AlqCoche
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(345, 450)
        Me.Controls.Add(Me.Panel1)
        Me.Controls.Add(Me.btnBuscar)
        Me.Controls.Add(Me.txtDni)
        Me.Controls.Add(Me.Label1)
        Me.Name = "AlqCoche"
        Me.Text = "AlqCoche"
        Me.Panel1.ResumeLayout(False)
        Me.Panel1.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents listaCoche As ListView
    Friend WithEvents Label1 As Label
    Friend WithEvents txtDni As TextBox
    Friend WithEvents btnAlquilar As Button
    Friend WithEvents btnBuscar As Button
    Friend WithEvents Label2 As Label
    Friend WithEvents dtFecha As DateTimePicker
    Friend WithEvents Label3 As Label
    Friend WithEvents labTotal As Label
    Friend WithEvents Panel1 As Panel
End Class
