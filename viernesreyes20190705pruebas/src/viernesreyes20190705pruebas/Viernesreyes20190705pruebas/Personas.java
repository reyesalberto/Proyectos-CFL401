/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viernesreyes20190705pruebas.Viernesreyes20190705pruebas;

import java.util.ArrayList;

/**
 *
 * @author Programación
 */
public class Personas {
    
    private String nombre;
    private int edad;
    private int años;

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

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
    private  ArrayList <Mascota> mascotas; 
    
    
public class Mascotas {
    private String nombre;
    private int edad;
    private int años;

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

        public int getAños() {
            return años;
        }

        public void setAños(int años) {
            this.años = años;
        }
    }
public int agregarMascota(Mascota mascota){
    mascota.add(mascota);
    return mascotas.size();
    
}
public int cuantasMascotasTenes(){
  return  mascotas.size();
}
    

        }
    


      
    

   

