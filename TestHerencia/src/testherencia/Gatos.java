
package testherencia;

/**
 *
 * @author Programación
 */
public class Gatos extends Animales {
    private String nombre;
     private int patas;
    private int catPelos;

    public Gatos(String nombre, int patas, int cantPelos) {
        Super( nombre, patas,100);
        this.catPelos=cantPelos;
  
   }    
     
  
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public int getCatPelos() {
        return catPelos;
    }

    public void setCatPelos(int catPelos) {
        this.catPelos = catPelos;
    }
    public void correr(){
        if(energia>5){
            energia+=5;
        }
    }
    
  public void jugar() {
      
  }
  
  public void jugarCon(Gatos gato){
      gato.jugar();
      jugar();
  }

    private void Super(String nombre, int patas, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
