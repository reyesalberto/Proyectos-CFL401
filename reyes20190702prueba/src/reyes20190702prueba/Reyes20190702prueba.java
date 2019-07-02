/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reyes20190702prueba;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Programación
 */
public class Reyes20190702prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList numeros= new ArrayList();
        int dato;
        Scanner teclado;
        teclado = new Scanner(System.in);
        dato=teclado.nextInt();
        
        while(dato>=0){
            numeros.add(dato);
            dato=teclado.nextInt();
        }
        System.out.println(numeros);
        
               
    }
    
}
