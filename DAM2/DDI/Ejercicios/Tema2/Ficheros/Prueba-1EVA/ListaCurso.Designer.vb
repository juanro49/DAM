<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()>
Partial Class ListaCurso
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
        Me.Panel1 = New System.Windows.Forms.Panel()
        Me.txtCursoL = New System.Windows.Forms.TextBox()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.btnListar = New System.Windows.Forms.Button()
        Me.Panel2 = New System.Windows.Forms.Panel()
        Me.txtCurso = New System.Windows.Forms.TextBox()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.txtApe2 = New System.Windows.Forms.TextBox()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.txtApe1 = New System.Windows.Forms.TextBox()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.txtNom = New System.Windows.Forms.TextBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.txtNota = New System.Windows.Forms.TextBox()
        Me.Label6 = New System.Windows.Forms.Label()
        Me.btnSig = New System.Windows.Forms.Button()
        Me.Panel1.SuspendLayout()
        Me.Panel2.SuspendLayout()
        Me.SuspendLayout()
        '
        'Panel1
        '
        Me.Panel1.Controls.Add(Me.btnListar)
        Me.Panel1.Controls.Add(Me.txtCursoL)
        Me.Panel1.Controls.Add(Me.Label2)
        Me.Panel1.Location = New System.Drawing.Point(12, 12)
        Me.Panel1.Name = "Panel1"
        Me.Panel1.Size = New System.Drawing.Size(385, 62)
        Me.Panel1.TabIndex = 0
        '
        'txtCursoL
        '
        Me.txtCursoL.Location = New System.Drawing.Point(110, 21)
        Me.txtCursoL.Name = "txtCursoL"
        Me.txtCursoL.Size = New System.Drawing.Size(162, 20)
        Me.txtCursoL.TabIndex = 16
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(34, 24)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(70, 13)
        Me.Label2.TabIndex = 15
        Me.Label2.Text = "Curso a listar:"
        '
        'btnListar
        '
        Me.btnListar.Location = New System.Drawing.Point(296, 21)
        Me.btnListar.Name = "btnListar"
        Me.btnListar.Size = New System.Drawing.Size(73, 20)
        Me.btnListar.TabIndex = 22
        Me.btnListar.Text = "Listar"
        Me.btnListar.UseVisualStyleBackColor = True
        '
        'Panel2
        '
        Me.Panel2.Controls.Add(Me.btnSig)
        Me.Panel2.Controls.Add(Me.txtCurso)
        Me.Panel2.Controls.Add(Me.Label5)
        Me.Panel2.Controls.Add(Me.txtApe2)
        Me.Panel2.Controls.Add(Me.Label4)
        Me.Panel2.Controls.Add(Me.txtApe1)
        Me.Panel2.Controls.Add(Me.Label3)
        Me.Panel2.Controls.Add(Me.txtNom)
        Me.Panel2.Controls.Add(Me.Label1)
        Me.Panel2.Controls.Add(Me.txtNota)
        Me.Panel2.Controls.Add(Me.Label6)
        Me.Panel2.Location = New System.Drawing.Point(13, 81)
        Me.Panel2.Name = "Panel2"
        Me.Panel2.Size = New System.Drawing.Size(384, 279)
        Me.Panel2.TabIndex = 1
        '
        'txtCurso
        '
        Me.txtCurso.Location = New System.Drawing.Point(109, 135)
        Me.txtCurso.Name = "txtCurso"
        Me.txtCurso.ReadOnly = True
        Me.txtCurso.Size = New System.Drawing.Size(162, 20)
        Me.txtCurso.TabIndex = 30
        '
        'Label5
        '
        Me.Label5.AutoSize = True
        Me.Label5.Location = New System.Drawing.Point(49, 138)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(37, 13)
        Me.Label5.TabIndex = 29
        Me.Label5.Text = "Curso:"
        '
        'txtApe2
        '
        Me.txtApe2.Location = New System.Drawing.Point(109, 100)
        Me.txtApe2.Name = "txtApe2"
        Me.txtApe2.ReadOnly = True
        Me.txtApe2.Size = New System.Drawing.Size(162, 20)
        Me.txtApe2.TabIndex = 28
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(49, 103)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(56, 13)
        Me.Label4.TabIndex = 27
        Me.Label4.Text = "Apellido 2:"
        '
        'txtApe1
        '
        Me.txtApe1.Location = New System.Drawing.Point(109, 64)
        Me.txtApe1.Name = "txtApe1"
        Me.txtApe1.ReadOnly = True
        Me.txtApe1.Size = New System.Drawing.Size(162, 20)
        Me.txtApe1.TabIndex = 26
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(49, 67)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(56, 13)
        Me.Label3.TabIndex = 25
        Me.Label3.Text = "Apellido 1:"
        '
        'txtNom
        '
        Me.txtNom.Location = New System.Drawing.Point(109, 25)
        Me.txtNom.Name = "txtNom"
        Me.txtNom.ReadOnly = True
        Me.txtNom.Size = New System.Drawing.Size(162, 20)
        Me.txtNom.TabIndex = 24
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(49, 28)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(47, 13)
        Me.Label1.TabIndex = 23
        Me.Label1.Text = "Nombre:"
        '
        'txtNota
        '
        Me.txtNota.Location = New System.Drawing.Point(109, 170)
        Me.txtNota.Name = "txtNota"
        Me.txtNota.ReadOnly = True
        Me.txtNota.Size = New System.Drawing.Size(162, 20)
        Me.txtNota.TabIndex = 22
        '
        'Label6
        '
        Me.Label6.AutoSize = True
        Me.Label6.Location = New System.Drawing.Point(49, 173)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(33, 13)
        Me.Label6.TabIndex = 21
        Me.Label6.Text = "Nota:"
        '
        'btnSig
        '
        Me.btnSig.Location = New System.Drawing.Point(271, 225)
        Me.btnSig.Name = "btnSig"
        Me.btnSig.Size = New System.Drawing.Size(97, 36)
        Me.btnSig.TabIndex = 31
        Me.btnSig.Text = "Siguiente"
        Me.btnSig.UseVisualStyleBackColor = True
        '
        'ListaCurso
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(413, 372)
        Me.Controls.Add(Me.Panel2)
        Me.Controls.Add(Me.Panel1)
        Me.Name = "ListaCurso"
        Me.Text = "ListaCurso"
        Me.Panel1.ResumeLayout(False)
        Me.Panel1.PerformLayout()
        Me.Panel2.ResumeLayout(False)
        Me.Panel2.PerformLayout()
        Me.ResumeLayout(False)

    End Sub

    Friend WithEvents Panel1 As Panel
    Friend WithEvents txtCursoL As TextBox
    Friend WithEvents Label2 As Label
    Friend WithEvents btnListar As Button
    Friend WithEvents Panel2 As Panel
    Friend WithEvents txtCurso As TextBox
    Friend WithEvents Label5 As Label
    Friend WithEvents txtApe2 As TextBox
    Friend WithEvents Label4 As Label
    Friend WithEvents txtApe1 As TextBox
    Friend WithEvents Label3 As Label
    Friend WithEvents txtNom As TextBox
    Friend WithEvents Label1 As Label
    Friend WithEvents txtNota As TextBox
    Friend WithEvents Label6 As Label
    Friend WithEvents btnSig As Button
End Class
