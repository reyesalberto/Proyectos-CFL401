 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Programación
 */
public class Fileio {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */ @SuppressWarnings("UnusedAssignment")
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //file TODO code application logic here
        FileWriter File;
       
        FileReader FileR=FileR = new fileWriter(rutaAlArchivo, sobretexto);
        PrintWriter escritor=new PrintWriter(file);
        escritor.print("¡como estas?");
        escritor.print("Edad:");
        escritor.print(JOptionPane.showInputDialog(null,"hola"));
        escritor.close();
        escritor.flush();
        
        FileReader fileR=new FileReader("texto.txt");
        BufferedReader  lector=new BufferedReader(FileR);
        String textoEntrada = lector.readLine();
        
        while(textoEntrada!=null){
            System.out.println(textoEntrada);
            textoEntrada = lector.readLine();
        }
       lector.close();
    }
 textoEntrada = lector.readerLine();
 String[] tp = textoEntrada.split(":");
 System.out.println(tp[0]);
 System.out.println(tp`[1]);
 
System.out.println("");
  
 
}
//conver.txt
Tomas: hola
Franco: HOLA
Franco: Todo bien?
Tomas: Me confundi
Tomas; Chau
        
textoEntrada=lector.readLine();
textoEntrada.split(":");
String[] tp = textoEntrada.split(":");
