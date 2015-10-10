/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clases.buques;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Fernando
 */
public class MontaCarga {

    private ArrayList<Integer> tiempoInicio;
    private ArrayList<BuqueHijo> subBuques;

    public MontaCarga(ArrayList<Integer> tiempoInicio, ArrayList<BuqueHijo> subBuques) {
        this.tiempoInicio = tiempoInicio;
        this.subBuques = subBuques;
    }

    public ArrayList<Integer> getTiempoInicio() {
        return tiempoInicio;
    }

    public void setTiempoInicio(ArrayList<Integer> tiempoInicio) {
        this.tiempoInicio = tiempoInicio;
    }

    public ArrayList<BuqueHijo> getSubBuques() {
        return subBuques;
    }

    public void setSubBuques(ArrayList<BuqueHijo> subBuques) {
        this.subBuques = subBuques;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.getTiempoInicio().toArray()) + " " + subBuques;
    }
    
    

}
