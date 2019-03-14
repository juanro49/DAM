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
        Me.GroupBox1 = New System.Windows.Forms.GroupBox()
        Me.GroupBox2 = New System.Windows.Forms.GroupBox()
        Me.GroupBox3 = New System.Windows.Forms.GroupBox()
        Me.GroupBox4 = New System.Windows.Forms.GroupBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.txtNumero = New System.Windows.Forms.TextBox()
        Me.txtNdigit = New System.Windows.Forms.TextBox()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.txtSimp = New System.Windows.Forms.TextBox()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.txtSpar = New System.Windows.Forms.TextBox()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.txtStotal = New System.Windows.Forms.TextBox()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.txtMayor = New System.Windows.Forms.TextBox()
        Me.Label6 = New System.Windows.Forms.Label()
        Me.txtMenor = New System.Windows.Forms.TextBox()
        Me.Label7 = New System.Windows.Forms.Label()
        Me.btnAnalisis = New System.Windows.Forms.Button()
        Me.btnOtro = New System.Windows.Forms.Button()
        Me.btnSalir = New System.Windows.Forms.Button()
        Me.txtDivisores = New System.Windows.Forms.TextBox()
        Me.GroupBox1.SuspendLayout()
        Me.GroupBox2.SuspendLayout()
        Me.GroupBox3.SuspendLayout()
        Me.GroupBox4.SuspendLayout()
        Me.SuspendLayout()
        '
        'GroupBox1
        '
        Me.GroupBox1.Controls.Add(Me.txtDivisores)
        Me.GroupBox1.Location = New System.Drawing.Point(276, 13)
        Me.GroupBox1.Name = "GroupBox1"
        Me.GroupBox1.Size = New System.Drawing.Size(118, 257)
        Me.GroupBox1.TabIndex = 2
        Me.GroupBox1.TabStop = False
        Me.GroupBox1.Text = "Divisores"
        '
        'GroupBox2
        '
        Me.GroupBox2.Controls.Add(Me.txtNumero)
        Me.GroupBox2.Controls.Add(Me.Label1)
        Me.GroupBox2.Location = New System.Drawing.Point(12, 13)
        Me.GroupBox2.Name = "GroupBox2"
        Me.GroupBox2.Size = New System.Drawing.Size(258, 62)
        Me.GroupBox2.TabIndex = 3
        Me.GroupBox2.TabStop = False
        '
        'GroupBox3
        '
        Me.GroupBox3.Controls.Add(Me.txtMenor)
        Me.GroupBox3.Controls.Add(Me.Label7)
        Me.GroupBox3.Controls.Add(Me.txtMayor)
        Me.GroupBox3.Controls.Add(Me.Label6)
        Me.GroupBox3.Controls.Add(Me.txtStotal)
        Me.GroupBox3.Controls.Add(Me.Label5)
        Me.GroupBox3.Controls.Add(Me.txtSpar)
        Me.GroupBox3.Controls.Add(Me.Label4)
        Me.GroupBox3.Controls.Add(Me.txtSimp)
        Me.GroupBox3.Controls.Add(Me.Label3)
        Me.GroupBox3.Controls.Add(Me.txtNdigit)
        Me.GroupBox3.Controls.Add(Me.Label2)
        Me.GroupBox3.Location = New System.Drawing.Point(12, 81)
        Me.GroupBox3.Name = "GroupBox3"
        Me.GroupBox3.Size = New System.Drawing.Size(258, 189)
        Me.GroupBox3.TabIndex = 4
        Me.GroupBox3.TabStop = False
        '
        'GroupBox4
        '
        Me.GroupBox4.Controls.Add(Me.btnSalir)
        Me.GroupBox4.Controls.Add(Me.btnOtro)
        Me.GroupBox4.Controls.Add(Me.btnAnalisis)
        Me.GroupBox4.Location = New System.Drawing.Point(12, 276)
        Me.GroupBox4.Name = "GroupBox4"
        Me.GroupBox4.Size = New System.Drawing.Size(382, 62)
        Me.GroupBox4.TabIndex = 5
        Me.GroupBox4.TabStop = False
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(18, 20)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(105, 13)
        Me.Label1.TabIndex = 0
        Me.Label1.Text = "Introduce un número"
        '
        'txtNumero
        '
        Me.txtNumero.Location = New System.Drawing.Point(147, 17)
        Me.txtNumero.Name = "txtNumero"
        Me.txtNumero.Size = New System.Drawing.Size(100, 20)
        Me.txtNumero.TabIndex = 1
        '
        'txtNdigit
        '
        Me.txtNdigit.Location = New System.Drawing.Point(147, 13)
        Me.txtNdigit.Name = "txtNdigit"
        Me.txtNdigit.Size = New System.Drawing.Size(100, 20)
        Me.txtNdigit.TabIndex = 3
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(18, 16)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(94, 13)
        Me.Label2.TabIndex = 2
        Me.Label2.Text = "Número de dígitos"
        '
        'txtSimp
        '
        Me.txtSimp.Location = New System.Drawing.Point(147, 42)
        Me.txtSimp.Name = "txtSimp"
        Me.txtSimp.Size = New System.Drawing.Size(100, 20)
        Me.txtSimp.TabIndex = 5
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(18, 45)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(123, 13)
        Me.Label3.TabIndex = 4
        Me.Label3.Text = "Suma de dígitos impares"
        '
        'txtSpar
        '
        Me.txtSpar.Location = New System.Drawing.Point(147, 68)
        Me.txtSpar.Name = "txtSpar"
        Me.txtSpar.Size = New System.Drawing.Size(100, 20)
        Me.txtSpar.TabIndex = 7
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(18, 71)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(113, 13)
        Me.Label4.TabIndex = 6
        Me.Label4.Text = "Suma de dígitos pares"
        '
        'txtStotal
        '
        Me.txtStotal.Location = New System.Drawing.Point(147, 98)
        Me.txtStotal.Name = "txtStotal"
        Me.txtStotal.Size = New System.Drawing.Size(100, 20)
        Me.txtStotal.TabIndex = 9
        '
        'Label5
        '
        Me.Label5.AutoSize = True
        Me.Label5.Location = New System.Drawing.Point(18, 101)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(107, 13)
        Me.Label5.TabIndex = 8
        Me.Label5.Text = "Suma total de dígitos"
        '
        'txtMayor
        '
        Me.txtMayor.Location = New System.Drawing.Point(147, 125)
        Me.txtMayor.Name = "txtMayor"
        Me.txtMayor.Size = New System.Drawing.Size(100, 20)
        Me.txtMayor.TabIndex = 11
        '
        'Label6
        '
        Me.Label6.AutoSize = True
        Me.Label6.Location = New System.Drawing.Point(18, 128)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(67, 13)
        Me.Label6.TabIndex = 10
        Me.Label6.Text = "Dígito mayor"
        '
        'txtMenor
        '
        Me.txtMenor.Location = New System.Drawing.Point(147, 155)
        Me.txtMenor.Name = "txtMenor"
        Me.txtMenor.Size = New System.Drawing.Size(100, 20)
        Me.txtMenor.TabIndex = 13
        '
        'Label7
        '
        Me.Label7.AutoSize = True
        Me.Label7.Location = New System.Drawing.Point(18, 158)
        Me.Label7.Name = "Label7"
        Me.Label7.Size = New System.Drawing.Size(68, 13)
        Me.Label7.TabIndex = 12
        Me.Label7.Text = "Dígito menor"
        '
        'btnAnalisis
        '
        Me.btnAnalisis.Location = New System.Drawing.Point(21, 20)
        Me.btnAnalisis.Name = "btnAnalisis"
        Me.btnAnalisis.Size = New System.Drawing.Size(75, 23)
        Me.btnAnalisis.TabIndex = 0
        Me.btnAnalisis.Text = "Análisis"
        Me.btnAnalisis.UseVisualStyleBackColor = True
        '
        'btnOtro
        '
        Me.btnOtro.Location = New System.Drawing.Point(147, 20)
        Me.btnOtro.Name = "btnOtro"
        Me.btnOtro.Size = New System.Drawing.Size(75, 23)
        Me.btnOtro.TabIndex = 1
        Me.btnOtro.Text = "Otro Número"
        Me.btnOtro.UseVisualStyleBackColor = True
        '
        'btnSalir
        '
        Me.btnSalir.Location = New System.Drawing.Point(283, 20)
        Me.btnSalir.Name = "btnSalir"
        Me.btnSalir.Size = New System.Drawing.Size(75, 23)
        Me.btnSalir.TabIndex = 2
        Me.btnSalir.Text = "Salir"
        Me.btnSalir.UseVisualStyleBackColor = True
        '
        'txtDivisores
        '
        Me.txtDivisores.Location = New System.Drawing.Point(19, 20)
        Me.txtDivisores.Multiline = True
        Me.txtDivisores.Name = "txtDivisores"
        Me.txtDivisores.Size = New System.Drawing.Size(75, 223)
        Me.txtDivisores.TabIndex = 0
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(409, 351)
        Me.Controls.Add(Me.GroupBox4)
        Me.Controls.Add(Me.GroupBox3)
        Me.Controls.Add(Me.GroupBox2)
        Me.Controls.Add(Me.GroupBox1)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.GroupBox1.ResumeLayout(False)
        Me.GroupBox1.PerformLayout()
        Me.GroupBox2.ResumeLayout(False)
        Me.GroupBox2.PerformLayout()
        Me.GroupBox3.ResumeLayout(False)
        Me.GroupBox3.PerformLayout()
        Me.GroupBox4.ResumeLayout(False)
        Me.ResumeLayout(False)

    End Sub

    Friend WithEvents GroupBox1 As GroupBox
    Friend WithEvents txtDivisores As TextBox
    Friend WithEvents GroupBox2 As GroupBox
    Friend WithEvents txtNumero As TextBox
    Friend WithEvents Label1 As Label
    Friend WithEvents GroupBox3 As GroupBox
    Friend WithEvents txtMenor As TextBox
    Friend WithEvents Label7 As Label
    Friend WithEvents txtMayor As TextBox
    Friend WithEvents Label6 As Label
    Friend WithEvents txtStotal As TextBox
    Friend WithEvents Label5 As Label
    Friend WithEvents txtSpar As TextBox
    Friend WithEvents Label4 As Label
    Friend WithEvents txtSimp As TextBox
    Friend WithEvents Label3 As Label
    Friend WithEvents txtNdigit As TextBox
    Friend WithEvents Label2 As Label
    Friend WithEvents GroupBox4 As GroupBox
    Friend WithEvents btnSalir As Button
    Friend WithEvents btnOtro As Button
    Friend WithEvents btnAnalisis As Button
End Class
