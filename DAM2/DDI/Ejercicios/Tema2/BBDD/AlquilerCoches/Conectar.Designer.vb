<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Conectar
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
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(Conectar))
        Me.btnConectar = New System.Windows.Forms.Button()
        Me.txtCont = New System.Windows.Forms.TextBox()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.txtUsu = New System.Windows.Forms.TextBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.cbMosCont = New System.Windows.Forms.CheckBox()
        Me.SuspendLayout()
        '
        'btnConectar
        '
        Me.btnConectar.FlatStyle = System.Windows.Forms.FlatStyle.System
        Me.btnConectar.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnConectar.Location = New System.Drawing.Point(197, 175)
        Me.btnConectar.Name = "btnConectar"
        Me.btnConectar.Size = New System.Drawing.Size(75, 23)
        Me.btnConectar.TabIndex = 9
        Me.btnConectar.Text = "Conectar"
        Me.btnConectar.UseVisualStyleBackColor = True
        '
        'txtCont
        '
        Me.txtCont.Location = New System.Drawing.Point(191, 113)
        Me.txtCont.Name = "txtCont"
        Me.txtCont.Size = New System.Drawing.Size(98, 20)
        Me.txtCont.TabIndex = 8
        Me.txtCont.UseSystemPasswordChar = True
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.FlatStyle = System.Windows.Forms.FlatStyle.System
        Me.Label2.Font = New System.Drawing.Font("Segoe UI", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label2.Location = New System.Drawing.Point(94, 114)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(81, 17)
        Me.Label2.TabIndex = 7
        Me.Label2.Text = "Contraseña:"
        '
        'txtUsu
        '
        Me.txtUsu.Location = New System.Drawing.Point(191, 77)
        Me.txtUsu.Name = "txtUsu"
        Me.txtUsu.Size = New System.Drawing.Size(98, 20)
        Me.txtUsu.TabIndex = 6
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.FlatStyle = System.Windows.Forms.FlatStyle.System
        Me.Label1.Font = New System.Drawing.Font("Segoe UI", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label1.Location = New System.Drawing.Point(119, 78)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(59, 17)
        Me.Label1.TabIndex = 5
        Me.Label1.Text = "Usuario:"
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.FlatStyle = System.Windows.Forms.FlatStyle.System
        Me.Label3.Font = New System.Drawing.Font("Segoe UI", 11.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label3.Location = New System.Drawing.Point(29, 28)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(407, 20)
        Me.Label3.TabIndex = 10
        Me.Label3.Text = "Introduce usuario y contraseña para acceder al programa"
        '
        'cbMosCont
        '
        Me.cbMosCont.AutoSize = True
        Me.cbMosCont.FlatStyle = System.Windows.Forms.FlatStyle.System
        Me.cbMosCont.Location = New System.Drawing.Point(191, 140)
        Me.cbMosCont.Name = "cbMosCont"
        Me.cbMosCont.Size = New System.Drawing.Size(123, 18)
        Me.cbMosCont.TabIndex = 11
        Me.cbMosCont.Text = "Mostrar contraseña"
        Me.cbMosCont.UseVisualStyleBackColor = True
        '
        'Conectar
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(460, 218)
        Me.Controls.Add(Me.cbMosCont)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.btnConectar)
        Me.Controls.Add(Me.txtCont)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.txtUsu)
        Me.Controls.Add(Me.Label1)
        Me.Icon = CType(resources.GetObject("$this.Icon"), System.Drawing.Icon)
        Me.Name = "Conectar"
        Me.Opacity = 0.98R
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Conectar"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents btnConectar As Button
    Friend WithEvents txtCont As TextBox
    Friend WithEvents Label2 As Label
    Friend WithEvents txtUsu As TextBox
    Friend WithEvents Label1 As Label
    Friend WithEvents Label3 As Label
    Friend WithEvents cbMosCont As CheckBox
End Class
