<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()>
Partial Class MostrarLibros
    Inherits System.Windows.Forms.Form

    'Form reemplaza a Dispose para limpiar la lista de componentes.
    <System.Diagnostics.DebuggerNonUserCode()>
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
    <System.Diagnostics.DebuggerStepThrough()>
    Private Sub InitializeComponent()
        Me.btnSig = New System.Windows.Forms.Button()
        Me.labCant = New System.Windows.Forms.Label()
        Me.Label8 = New System.Windows.Forms.Label()
        Me.labIsbn = New System.Windows.Forms.Label()
        Me.Label6 = New System.Windows.Forms.Label()
        Me.labAut = New System.Windows.Forms.Label()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.labTit = New System.Windows.Forms.Label()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.lbLibro = New System.Windows.Forms.Label()
        Me.SuspendLayout()
        '
        'btnSig
        '
        Me.btnSig.Location = New System.Drawing.Point(199, 171)
        Me.btnSig.Name = "btnSig"
        Me.btnSig.Size = New System.Drawing.Size(75, 23)
        Me.btnSig.TabIndex = 23
        Me.btnSig.Text = "Siguiente"
        Me.btnSig.UseVisualStyleBackColor = True
        '
        'labCant
        '
        Me.labCant.AutoSize = True
        Me.labCant.Location = New System.Drawing.Point(100, 119)
        Me.labCant.Name = "labCant"
        Me.labCant.Size = New System.Drawing.Size(0, 13)
        Me.labCant.TabIndex = 20
        '
        'Label8
        '
        Me.Label8.AutoSize = True
        Me.Label8.Location = New System.Drawing.Point(42, 119)
        Me.Label8.Name = "Label8"
        Me.Label8.Size = New System.Drawing.Size(52, 13)
        Me.Label8.TabIndex = 19
        Me.Label8.Text = "Cantidad:"
        '
        'labIsbn
        '
        Me.labIsbn.AutoSize = True
        Me.labIsbn.Location = New System.Drawing.Point(100, 90)
        Me.labIsbn.Name = "labIsbn"
        Me.labIsbn.Size = New System.Drawing.Size(0, 13)
        Me.labIsbn.TabIndex = 18
        '
        'Label6
        '
        Me.Label6.AutoSize = True
        Me.Label6.Location = New System.Drawing.Point(59, 89)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(35, 13)
        Me.Label6.TabIndex = 17
        Me.Label6.Text = "ISBN:"
        '
        'labAut
        '
        Me.labAut.AutoSize = True
        Me.labAut.Location = New System.Drawing.Point(100, 61)
        Me.labAut.Name = "labAut"
        Me.labAut.Size = New System.Drawing.Size(0, 13)
        Me.labAut.TabIndex = 16
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(59, 60)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(35, 13)
        Me.Label4.TabIndex = 15
        Me.Label4.Text = "Autor:"
        '
        'labTit
        '
        Me.labTit.AutoSize = True
        Me.labTit.Location = New System.Drawing.Point(100, 33)
        Me.labTit.Name = "labTit"
        Me.labTit.Size = New System.Drawing.Size(0, 13)
        Me.labTit.TabIndex = 14
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(59, 32)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(38, 13)
        Me.Label1.TabIndex = 13
        Me.Label1.Text = "Título:"
        '
        'lbLibro
        '
        Me.lbLibro.AutoSize = True
        Me.lbLibro.Location = New System.Drawing.Point(137, 176)
        Me.lbLibro.Name = "lbLibro"
        Me.lbLibro.Size = New System.Drawing.Size(24, 13)
        Me.lbLibro.TabIndex = 24
        Me.lbLibro.Text = "0/0"
        '
        'MostrarLibros
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(311, 224)
        Me.Controls.Add(Me.lbLibro)
        Me.Controls.Add(Me.btnSig)
        Me.Controls.Add(Me.labCant)
        Me.Controls.Add(Me.Label8)
        Me.Controls.Add(Me.labIsbn)
        Me.Controls.Add(Me.Label6)
        Me.Controls.Add(Me.labAut)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.labTit)
        Me.Controls.Add(Me.Label1)
        Me.Name = "MostrarLibros"
        Me.Text = "MostrarLibros"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents btnSig As Button
    Friend WithEvents labCant As Label
    Friend WithEvents Label8 As Label
    Friend WithEvents labIsbn As Label
    Friend WithEvents Label6 As Label
    Friend WithEvents labAut As Label
    Friend WithEvents Label4 As Label
    Friend WithEvents labTit As Label
    Friend WithEvents Label1 As Label
    Friend WithEvents lbLibro As Label
End Class
