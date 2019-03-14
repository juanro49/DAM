
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class ControlArchivo
{
    public void crear(String fichero, String texto)
    {
        File f = new File(fichero);
        
        if(! f.exists())
        {
            try
            {
                PrintWriter pw = new PrintWriter(f);

                pw.printf(texto);

                pw.flush();
                pw.close();

                JOptionPane.showMessageDialog(null, "Texto ingresado correctamente");
            }
            catch (FileNotFoundException ex)
            {
                JOptionPane.showMessageDialog(null, ex.toString());
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El archivo " + fichero + " ya existe");
        }
    }
    
    public void mostrar(String fichero, JTextArea txtArea) 
    {
        File f = new File(fichero);
        
        if(f.exists())
        {
            try
            {
                FileReader fr = new FileReader(f);
                
                /*
                //Opcion 1: Con el método read
                int caract = fr.read();
                
                while(caract != -1)
                {
                    txtArea.append(String.valueOf((char)caract));
                    caract = fr.read();
                }
                */
                
                /*
                //Opcion 2: Con BufferedReader
                String cad;
                BufferedReader bf = new BufferedReader(fr);
                
                while((cad = bf.readLine()) != null)
                {
                    txtArea.append(cad + "\n");
                }
                */
                
                //Opcion 3: Con Scanner
                Scanner lectura = new Scanner(f);
                
                while(lectura.hasNextLine())
                {
                    txtArea.append(lectura.nextLine() + "\n");
                }
                
                lectura.close();
                
            }
            catch (FileNotFoundException ex)
            {
                JOptionPane.showMessageDialog(null, "Archivo no encontrado");
            }
            catch (IOException ex)
            {
                JOptionPane.showMessageDialog(null, "Error de lectura del fichero");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No existe el fichero");
        }
    }
    
    public int[] contarVocales(String fichero)
    {
        File f = new File(fichero);
        
        if(f.exists())
        {
            int vocales[] = new int[5];
            String letra;
            
            try
            {
                FileReader fr = new FileReader(f);
                
                int caract = fr.read();
                
                while(caract != -1)
                {
                    
                    letra = String.valueOf((char) caract);
                    
                    switch(letra)
                    {
                        case "a":
                            vocales[0]++;
                            break;
                            
                        case "A":
                            vocales[0]++;
                            break;
                            
                        case "e":
                            vocales[1]++;
                            break;
                            
                        case "E":
                            vocales[1]++;
                            break;
                            
                        case "i":
                            vocales[2]++;
                            break;
                            
                        case "I":
                            vocales[2]++;
                            break;
                            
                        case "o":
                            vocales[3]++;
                            break;
                            
                        case "O":
                            vocales[3]++;
                            break;
                            
                        case "u":
                            vocales[4]++;
                            break;
                            
                        case "U":
                            vocales[4]++;
                            break;
                    }
                    caract = fr.read();
                }
                
                return vocales;
            }
            catch (FileNotFoundException ex)
            {
                JOptionPane.showMessageDialog(null, "Archivo no encontrado");
            }
            catch (IOException ex)
            {
                JOptionPane.showMessageDialog(null, "Error al leer el archivo");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No existe el fichero");
        }
        return null;
    }

    public void contarPalabras(String fichero, JTextField txtPalabras)
    {
        File f = new File(fichero);
        
        if(f.exists())
        {
            try
            {
                int cont = 0;
                Scanner lectura = new Scanner(f);
                
                while(lectura.hasNext())
                {
                    cont++;
                    lectura.next();
                }
                
                lectura.close();
                
                txtPalabras.setText(String.valueOf(cont));
            }
            catch (FileNotFoundException ex)
            {
                JOptionPane.showMessageDialog(null, "Archivo no encontrado");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No existe el fichero");
        }
    }
}
