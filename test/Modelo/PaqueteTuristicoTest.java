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
public class PaqueteTuristicoTest {
    
    public PaqueteTuristicoTest() {
    }
    private LinkedList<String> atractivos;
    private Destino d1;
    private Destino d2;
    private ArrayList<Destino> susDestinos;
    private PaqueteTuristicoUnico suPaquete;
    @Before
    public void setUp(){
        atractivos = new LinkedList<>();
        d1 = new Destino("Barranquilla", 2,atractivos,true);
        d2 = new Destino("San Andres", 4,atractivos,true);
        susDestinos = new ArrayList<>();
        susDestinos.add(d1);
        susDestinos.add(d2);
        suPaquete = new PaqueteTuristicoUnico("nombreHotel","tipoDesayuno","codigo","nombre","tipologiaTurismo","descripcion","origen",susDestinos,true,true,false,true,true, 100000, 2);
        
    }
    @Test
    public void testCalcularValorUnidad() {
        System.out.println("calcularValorUnidad");
 
        int expResult = 6;
        int result = suPaquete.calcularValorUnidad();
        System.out.println("Resultado Esperado=" + expResult);
        System.out.println("Resultado Obtenido=" + result);
        assertEquals(expResult, result);

    }

    /**
     * Test of calcularValorTotal method, of class PaqueteTuristico.
     */
    @Test
    public void testCalcularValorTotal() {
        System.out.println("calcularValorTotal");
        int expResult = 1200000;
        int result = suPaquete.calcularValorTotal();
        System.out.println("Resultado Esperado=" + expResult);
        System.out.println("Resultado Obtenido=" + result);
        assertEquals(expResult, result);

    }

//    public class PaqueteTuristicoImpl extends PaqueteTuristico {
//
//        public PaqueteTuristicoImpl() {
//            super("", "", "", "", "", null, false, false, false, false, false, 0, 0);
//        }
//
//        public int calcularValorUnidad() {
//            return 0;
//        }
//    }
    
}
