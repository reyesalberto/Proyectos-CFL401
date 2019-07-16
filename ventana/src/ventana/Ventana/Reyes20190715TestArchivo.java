package ventana.Ventana;

import java.io.PrintStream;

/**
 *
 * @author Programación
 */
public class Reyes20190715TestArchivo {

    private static VentanaLogin ventanaLogin;
    private static Ventana ventana;

//    private static boolean apellido;
//    private static mostrarLogin mostrarLogin;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        VentanaLogin ventanaLogin = new VentanaLogin();
//        ventanaLogin.setVisible(true);
//        mostrarLogin =new mostrarLogin();
        mostrarLogin();
        // TODO code application logic here
////        Testeo test= new testeo();
////        test.setApellido("firu");
////        test2.setApellido("L6");
////        testeo.setApellido("loco");
////                

////      System.out.println();
////      test.setApellido("firu");
////      System.out.println(apellido);
////      System.out.println(testeo.getApellido());
////     System.out.println(testeo.getApellido());
////      
    }

    public static void mostrarVentanaPrincipal() {
        ventanaLogin.setVisible(false);
        ventana = new Ventana();
        ventana.setVisible(true);

    }

    public static void mostrarLogin() {

        ventanaLogin = new VentanaLogin();
        ventanaLogin.setVisible(true);

    }

}
