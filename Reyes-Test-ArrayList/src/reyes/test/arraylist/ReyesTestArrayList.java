
package reyes.test.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class ReyesTestArrayList {

    public static void main(String[] args) {
        String nombre;
        int patas,edad;
       
        Scanner entrada = new Scanner(System.in);
        // TODO code application logic here
        /*int mascotas;
        int dato;
        boolean bandera=true;
        Scanner teclado = new Scanner(System.in);   
        dato = teclado.nextInt();
     System.out.println("hola bay bay");
        
        ArrayList teclado1;
        teclado1 = new ArrayList((Collection) System.in);
        ArrayList elem = new ArrayList();
        ArrayList <Integer>elem2;
        elem2 = new ArrayList();
        elem.add("Perro");
        elem.add(4);
        elem.add(7);
        
     while(bandera){
         dato=teclado.nextInt(dato);
         
         
     }
         if(<=4){
             dato=teclado.nextInt(dato);
             
           
    }else(<=7){
         
     }
         
     }
     }
        
        
     
        
        
        
        
        
        
        
        
        
        
        
        
      /*  
      while(bandera)  {
          dato=teclado.nextLine();
      }*/
 /*dato=teclado.nextLine();
      try{
          dato=null;
      }
          dato=teclado.nextLine();
          System.out.println(dato);
      }catch(Exception e){
          System.out.println(e);
      }if(dato=null){
    elem2.add(dato);
}
   
        System.out.println("hola soy bol");
    }
        
        
        
        
        
        
        
        
        
        System.out.println(elem); 
        
        
        
        
    /* while(bandera){
         numero = teclado.nextInt();
             if(>=0){
                 elem2.add(numero);
    
            babdera=false;
    
        }else{
              babdera=false;
              System.out.println(elem2);
     }
    System.out.println("es mayor a "+ numero);
     
         */
       // entrada = new Scanner(System.in);

         
        ArrayList <Mascotas> mascotas = new ArrayList();
        Iterator it = mascotas.iterator();
        //it.hasNext();// si hay proximo elemento true o folse si no exepcion el next para el proximo elemento
        //next();
        
        while(it.hasNext()){
            Mascotas mascota = (Mascotas)it.next();
           // System.out.println(((Mascotas) it.next()).getNombre());
            System.out.println("nombre:"+ mascota.getNombre()+" patas:"+ mascota.getPatas()+" años:" + mascota.getEdad());
        }
        Mascotas mascotas = it.next()
        } 
        Mascotas perro1 = new Mascotas("Tory",4,22);
         mascotas.add(new Mascotas("Tory",4,22));
         mascotas.add(new Mascotas("Mish",3,10));
         mascotas.add(new Mascotas("Poli",2,25));
         mascotas.add(perro1);
         Mascotas gato1 = new Mascotas("Mish",3,10);
         Mascotas loro1 = new Mascotas("Poli",2,25);
         mascotas.add(gato1);
         mascotas.add(loro1);
         System.out.println(mascotas);
    
    private static String Mascotas(){
        String nombre;
        int patas,edad;
        String entrada = null;
        
        System.out.println();
        nombre= entrada.nextLine();
        boolean bandera= true;
        String mascotas;
        Scanner teclado;
        teclado = new Scanner(System.in);
        while (!nombre.equals("salir")){
            mascotas.add(new mascotas)
             patas=entrada.nexInt();
             edad= entrada.nextInt();
             mascotas.add(new Mascotas(nombre,patas,edad));

             nombre = entrada.nextLine();
        
        }
        System.out.println(mascotas);
        while(!nombre.toUpperCase().equals("salir".toUpperCase())){
                patas = entrada.nextInt();
                edad =  entrada.nextInt();
                mascotas.add(new Mascotas(nombre, patas,edad));
                
        
        
        
        
        
        
        entrada.nextLine();
        
        }
        
     /*  while= teclado.nextLine(null,
                                      "menu /n"
                                     +"1-perro /n"
                                     +"2-gato/n"
                                     +"3-loro/n"
                                     +"4-salir/n");
          */  
    

    


   
}

   

/*dato=teclado.nextLine();
//while(dato>=0){

elem2.add(dato);
dato=teclado.netLINE()
}
System.out.println(elem2);
 *//*
     1- declaro las variables
     2-declaro tipo de datos
             
*/
