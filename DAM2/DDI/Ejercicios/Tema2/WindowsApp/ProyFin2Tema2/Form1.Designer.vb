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
        Me.txtTexto = New System.Windows.Forms.TextBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.txtCifrado = New System.Windows.Forms.TextBox()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.txtNum = New System.Windows.Forms.TextBox()
        Me.GroupBox1 = New System.Windows.Forms.GroupBox()
        Me.rbIzq = New System.Windows.Forms.RadioButton()
        Me.rbDer = New System.Windows.Forms.RadioButton()
        Me.btnCifrar = New System.Windows.Forms.Button()
        Me.btnLimp = New System.Windows.Forms.Button()
        Me.btnSalir = New System.Windows.Forms.Button()
        Me.GroupBox1.SuspendLayout()
        Me.SuspendLayout()
        '
        'txtTexto
        '
        Me.txtTexto.Location = New System.Drawing.Point(87, 47)
        Me.txtTexto.Name = "txtTexto"
        Me.txtTexto.Size = New System.Drawing.Size(162, 20)
        Me.txtTexto.TabIndex = 0
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(12, 50)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(72, 13)
        Me.Label1.TabIndex = 1
        Me.Label1.Text = "Texto a cifrar:"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(12, 271)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(72, 13)
        Me.Label2.TabIndex = 3
        Me.Label2.Text = "Texto cifrado:"
        '
        'txtCifrado
        '
        Me.txtCifrado.Location = New System.Drawing.Point(87, 268)
        Me.txtCifrado.Name = "txtCifrado"
        Me.txtCifrado.ReadOnly = True
        Me.txtCifrado.Size = New System.Drawing.Size(162, 20)
        Me.txtCifrado.TabIndex = 2
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(12, 86)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(47, 13)
        Me.Label3.TabIndex = 5
        Me.Label3.Text = "Número:"
        '
        'txtNum
        '
        Me.txtNum.Location = New System.Drawing.Point(87, 83)
        Me.txtNum.Name = "txtNum"
        Me.txtNum.Size = New System.Drawing.Size(41, 20)
        Me.txtNum.TabIndex = 4
        '
        'GroupBox1
        '
        Me.GroupBox1.Controls.Add(Me.rbIzq)
        Me.GroupBox1.Controls.Add(Me.rbDer)
        Me.GroupBox1.Location = New System.Drawing.Point(40, 131)
        Me.GroupBox1.Name = "GroupBox1"
        Me.GroupBox1.Size = New System.Drawing.Size(147, 85)
        Me.GroupBox1.TabIndex = 6
        Me.GroupBox1.TabStop = False
        Me.GroupBox1.Text = "Dirección"
        '
        'rbIzq
        '
        Me.rbIzq.AutoSize = True
        Me.rbIzq.Location = New System.Drawing.Point(22, 51)
        Me.rbIzq.Name = "rbIzq"
        Me.rbIzq.Size = New System.Drawing.Size(68, 17)
        Me.rbIzq.TabIndex = 1
        Me.rbIzq.TabStop = True
        Me.rbIzq.Text = "Izquierda"
        Me.rbIzq.UseVisualStyleBackColor = True
        '
        'rbDer
        '
        Me.rbDer.AutoSize = True
        Me.rbDer.Location = New System.Drawing.Point(22, 28)
        Me.rbDer.Name = "rbDer"
        Me.rbDer.Size = New System.Drawing.Size(66, 17)
        Me.rbDer.TabIndex = 0
        Me.rbDer.TabStop = True
        Me.rbDer.Text = "Derecha"
        Me.rbDer.UseVisualStyleBackColor = True
        '
        'btnCifrar
        '
        Me.btnCifrar.Location = New System.Drawing.Point(12, 322)
        Me.btnCifrar.Name = "btnCifrar"
        Me.btnCifrar.Size = New System.Drawing.Size(75, 23)
        Me.btnCifrar.TabIndex = 7
        Me.btnCifrar.Text = "Cifrar"
        Me.btnCifrar.UseVisualStyleBackColor = True
        '
        'btnLimp
        '
        Me.btnLimp.Location = New System.Drawing.Point(93, 322)
        Me.btnLimp.Name = "btnLimp"
        Me.btnLimp.Size = New System.Drawing.Size(75, 23)
        Me.btnLimp.TabIndex = 8
        Me.btnLimp.Text = "Limpiar"
        Me.btnLimp.UseVisualStyleBackColor = True
        '
        'btnSalir
        '
        Me.btnSalir.Location = New System.Drawing.Point(174, 322)
        Me.btnSalir.Name = "btnSalir"
        Me.btnSalir.Size = New System.Drawing.Size(75, 23)
        Me.btnSalir.TabIndex = 9
        Me.btnSalir.Text = "Salir"
        Me.btnSalir.UseVisualStyleBackColor = True
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(273, 363)
        Me.Controls.Add(Me.btnSalir)
        Me.Controls.Add(Me.btnLimp)
        Me.Controls.Add(Me.btnCifrar)
        Me.Controls.Add(Me.GroupBox1)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.txtNum)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.txtCifrado)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.txtTexto)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.GroupBox1.ResumeLayout(False)
        Me.GroupBox1.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents txtTexto As TextBox
    Friend WithEvents Label1 As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents txtCifrado As TextBox
    Friend WithEvents Label3 As Label
    Friend WithEvents txtNum As TextBox
    Friend WithEvents GroupBox1 As GroupBox
    Friend WithEvents rbIzq As RadioButton
    Friend WithEvents rbDer As RadioButton
    Friend WithEvents btnCifrar As Button
    Friend WithEvents btnLimp As Button
    Friend WithEvents btnSalir As Button
End Class
