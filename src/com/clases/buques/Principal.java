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
    
    public void inicializarBuques(ArrayList<Buque> buques, int numBuques, int vector_tiempos[], int vector_laycan[]) {
        for (int i = 1; i < 7; i++) {
            String[] detalle = {String.valueOf(i) + "1", String.valueOf(i) + "2"};
            BuqueHijo buqueHijo1 = new BuqueHijo(detalle[0], vector_tiempos[i - 1], vector_laycan[i - 1]);
            BuqueHijo buqueHijo2 = new BuqueHijo(detalle[1], vector_tiempos[i - 1], vector_laycan[i - 1]);
            //System.out.println(buqueHijo1 + " " + buqueHijo2);
            buques.add(new Buque(buqueHijo1, buqueHijo2));
        }
    }
    
    public int[] cambiarPosiciones(ArrayList<Buque> buques) {
        int pos1, pos2, pos3, pos4, pos5, pos6;
        int[] res = new int[2];
        double n1 = Math.random();
        if (n1 <= 0.33) {
            do {
                pos1 = (int) (Math.random() * 6);
                pos2 = (int) (Math.random() * 6);
            } while (pos1 == pos2);
            Buque val1 = buques.get(pos1);
            Buque val2 = buques.get(pos2);
            buques.set(pos1, val2);
            buques.set(pos2, val1);
            res[0] = (pos1 + 1);
            res[1] = (pos2 + 1);
        } else if (0.33 < n1 && n1 <= 0.66) {
            do {
                pos1 = (int) (Math.random() * 6);
                pos2 = (int) (Math.random() * 6);
                pos3 = (int) (Math.random() * 6);

            } while (pos1 == pos2 || pos1 == pos3 || pos2 == pos3);
            Buque val1 = buques.get(pos1);
            Buque val2 = buques.get(pos2);
            Buque val3 = buques.get(pos3);
            buques.set(pos1, val2);
            buques.set(pos2, val3);
            buques.set(pos3, val1);
            res[0] = (pos1 + 1);
            res[1] = (pos2 + 1);
        } else if (0.66 < n1 && n1 <= 1) {
            do {
                pos1 = (int) (Math.random() * 6);
                pos2 = (int) (Math.random() * 6);
                pos3 = (int) (Math.random() * 6);
                pos4 = (int) (Math.random() * 6);
            } while (pos1 == pos2 || pos1 == pos3 || pos2 == pos3 || pos1 == pos4
                    || pos2 == pos4 || pos3 == pos4);
            Buque val1 = buques.get(pos1);
            Buque val2 = buques.get(pos2);
            Buque val3 = buques.get(pos3);
            Buque val4 = buques.get(pos4);
            buques.set(pos1, val4);
            buques.set(pos2, val1);
            buques.set(pos3, val2);
            buques.set(pos4, val3);
            res[0] = (pos1 + 1);
            res[1] = (pos2 + 1);
        }
        return res;
    }
    
    public int[] escogerPosiciones() {
        double n2 = Math.random();
        int[] posiciones = new int[2];
        if (n2 <= 0.33) {
            posiciones[0] = 2;
            posiciones[1] = 4;
        } else if (0.33 < n2 && n2 <= 0.66) {
            posiciones[0] = 3;
            posiciones[1] = 5;
        } else if (0.66 < n2 && n2 <= 1) {
            posiciones[0] = 4;
            posiciones[1] = 6;
        }
        return posiciones;
    }
    
    public MontaCarga llenarMontaCarga(MontaCarga montaCarga1, MontaCarga montaCarga2, ArrayList<Buque> buques) {
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
        System.out.println(this.mostrar(comparados));
        return montaCarga1;
    }

    public int[] compararLaycanTiempo(int[] tiempos, int[] laycans) {
        int[] a = new int[6];
        for (int i = 0; i < tiempos.length; i++) {
            a[i] = tiempos[i] - laycans[i];
        }
        return a;
    }

    public String mostrar(int[] vector) {
        String a = "";
        for (int i = 0; i < vector.length; i++) {
            a += vector[i] + " ";
        }
        return a;
    }
}
