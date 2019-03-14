<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Prestar
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
        Me.txtCarnet = New System.Windows.Forms.TextBox()
        Me.btnBuscar = New System.Windows.Forms.Button()
        Me.Panel1 = New System.Windows.Forms.Panel()
        Me.Panel2 = New System.Windows.Forms.Panel()
        Me.btnPrestar = New System.Windows.Forms.Button()
        Me.txtAutor = New System.Windows.Forms.TextBox()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.txtTitulo = New System.Windows.Forms.TextBox()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.Label10 = New System.Windows.Forms.Label()
        Me.labNom = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.labLibpres1 = New System.Windows.Forms.Label()
        Me.labLibpres2 = New System.Windows.Forms.Label()
        Me.labLibpres3 = New System.Windows.Forms.Label()
        Me.Panel1.SuspendLayout()
        Me.Panel2.SuspendLayout()
        Me.SuspendLayout()
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(54, 40)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(95, 13)
        Me.Label1.TabIndex = 0
        Me.Label1.Text = "Número de carnet:"
        '
        'txtCarnet
        '
        Me.txtCarnet.Location = New System.Drawing.Point(152, 37)
        Me.txtCarnet.Name = "txtCarnet"
        Me.txtCarnet.Size = New System.Drawing.Size(100, 20)
        Me.txtCarnet.TabIndex = 1
        '
        'btnBuscar
        '
        Me.btnBuscar.Location = New System.Drawing.Point(110, 81)
        Me.btnBuscar.Name = "btnBuscar"
        Me.btnBuscar.Size = New System.Drawing.Size(75, 23)
        Me.btnBuscar.TabIndex = 2
        Me.btnBuscar.Text = "Buscar"
        Me.btnBuscar.UseVisualStyleBackColor = True
        '
        'Panel1
        '
        Me.Panel1.Controls.Add(Me.labLibpres3)
        Me.Panel1.Controls.Add(Me.labLibpres2)
        Me.Panel1.Controls.Add(Me.labLibpres1)
        Me.Panel1.Controls.Add(Me.Panel2)
        Me.Panel1.Controls.Add(Me.Label10)
        Me.Panel1.Controls.Add(Me.labNom)
        Me.Panel1.Controls.Add(Me.Label2)
        Me.Panel1.Location = New System.Drawing.Point(57, 121)
        Me.Panel1.Name = "Panel1"
        Me.Panel1.Size = New System.Drawing.Size(284, 289)
        Me.Panel1.TabIndex = 3
        '
        'Panel2
        '
        Me.Panel2.Controls.Add(Me.btnPrestar)
        Me.Panel2.Controls.Add(Me.txtAutor)
        Me.Panel2.Controls.Add(Me.Label5)
        Me.Panel2.Controls.Add(Me.txtTitulo)
        Me.Panel2.Controls.Add(Me.Label4)
        Me.Panel2.Controls.Add(Me.Label3)
        Me.Panel2.Location = New System.Drawing.Point(3, 145)
        Me.Panel2.Name = "Panel2"
        Me.Panel2.Size = New System.Drawing.Size(278, 141)
        Me.Panel2.TabIndex = 20
        '
        'btnPrestar
        '
        Me.btnPrestar.Location = New System.Drawing.Point(92, 115)
        Me.btnPrestar.Name = "btnPrestar"
        Me.btnPrestar.Size = New System.Drawing.Size(75, 23)
        Me.btnPrestar.TabIndex = 5
        Me.btnPrestar.Text = "Prestar"
        Me.btnPrestar.UseVisualStyleBackColor = True
        '
        'txtAutor
        '
        Me.txtAutor.Location = New System.Drawing.Point(74, 77)
        Me.txtAutor.Name = "txtAutor"
        Me.txtAutor.Size = New System.Drawing.Size(153, 20)
        Me.txtAutor.TabIndex = 4
        '
        'Label5
        '
        Me.Label5.AutoSize = True
        Me.Label5.Location = New System.Drawing.Point(29, 80)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(35, 13)
        Me.Label5.TabIndex = 3
        Me.Label5.Text = "Autor:"
        '
        'txtTitulo
        '
        Me.txtTitulo.Location = New System.Drawing.Point(74, 51)
        Me.txtTitulo.Name = "txtTitulo"
        Me.txtTitulo.Size = New System.Drawing.Size(153, 20)
        Me.txtTitulo.TabIndex = 2
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(29, 54)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(38, 13)
        Me.Label4.TabIndex = 1
        Me.Label4.Text = "Título:"
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(56, 15)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(126, 13)
        Me.Label3.TabIndex = 0
        Me.Label3.Text = "Ejemplar que desea cojer"
        '
        'Label10
        '
        Me.Label10.AutoSize = True
        Me.Label10.Location = New System.Drawing.Point(19, 54)
        Me.Label10.Name = "Label10"
        Me.Label10.Size = New System.Drawing.Size(133, 13)
        Me.Label10.TabIndex = 18
        Me.Label10.Text = "PRÉSTAMOS ACTUALES"
        '
        'labNom
        '
        Me.labNom.AutoSize = True
        Me.labNom.Location = New System.Drawing.Point(74, 17)
        Me.labNom.Name = "labNom"
        Me.labNom.Size = New System.Drawing.Size(0, 13)
        Me.labNom.TabIndex = 11
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(19, 17)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(46, 13)
        Me.Label2.TabIndex = 10
        Me.Label2.Text = "Usuario:"
        '
        'labLibpres1
        '
        Me.labLibpres1.AutoSize = True
        Me.labLibpres1.Location = New System.Drawing.Point(50, 76)
        Me.labLibpres1.Name = "labLibpres1"
        Me.labLibpres1.Size = New System.Drawing.Size(0, 13)
        Me.labLibpres1.TabIndex = 21
        '
        'labLibpres2
        '
        Me.labLibpres2.AutoSize = True
        Me.labLibpres2.Location = New System.Drawing.Point(50, 98)
        Me.labLibpres2.Name = "labLibpres2"
        Me.labLibpres2.Size = New System.Drawing.Size(0, 13)
        Me.labLibpres2.TabIndex = 22
        '
        'labLibpres3
        '
        Me.labLibpres3.AutoSize = True
        Me.labLibpres3.Location = New System.Drawing.Point(50, 120)
        Me.labLibpres3.Name = "labLibpres3"
        Me.labLibpres3.Size = New System.Drawing.Size(0, 13)
        Me.labLibpres3.TabIndex = 23
        '
        'Prestar
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(386, 422)
        Me.Controls.Add(Me.Panel1)
        Me.Controls.Add(Me.btnBuscar)
        Me.Controls.Add(Me.txtCarnet)
        Me.Controls.Add(Me.Label1)
        Me.Name = "Prestar"
        Me.Text = "Préstamo de ejemplares"
        Me.Panel1.ResumeLayout(False)
        Me.Panel1.PerformLayout()
        Me.Panel2.ResumeLayout(False)
        Me.Panel2.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents Label1 As Label
    Friend WithEvents txtCarnet As TextBox
    Friend WithEvents btnBuscar As Button
    Friend WithEvents Panel1 As Panel
    Friend WithEvents Panel2 As Panel
    Friend WithEvents btnPrestar As Button
    Friend WithEvents txtAutor As TextBox
    Friend WithEvents Label5 As Label
    Friend WithEvents txtTitulo As TextBox
    Friend WithEvents Label4 As Label
    Friend WithEvents Label3 As Label
    Friend WithEvents Label10 As Label
    Friend WithEvents labNom As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents labLibpres3 As Label
    Friend WithEvents labLibpres2 As Label
    Friend WithEvents labLibpres1 As Label
End Class
