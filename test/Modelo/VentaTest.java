/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Modelo;

import Modelo.Cliente;
import Modelo.Destino;
import Modelo.PaqueteTuristico;
import Modelo.PaqueteTuristicoMultiple;
import Modelo.PaqueteTuristicoUnico;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Admin
 */
public class VentaTest {
    
    public VentaTest() {
    }
    LinkedList<String> atractivos;
    private Cliente suCliente;
    private Destino d1;
    private Destino d2;
    private Destino d3;
    private ArrayList<Destino> susDestinos;
    
    private PaqueteTuristico p1;
    private PaqueteTuristico p2;
    private PaqueteTuristico p3;
    
    private ArrayList <PaqueteTuristico> susPaquetesTuristicos;

    private Venta laVenta;
    
    @Before
    public void setUp(){
        atractivos = new LinkedList<>();
        suCliente = new Cliente('c',"numeroIdentificacion", true, "nombre", "email", "telefono", "nombreContacto", 10);
        d1 = new Destino("Cali", 3, atractivos,true);
        d2 = new Destino("Bogota", 3, atractivos,false);
        d3 = new Destino("Pasto", 2, atractivos,true);
        susDestinos = new ArrayList<>();
        susDestinos.add(d1);
        susDestinos.add(d2);
        susDestinos.add(d3);
        p1 = new PaqueteTuristicoUnico("nombreHotel","tipoDesayuno","codigo","nombre","tipologiaTurismo","descripcion","origen",susDestinos,true,true,false,true,true, 100000, 2);
        p2 = new PaqueteTuristicoMultiple("obsequio","codigo","nombre","tipologiaTurismo","descripcion","origen",susDestinos,true,true,false,true,true, 100000, 2);
        p3 = new PaqueteTuristicoUnico("nombreHotel","tipoDesayuno","codigo","nombre","tipologiaTurismo","descripcion","origen",susDestinos,true,true,false,true,true, 100000, 2);
        susPaquetesTuristicos.add(p1);
        susPaquetesTuristicos.add(p2);
        susPaquetesTuristicos.add(p3);
        susPaquetesTuristicos = new ArrayList<>();

        laVenta = new Venta(1,LocalDateTime.now(),LocalDateTime.now(),suCliente,susPaquetesTuristicos,'a');
    }
    
    /**
     * Test of calcularCantidadTotalUnidadesPaquetes method, of class Venta.
     */
    @Test
    public void testCalcularCantidadTotalUnidadesPaquetes() {
        System.out.println("Test #1: Calcular Cantidad Total Unidades Paquetes");
        int expResult = 3;
        int result = laVenta.calcularCantidadTotalUnidadesPaquetes();
        System.out.println("Resultado Esperado=" + expResult);
        System.out.println("Resultado Obtenido=" + result);
        assertEquals(expResult, result);

    }

    /**
     * Test of calcularValorTotalPaquetes method, of class Venta.
     */
    @Test
    public void testCalcularValorTotalPaquetes() {
        System.out.println("calcularValorTotalPaquetes");
        int expResult = 2430000;
        int result = laVenta.calcularValorTotalPaquetes();
        System.out.println("Resultado Esperado=" + expResult);
        System.out.println("Resultado Obtenido=" + result);
        assertEquals(expResult, result);

    }

    /**
     * Test of calcularValorTotalDescuento method, of class Venta.
     */
    @Test
    public void testCalcularValorTotalDescuento() {
        System.out.println("calcularValorTotalDescuento");
        int expResult = 243000;
        int result = laVenta.calcularValorTotalDescuento();
        System.out.println("Resultado Esperado=" + expResult);
        System.out.println("Resultado Obtenido=" + result);
        assertEquals(expResult, result);

    }

    /**
     * Test of calcularValorTotalPagar method, of class Venta.
     */
    @Test
    public void testCalcularValorTotalPagar() {
        System.out.println("calcularValorTotalPagar");
        int expResult = 2187000;
        int result = laVenta.calcularValorTotalPagar();
        System.out.println("Resultado Esperado=" + expResult);
        System.out.println("Resultado Obtenido=" + result);
        assertEquals(expResult, result);

    }
    
}
