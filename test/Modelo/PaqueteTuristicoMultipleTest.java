/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.LinkedList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Admin
 */
public class PaqueteTuristicoMultipleTest {
    
    public PaqueteTuristicoMultipleTest() {
    }

    //
    LinkedList<String> atractivos = new LinkedList<>();
    private Destino d1 = new Destino("Barranquilla", 3, atractivos,true);
    private Destino d2 = new Destino("Medellin", 4, atractivos,false);
    private Destino d3 = new Destino("Cartagena", 2, atractivos,true);
    private PaqueteTuristicoMultiple suPaquete;
    ArrayList<Destino> susDestinos = new ArrayList<>();
    
    @Before
    public void setUp(){
    susDestinos.add(d1);
    susDestinos.add(d2);
    susDestinos.add(d3);
    suPaquete = new PaqueteTuristicoMultiple("obsequio","codigo","nombre","tipologiaTurismo","descripcion","origen",susDestinos,true,true,false,true,true, 100000, 2);
    } 
   
    /**
     * Test of calcularValorUnidad method, of class PaqueteTuristicoMultiple.
     */
    @Test
    public void testCalcularValorUnidad() {
        System.out.println("Test Calcular Valor Unidad para Paquete Turistico Multiple");
        
        int expResult = 930000;
        int result = suPaquete.calcularValorUnidad();
        System.out.println("Resultado Esperado=" + expResult);
        System.out.println("Resultado Obtenido=" + result);
        assertEquals(expResult, result);
 
    }

    /**
     * Test of obtenerDestinoInicial method, of class PaqueteTuristicoMultiple.
     */
    @Test
    public void testObtenerDestinoInicial() {
        System.out.println("obtenerDestinoInicial");
        Destino expResult = d1;
        Destino result = suPaquete.obtenerDestinoInicial();
        System.out.println("Resultado Esperado=" + expResult);
        System.out.println("Resultado Obtenido=" + result);
        assertEquals(expResult, result);

    }

    /**
     * Test of obtenerDestinoFinal method, of class PaqueteTuristicoMultiple.
     */
    @Test
    public void testObtenerDestinoFinal() {
        System.out.println("obtenerDestinoFinal");
        Destino expResult = d3;
        Destino result = suPaquete.obtenerDestinoFinal();
        System.out.println("Resultado Esperado=" + expResult);
        System.out.println("Resultado Obtenido=" + result);
        assertEquals(expResult, result);

    }
    
}
