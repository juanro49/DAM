<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class DelUsu
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
        Me.listaUsu = New System.Windows.Forms.ListView()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.bynEliminar = New System.Windows.Forms.Button()
        Me.SuspendLayout()
        '
        'listaUsu
        '
        Me.listaUsu.Location = New System.Drawing.Point(12, 32)
        Me.listaUsu.Name = "listaUsu"
        Me.listaUsu.Size = New System.Drawing.Size(445, 263)
        Me.listaUsu.TabIndex = 0
        Me.listaUsu.UseCompatibleStateImageBehavior = False
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label1.Location = New System.Drawing.Point(89, 9)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(262, 20)
        Me.Label1.TabIndex = 1
        Me.Label1.Text = "Selecciona el usuario a eliminar"
        '
        'bynEliminar
        '
        Me.bynEliminar.Location = New System.Drawing.Point(201, 301)
        Me.bynEliminar.Name = "bynEliminar"
        Me.bynEliminar.Size = New System.Drawing.Size(75, 23)
        Me.bynEliminar.TabIndex = 2
        Me.bynEliminar.Text = "Eliminar"
        Me.bynEliminar.UseVisualStyleBackColor = True
        '
        'DelUsu
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(469, 341)
        Me.Controls.Add(Me.bynEliminar)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.listaUsu)
        Me.Name = "DelUsu"
        Me.Text = "DelUsu"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents listaUsu As ListView
    Friend WithEvents Label1 As Label
    Friend WithEvents bynEliminar As Button
End Class
