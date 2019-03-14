<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Ingresar
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
        Me.txtDni = New System.Windows.Forms.TextBox()
        Me.txtNom = New System.Windows.Forms.TextBox()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.txtApe = New System.Windows.Forms.TextBox()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.txtProf = New System.Windows.Forms.TextBox()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.txtEdad = New System.Windows.Forms.TextBox()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.btnIngres = New System.Windows.Forms.Button()
        Me.SuspendLayout()
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(34, 35)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(29, 13)
        Me.Label1.TabIndex = 0
        Me.Label1.Text = "DNI:"
        '
        'txtDni
        '
        Me.txtDni.Location = New System.Drawing.Point(94, 32)
        Me.txtDni.Name = "txtDni"
        Me.txtDni.Size = New System.Drawing.Size(162, 20)
        Me.txtDni.TabIndex = 1
        '
        'txtNom
        '
        Me.txtNom.Location = New System.Drawing.Point(94, 68)
        Me.txtNom.Name = "txtNom"
        Me.txtNom.Size = New System.Drawing.Size(162, 20)
        Me.txtNom.TabIndex = 3
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(34, 71)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(47, 13)
        Me.Label2.TabIndex = 2
        Me.Label2.Text = "Nombre:"
        '
        'txtApe
        '
        Me.txtApe.Location = New System.Drawing.Point(94, 107)
        Me.txtApe.Name = "txtApe"
        Me.txtApe.Size = New System.Drawing.Size(162, 20)
        Me.txtApe.TabIndex = 5
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(34, 110)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(52, 13)
        Me.Label3.TabIndex = 4
        Me.Label3.Text = "Apellidos:"
        '
        'txtProf
        '
        Me.txtProf.Location = New System.Drawing.Point(94, 143)
        Me.txtProf.Name = "txtProf"
        Me.txtProf.Size = New System.Drawing.Size(162, 20)
        Me.txtProf.TabIndex = 7
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(34, 146)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(54, 13)
        Me.Label4.TabIndex = 6
        Me.Label4.Text = "Profesión:"
        '
        'txtEdad
        '
        Me.txtEdad.Location = New System.Drawing.Point(94, 178)
        Me.txtEdad.Name = "txtEdad"
        Me.txtEdad.Size = New System.Drawing.Size(162, 20)
        Me.txtEdad.TabIndex = 9
        '
        'Label5
        '
        Me.Label5.AutoSize = True
        Me.Label5.Location = New System.Drawing.Point(34, 181)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(35, 13)
        Me.Label5.TabIndex = 8
        Me.Label5.Text = "Edad:"
        '
        'btnIngres
        '
        Me.btnIngres.Location = New System.Drawing.Point(142, 221)
        Me.btnIngres.Name = "btnIngres"
        Me.btnIngres.Size = New System.Drawing.Size(97, 36)
        Me.btnIngres.TabIndex = 10
        Me.btnIngres.Text = "Ingresar"
        Me.btnIngres.UseVisualStyleBackColor = True
        '
        'Ingresar
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(306, 285)
        Me.Controls.Add(Me.btnIngres)
        Me.Controls.Add(Me.txtEdad)
        Me.Controls.Add(Me.Label5)
        Me.Controls.Add(Me.txtProf)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.txtApe)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.txtNom)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.txtDni)
        Me.Controls.Add(Me.Label1)
        Me.Name = "Ingresar"
        Me.Text = "Ingresar"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents Label1 As Label
    Friend WithEvents txtDni As TextBox
    Friend WithEvents txtNom As TextBox
    Friend WithEvents Label2 As Label
    Friend WithEvents txtApe As TextBox
    Friend WithEvents Label3 As Label
    Friend WithEvents txtProf As TextBox
    Friend WithEvents Label4 As Label
    Friend WithEvents txtEdad As TextBox
    Friend WithEvents Label5 As Label
    Friend WithEvents btnIngres As Button
End Class
