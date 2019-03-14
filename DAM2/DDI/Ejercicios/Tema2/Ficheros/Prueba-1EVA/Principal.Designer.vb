<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Principal
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
        Me.MenuStrip1 = New System.Windows.Forms.MenuStrip()
        Me.AñadirToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.ListarToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.ListarAlumnosDeUnCursoToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.ListarNotasDeUnCursoToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.ListarAlumnosConNotasMasAltasToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.SalirToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.MenuStrip1.SuspendLayout()
        Me.SuspendLayout()
        '
        'MenuStrip1
        '
        Me.MenuStrip1.Items.AddRange(New System.Windows.Forms.ToolStripItem() {Me.AñadirToolStripMenuItem, Me.ListarToolStripMenuItem, Me.SalirToolStripMenuItem})
        Me.MenuStrip1.Location = New System.Drawing.Point(0, 0)
        Me.MenuStrip1.Name = "MenuStrip1"
        Me.MenuStrip1.Size = New System.Drawing.Size(329, 24)
        Me.MenuStrip1.TabIndex = 0
        Me.MenuStrip1.Text = "MenuStrip1"
        '
        'AñadirToolStripMenuItem
        '
        Me.AñadirToolStripMenuItem.Name = "AñadirToolStripMenuItem"
        Me.AñadirToolStripMenuItem.Size = New System.Drawing.Size(54, 20)
        Me.AñadirToolStripMenuItem.Text = "Añadir"
        '
        'ListarToolStripMenuItem
        '
        Me.ListarToolStripMenuItem.DropDownItems.AddRange(New System.Windows.Forms.ToolStripItem() {Me.ListarAlumnosDeUnCursoToolStripMenuItem, Me.ListarNotasDeUnCursoToolStripMenuItem, Me.ListarAlumnosConNotasMasAltasToolStripMenuItem})
        Me.ListarToolStripMenuItem.Name = "ListarToolStripMenuItem"
        Me.ListarToolStripMenuItem.Size = New System.Drawing.Size(47, 20)
        Me.ListarToolStripMenuItem.Text = "Listar"
        '
        'ListarAlumnosDeUnCursoToolStripMenuItem
        '
        Me.ListarAlumnosDeUnCursoToolStripMenuItem.Name = "ListarAlumnosDeUnCursoToolStripMenuItem"
        Me.ListarAlumnosDeUnCursoToolStripMenuItem.Size = New System.Drawing.Size(258, 22)
        Me.ListarAlumnosDeUnCursoToolStripMenuItem.Text = "Listar alumnos de un curso"
        '
        'ListarNotasDeUnCursoToolStripMenuItem
        '
        Me.ListarNotasDeUnCursoToolStripMenuItem.Name = "ListarNotasDeUnCursoToolStripMenuItem"
        Me.ListarNotasDeUnCursoToolStripMenuItem.Size = New System.Drawing.Size(258, 22)
        Me.ListarNotasDeUnCursoToolStripMenuItem.Text = "Listar notas de un curso"
        '
        'ListarAlumnosConNotasMasAltasToolStripMenuItem
        '
        Me.ListarAlumnosConNotasMasAltasToolStripMenuItem.Name = "ListarAlumnosConNotasMasAltasToolStripMenuItem"
        Me.ListarAlumnosConNotasMasAltasToolStripMenuItem.Size = New System.Drawing.Size(258, 22)
        Me.ListarAlumnosConNotasMasAltasToolStripMenuItem.Text = "Listar alumnos con notas mas altas"
        '
        'SalirToolStripMenuItem
        '
        Me.SalirToolStripMenuItem.Name = "SalirToolStripMenuItem"
        Me.SalirToolStripMenuItem.Size = New System.Drawing.Size(41, 20)
        Me.SalirToolStripMenuItem.Text = "Salir"
        '
        'Principal
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(329, 267)
        Me.Controls.Add(Me.MenuStrip1)
        Me.MainMenuStrip = Me.MenuStrip1
        Me.Name = "Principal"
        Me.Text = "Principal"
        Me.MenuStrip1.ResumeLayout(False)
        Me.MenuStrip1.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents MenuStrip1 As MenuStrip
    Friend WithEvents AñadirToolStripMenuItem As ToolStripMenuItem
    Friend WithEvents ListarToolStripMenuItem As ToolStripMenuItem
    Friend WithEvents ListarAlumnosDeUnCursoToolStripMenuItem As ToolStripMenuItem
    Friend WithEvents ListarNotasDeUnCursoToolStripMenuItem As ToolStripMenuItem
    Friend WithEvents ListarAlumnosConNotasMasAltasToolStripMenuItem As ToolStripMenuItem
    Friend WithEvents SalirToolStripMenuItem As ToolStripMenuItem
End Class
