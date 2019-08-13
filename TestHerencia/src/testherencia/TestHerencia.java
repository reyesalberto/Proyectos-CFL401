
package testherencia;

/**
 *
 * @author Programación
 */
public class TestHerencia {

    private static String nomComida;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Gatos gato1 = new Gatos("Mish",4,12345);
       Perros perro1=new Perros("Boby",4,54321);
       Aves ave1 = new Aves("Julio", 2,2,67890);
       Gatos gato2 = new Gatos("Salem",4,15436);
       System.out.println(gato1.getEnergia());
       gato1.correr();
       gato1.jugar();
       gato1.correr();
       gato1.jugar();
       gato1.comer("comidaRaza");
       System.out.println(perro1.getEnergia());
       perro1.correr();
       perro1.jugar();
       perro1.correr();
       perro1.comer("comidaRaza");
       
       System.out.println(ave1.getEnergia());
       ave1.volar();
       ave1.comer(nomComida);
       ave1.comer(nomComida);
       ave1.volar();
       
       System.out.println(gato2.getEnergia());
       gato2.jugar();
       gato2.correr();
       gato2.correr();
       gato2.jugar();
       
       
       gato2.getEnergia();
       System.out.println(gato2.getEnergia());
       System.out.println(gato1.getEnergia());
       gato1.jugarCon(gato2);
       System.out.println(gato2.getEnergia());
       System.out.println(gato1.getEnergia());
    }
   
}
