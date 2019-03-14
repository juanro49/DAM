package prueba;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


public class prueba extends javax.swing.JFrame
{
    Connection conexion;
    Statement sentencia;
    
    public prueba()
    {
        initComponents();
        PrepararBaseDatos();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jButton1)
                .addContainerGap(192, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jButton1)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
void PrepararBaseDatos(){
    //1.- Cargar el controlador
        try
        {
            String controlador="com.mysql.jdbc.Driver";
            Class.forName(controlador).newInstance();
            
        } catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Error al cargar el controlador.");
        }
   //2.- Crear el objeto conexión. 
        
        String DBURL="jdbc:mysql://localhost/tienda";
        String usuario="root";
        String password="";
        try
        {
            conexion=DriverManager.getConnection(DBURL,usuario,password);
        } catch (SQLException ex)
        {
            Logger.getLogger(prueba.class.getName()).log(Level.SEVERE, null, ex);
        }
        try
        {
  //3.- Crear el objeto sentencia.
                 sentencia=conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException ex)
        {
            Logger.getLogger(prueba.class.getName()).log(Level.SEVERE, null, ex);
        } 
        System.out.println("Base de datos preparada.");
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        try { 
                
                String archivo = "report1.jrxml"; 
                System.out.println("Cargando desde: " + archivo); 
                if (archivo == null) { 
                System.out.println("No se encuentra el archivo."); 
                System.exit(0); 
                } 
                               
                //Reporte diseñado y compilado con iReport 
                JasperReport masterReport= JasperCompileManager.compileReport(archivo);                   
                JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport,null,conexion); 
                //Se lanza el Viewer de Jasper, no termina aplicación al salir 
                JasperViewer jviewer = new JasperViewer(jasperPrint,false); 
                jviewer.setTitle("Prueba - Inés"); 
                jviewer.setVisible(true); 
        } catch (Exception j) 
        { 
        System.out.println("Mensaje de Error:"+j.getMessage()); 
        } 

        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new prueba().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
