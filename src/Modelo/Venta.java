/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Venta {
    private int numero;
    private LocalDateTime fechaHoraGeneracion;
    private LocalDateTime fechaHoraActualizacion;
    private Cliente suCliente;
    private ArrayList<PaqueteTuristico> susPaquetesTuristicos;
    private char estado;

    public Venta(int numero, LocalDateTime fechaHoraGeneracion, LocalDateTime fechaHoraActualizacion, Cliente suCliente, ArrayList<PaqueteTuristico> susPaquetesTuristicos, char estado) {
        this.numero = numero;
        this.fechaHoraGeneracion = fechaHoraGeneracion;
        this.fechaHoraActualizacion = fechaHoraActualizacion;
        this.suCliente = suCliente;
        this.susPaquetesTuristicos = susPaquetesTuristicos;
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDateTime getFechaHoraGeneracion() {
        return fechaHoraGeneracion;
    }

    public void setFechaHoraGeneracion(LocalDateTime fechaHoraGeneracion) {
        this.fechaHoraGeneracion = fechaHoraGeneracion;
    }

    public LocalDateTime getFechaHoraActualizacion() {
        return fechaHoraActualizacion;
    }

    public void setFechaHoraActualizacion(LocalDateTime fechaHoraActualizacion) {
        this.fechaHoraActualizacion = fechaHoraActualizacion;
    }

    public Cliente getSuCliente() {
        return suCliente;
    }

    public void setSuCliente(Cliente suCliente) {
        this.suCliente = suCliente;
    }

    public ArrayList<PaqueteTuristico> getSusPaquetesTuristicos() {
        return susPaquetesTuristicos;
    }

    public void setSusPaquetesTuristicos(ArrayList<PaqueteTuristico> susPaquetesTuristicos) {
        this.susPaquetesTuristicos = susPaquetesTuristicos;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Venta{" + "numero=" + numero 
                + ", fechaHoraGeneracion=" + fechaHoraGeneracion 
                + ", fechaHoraActualizacion=" + fechaHoraActualizacion 
                + ", suCliente=" + suCliente 
                + ", susPaquetesTuristicos=" + listarArray() 
                + ", estado=" + estado + '}';
    }
    
    public String listarArray(){
        String resultado = "\n";
        for(PaqueteTuristico PT : susPaquetesTuristicos){
            resultado += PT.toString() + "\n";
        }
        return resultado;
    }
    
    
    public int calcularCantidadTotalUnidadesPaquetes(){
        int resultado = susPaquetesTuristicos.size();
        return resultado;
    }
    
    public int calcularValorTotalPaquetes(){
        int resultado = 0;

        for(PaqueteTuristico PT : susPaquetesTuristicos){
            resultado += PT.calcularValorTotal();
        }
        return resultado;
    }
    
    public int calcularValorTotalDescuento(){
        int resultado = (int) (calcularValorTotalPaquetes()*(suCliente.getPorcentajeDescuento()/100)); //valor total paquetes * porcentaje descuento cliente

        return resultado;
    }
    
    public int calcularValorTotalPagar(){
        int resultado = calcularValorTotalPaquetes()-calcularValorTotalDescuento();
        return resultado;
    }
    
}
