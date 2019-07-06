/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viernesreyes20190705pruebas.Viernesreyes20190705pruebas;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Programación
 */
public class PèrsonasTest {
    
    public PèrsonasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNombre method, of class Pèrsonas.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Personas instance = new Personas();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Pèrsonas.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Personas instance = new Personas();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEdad method, of class Pèrsonas.
     */
    @Test
    public void testGetEdad() {
        System.out.println("getEdad");
        Personas instance = new Personas();
        int expResult = 0;
        int result = instance.getEdad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEdad method, of class Pèrsonas.
     */
    @Test
    public void testSetEdad() {
        System.out.println("setEdad");
        int edad = 0;
        Personas instance = new Personas();
        instance.setEdad(edad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMascotas method, of class Pèrsonas.
     */
    @Test
    public void testGetMascotas() {
        System.out.println("getMascotas");
        Personas instance = new Personas();
        ArrayList expResult = null;
        ArrayList result = instance.getMascotas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAños method, of class Pèrsonas.
     */
    @Test
    public void testGetAños() {
        System.out.println("getA\u00f1os");
        Personas instance = new Personas();
        int expResult = 0;
        int result = instance.getAños();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAños method, of class Pèrsonas.
     */
    @Test
    public void testSetAños() {
        System.out.println("setA\u00f1os");
        int años = 0;
        Personas instance = new Personas();
        instance.setAños(años);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMascotas method, of class Pèrsonas.
     */
    @Test
    public void testSetMascotas_String() {
        System.out.println("setMascotas");
        String mascotas = "";
        Personas instance = new Personas();
        instance.setMascotas(mascotas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMascotas method, of class Pèrsonas.
     */
    @Test
    public void testSetMascotas_ErrorType() {
        System.out.println("setMascotas");
        Object mascotas = null;
        Personas instance = new Personas();
        instance.setMascotas(mascotas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarMascotas method, of class Pèrsonas.
     */
    @Test
    public void testAgregarMascotas() {
        System.out.println("agregarMascotas");
        Personas.Mascota mascota = null;
        Personas instance = new Personas();
        int expResult = 0;
        int result = instance.agregarMascotas(mascota);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
