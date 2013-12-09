/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pt.ipleiria.tripPlanner.gui.Models;

import java.util.ArrayList;

/**
 *
 * @author Ricardo
 */
public class Etapa {
    private String localInicio;
    private String localidadeFinal;
    private ArrayList<String> listaLocalidades;
    private int distanciaTotal;
    private int altitudeAcumulada;
    private int altitudeMaxima;
    private int altitudeMinima;

    public Etapa(String localInicio, String localidadeFinal, ArrayList<String> listaLocalidades, int distanciaTotal, int altitudeAcumulada, int altitudeMaxima, int altitudeMinima) {
        this.localInicio = localInicio;
        this.localidadeFinal = localidadeFinal;
        this.listaLocalidades = listaLocalidades;
        this.distanciaTotal = distanciaTotal;
        this.altitudeAcumulada = altitudeAcumulada;
        this.altitudeMaxima = altitudeMaxima;
        this.altitudeMinima = altitudeMinima;
    }

    public String getLocalInicio() {
        return localInicio;
    }

    public String getLocalidadeFinal() {
        return localidadeFinal;
    }

    public ArrayList<String> getListaLocalidades() {
        return listaLocalidades;
    }

    public int getDistanciaTotal() {
        return distanciaTotal;
    }

    public int getAltitudeAcumulada() {
        return altitudeAcumulada;
    }

    public int getAltitudeMaxima() {
        return altitudeMaxima;
    }

    public int getAltitudeMinima() {
        return altitudeMinima;
    }

   
    
    
}
