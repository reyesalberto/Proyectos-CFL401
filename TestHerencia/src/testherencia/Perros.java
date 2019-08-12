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
public class Perros extends Animales{
    private String nombre;
    private int patas;
    private int catPelos;
    
    public Perros (String nombre,int patas,int cantPelos){
    this.nombre=nombre;
    this.patas=patas;
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

    public int getPàtas() {
        return pàtas;
    }

    public void setPàtas(int pàtas) {
        this.pàtas = pàtas;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

public void correr(){
     if(energia>10){
         System.out.println("falta comida");
     }
 }
 public void jugar(){
     if(energia>15){
         System.out.println("esta cansado");
     }
 } 
 public void comer(){
     
 }
}

