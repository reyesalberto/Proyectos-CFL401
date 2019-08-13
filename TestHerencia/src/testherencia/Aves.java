/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testherencia;

/**
 *
 * @author Programación
 */
public class Aves extends Animales {
    private String nombre;
    private int patas;
    private int alas; 
    private int cantPlumas;

    public Aves(String nombre, int patas, int alas, int cantPlumas) {
       Super (nombre,patas,100);
        this.cantPlumas=cantPlumas;
        
        
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

    public int gtAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public int getCantPelos() {
        return cantPlumas;
    }

    public void setCantPelos(int cantPelos) {
        this.cantPlumas = cantPlumas;
    }
    
 @Override
 public void comer(String nomComida){
     if(nomComida.equals("Alpiste")){
         energia+=10;
     }
 }
         
 public void volar(int energia){
     if(energia>10){
         energia+=10;
         System.out.println("falta energia");
     }    
}
 public void volar(){
     
 }

    private void Super(String nombre, int patas, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
