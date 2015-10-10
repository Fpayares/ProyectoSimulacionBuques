/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clases.buques;

import java.util.ArrayList;

/**
 *
 * @author Efren
 */
public class Solucion {
    
    private ArrayList<Buque> arreglo;
    private int penalizacion;

    public Solucion(ArrayList<Buque> arreglo, int penalizacion) {
        this.arreglo = arreglo;
        this.penalizacion = penalizacion;
    }

    public ArrayList<Buque> getArreglo() {
        return arreglo;
    }

    public void setArreglo(ArrayList<Buque> arreglo) {
        this.arreglo = arreglo;
    }

    public int getPenalizacion() {
        return penalizacion;
    }

    public void setPenalizacion(int penalizacion) {
        this.penalizacion = penalizacion;
    }

    @Override
    public String toString() {
        return " Solucion {" + "Ordenamiento: " + arreglo + ", Penalizacion=" + penalizacion + '}';
    }
    
}
