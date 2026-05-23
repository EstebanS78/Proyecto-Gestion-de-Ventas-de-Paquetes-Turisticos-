/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.LinkedList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class PaqueteTuristicoUnicoTest {
    
    public PaqueteTuristicoUnicoTest() {
    }

    /**
     * Test of calcularValorUnidad method, of class PaqueteTuristicoUnico.
     */
    @Test
    public void testCalcularValorUnidad() {
        System.out.println("Test Calcular Valor Unidad de Paquete Turistico Unico");
        LinkedList<String> atractivos = new LinkedList<>();
        Destino D1 = new Destino("Cartagena", 2,atractivos,true);
        Destino D2 = new Destino("San Andres", 4,atractivos,true);
        ArrayList<Destino> susDestinos = new ArrayList<>();
        susDestinos.add(D1);
        susDestinos.add(D2);
        PaqueteTuristicoUnico suPaquete = new PaqueteTuristicoUnico("nombreHotel","tipoDesayuno","codigo","nombre","tipologiaTurismo","descripcion","origen",susDestinos,true,true,false,true,true, 100000, 2);
        
        int expResult = 6000000;
        int result = suPaquete.calcularValorUnidad();
        System.out.println("Resultado Esperado=" + expResult);
        System.out.println("Resultado Obtenido=" + result);
        assertEquals(expResult, result);
        
    }
    
}
