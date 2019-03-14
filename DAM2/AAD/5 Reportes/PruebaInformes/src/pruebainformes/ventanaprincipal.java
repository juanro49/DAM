
package pruebainformes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;


public class ventanaprincipal extends javax.swing.JFrame
{

    Connection conexion;
    Statement sentencia;
   //private final String logotipo=".\\TICs Extremadura.jpg";
    public ventanaprincipal()
    {
        initComponents();
        PrepararBaseDatos();
    }
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
        
        String DBURL="jdbc:mysql://localhost/manempsa";
        String usuario="root";
        String password="";
        try
        {
            conexion=DriverManager.getConnection(DBURL,usuario,password);
        } catch (SQLException ex)
        {
            Logger.getLogger(ventanaprincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        try
        {
  //3.- Crear el objeto sentencia.
                 sentencia=conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException ex)
        {
            Logger.getLogger(ventanaprincipal.class.getName()).log(Level.SEVERE, null, ex);
        } 
        System.out.println("Base de datos preparada.");
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        btnInformeAgrupado = new javax.swing.JButton();
        btnImprimirDirecto = new javax.swing.JButton();
        btnServiciosTrabajador = new javax.swing.JButton();
        txtDNI = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnInformeAgrupado.setText("Informe Agrupado");
        btnInformeAgrupado.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnInformeAgrupadoActionPerformed(evt);
            }
        });

        btnImprimirDirecto.setText("Impresión Directa de Informe");
        btnImprimirDirecto.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnImprimirDirectoActionPerformed(evt);
            }
        });

        btnServiciosTrabajador.setText("Servicios Trabajadores");
        btnServiciosTrabajador.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnServiciosTrabajadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnInformeAgrupado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnImprimirDirecto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnServiciosTrabajador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(btnInformeAgrupado)
                .addGap(50, 50, 50)
                .addComponent(btnImprimirDirecto)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnServiciosTrabajador)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInformeAgrupadoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnInformeAgrupadoActionPerformed
    {//GEN-HEADEREND:event_btnInformeAgrupadoActionPerformed
        try
        {
            String rutaArchivo = "ListadoServicios.jrxml"; 
                    System.out.println("Cargando desde: " + rutaArchivo); 
                    if (rutaArchivo == null) { 
                    System.out.println("No se encuentra el archivo."); 
                    System.exit(0); 
                    } 
                                   
                    //Reporte diseñado y compilado con iReport 
                    JasperReport masterReport= JasperCompileManager.compileReport(rutaArchivo);                   
                    JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport,null,conexion); 
                    //Se lanza el Viewer de Jasper, no termina aplicación al salir 
                    JasperViewer jviewer = new JasperViewer(jasperPrint,false); 
                    jviewer.setTitle("Listado de Servicios"); 
                    jviewer.setVisible(true);
        } catch (JRException ex)
        {
            Logger.getLogger(ventanaprincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnInformeAgrupadoActionPerformed

    private void btnImprimirDirectoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnImprimirDirectoActionPerformed
    {//GEN-HEADEREND:event_btnImprimirDirectoActionPerformed
        // TODO add your handling code here:
        try
        {
                    String rutaArchivo = "ListadoServicios.jrxml"; 
                                                      
                    //Reporte diseñado y compilado con iReport 
                    JasperReport masterReport= JasperCompileManager.compileReport(rutaArchivo);                   
                    JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport,null,conexion); 
                    JasperPrintManager.printReport(jasperPrint, true);
        } catch (JRException ex)
        {
            Logger.getLogger(ventanaprincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnImprimirDirectoActionPerformed

    private void btnServiciosTrabajadorActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnServiciosTrabajadorActionPerformed
    {//GEN-HEADEREND:event_btnServiciosTrabajadorActionPerformed
         try
        {
            String rutaArchivo = "serviciosJuan.jrxml"; 
                    System.out.println("Cargando desde: " + rutaArchivo); 
                    if (rutaArchivo == null) { 
                    System.out.println("No se encuentra el archivo."); 
                    System.exit(0); 
                    } 
                     Map parametros = new HashMap();  
                     parametros.put("DNI", txtDNI.getText());
                     //parametros.put("logo", this.getClass().getResourceAsStream(logotipo));
                    //Reporte diseñado y compilado con iReport 
                    JasperReport masterReport= JasperCompileManager.compileReport(rutaArchivo);                   
                    JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport,parametros,conexion); 
                    //Se lanza el Viewer de Jasper, no termina aplicación al salir 
                    JasperViewer jviewer = new JasperViewer(jasperPrint,false); 
                    jviewer.setTitle("Listado de Servicios"); 
                    jviewer.setVisible(true);
        } catch (JRException ex)
        {
            Logger.getLogger(ventanaprincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnServiciosTrabajadorActionPerformed

    
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
            java.util.logging.Logger.getLogger(ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new ventanaprincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimirDirecto;
    private javax.swing.JButton btnInformeAgrupado;
    private javax.swing.JButton btnServiciosTrabajador;
    private javax.swing.JTextField txtDNI;
    // End of variables declaration//GEN-END:variables
}
