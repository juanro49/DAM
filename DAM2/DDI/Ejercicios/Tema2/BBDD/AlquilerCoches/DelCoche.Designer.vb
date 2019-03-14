<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class DelCoche
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
        Me.bynEliminar = New System.Windows.Forms.Button()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.listaCoche = New System.Windows.Forms.ListView()
        Me.SuspendLayout()
        '
        'bynEliminar
        '
        Me.bynEliminar.Location = New System.Drawing.Point(201, 301)
        Me.bynEliminar.Name = "bynEliminar"
        Me.bynEliminar.Size = New System.Drawing.Size(75, 23)
        Me.bynEliminar.TabIndex = 5
        Me.bynEliminar.Text = "Eliminar"
        Me.bynEliminar.UseVisualStyleBackColor = True
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label1.Location = New System.Drawing.Point(89, 9)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(251, 20)
        Me.Label1.TabIndex = 4
        Me.Label1.Text = "Selecciona el coche a eliminar"
        '
        'listaCoche
        '
        Me.listaCoche.Location = New System.Drawing.Point(12, 32)
        Me.listaCoche.Name = "listaCoche"
        Me.listaCoche.Size = New System.Drawing.Size(445, 263)
        Me.listaCoche.TabIndex = 3
        Me.listaCoche.UseCompatibleStateImageBehavior = False
        '
        'DelCoche
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(481, 338)
        Me.Controls.Add(Me.bynEliminar)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.listaCoche)
        Me.Name = "DelCoche"
        Me.Text = "DelCoche"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents bynEliminar As Button
    Friend WithEvents Label1 As Label
    Friend WithEvents listaCoche As ListView
End Class
