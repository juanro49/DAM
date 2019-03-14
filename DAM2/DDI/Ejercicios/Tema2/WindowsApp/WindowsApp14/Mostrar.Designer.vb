<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Mostrar
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
        Me.labNom = New System.Windows.Forms.Label()
        Me.labDni = New System.Windows.Forms.Label()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.labProf = New System.Windows.Forms.Label()
        Me.Label6 = New System.Windows.Forms.Label()
        Me.labEdad = New System.Windows.Forms.Label()
        Me.Label8 = New System.Windows.Forms.Label()
        Me.labLibpres1 = New System.Windows.Forms.Label()
        Me.Label10 = New System.Windows.Forms.Label()
        Me.btnSig = New System.Windows.Forms.Button()
        Me.labLibpres2 = New System.Windows.Forms.Label()
        Me.labLibpres3 = New System.Windows.Forms.Label()
        Me.SuspendLayout()
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(82, 48)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(46, 13)
        Me.Label1.TabIndex = 0
        Me.Label1.Text = "Usuario:"
        '
        'labNom
        '
        Me.labNom.AutoSize = True
        Me.labNom.Location = New System.Drawing.Point(137, 48)
        Me.labNom.Name = "labNom"
        Me.labNom.Size = New System.Drawing.Size(0, 13)
        Me.labNom.TabIndex = 1
        '
        'labDni
        '
        Me.labDni.AutoSize = True
        Me.labDni.Location = New System.Drawing.Point(137, 76)
        Me.labDni.Name = "labDni"
        Me.labDni.Size = New System.Drawing.Size(0, 13)
        Me.labDni.TabIndex = 3
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(82, 76)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(29, 13)
        Me.Label4.TabIndex = 2
        Me.Label4.Text = "DNI:"
        '
        'labProf
        '
        Me.labProf.AutoSize = True
        Me.labProf.Location = New System.Drawing.Point(137, 105)
        Me.labProf.Name = "labProf"
        Me.labProf.Size = New System.Drawing.Size(0, 13)
        Me.labProf.TabIndex = 5
        '
        'Label6
        '
        Me.Label6.AutoSize = True
        Me.Label6.Location = New System.Drawing.Point(82, 105)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(54, 13)
        Me.Label6.TabIndex = 4
        Me.Label6.Text = "Profesión:"
        '
        'labEdad
        '
        Me.labEdad.AutoSize = True
        Me.labEdad.Location = New System.Drawing.Point(137, 134)
        Me.labEdad.Name = "labEdad"
        Me.labEdad.Size = New System.Drawing.Size(0, 13)
        Me.labEdad.TabIndex = 7
        '
        'Label8
        '
        Me.Label8.AutoSize = True
        Me.Label8.Location = New System.Drawing.Point(82, 134)
        Me.Label8.Name = "Label8"
        Me.Label8.Size = New System.Drawing.Size(35, 13)
        Me.Label8.TabIndex = 6
        Me.Label8.Text = "Edad:"
        '
        'labLibpres1
        '
        Me.labLibpres1.AutoSize = True
        Me.labLibpres1.Location = New System.Drawing.Point(137, 209)
        Me.labLibpres1.Name = "labLibpres1"
        Me.labLibpres1.Size = New System.Drawing.Size(0, 13)
        Me.labLibpres1.TabIndex = 9
        '
        'Label10
        '
        Me.Label10.AutoSize = True
        Me.Label10.Location = New System.Drawing.Point(82, 183)
        Me.Label10.Name = "Label10"
        Me.Label10.Size = New System.Drawing.Size(133, 13)
        Me.Label10.TabIndex = 8
        Me.Label10.Text = "PRÉSTAMOS ACTUALES"
        '
        'btnSig
        '
        Me.btnSig.Location = New System.Drawing.Point(263, 326)
        Me.btnSig.Name = "btnSig"
        Me.btnSig.Size = New System.Drawing.Size(75, 23)
        Me.btnSig.TabIndex = 10
        Me.btnSig.Text = "Siguiente"
        Me.btnSig.UseVisualStyleBackColor = True
        '
        'labLibpres2
        '
        Me.labLibpres2.AutoSize = True
        Me.labLibpres2.Location = New System.Drawing.Point(137, 236)
        Me.labLibpres2.Name = "labLibpres2"
        Me.labLibpres2.Size = New System.Drawing.Size(0, 13)
        Me.labLibpres2.TabIndex = 11
        '
        'labLibpres3
        '
        Me.labLibpres3.AutoSize = True
        Me.labLibpres3.Location = New System.Drawing.Point(137, 263)
        Me.labLibpres3.Name = "labLibpres3"
        Me.labLibpres3.Size = New System.Drawing.Size(0, 13)
        Me.labLibpres3.TabIndex = 12
        '
        'Mostrar
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(364, 377)
        Me.Controls.Add(Me.labLibpres3)
        Me.Controls.Add(Me.labLibpres2)
        Me.Controls.Add(Me.btnSig)
        Me.Controls.Add(Me.labLibpres1)
        Me.Controls.Add(Me.Label10)
        Me.Controls.Add(Me.labEdad)
        Me.Controls.Add(Me.Label8)
        Me.Controls.Add(Me.labProf)
        Me.Controls.Add(Me.Label6)
        Me.Controls.Add(Me.labDni)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.labNom)
        Me.Controls.Add(Me.Label1)
        Me.Name = "Mostrar"
        Me.Text = "Información de los usuarios"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents Label1 As Label
    Friend WithEvents labNom As Label
    Friend WithEvents labDni As Label
    Friend WithEvents Label4 As Label
    Friend WithEvents labProf As Label
    Friend WithEvents Label6 As Label
    Friend WithEvents labEdad As Label
    Friend WithEvents Label8 As Label
    Friend WithEvents labLibpres1 As Label
    Friend WithEvents Label10 As Label
    Friend WithEvents btnSig As Button
    Friend WithEvents labLibpres2 As Label
    Friend WithEvents labLibpres3 As Label
End Class
