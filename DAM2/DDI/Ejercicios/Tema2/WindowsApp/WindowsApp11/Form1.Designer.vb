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
        Me.txtFrase = New System.Windows.Forms.TextBox()
        Me.btnComprobar = New System.Windows.Forms.Button()
        Me.btnSalir = New System.Windows.Forms.Button()
        Me.labPal = New System.Windows.Forms.Label()
        Me.txtReverse = New System.Windows.Forms.TextBox()
        Me.SuspendLayout()
        '
        'txtFrase
        '
        Me.txtFrase.Location = New System.Drawing.Point(32, 35)
        Me.txtFrase.Name = "txtFrase"
        Me.txtFrase.Size = New System.Drawing.Size(100, 20)
        Me.txtFrase.TabIndex = 0
        '
        'btnComprobar
        '
        Me.btnComprobar.Location = New System.Drawing.Point(163, 35)
        Me.btnComprobar.Name = "btnComprobar"
        Me.btnComprobar.Size = New System.Drawing.Size(75, 23)
        Me.btnComprobar.TabIndex = 1
        Me.btnComprobar.Text = "Comprobar"
        Me.btnComprobar.UseVisualStyleBackColor = True
        '
        'btnSalir
        '
        Me.btnSalir.Location = New System.Drawing.Point(163, 136)
        Me.btnSalir.Name = "btnSalir"
        Me.btnSalir.Size = New System.Drawing.Size(75, 23)
        Me.btnSalir.TabIndex = 2
        Me.btnSalir.Text = "Salir"
        Me.btnSalir.UseVisualStyleBackColor = True
        '
        'labPal
        '
        Me.labPal.AutoSize = True
        Me.labPal.Location = New System.Drawing.Point(29, 141)
        Me.labPal.Name = "labPal"
        Me.labPal.Size = New System.Drawing.Size(73, 13)
        Me.labPal.TabIndex = 3
        Me.labPal.Text = "¿Palíndromo?"
        '
        'txtReverse
        '
        Me.txtReverse.Location = New System.Drawing.Point(32, 80)
        Me.txtReverse.Name = "txtReverse"
        Me.txtReverse.Size = New System.Drawing.Size(100, 20)
        Me.txtReverse.TabIndex = 4
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(262, 180)
        Me.Controls.Add(Me.txtReverse)
        Me.Controls.Add(Me.labPal)
        Me.Controls.Add(Me.btnSalir)
        Me.Controls.Add(Me.btnComprobar)
        Me.Controls.Add(Me.txtFrase)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents txtFrase As TextBox
    Friend WithEvents btnComprobar As Button
    Friend WithEvents btnSalir As Button
    Friend WithEvents labPal As Label
    Friend WithEvents txtReverse As TextBox
End Class
