/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public final class PaqueteTuristicoUnico extends PaqueteTuristico {
    private String nombreHotel;
    private String tipoDesayuno;

    public PaqueteTuristicoUnico(String nombreHotel, String tipoDesayuno, String codigo, String nombre, String tipologiaTurismo, String descripcion, String origen, ArrayList<Destino> susDestinos, boolean hotel, boolean alimentacion, boolean alimentacionTodo, boolean vuelo, boolean asistencia, int tarifaDia, int CantidadUnidades) {
        super(codigo, nombre, tipologiaTurismo, descripcion, origen, susDestinos, hotel, alimentacion, alimentacionTodo, vuelo, asistencia, tarifaDia, CantidadUnidades);
        this.nombreHotel = nombreHotel;
        this.tipoDesayuno = tipoDesayuno;
    }

    public PaqueteTuristicoUnico(String nombreHotel, String codigo, String nombre, String tipologiaTurismo, String descripcion, String origen, ArrayList<Destino> susDestinos, boolean hotel, boolean alimentacion, boolean alimentacionTodo, boolean vuelo, boolean asistencia, int tarifaDia, int CantidadUnidades) {
        super(codigo, nombre, tipologiaTurismo, descripcion, origen, susDestinos, hotel, alimentacion, alimentacionTodo, vuelo, asistencia, tarifaDia, CantidadUnidades);
        this.nombreHotel = nombreHotel;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public String getTipoDesayuno() {
        return tipoDesayuno;
    }

    public void setTipoDesayuno(String tipoDesayuno) {
        this.tipoDesayuno = tipoDesayuno;
    }

    @Override
    public String toString() {
        return "PaqueteTuristicoUnico{" 
                + super.toString()
                + "nombreHotel=" + nombreHotel 
                + ", tipoDesayuno=" + tipoDesayuno 
                + '}';
    }
    
    @Override
    public int calcularValorUnidad(){
        int resultado = 0;
        for(Destino D : susDestinos){
            resultado += D.getDiasPermanencia();
        }
        resultado *= tarifaDia;
        return resultado;
    }
    
}
