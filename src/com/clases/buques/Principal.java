/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clases.buques;

import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class Principal {

    public MontaCarga llenarMontaCarga(MontaCarga montaCarga1,
        MontaCarga montaCarga2, ArrayList<Buque> buques) {
        int[] tiempos = new int[6];
        int[] laycans = new int[6];
        for (int i = 0; i < buques.size(); i++) {
            montaCarga1.getSubBuques().add(buques.get(i).getBuque1());
            if (i > 0) {
                tiempos[i] = montaCarga1.getSubBuques().get(i - 1).getTiempoDeCarga()
                        + tiempos[i - 1];
            }
            laycans[i] = montaCarga1.getSubBuques().get(i).getLaycan();
        }
        montaCarga1.setTiempoInicio(tiempos);
        int[] comparados = this.compararLaycanTiempo(tiempos, laycans);
        System.out.println(this.mostar(comparados));
        return montaCarga1;
    }

    public int[] compararLaycanTiempo(int[] tiempos, int[] laycans) {
        int[] a = new int[6];
        for (int i = 0; i < tiempos.length; i++) {
            a[i] = tiempos[i] - laycans[i];
        }
        return a;
    }

    public String mostar(int[] vector) {
        String a = "";
        for (int i = 0; i < vector.length; i++) {
            a += vector[i] + " ";
        }
        return a;
    }
}
