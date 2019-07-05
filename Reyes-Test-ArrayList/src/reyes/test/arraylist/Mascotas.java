/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reyes.test.arraylist;

import java.util.ArrayList;

/**
 *
 * @author Programación
 */
public class Mascotas {
    private String nombre;
    private int patas;
    private int edad;
public class Persona  {
    private String nombre;
    private int  edad;
    private ArrayList <Mascotas> mascotas;
  /**
   * el metodo getNombre es para conseguir el nombre.
   * @return el nombre
   */
    //parametro se utiliza para los nombres
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public ArrayList<Mascotas> getMascotas() {
            return mascotas;
        }

        public void setMascotas(ArrayList<Mascotas> mascotas) {
            this.mascotas = mascotas;
        }
    }  

    public Mascotas(String nombre, int patas, int edad) {
        this.nombre = nombre;
        this.patas = patas;
        this.edad = edad;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
