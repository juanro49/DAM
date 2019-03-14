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
        Me.Label2 = New System.Windows.Forms.Label()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.Label6 = New System.Windows.Forms.Label()
        Me.Label7 = New System.Windows.Forms.Label()
        Me.Label8 = New System.Windows.Forms.Label()
        Me.Label9 = New System.Windows.Forms.Label()
        Me.txtFrase = New System.Windows.Forms.TextBox()
        Me.txtLong = New System.Windows.Forms.TextBox()
        Me.txtPrimer = New System.Windows.Forms.TextBox()
        Me.txtUlti = New System.Windows.Forms.TextBox()
        Me.txt2a6 = New System.Windows.Forms.TextBox()
        Me.txtPosA = New System.Windows.Forms.TextBox()
        Me.txtMinus = New System.Windows.Forms.TextBox()
        Me.txtMayus = New System.Windows.Forms.TextBox()
        Me.txt1mayus = New System.Windows.Forms.TextBox()
        Me.btnProcesar = New System.Windows.Forms.Button()
        Me.btnLimpiar = New System.Windows.Forms.Button()
        Me.btnSalir = New System.Windows.Forms.Button()
        Me.SuspendLayout()
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(22, 23)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(102, 13)
        Me.Label1.TabIndex = 0
        Me.Label1.Text = "Introduce una frase:"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(22, 65)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(51, 13)
        Me.Label2.TabIndex = 1
        Me.Label2.Text = "Longitud:"
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(22, 88)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(81, 13)
        Me.Label3.TabIndex = 2
        Me.Label3.Text = "Primer caracter:"
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(22, 110)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(81, 13)
        Me.Label4.TabIndex = 3
        Me.Label4.Text = "Último caracter:"
        '
        'Label5
        '
        Me.Label5.AutoSize = True
        Me.Label5.Location = New System.Drawing.Point(22, 134)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(105, 13)
        Me.Label5.TabIndex = 4
        Me.Label5.Text = "Del 2º al 6º caracter:"
        '
        'Label6
        '
        Me.Label6.AutoSize = True
        Me.Label6.Location = New System.Drawing.Point(22, 159)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(123, 13)
        Me.Label6.TabIndex = 5
        Me.Label6.Text = "Posición de la primera A:"
        '
        'Label7
        '
        Me.Label7.AutoSize = True
        Me.Label7.Location = New System.Drawing.Point(22, 186)
        Me.Label7.Name = "Label7"
        Me.Label7.Size = New System.Drawing.Size(60, 13)
        Me.Label7.TabIndex = 6
        Me.Label7.Text = "Minúsculas"
        '
        'Label8
        '
        Me.Label8.AutoSize = True
        Me.Label8.Location = New System.Drawing.Point(22, 210)
        Me.Label8.Name = "Label8"
        Me.Label8.Size = New System.Drawing.Size(63, 13)
        Me.Label8.TabIndex = 7
        Me.Label8.Text = "Mayúsculas"
        '
        'Label9
        '
        Me.Label9.AutoSize = True
        Me.Label9.Location = New System.Drawing.Point(22, 235)
        Me.Label9.Name = "Label9"
        Me.Label9.Size = New System.Drawing.Size(90, 13)
        Me.Label9.TabIndex = 8
        Me.Label9.Text = "1ª en mayúsculas"
        '
        'txtFrase
        '
        Me.txtFrase.Location = New System.Drawing.Point(131, 23)
        Me.txtFrase.Name = "txtFrase"
        Me.txtFrase.Size = New System.Drawing.Size(218, 20)
        Me.txtFrase.TabIndex = 9
        '
        'txtLong
        '
        Me.txtLong.Location = New System.Drawing.Point(159, 62)
        Me.txtLong.Name = "txtLong"
        Me.txtLong.ReadOnly = True
        Me.txtLong.Size = New System.Drawing.Size(68, 20)
        Me.txtLong.TabIndex = 10
        '
        'txtPrimer
        '
        Me.txtPrimer.Location = New System.Drawing.Point(159, 85)
        Me.txtPrimer.Name = "txtPrimer"
        Me.txtPrimer.ReadOnly = True
        Me.txtPrimer.Size = New System.Drawing.Size(68, 20)
        Me.txtPrimer.TabIndex = 11
        '
        'txtUlti
        '
        Me.txtUlti.Location = New System.Drawing.Point(159, 107)
        Me.txtUlti.Name = "txtUlti"
        Me.txtUlti.ReadOnly = True
        Me.txtUlti.Size = New System.Drawing.Size(68, 20)
        Me.txtUlti.TabIndex = 12
        '
        'txt2a6
        '
        Me.txt2a6.Location = New System.Drawing.Point(159, 131)
        Me.txt2a6.Name = "txt2a6"
        Me.txt2a6.ReadOnly = True
        Me.txt2a6.Size = New System.Drawing.Size(68, 20)
        Me.txt2a6.TabIndex = 13
        '
        'txtPosA
        '
        Me.txtPosA.Location = New System.Drawing.Point(159, 156)
        Me.txtPosA.Name = "txtPosA"
        Me.txtPosA.ReadOnly = True
        Me.txtPosA.Size = New System.Drawing.Size(68, 20)
        Me.txtPosA.TabIndex = 14
        '
        'txtMinus
        '
        Me.txtMinus.Location = New System.Drawing.Point(159, 183)
        Me.txtMinus.Name = "txtMinus"
        Me.txtMinus.ReadOnly = True
        Me.txtMinus.Size = New System.Drawing.Size(237, 20)
        Me.txtMinus.TabIndex = 15
        '
        'txtMayus
        '
        Me.txtMayus.Location = New System.Drawing.Point(159, 207)
        Me.txtMayus.Name = "txtMayus"
        Me.txtMayus.ReadOnly = True
        Me.txtMayus.Size = New System.Drawing.Size(237, 20)
        Me.txtMayus.TabIndex = 16
        '
        'txt1mayus
        '
        Me.txt1mayus.Location = New System.Drawing.Point(159, 232)
        Me.txt1mayus.Name = "txt1mayus"
        Me.txt1mayus.ReadOnly = True
        Me.txt1mayus.Size = New System.Drawing.Size(237, 20)
        Me.txt1mayus.TabIndex = 17
        '
        'btnProcesar
        '
        Me.btnProcesar.Location = New System.Drawing.Point(25, 287)
        Me.btnProcesar.Name = "btnProcesar"
        Me.btnProcesar.Size = New System.Drawing.Size(75, 23)
        Me.btnProcesar.TabIndex = 18
        Me.btnProcesar.Text = "Procesar"
        Me.btnProcesar.UseVisualStyleBackColor = True
        '
        'btnLimpiar
        '
        Me.btnLimpiar.Location = New System.Drawing.Point(131, 287)
        Me.btnLimpiar.Name = "btnLimpiar"
        Me.btnLimpiar.Size = New System.Drawing.Size(75, 23)
        Me.btnLimpiar.TabIndex = 19
        Me.btnLimpiar.Text = "Limpiar"
        Me.btnLimpiar.UseVisualStyleBackColor = True
        '
        'btnSalir
        '
        Me.btnSalir.Location = New System.Drawing.Point(244, 287)
        Me.btnSalir.Name = "btnSalir"
        Me.btnSalir.Size = New System.Drawing.Size(75, 23)
        Me.btnSalir.TabIndex = 20
        Me.btnSalir.Text = "Salir"
        Me.btnSalir.UseVisualStyleBackColor = True
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(427, 450)
        Me.Controls.Add(Me.btnSalir)
        Me.Controls.Add(Me.btnLimpiar)
        Me.Controls.Add(Me.btnProcesar)
        Me.Controls.Add(Me.txt1mayus)
        Me.Controls.Add(Me.txtMayus)
        Me.Controls.Add(Me.txtMinus)
        Me.Controls.Add(Me.txtPosA)
        Me.Controls.Add(Me.txt2a6)
        Me.Controls.Add(Me.txtUlti)
        Me.Controls.Add(Me.txtPrimer)
        Me.Controls.Add(Me.txtLong)
        Me.Controls.Add(Me.txtFrase)
        Me.Controls.Add(Me.Label9)
        Me.Controls.Add(Me.Label8)
        Me.Controls.Add(Me.Label7)
        Me.Controls.Add(Me.Label6)
        Me.Controls.Add(Me.Label5)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents Label1 As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents Label3 As Label
    Friend WithEvents Label4 As Label
    Friend WithEvents Label5 As Label
    Friend WithEvents Label6 As Label
    Friend WithEvents Label7 As Label
    Friend WithEvents Label8 As Label
    Friend WithEvents Label9 As Label
    Friend WithEvents txtFrase As TextBox
    Friend WithEvents txtLong As TextBox
    Friend WithEvents txtPrimer As TextBox
    Friend WithEvents txtUlti As TextBox
    Friend WithEvents txt2a6 As TextBox
    Friend WithEvents txtPosA As TextBox
    Friend WithEvents txtMinus As TextBox
    Friend WithEvents txtMayus As TextBox
    Friend WithEvents txt1mayus As TextBox
    Friend WithEvents btnProcesar As Button
    Friend WithEvents btnLimpiar As Button
    Friend WithEvents btnSalir As Button
End Class
