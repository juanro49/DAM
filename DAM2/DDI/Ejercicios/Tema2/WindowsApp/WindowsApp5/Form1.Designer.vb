<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form1
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
        Me.Label1 = New System.Windows.Forms.Label()
        Me.txtMetros = New System.Windows.Forms.TextBox()
        Me.rbMm = New System.Windows.Forms.RadioButton()
        Me.rbCm = New System.Windows.Forms.RadioButton()
        Me.rbDm = New System.Windows.Forms.RadioButton()
        Me.rbKm = New System.Windows.Forms.RadioButton()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.txtResul = New System.Windows.Forms.TextBox()
        Me.GroupBox1 = New System.Windows.Forms.GroupBox()
        Me.brnConvertir = New System.Windows.Forms.Button()
        Me.brnNuevo = New System.Windows.Forms.Button()
        Me.btnSalir = New System.Windows.Forms.Button()
        Me.GroupBox1.SuspendLayout()
        Me.SuspendLayout()
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(39, 26)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(101, 13)
        Me.Label1.TabIndex = 0
        Me.Label1.Text = "Cantidad de metros:"
        '
        'txtMetros
        '
        Me.txtMetros.Location = New System.Drawing.Point(147, 26)
        Me.txtMetros.Name = "txtMetros"
        Me.txtMetros.Size = New System.Drawing.Size(50, 20)
        Me.txtMetros.TabIndex = 1
        '
        'rbMm
        '
        Me.rbMm.AutoSize = True
        Me.rbMm.Location = New System.Drawing.Point(15, 19)
        Me.rbMm.Name = "rbMm"
        Me.rbMm.Size = New System.Drawing.Size(71, 17)
        Me.rbMm.TabIndex = 2
        Me.rbMm.TabStop = True
        Me.rbMm.Text = "Milimetros"
        Me.rbMm.UseVisualStyleBackColor = True
        '
        'rbCm
        '
        Me.rbCm.AutoSize = True
        Me.rbCm.Location = New System.Drawing.Point(15, 42)
        Me.rbCm.Name = "rbCm"
        Me.rbCm.Size = New System.Drawing.Size(80, 17)
        Me.rbCm.TabIndex = 3
        Me.rbCm.TabStop = True
        Me.rbCm.Text = "Centimetros"
        Me.rbCm.UseVisualStyleBackColor = True
        '
        'rbDm
        '
        Me.rbDm.AutoSize = True
        Me.rbDm.Location = New System.Drawing.Point(15, 65)
        Me.rbDm.Name = "rbDm"
        Me.rbDm.Size = New System.Drawing.Size(78, 17)
        Me.rbDm.TabIndex = 4
        Me.rbDm.TabStop = True
        Me.rbDm.Text = "Decimetros"
        Me.rbDm.UseVisualStyleBackColor = True
        '
        'rbKm
        '
        Me.rbKm.AutoSize = True
        Me.rbKm.Location = New System.Drawing.Point(15, 88)
        Me.rbKm.Name = "rbKm"
        Me.rbKm.Size = New System.Drawing.Size(73, 17)
        Me.rbKm.TabIndex = 5
        Me.rbKm.TabStop = True
        Me.rbKm.Text = "Kilometros"
        Me.rbKm.UseVisualStyleBackColor = True
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(173, 83)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(55, 13)
        Me.Label2.TabIndex = 6
        Me.Label2.Text = "Resultado"
        '
        'txtResul
        '
        Me.txtResul.Location = New System.Drawing.Point(176, 106)
        Me.txtResul.Name = "txtResul"
        Me.txtResul.ReadOnly = True
        Me.txtResul.Size = New System.Drawing.Size(74, 20)
        Me.txtResul.TabIndex = 7
        '
        'GroupBox1
        '
        Me.GroupBox1.Controls.Add(Me.rbMm)
        Me.GroupBox1.Controls.Add(Me.rbCm)
        Me.GroupBox1.Controls.Add(Me.rbDm)
        Me.GroupBox1.Controls.Add(Me.rbKm)
        Me.GroupBox1.Location = New System.Drawing.Point(42, 71)
        Me.GroupBox1.Name = "GroupBox1"
        Me.GroupBox1.Size = New System.Drawing.Size(115, 113)
        Me.GroupBox1.TabIndex = 8
        Me.GroupBox1.TabStop = False
        Me.GroupBox1.Text = "Tipo de conversión"
        '
        'brnConvertir
        '
        Me.brnConvertir.Location = New System.Drawing.Point(42, 208)
        Me.brnConvertir.Name = "brnConvertir"
        Me.brnConvertir.Size = New System.Drawing.Size(75, 23)
        Me.brnConvertir.TabIndex = 9
        Me.brnConvertir.Text = "Convertir"
        Me.brnConvertir.UseVisualStyleBackColor = True
        '
        'brnNuevo
        '
        Me.brnNuevo.Location = New System.Drawing.Point(123, 208)
        Me.brnNuevo.Name = "brnNuevo"
        Me.brnNuevo.Size = New System.Drawing.Size(87, 23)
        Me.brnNuevo.TabIndex = 10
        Me.brnNuevo.Text = "Nuevo Cálculo"
        Me.brnNuevo.UseVisualStyleBackColor = True
        '
        'btnSalir
        '
        Me.btnSalir.Location = New System.Drawing.Point(216, 208)
        Me.btnSalir.Name = "btnSalir"
        Me.btnSalir.Size = New System.Drawing.Size(75, 23)
        Me.btnSalir.TabIndex = 11
        Me.btnSalir.Text = "Salir"
        Me.btnSalir.UseVisualStyleBackColor = True
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(313, 255)
        Me.Controls.Add(Me.btnSalir)
        Me.Controls.Add(Me.brnNuevo)
        Me.Controls.Add(Me.brnConvertir)
        Me.Controls.Add(Me.GroupBox1)
        Me.Controls.Add(Me.txtResul)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.txtMetros)
        Me.Controls.Add(Me.Label1)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.GroupBox1.ResumeLayout(False)
        Me.GroupBox1.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents Label1 As Label
    Friend WithEvents txtMetros As TextBox
    Friend WithEvents rbMm As RadioButton
    Friend WithEvents rbCm As RadioButton
    Friend WithEvents rbDm As RadioButton
    Friend WithEvents rbKm As RadioButton
    Friend WithEvents Label2 As Label
    Friend WithEvents txtResul As TextBox
    Friend WithEvents GroupBox1 As GroupBox
    Friend WithEvents brnConvertir As Button
    Friend WithEvents brnNuevo As Button
    Friend WithEvents btnSalir As Button
End Class
