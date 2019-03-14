/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoprueba;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


/**
 *
 * @author usuario
 */
public class Tablero extends javax.swing.JFrame
{
    String Datos[][] = new String [12][12];
    JLabel matriz[][];
    int cont1 = 2;
    int cont2 = 0;
    
    static String tipo;
    static String host;
    static final int Puerto = 2000;
    
    ServerSocket skServidor;
    Socket skCliente;
    
    public Tablero(String tipo, String host)
    {
        this.tipo = tipo;
        this.host = host;
        
        initComponents();
         
        this.setSize(613,610);
        Imagen Imagen = new Imagen();
        
        jPanel1.add(Imagen);
        jPanel1.repaint();
        new fondopanel(12,12);
        
        Pintarj1();
        Pintarj2();
    }

    public void inicializarSockets()
    {
        try
        {
            if(tipo.equals("servidor"))
            {
                skServidor = new ServerSocket(Puerto);
                skCliente = skServidor.accept();
                JOptionPane.showMessageDialog(null, "Servidor inicializado");
                
            }
            else
            {
                skCliente = new Socket(host, Puerto);
                JOptionPane.showMessageDialog(null, "Cliente inicializado");
                recibirDatos();
            }
        }
        catch (IOException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    
    private void Pintarj1()
    {
        String path = "j3.png";  
        URL url = this.getClass().getResource(path);  
        ImageIcon icon = new ImageIcon(url);   
        matriz[0][5].setOpaque(true);
        matriz[0][5].setBackground(Color.CYAN);
        matriz[0][5].setIcon(icon);
        Datos[0][5] = "J1";
    }
    
    
    private void Pintarj2()
    {
        String path = "j3.png";  
        URL url = this.getClass().getResource(path);  
        ImageIcon icon = new ImageIcon(url);   
        matriz[11][6].setOpaque(true);
        matriz[11][6].setBackground(Color.orange);
        matriz[11][6].setIcon(icon);
        Datos[11][6] = "J2";
    }

    
    private void PintarLabel(String pos1, String pos2)
    {
        String posiciones[] = posicionActual();
        
        int x = Integer.parseInt(pos1);
        int y = Integer.parseInt(pos2);
        
        int v1 = Integer.parseInt(posiciones[0]);
        int v2 = Integer.parseInt(posiciones[1]);
        
        int vt = v1 + v2;
        int vi = x + y;
     
        switch(tipo)
        {
            case "servidor":
            {
                if(cont1 != 0 && cont2 == 0)
                {
                    if((vt-vi) <= 4 && (vt-vi) >= -4)
                    {
                        Limpia(v1, v2);
                        String path = "j3.png";  
                        URL url = this.getClass().getResource(path);  
                        ImageIcon icon = new ImageIcon(url);   
                        
                        matriz[x][y].setOpaque(true);
                        matriz[x][y].setBackground(Color.CYAN);
                        matriz[x][y].setIcon(icon);
                        Datos[x][y] = "J1";
                        
                        cont1--;
                        turno(cont1);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Solo puedes moverte 4 casillas");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Es el turno del jugador 2");
                }
                
                break;
            }
            
            case "cliente":
            {
                if(cont2 != 0 && cont1 == 0)
                {
                    if((vt-vi) <= 4 && (vt-vi) >= -4)
                    {
                        Limpia(v1, v2);
                        String path = "j3.png";  
                        URL url = this.getClass().getResource(path);  
                        ImageIcon icon = new ImageIcon(url);  
                        
                        matriz[x][y].setOpaque(true);
                        matriz[x][y].setBackground(Color.orange);
                        matriz[x][y].setIcon(icon);
                        Datos[x][y] = "J2";
                        
                        cont2--;
                        turno(cont2);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Solo puedes moverte 4 casillas");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Es el turno del jugador 1");
                }
                
                break;
            }
        }
    }

    
    private void Limpia(int pos1, int pos2)
    {
        Datos[pos1][pos2] = pos1 + "|" + pos2;
        matriz[pos1][pos2].setIcon(null);
        matriz[pos1][pos2].setOpaque(false);
    }
    
    
    private String[] posicionActual()
    {
        String posicion[] = {"", ""};
        
        for(int i = 0; i < matriz.length; i++)
        {
            for(int j = 0; j < matriz.length; j++)
            {
                switch(tipo)
                {
                    case "servidor":
                    {
                        if(Datos[i][j].equals("J1"))
                        {
                            posicion[0] = String.valueOf(i);
                            posicion[1] = String.valueOf(j);
                        }
                        
                        break;
                    }

                    case "cliente":
                    {
                        if(Datos[i][j].equals("J2"))
                        {
                            posicion[0] = String.valueOf(i);
                            posicion[1] = String.valueOf(j);
                        }
                        
                        break;
                    }
                }
            }
        }
        return posicion;
    }
    

    private void turno(int con)
    {
        switch(tipo)
        {
            case "servidor":
            {
                switch (con)
                {
                    case 1:
                    {
                        t1.setBackground(Color.blue);
                        t2.setBackground(Color.WHITE);
                        
                        enviarDatos();
                        ganador();
                        break;
                    }
                        
                    case 0:
                    {
                        t1.setBackground(Color.WHITE);
                        t2.setBackground(Color.WHITE);
                        cont2 = 2;

                        enviarDatos();
                        
                        if(!ganador())
                        {
                            JOptionPane.showMessageDialog(rootPane, "Turno del otro jugador");
                        }
                        
                        recibirDatos();

                        break;
                    }
                }
                
                break;
            }
            
            case "cliente":
            {
                switch (con)
                {
                    case 1:
                    {
                        t3.setBackground(Color.red);
                        t4.setBackground(Color.WHITE);

                        enviarDatos();
                        ganador();
                        break;
                    }

                    case 0:
                    {
                        t3.setBackground(Color.white);
                        t4.setBackground(Color.white);
                        cont1 = 2;

                        enviarDatos();
                        
                        if(!ganador())
                        {
                            JOptionPane.showMessageDialog(rootPane, "Turno del otro jugador");
                        }
                        
                        recibirDatos();

                        break;
                    }
                }
                
                break;
            }
        }
    }
    
    
    private void recibirDatos()
    {
        switch(tipo)
        {
            case "servidor":
            {
                try
                {
                    //ServerSocket skServidor = new ServerSocket(Puerto);
                    //Socket skCliente = skServidor.accept();
                    
                    while(cont1 != 2)
                    { 
                        DataInputStream entradaDatos = new DataInputStream(skCliente.getInputStream());
                        ObjectInputStream entradaObjetos = new ObjectInputStream(skCliente.getInputStream());
                        
                        cont1 = entradaDatos.readInt();
                        cont2 = entradaDatos.readInt();
                        //t3 = (JLabel) entradaObjetos.readObject();
                        //t4 = (JLabel) entradaObjetos.readObject();
                        //matriz = (JLabel[][]) entradaObjetos.readObject();
                        limpiarDatos();
                        Datos = (String[][]) entradaObjetos.readObject();
                        pintarJugadores();
                        ganador();
                    }
                }
                catch (IOException ex)
                {
                    JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                }

                catch (ClassNotFoundException ex)
                {
                    JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                }

                break;
            }

            
            case "cliente":
            {
                try
                {
                    //Socket skCliente = new Socket(host, Puerto);
                    
                    while(cont2 != 2)
                    {
                        
                        DataInputStream entradaDatos = new DataInputStream(skCliente.getInputStream());
                        ObjectInputStream entradaObjetos = new ObjectInputStream(skCliente.getInputStream());
                        
                        cont1 = entradaDatos.readInt();
                        cont2 = entradaDatos.readInt();
                        //t3 = (JLabel) entradaObjetos.readObject();
                        //t4 = (JLabel) entradaObjetos.readObject();
                        //matriz = (JLabel[][]) entradaObjetos.readObject();
                        limpiarDatos();
                        Datos = (String[][]) entradaObjetos.readObject();
                        pintarJugadores();
                        ganador();
                    }
                    
                }
                catch (IOException ex)
                {
                    JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                }
                catch (ClassNotFoundException ex)
                {
                    JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                }
                break;
            }
        }
    }
    
    
    private void enviarDatos()
    {
        switch(tipo)
        {
            case "servidor":
            {
                try
                {
                    //ServerSocket skServidor = new ServerSocket(Puerto);
                    //Socket skCliente = skServidor.accept();
                    DataOutputStream salidaDatos = new DataOutputStream(skCliente.getOutputStream());
                    ObjectOutputStream salidaObjetos = new ObjectOutputStream(skCliente.getOutputStream());
                    
                    salidaDatos.writeInt(cont1);
                    salidaDatos.writeInt(cont2);
                    //salidaObjetos.writeObject(t3);
                    //salidaObjetos.writeObject(t4);
                    //salidaObjetos.writeObject(matriz);
                    salidaObjetos.writeObject(Datos);
                    
                    break;
                }
                catch (IOException ex)
                {
                    JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                }
            }

            case "cliente":
            {
                try
                {
                    //Socket skCliente = new Socket(host, Puerto);
                    
                    DataOutputStream salidaDatos = new DataOutputStream(skCliente.getOutputStream());
                    ObjectOutputStream salidaObjetos = new ObjectOutputStream(skCliente.getOutputStream()); 
                        
                    salidaDatos.writeInt(cont1);
                    salidaDatos.writeInt(cont2);
                    //salidaObjetos.writeObject(t3);
                    //salidaObjetos.writeObject(t4);
                    //salidaObjetos.writeObject(matriz);
                    salidaObjetos.writeObject(Datos);
                }
                catch (IOException ex)
                {
                    JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                }
                
                break;
            }

        }
    }
    
    public void limpiarDatos()
    {
        for(int x = 0; x < matriz.length; x++)
        {
            for(int y = 0; y < matriz.length; y++)
            {
                String path = "j3.png";  
                URL url = this.getClass().getResource(path);  
                ImageIcon icon = new ImageIcon(url);
                
                if(Datos[x][y].equals("J2"))
                {
                    Limpia(x,y);
                }
                
                if(Datos[x][y].equals("J1"))
                {
                    Limpia(x,y);
                }
            }
        }
    }
    
    public void pintarJugadores()
    {
        for(int x = 0; x < matriz.length; x++)
        {
            for(int y = 0; y < matriz.length; y++)
            {
                String path = "j3.png";  
                URL url = this.getClass().getResource(path);  
                ImageIcon icon = new ImageIcon(url);
                
                if(Datos[x][y].equals("J2"))
                {
                    matriz[x][y].setOpaque(true);
                    matriz[x][y].setBackground(Color.orange);
                    matriz[x][y].setIcon(icon);
                }
                
                if(Datos[x][y].equals("J1"))
                {
                    matriz[x][y].setOpaque(true);
                    matriz[x][y].setBackground(Color.cyan);
                    matriz[x][y].setIcon(icon);
                }
            }
        }
        
    }
    
    public boolean ganador()
    {
        int j1 = 0;
        int j2 = 0;
        
        for(int x = 0; x < matriz.length; x++)
        {
            for(int y = 0; y < matriz.length; y++)
            {
                
                if(Datos[x][y].equals("J2"))
                {
                    j2++;
                }
                
                if(Datos[x][y].equals("J1"))
                {
                    j1++;
                }
            }
        }
        
        if(j1 == 0)
        {
            JOptionPane.showMessageDialog(rootPane, "El jugador 2 ha ganado");
            
            try
            {
                skCliente.close();
                return true;
            }
            catch (IOException ex)
            {
                Logger.getLogger(Tablero.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(j2 == 0)
        {
            JOptionPane.showMessageDialog(rootPane, "El jugador 1 ha ganado");
            
            try
            {
                skCliente.close();
                return true;
            }
            catch (IOException ex)
            {
                Logger.getLogger(Tablero.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return false;
    }
    
    public class Imagen extends javax.swing.JPanel
    {
        public Imagen()
        {
            this.setSize(600,650);
        }
        
        public void paint(Graphics grafico)
        {
            Dimension height = this.getSize();
            ImageIcon Img = new ImageIcon(getClass().getResource("mapa.png"));
            grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);
            this.setOpaque(false);
            super.paintComponent(grafico);
        }
    }
    
    
    public class fondopanel
    {
        JLabel label;
    
        public fondopanel(int ancho, int alto)
        {
            jPanel2.setLayout(new GridLayout(ancho,alto));
            matriz = new JLabel[ancho][alto];
        
            for(int i = 0; i < ancho; i++)
            {
                for(int j = 0; j < alto; j++)
                {
                    String pos1 = String.valueOf(i);
                    String pos2 = String.valueOf(j);
                    matriz[i][j] = new JLabel();
                    matriz[i][j].setName(String.valueOf(i + "," + j));
                    matriz[i][j].setOpaque(false);
                    matriz[i][j].setBorder(javax.swing.BorderFactory.createLineBorder(Color.darkGray));
                    jPanel2.add(matriz[i][j]);
                    
                    Datos[i][j] = i + "|" + j;
                    
                    if((j > 2 && j < 9) && (i != 3 || j != 5) && (i != 8 || j != 7))
                    {
                        matriz[i][j].addMouseListener(new java.awt.event.MouseAdapter()
                        {
                            public void mouseClicked(java.awt.event.MouseEvent evt)
                            {
                                matrizMouseClicked(evt, pos1, pos2);
                            }
                        });
                    }
                }
            }
            
            jPanel1.setVisible(true);
        }
    }
    
    
    private void matrizMouseClicked(MouseEvent evt, String pos1, String pos2)
    {
        PintarLabel(pos1, pos2);
    }

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        t1 = new javax.swing.JLabel();
        t2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t3 = new javax.swing.JLabel();
        t4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setOpaque(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 563, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Haettenschweiler", 0, 18)); // NOI18N
        jLabel1.setText("Jugador 1");

        t1.setBackground(java.awt.Color.blue);
        t1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        t1.setOpaque(true);

        t2.setBackground(java.awt.Color.blue);
        t2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        t2.setOpaque(true);

        jLabel3.setFont(new java.awt.Font("Haettenschweiler", 0, 18)); // NOI18N
        jLabel3.setText("Jugador 2");

        t3.setBackground(java.awt.Color.red);
        t3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        t3.setOpaque(true);

        t4.setBackground(java.awt.Color.red);
        t4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        t4.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))
                        .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(1, 1, 1)))
                            .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run()
            {
                
                Tablero juego = new Tablero(tipo, host);
                
                juego.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel t1;
    private javax.swing.JLabel t2;
    private javax.swing.JLabel t3;
    private javax.swing.JLabel t4;
    // End of variables declaration//GEN-END:variables
}
