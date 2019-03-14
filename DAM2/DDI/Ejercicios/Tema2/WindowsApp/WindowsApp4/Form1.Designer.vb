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
        Me.txtLado1 = New System.Windows.Forms.TextBox()
        Me.txtLado2 = New System.Windows.Forms.TextBox()
        Me.btnCalcular = New System.Windows.Forms.Button()
        Me.Área = New System.Windows.Forms.Label()
        Me.labArea = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.rbCuadrado = New System.Windows.Forms.RadioButton()
        Me.rbRect = New System.Windows.Forms.RadioButton()
        Me.rbTrian = New System.Windows.Forms.RadioButton()
        Me.rbCirc = New System.Windows.Forms.RadioButton()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.txtAltura = New System.Windows.Forms.TextBox()
        Me.txtBase = New System.Windows.Forms.TextBox()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.Label6 = New System.Windows.Forms.Label()
        Me.txtRadio = New System.Windows.Forms.TextBox()
        Me.panCuad = New System.Windows.Forms.Panel()
        Me.panTri = New System.Windows.Forms.Panel()
        Me.PanCir = New System.Windows.Forms.Panel()
        Me.panCuad.SuspendLayout()
        Me.panTri.SuspendLayout()
        Me.PanCir.SuspendLayout()
        Me.SuspendLayout()
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(13, 18)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(37, 13)
        Me.Label1.TabIndex = 0
        Me.Label1.Text = "Lado1"
        '
        'txtLado1
        '
        Me.txtLado1.Location = New System.Drawing.Point(56, 15)
        Me.txtLado1.Name = "txtLado1"
        Me.txtLado1.Size = New System.Drawing.Size(100, 20)
        Me.txtLado1.TabIndex = 1
        '
        'txtLado2
        '
        Me.txtLado2.Location = New System.Drawing.Point(56, 41)
        Me.txtLado2.Name = "txtLado2"
        Me.txtLado2.Size = New System.Drawing.Size(100, 20)
        Me.txtLado2.TabIndex = 2
        '
        'btnCalcular
        '
        Me.btnCalcular.Location = New System.Drawing.Point(239, 393)
        Me.btnCalcular.Name = "btnCalcular"
        Me.btnCalcular.Size = New System.Drawing.Size(75, 23)
        Me.btnCalcular.TabIndex = 3
        Me.btnCalcular.Text = "Calcular"
        Me.btnCalcular.UseVisualStyleBackColor = True
        '
        'Área
        '
        Me.Área.AutoSize = True
        Me.Área.Font = New System.Drawing.Font("Microsoft Sans Serif", 8.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Área.Location = New System.Drawing.Point(56, 101)
        Me.Área.Name = "Área"
        Me.Área.Size = New System.Drawing.Size(33, 13)
        Me.Área.TabIndex = 4
        Me.Área.Text = "Área"
        '
        'labArea
        '
        Me.labArea.AutoSize = True
        Me.labArea.Location = New System.Drawing.Point(96, 101)
        Me.labArea.Name = "labArea"
        Me.labArea.Size = New System.Drawing.Size(10, 13)
        Me.labArea.TabIndex = 5
        Me.labArea.Text = "-"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Font = New System.Drawing.Font("Microsoft Sans Serif", 8.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label2.Location = New System.Drawing.Point(12, 18)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(42, 13)
        Me.Label2.TabIndex = 6
        Me.Label2.Text = "Figura"
        '
        'rbCuadrado
        '
        Me.rbCuadrado.AutoSize = True
        Me.rbCuadrado.Location = New System.Drawing.Point(59, 46)
        Me.rbCuadrado.Name = "rbCuadrado"
        Me.rbCuadrado.Size = New System.Drawing.Size(71, 17)
        Me.rbCuadrado.TabIndex = 7
        Me.rbCuadrado.TabStop = True
        Me.rbCuadrado.Text = "Cuadrado"
        Me.rbCuadrado.UseVisualStyleBackColor = True
        '
        'rbRect
        '
        Me.rbRect.AutoSize = True
        Me.rbRect.Location = New System.Drawing.Point(59, 69)
        Me.rbRect.Name = "rbRect"
        Me.rbRect.Size = New System.Drawing.Size(80, 17)
        Me.rbRect.TabIndex = 8
        Me.rbRect.TabStop = True
        Me.rbRect.Text = "Rectángulo"
        Me.rbRect.UseVisualStyleBackColor = True
        '
        'rbTrian
        '
        Me.rbTrian.AutoSize = True
        Me.rbTrian.Location = New System.Drawing.Point(155, 46)
        Me.rbTrian.Name = "rbTrian"
        Me.rbTrian.Size = New System.Drawing.Size(69, 17)
        Me.rbTrian.TabIndex = 9
        Me.rbTrian.TabStop = True
        Me.rbTrian.Text = "Triángulo"
        Me.rbTrian.UseVisualStyleBackColor = True
        '
        'rbCirc
        '
        Me.rbCirc.AutoSize = True
        Me.rbCirc.Location = New System.Drawing.Point(155, 69)
        Me.rbCirc.Name = "rbCirc"
        Me.rbCirc.Size = New System.Drawing.Size(59, 17)
        Me.rbCirc.TabIndex = 10
        Me.rbCirc.TabStop = True
        Me.rbCirc.Text = "Círculo"
        Me.rbCirc.UseVisualStyleBackColor = True
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(21, 18)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(34, 13)
        Me.Label3.TabIndex = 11
        Me.Label3.Text = "Altura"
        '
        'txtAltura
        '
        Me.txtAltura.Location = New System.Drawing.Point(56, 15)
        Me.txtAltura.Name = "txtAltura"
        Me.txtAltura.Size = New System.Drawing.Size(100, 20)
        Me.txtAltura.TabIndex = 12
        '
        'txtBase
        '
        Me.txtBase.Location = New System.Drawing.Point(56, 41)
        Me.txtBase.Name = "txtBase"
        Me.txtBase.Size = New System.Drawing.Size(100, 20)
        Me.txtBase.TabIndex = 14
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(21, 44)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(31, 13)
        Me.Label4.TabIndex = 13
        Me.Label4.Text = "Base"
        '
        'Label5
        '
        Me.Label5.AutoSize = True
        Me.Label5.Location = New System.Drawing.Point(13, 44)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(37, 13)
        Me.Label5.TabIndex = 15
        Me.Label5.Text = "Lado2"
        '
        'Label6
        '
        Me.Label6.AutoSize = True
        Me.Label6.Location = New System.Drawing.Point(15, 17)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(35, 13)
        Me.Label6.TabIndex = 16
        Me.Label6.Text = "Radio"
        '
        'txtRadio
        '
        Me.txtRadio.Location = New System.Drawing.Point(59, 17)
        Me.txtRadio.Name = "txtRadio"
        Me.txtRadio.Size = New System.Drawing.Size(100, 20)
        Me.txtRadio.TabIndex = 17
        '
        'panCuad
        '
        Me.panCuad.Controls.Add(Me.txtLado1)
        Me.panCuad.Controls.Add(Me.Label1)
        Me.panCuad.Controls.Add(Me.txtLado2)
        Me.panCuad.Controls.Add(Me.Label5)
        Me.panCuad.Location = New System.Drawing.Point(59, 117)
        Me.panCuad.Name = "panCuad"
        Me.panCuad.Size = New System.Drawing.Size(179, 73)
        Me.panCuad.TabIndex = 18
        '
        'panTri
        '
        Me.panTri.Controls.Add(Me.Label3)
        Me.panTri.Controls.Add(Me.txtAltura)
        Me.panTri.Controls.Add(Me.Label4)
        Me.panTri.Controls.Add(Me.txtBase)
        Me.panTri.Location = New System.Drawing.Point(62, 117)
        Me.panTri.Name = "panTri"
        Me.panTri.Size = New System.Drawing.Size(163, 70)
        Me.panTri.TabIndex = 19
        '
        'PanCir
        '
        Me.PanCir.Controls.Add(Me.txtRadio)
        Me.PanCir.Controls.Add(Me.Label6)
        Me.PanCir.Location = New System.Drawing.Point(59, 124)
        Me.PanCir.Name = "PanCir"
        Me.PanCir.Size = New System.Drawing.Size(179, 50)
        Me.PanCir.TabIndex = 20
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(326, 450)
        Me.Controls.Add(Me.PanCir)
        Me.Controls.Add(Me.panTri)
        Me.Controls.Add(Me.panCuad)
        Me.Controls.Add(Me.rbCirc)
        Me.Controls.Add(Me.rbTrian)
        Me.Controls.Add(Me.rbRect)
        Me.Controls.Add(Me.rbCuadrado)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.labArea)
        Me.Controls.Add(Me.Área)
        Me.Controls.Add(Me.btnCalcular)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.panCuad.ResumeLayout(False)
        Me.panCuad.PerformLayout()
        Me.panTri.ResumeLayout(False)
        Me.panTri.PerformLayout()
        Me.PanCir.ResumeLayout(False)
        Me.PanCir.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents Label1 As Label
    Friend WithEvents txtLado1 As TextBox
    Friend WithEvents txtLado2 As TextBox
    Friend WithEvents btnCalcular As Button
    Friend WithEvents Área As Label
    Friend WithEvents labArea As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents rbCuadrado As RadioButton
    Friend WithEvents rbRect As RadioButton
    Friend WithEvents rbTrian As RadioButton
    Friend WithEvents rbCirc As RadioButton
    Friend WithEvents Label3 As Label
    Friend WithEvents txtAltura As TextBox
    Friend WithEvents txtBase As TextBox
    Friend WithEvents Label4 As Label
    Friend WithEvents Label5 As Label
    Friend WithEvents Label6 As Label
    Friend WithEvents txtRadio As TextBox
    Friend WithEvents panCuad As Panel
    Friend WithEvents panTri As Panel
    Friend WithEvents PanCir As Panel
End Class
