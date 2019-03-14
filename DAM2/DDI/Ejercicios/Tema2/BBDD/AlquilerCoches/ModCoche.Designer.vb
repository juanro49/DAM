<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class ModCoche
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
        Me.btnMod = New System.Windows.Forms.Button()
        Me.Label6 = New System.Windows.Forms.Label()
        Me.txtNprecio = New System.Windows.Forms.TextBox()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.txtnModelo = New System.Windows.Forms.TextBox()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.txtNmarca = New System.Windows.Forms.TextBox()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.txtNmatri = New System.Windows.Forms.TextBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.txtMatri = New System.Windows.Forms.TextBox()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.Panel1 = New System.Windows.Forms.Panel()
        Me.btnBuscar = New System.Windows.Forms.Button()
        Me.Panel1.SuspendLayout()
        Me.SuspendLayout()
        '
        'btnMod
        '
        Me.btnMod.Location = New System.Drawing.Point(130, 170)
        Me.btnMod.Name = "btnMod"
        Me.btnMod.Size = New System.Drawing.Size(75, 23)
        Me.btnMod.TabIndex = 33
        Me.btnMod.Text = "Modificar"
        Me.btnMod.UseVisualStyleBackColor = True
        '
        'Label6
        '
        Me.Label6.AutoSize = True
        Me.Label6.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label6.Location = New System.Drawing.Point(79, 9)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(118, 16)
        Me.Label6.TabIndex = 32
        Me.Label6.Text = "Modificar coche"
        '
        'txtNprecio
        '
        Me.txtNprecio.Location = New System.Drawing.Point(116, 123)
        Me.txtNprecio.MaxLength = 9
        Me.txtNprecio.Name = "txtNprecio"
        Me.txtNprecio.Size = New System.Drawing.Size(139, 20)
        Me.txtNprecio.TabIndex = 31
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(12, 126)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(98, 13)
        Me.Label4.TabIndex = 30
        Me.Label4.Text = "Nuevo Precio/Día:"
        '
        'txtnModelo
        '
        Me.txtnModelo.Location = New System.Drawing.Point(116, 88)
        Me.txtnModelo.Name = "txtnModelo"
        Me.txtnModelo.Size = New System.Drawing.Size(139, 20)
        Me.txtnModelo.TabIndex = 29
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(12, 91)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(80, 13)
        Me.Label3.TabIndex = 28
        Me.Label3.Text = "Nuevo Modelo:"
        '
        'txtNmarca
        '
        Me.txtNmarca.Location = New System.Drawing.Point(116, 53)
        Me.txtNmarca.Name = "txtNmarca"
        Me.txtNmarca.Size = New System.Drawing.Size(139, 20)
        Me.txtNmarca.TabIndex = 27
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(12, 56)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(75, 13)
        Me.Label2.TabIndex = 26
        Me.Label2.Text = "Nueva Marca:"
        '
        'txtNmatri
        '
        Me.txtNmatri.Location = New System.Drawing.Point(116, 18)
        Me.txtNmatri.MaxLength = 9
        Me.txtNmatri.Name = "txtNmatri"
        Me.txtNmatri.Size = New System.Drawing.Size(139, 20)
        Me.txtNmatri.TabIndex = 25
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(12, 21)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(90, 13)
        Me.Label1.TabIndex = 24
        Me.Label1.Text = "Nueva Matrícula:"
        '
        'txtMatri
        '
        Me.txtMatri.Location = New System.Drawing.Point(105, 37)
        Me.txtMatri.MaxLength = 9
        Me.txtMatri.Name = "txtMatri"
        Me.txtMatri.Size = New System.Drawing.Size(165, 20)
        Me.txtMatri.TabIndex = 35
        '
        'Label5
        '
        Me.Label5.AutoSize = True
        Me.Label5.Location = New System.Drawing.Point(36, 40)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(55, 13)
        Me.Label5.TabIndex = 34
        Me.Label5.Text = "Matrícula:"
        '
        'Panel1
        '
        Me.Panel1.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.Panel1.Controls.Add(Me.txtNmatri)
        Me.Panel1.Controls.Add(Me.Label1)
        Me.Panel1.Controls.Add(Me.Label2)
        Me.Panel1.Controls.Add(Me.btnMod)
        Me.Panel1.Controls.Add(Me.txtNmarca)
        Me.Panel1.Controls.Add(Me.Label3)
        Me.Panel1.Controls.Add(Me.txtNprecio)
        Me.Panel1.Controls.Add(Me.txtnModelo)
        Me.Panel1.Controls.Add(Me.Label4)
        Me.Panel1.Dock = System.Windows.Forms.DockStyle.Bottom
        Me.Panel1.Location = New System.Drawing.Point(0, 92)
        Me.Panel1.Name = "Panel1"
        Me.Panel1.Size = New System.Drawing.Size(313, 228)
        Me.Panel1.TabIndex = 36
        '
        'btnBuscar
        '
        Me.btnBuscar.Location = New System.Drawing.Point(132, 63)
        Me.btnBuscar.Name = "btnBuscar"
        Me.btnBuscar.Size = New System.Drawing.Size(75, 23)
        Me.btnBuscar.TabIndex = 37
        Me.btnBuscar.Text = "Buscar"
        Me.btnBuscar.UseVisualStyleBackColor = True
        '
        'ModCoche
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(313, 320)
        Me.Controls.Add(Me.btnBuscar)
        Me.Controls.Add(Me.Panel1)
        Me.Controls.Add(Me.txtMatri)
        Me.Controls.Add(Me.Label5)
        Me.Controls.Add(Me.Label6)
        Me.Name = "ModCoche"
        Me.Text = "ModCoche"
        Me.Panel1.ResumeLayout(False)
        Me.Panel1.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents btnMod As Button
    Friend WithEvents Label6 As Label
    Friend WithEvents txtNprecio As TextBox
    Friend WithEvents Label4 As Label
    Friend WithEvents txtnModelo As TextBox
    Friend WithEvents Label3 As Label
    Friend WithEvents txtNmarca As TextBox
    Friend WithEvents Label2 As Label
    Friend WithEvents txtNmatri As TextBox
    Friend WithEvents Label1 As Label
    Friend WithEvents txtMatri As TextBox
    Friend WithEvents Label5 As Label
    Friend WithEvents Panel1 As Panel
    Friend WithEvents btnBuscar As Button
End Class
