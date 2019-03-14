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
        Me.txtNota1 = New System.Windows.Forms.TextBox()
        Me.txtNota2 = New System.Windows.Forms.TextBox()
        Me.txtNota3 = New System.Windows.Forms.TextBox()
        Me.txtNota4 = New System.Windows.Forms.TextBox()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.Label6 = New System.Windows.Forms.Label()
        Me.Label7 = New System.Windows.Forms.Label()
        Me.Button1 = New System.Windows.Forms.Button()
        Me.Button2 = New System.Windows.Forms.Button()
        Me.Button3 = New System.Windows.Forms.Button()
        Me.labMayor = New System.Windows.Forms.Label()
        Me.labMenor = New System.Windows.Forms.Label()
        Me.labMedia = New System.Windows.Forms.Label()
        Me.SuspendLayout()
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(57, 39)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(39, 13)
        Me.Label1.TabIndex = 0
        Me.Label1.Text = "Nota 1"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(57, 68)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(39, 13)
        Me.Label2.TabIndex = 1
        Me.Label2.Text = "Nota 2"
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(57, 94)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(39, 13)
        Me.Label3.TabIndex = 2
        Me.Label3.Text = "Nota 3"
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(57, 120)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(39, 13)
        Me.Label4.TabIndex = 3
        Me.Label4.Text = "Nota 4"
        '
        'txtNota1
        '
        Me.txtNota1.Location = New System.Drawing.Point(103, 39)
        Me.txtNota1.Name = "txtNota1"
        Me.txtNota1.Size = New System.Drawing.Size(78, 20)
        Me.txtNota1.TabIndex = 4
        '
        'txtNota2
        '
        Me.txtNota2.Location = New System.Drawing.Point(102, 65)
        Me.txtNota2.Name = "txtNota2"
        Me.txtNota2.Size = New System.Drawing.Size(78, 20)
        Me.txtNota2.TabIndex = 5
        '
        'txtNota3
        '
        Me.txtNota3.Location = New System.Drawing.Point(103, 91)
        Me.txtNota3.Name = "txtNota3"
        Me.txtNota3.Size = New System.Drawing.Size(78, 20)
        Me.txtNota3.TabIndex = 6
        '
        'txtNota4
        '
        Me.txtNota4.Location = New System.Drawing.Point(102, 117)
        Me.txtNota4.Name = "txtNota4"
        Me.txtNota4.Size = New System.Drawing.Size(78, 20)
        Me.txtNota4.TabIndex = 7
        '
        'Label5
        '
        Me.Label5.AutoSize = True
        Me.Label5.Location = New System.Drawing.Point(57, 171)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(88, 13)
        Me.Label5.TabIndex = 8
        Me.Label5.Text = "La mayor nota es"
        '
        'Label6
        '
        Me.Label6.AutoSize = True
        Me.Label6.Location = New System.Drawing.Point(57, 197)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(89, 13)
        Me.Label6.TabIndex = 9
        Me.Label6.Text = "La menor nota es"
        '
        'Label7
        '
        Me.Label7.AutoSize = True
        Me.Label7.Location = New System.Drawing.Point(57, 224)
        Me.Label7.Name = "Label7"
        Me.Label7.Size = New System.Drawing.Size(64, 13)
        Me.Label7.TabIndex = 10
        Me.Label7.Text = "La media es"
        '
        'Button1
        '
        Me.Button1.Location = New System.Drawing.Point(254, 29)
        Me.Button1.Name = "Button1"
        Me.Button1.Size = New System.Drawing.Size(75, 23)
        Me.Button1.TabIndex = 11
        Me.Button1.Text = "Calcular"
        Me.Button1.UseVisualStyleBackColor = True
        '
        'Button2
        '
        Me.Button2.Location = New System.Drawing.Point(254, 63)
        Me.Button2.Name = "Button2"
        Me.Button2.Size = New System.Drawing.Size(75, 23)
        Me.Button2.TabIndex = 12
        Me.Button2.Text = "Limpiar"
        Me.Button2.UseVisualStyleBackColor = True
        '
        'Button3
        '
        Me.Button3.Location = New System.Drawing.Point(254, 94)
        Me.Button3.Name = "Button3"
        Me.Button3.Size = New System.Drawing.Size(75, 23)
        Me.Button3.TabIndex = 13
        Me.Button3.Text = "Salir"
        Me.Button3.UseVisualStyleBackColor = True
        '
        'labMayor
        '
        Me.labMayor.AutoSize = True
        Me.labMayor.Location = New System.Drawing.Point(163, 171)
        Me.labMayor.Name = "labMayor"
        Me.labMayor.Size = New System.Drawing.Size(0, 13)
        Me.labMayor.TabIndex = 14
        '
        'labMenor
        '
        Me.labMenor.AutoSize = True
        Me.labMenor.Location = New System.Drawing.Point(163, 197)
        Me.labMenor.Name = "labMenor"
        Me.labMenor.Size = New System.Drawing.Size(0, 13)
        Me.labMenor.TabIndex = 15
        '
        'labMedia
        '
        Me.labMedia.AutoSize = True
        Me.labMedia.Location = New System.Drawing.Point(163, 224)
        Me.labMedia.Name = "labMedia"
        Me.labMedia.Size = New System.Drawing.Size(0, 13)
        Me.labMedia.TabIndex = 16
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(389, 263)
        Me.Controls.Add(Me.labMedia)
        Me.Controls.Add(Me.labMenor)
        Me.Controls.Add(Me.labMayor)
        Me.Controls.Add(Me.Button3)
        Me.Controls.Add(Me.Button2)
        Me.Controls.Add(Me.Button1)
        Me.Controls.Add(Me.Label7)
        Me.Controls.Add(Me.Label6)
        Me.Controls.Add(Me.Label5)
        Me.Controls.Add(Me.txtNota4)
        Me.Controls.Add(Me.txtNota3)
        Me.Controls.Add(Me.txtNota2)
        Me.Controls.Add(Me.txtNota1)
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
    Friend WithEvents txtNota1 As TextBox
    Friend WithEvents txtNota2 As TextBox
    Friend WithEvents txtNota3 As TextBox
    Friend WithEvents txtNota4 As TextBox
    Friend WithEvents Label5 As Label
    Friend WithEvents Label6 As Label
    Friend WithEvents Label7 As Label
    Friend WithEvents Button1 As Button
    Friend WithEvents Button2 As Button
    Friend WithEvents Button3 As Button
    Friend WithEvents labMayor As Label
    Friend WithEvents labMenor As Label
    Friend WithEvents labMedia As Label
End Class
