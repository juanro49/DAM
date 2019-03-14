<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()>
Partial Class Principal
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
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(Principal))
        Me.mEmpleados = New System.Windows.Forms.ToolStripMenuItem()
        Me.mAddEmp = New System.Windows.Forms.ToolStripMenuItem()
        Me.mDelEmp = New System.Windows.Forms.ToolStripMenuItem()
        Me.mMosEmp = New System.Windows.Forms.ToolStripMenuItem()
        Me.mCoches = New System.Windows.Forms.ToolStripMenuItem()
        Me.mAddCoche = New System.Windows.Forms.ToolStripMenuItem()
        Me.mDelCoche = New System.Windows.Forms.ToolStripMenuItem()
        Me.ModificarCocheToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.mAlqCoche = New System.Windows.Forms.ToolStripMenuItem()
        Me.mDevCoche = New System.Windows.Forms.ToolStripMenuItem()
        Me.mMostCoches = New System.Windows.Forms.ToolStripMenuItem()
        Me.mUsuarios = New System.Windows.Forms.ToolStripMenuItem()
        Me.mAddusu = New System.Windows.Forms.ToolStripMenuItem()
        Me.mDelUsu = New System.Windows.Forms.ToolStripMenuItem()
        Me.mMostUsu = New System.Windows.Forms.ToolStripMenuItem()
        Me.ToolStripMenuItem1 = New System.Windows.Forms.ToolStripMenuItem()
        Me.MenuStrip1 = New System.Windows.Forms.MenuStrip()
        Me.mSalir = New System.Windows.Forms.ToolStripMenuItem()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.lbUsu = New System.Windows.Forms.Label()
        Me.MenuStrip1.SuspendLayout()
        Me.SuspendLayout()
        '
        'mEmpleados
        '
        Me.mEmpleados.DropDownItems.AddRange(New System.Windows.Forms.ToolStripItem() {Me.mAddEmp, Me.mDelEmp, Me.mMosEmp})
        Me.mEmpleados.Name = "mEmpleados"
        Me.mEmpleados.Size = New System.Drawing.Size(77, 20)
        Me.mEmpleados.Text = "Empleados"
        '
        'mAddEmp
        '
        Me.mAddEmp.Image = Global.AlquilerCoches.My.Resources.Resources.Añadir_Usuario
        Me.mAddEmp.Name = "mAddEmp"
        Me.mAddEmp.Size = New System.Drawing.Size(176, 22)
        Me.mAddEmp.Text = "Añadir empleado"
        '
        'mDelEmp
        '
        Me.mDelEmp.Image = Global.AlquilerCoches.My.Resources.Resources.Eliminar_Usuario
        Me.mDelEmp.Name = "mDelEmp"
        Me.mDelEmp.Size = New System.Drawing.Size(176, 22)
        Me.mDelEmp.Text = "Eliminar empleado"
        '
        'mMosEmp
        '
        Me.mMosEmp.Image = Global.AlquilerCoches.My.Resources.Resources.Listar_Usuario
        Me.mMosEmp.Name = "mMosEmp"
        Me.mMosEmp.Size = New System.Drawing.Size(176, 22)
        Me.mMosEmp.Text = "Mostrar empleados"
        '
        'mCoches
        '
        Me.mCoches.DropDownItems.AddRange(New System.Windows.Forms.ToolStripItem() {Me.mAddCoche, Me.mDelCoche, Me.ModificarCocheToolStripMenuItem, Me.mAlqCoche, Me.mDevCoche, Me.mMostCoches})
        Me.mCoches.Name = "mCoches"
        Me.mCoches.Size = New System.Drawing.Size(58, 20)
        Me.mCoches.Text = "Coches"
        '
        'mAddCoche
        '
        Me.mAddCoche.Name = "mAddCoche"
        Me.mAddCoche.Size = New System.Drawing.Size(259, 22)
        Me.mAddCoche.Text = "Añadir coche"
        '
        'mDelCoche
        '
        Me.mDelCoche.Name = "mDelCoche"
        Me.mDelCoche.Size = New System.Drawing.Size(259, 22)
        Me.mDelCoche.Text = "Eliminar coche"
        '
        'ModificarCocheToolStripMenuItem
        '
        Me.ModificarCocheToolStripMenuItem.Name = "ModificarCocheToolStripMenuItem"
        Me.ModificarCocheToolStripMenuItem.Size = New System.Drawing.Size(259, 22)
        Me.ModificarCocheToolStripMenuItem.Text = "Modificar coche"
        '
        'mAlqCoche
        '
        Me.mAlqCoche.Name = "mAlqCoche"
        Me.mAlqCoche.Size = New System.Drawing.Size(259, 22)
        Me.mAlqCoche.Text = "Alquilar coche"
        '
        'mDevCoche
        '
        Me.mDevCoche.Name = "mDevCoche"
        Me.mDevCoche.Size = New System.Drawing.Size(259, 22)
        Me.mDevCoche.Text = "Devolver coche/Mostrar préstamos"
        '
        'mMostCoches
        '
        Me.mMostCoches.Name = "mMostCoches"
        Me.mMostCoches.Size = New System.Drawing.Size(259, 22)
        Me.mMostCoches.Text = "Mostrar coches"
        '
        'mUsuarios
        '
        Me.mUsuarios.DropDownItems.AddRange(New System.Windows.Forms.ToolStripItem() {Me.mAddusu, Me.mDelUsu, Me.ToolStripMenuItem1, Me.mMostUsu})
        Me.mUsuarios.Name = "mUsuarios"
        Me.mUsuarios.Size = New System.Drawing.Size(64, 20)
        Me.mUsuarios.Text = "Usuarios"
        '
        'mAddusu
        '
        Me.mAddusu.Image = Global.AlquilerCoches.My.Resources.Resources.Añadir_Usuario
        Me.mAddusu.Name = "mAddusu"
        Me.mAddusu.Size = New System.Drawing.Size(180, 22)
        Me.mAddusu.Text = "Añadir usuario"
        '
        'mDelUsu
        '
        Me.mDelUsu.Image = Global.AlquilerCoches.My.Resources.Resources.Eliminar_Usuario
        Me.mDelUsu.Name = "mDelUsu"
        Me.mDelUsu.Size = New System.Drawing.Size(180, 22)
        Me.mDelUsu.Text = "Eliminar usuario"
        '
        'mMostUsu
        '
        Me.mMostUsu.Image = Global.AlquilerCoches.My.Resources.Resources.Listar_Usuario
        Me.mMostUsu.Name = "mMostUsu"
        Me.mMostUsu.Size = New System.Drawing.Size(180, 22)
        Me.mMostUsu.Text = "Mostrar usuarios"
        '
        'ToolStripMenuItem1
        '
        Me.ToolStripMenuItem1.Image = Global.AlquilerCoches.My.Resources.Resources.Modificar_Usuario
        Me.ToolStripMenuItem1.Name = "ToolStripMenuItem1"
        Me.ToolStripMenuItem1.Size = New System.Drawing.Size(180, 22)
        Me.ToolStripMenuItem1.Text = "Modificar usuario"
        '
        'MenuStrip1
        '
        Me.MenuStrip1.BackColor = System.Drawing.Color.White
        Me.MenuStrip1.Items.AddRange(New System.Windows.Forms.ToolStripItem() {Me.mEmpleados, Me.mCoches, Me.mUsuarios, Me.mSalir})
        Me.MenuStrip1.Location = New System.Drawing.Point(0, 0)
        Me.MenuStrip1.Name = "MenuStrip1"
        Me.MenuStrip1.Size = New System.Drawing.Size(643, 24)
        Me.MenuStrip1.TabIndex = 0
        Me.MenuStrip1.Text = "MenuStrip1"
        '
        'mSalir
        '
        Me.mSalir.Name = "mSalir"
        Me.mSalir.Size = New System.Drawing.Size(41, 20)
        Me.mSalir.Text = "Salir"
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.BackColor = System.Drawing.Color.White
        Me.Label1.Font = New System.Drawing.Font("Microsoft Sans Serif", 8.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label1.Location = New System.Drawing.Point(489, 0)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(106, 13)
        Me.Label1.TabIndex = 1
        Me.Label1.Text = "Conectado como:"
        '
        'lbUsu
        '
        Me.lbUsu.AutoSize = True
        Me.lbUsu.BackColor = System.Drawing.Color.White
        Me.lbUsu.Location = New System.Drawing.Point(601, 0)
        Me.lbUsu.Name = "lbUsu"
        Me.lbUsu.Size = New System.Drawing.Size(30, 13)
        Me.lbUsu.TabIndex = 2
        Me.lbUsu.Text = "USU"
        '
        'Principal
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackgroundImage = Global.AlquilerCoches.My.Resources.Resources.Principal_Fondo
        Me.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch
        Me.ClientSize = New System.Drawing.Size(643, 360)
        Me.Controls.Add(Me.lbUsu)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.MenuStrip1)
        Me.Icon = CType(resources.GetObject("$this.Icon"), System.Drawing.Icon)
        Me.MainMenuStrip = Me.MenuStrip1
        Me.Name = "Principal"
        Me.Text = "Principal"
        Me.MenuStrip1.ResumeLayout(False)
        Me.MenuStrip1.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents mEmpleados As ToolStripMenuItem
    Friend WithEvents mAddEmp As ToolStripMenuItem
    Friend WithEvents mDelEmp As ToolStripMenuItem
    Friend WithEvents mMosEmp As ToolStripMenuItem
    Friend WithEvents mCoches As ToolStripMenuItem
    Friend WithEvents mAddCoche As ToolStripMenuItem
    Friend WithEvents mDelCoche As ToolStripMenuItem
    Friend WithEvents mAlqCoche As ToolStripMenuItem
    Friend WithEvents mDevCoche As ToolStripMenuItem
    Friend WithEvents mMostCoches As ToolStripMenuItem
    Friend WithEvents mUsuarios As ToolStripMenuItem
    Friend WithEvents mAddusu As ToolStripMenuItem
    Friend WithEvents mDelUsu As ToolStripMenuItem
    Friend WithEvents mMostUsu As ToolStripMenuItem
    Friend WithEvents MenuStrip1 As MenuStrip
    Friend WithEvents Label1 As Label
    Friend WithEvents lbUsu As Label
    Friend WithEvents mSalir As ToolStripMenuItem
    Friend WithEvents ModificarCocheToolStripMenuItem As ToolStripMenuItem
    Friend WithEvents ToolStripMenuItem1 As ToolStripMenuItem
End Class
