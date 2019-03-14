<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class DevCoche
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
        Me.Panel1 = New System.Windows.Forms.Panel()
        Me.listaCoche = New System.Windows.Forms.ListView()
        Me.btnDevolver = New System.Windows.Forms.Button()
        Me.btnBuscar = New System.Windows.Forms.Button()
        Me.txtDni = New System.Windows.Forms.TextBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Panel1.SuspendLayout()
        Me.SuspendLayout()
        '
        'Panel1
        '
        Me.Panel1.Controls.Add(Me.listaCoche)
        Me.Panel1.Controls.Add(Me.btnDevolver)
        Me.Panel1.Dock = System.Windows.Forms.DockStyle.Bottom
        Me.Panel1.Location = New System.Drawing.Point(0, 80)
        Me.Panel1.Name = "Panel1"
        Me.Panel1.Size = New System.Drawing.Size(360, 114)
        Me.Panel1.TabIndex = 17
        '
        'listaCoche
        '
        Me.listaCoche.Dock = System.Windows.Forms.DockStyle.Top
        Me.listaCoche.Location = New System.Drawing.Point(0, 0)
        Me.listaCoche.Name = "listaCoche"
        Me.listaCoche.Size = New System.Drawing.Size(360, 69)
        Me.listaCoche.TabIndex = 4
        Me.listaCoche.UseCompatibleStateImageBehavior = False
        '
        'btnDevolver
        '
        Me.btnDevolver.Location = New System.Drawing.Point(129, 75)
        Me.btnDevolver.Name = "btnDevolver"
        Me.btnDevolver.Size = New System.Drawing.Size(75, 23)
        Me.btnDevolver.TabIndex = 7
        Me.btnDevolver.Text = "Devolver"
        Me.btnDevolver.UseVisualStyleBackColor = True
        '
        'btnBuscar
        '
        Me.btnBuscar.Location = New System.Drawing.Point(222, 35)
        Me.btnBuscar.Name = "btnBuscar"
        Me.btnBuscar.Size = New System.Drawing.Size(75, 23)
        Me.btnBuscar.TabIndex = 16
        Me.btnBuscar.Text = "Buscar"
        Me.btnBuscar.UseVisualStyleBackColor = True
        '
        'txtDni
        '
        Me.txtDni.Location = New System.Drawing.Point(43, 37)
        Me.txtDni.MaxLength = 9
        Me.txtDni.Name = "txtDni"
        Me.txtDni.Size = New System.Drawing.Size(149, 20)
        Me.txtDni.TabIndex = 15
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(40, 12)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(152, 13)
        Me.Label1.TabIndex = 14
        Me.Label1.Text = "Introduce el DNI de un usuario"
        '
        'DevCoche
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(360, 194)
        Me.Controls.Add(Me.Panel1)
        Me.Controls.Add(Me.btnBuscar)
        Me.Controls.Add(Me.txtDni)
        Me.Controls.Add(Me.Label1)
        Me.Name = "DevCoche"
        Me.Text = "DevCoche"
        Me.Panel1.ResumeLayout(False)
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents Panel1 As Panel
    Friend WithEvents listaCoche As ListView
    Friend WithEvents btnDevolver As Button
    Friend WithEvents btnBuscar As Button
    Friend WithEvents txtDni As TextBox
    Friend WithEvents Label1 As Label
End Class
