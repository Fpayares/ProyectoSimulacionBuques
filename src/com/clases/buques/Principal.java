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
public class Principal {
      
    ArrayList<Solucion> listaSoluciones = new ArrayList<>();
    MontaCarga montaCarga1 = new MontaCarga(new ArrayList<Integer>(), new ArrayList<>());
    MontaCarga montaCarga2 = new MontaCarga(new ArrayList<Integer>(), new ArrayList<>());  
    
    
    public MontaCarga verMontaCarga1() {
        return montaCarga1;
    }
    
    public MontaCarga verMontaCarga2() {
        return montaCarga2;
    }
    
    public void setVacios(ArrayList<Buque> a) {
        if (a.isEmpty() == false) {
            a.removeAll(a);
        }
    }
    
     public void vaciarMontacargas (MontaCarga m1,MontaCarga m2){
        m1.getSubBuques().clear();
        m1.setTiempoInicio(new ArrayList<>());
        m2.getSubBuques().clear();
        m2.setTiempoInicio(new ArrayList<>());
    }
    
    

    public void inicializarBuques(ArrayList<Buque> buques, int numBuques, int vector_tiempos[], int vector_laycan[]) {
        buques.clear();
        for (int i = 1; i < 7; i++) {
            String[] detalle = {String.valueOf(i) + "1", String.valueOf(i) + "2"};
            BuqueHijo buqueHijo1 = new BuqueHijo(detalle[0], vector_tiempos[i - 1], vector_laycan[i - 1]);
            BuqueHijo buqueHijo2 = new BuqueHijo(detalle[1], vector_tiempos[i - 1], vector_laycan[i - 1]);
            buques.add(new Buque(buqueHijo1, buqueHijo2));
        }
    }

    public int[] cambiarPosiciones(double n1, ArrayList<Buque> buques) {
        int pos1, pos2, pos3, pos4, pos5, pos6;
        int[] res = new int[4];
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
            res[2] = (pos3 + 1);
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
            res[2] = (pos3 + 1);
            res[3] = (pos4 + 1);
        }
        return res;
    }

    public int[] escogerPosiciones(double n2) {
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

    public ArrayList<Buque> cambiarPosiciones2(double n3, ArrayList<Buque> buques, int posicion1, int posicion2) {
        if (n3 <= 0.33) {
            return buques;
        } else if (0.33 < n3 && n3 <= 0.66) {
            ArrayList<BuqueHijo> valores1 = new ArrayList<>();
            valores1.add(buques.get(posicion1 - 2).getBuque1());
            valores1.add(buques.get(posicion1 - 1).getBuque1());
            valores1.add(buques.get(posicion1 - 2).getBuque2());
            valores1.add(buques.get(posicion1 - 1).getBuque2());
            valores1.add(buques.get(posicion2 - 2).getBuque1());
            valores1.add(buques.get(posicion2 - 1).getBuque1());
            valores1.add(buques.get(posicion2 - 2).getBuque2());
            valores1.add(buques.get(posicion2 - 1).getBuque2());
            buques.get(posicion1 - 2).setBuque1(valores1.get(0));
            buques.get(posicion1 - 2).setBuque2(valores1.get(1));
            buques.get(posicion1 - 1).setBuque1(valores1.get(2));
            buques.get(posicion1 - 1).setBuque2(valores1.get(3));
            buques.get(posicion2 - 2).setBuque1(valores1.get(4));
            buques.get(posicion2 - 2).setBuque2(valores1.get(5));
            buques.get(posicion2 - 1).setBuque1(valores1.get(6));
            buques.get(posicion2 - 1).setBuque2(valores1.get(7));
        } else if (0.66 < n3 && n3 <= 1) {
            ArrayList<BuqueHijo> valores1 = new ArrayList<>();
            valores1.add(buques.get(posicion1 - 2).getBuque1());
            valores1.add(buques.get(posicion1 - 1).getBuque1());
            valores1.add(buques.get(posicion1 - 1).getBuque2());
            valores1.add(buques.get(posicion1 - 2).getBuque2());
            valores1.add(buques.get(posicion2 - 2).getBuque1());
            valores1.add(buques.get(posicion2 - 1).getBuque1());
            valores1.add(buques.get(posicion2 - 1).getBuque2());
            valores1.add(buques.get(posicion2 - 2).getBuque2());
            buques.get(posicion1 - 2).setBuque1(valores1.get(0));
            buques.get(posicion1 - 2).setBuque2(valores1.get(1));
            buques.get(posicion1 - 1).setBuque1(valores1.get(2));
            buques.get(posicion1 - 1).setBuque2(valores1.get(3));
            buques.get(posicion2 - 2).setBuque1(valores1.get(4));
            buques.get(posicion2 - 2).setBuque2(valores1.get(5));
            buques.get(posicion2 - 1).setBuque1(valores1.get(6));
            buques.get(posicion2 - 1).setBuque2(valores1.get(7));
        }
        return buques;
    }

    public void llenarMontaCarga(ArrayList<Buque> buques) {
        montaCarga1.getSubBuques().clear();
        montaCarga1.getTiempoInicio().clear();
        montaCarga2.getSubBuques().clear();
        montaCarga2.getTiempoInicio().clear();
        int[] tiempos1 = new int[6];
        int[] tiempos2 = new int[6];
        int[] laycans1 = new int[6];
        int[] laycans2 = new int[6];
        for (int i = 0; i < buques.size(); i++) {
            if (i == 0) {
                montaCarga1.getSubBuques().add(buques.get(i).getBuque1());
                montaCarga2.getSubBuques().add(buques.get(i).getBuque2());
            }
            if (i > 0) {
                tiempos1[i] = montaCarga1.getSubBuques().get(i - 1).getTiempoDeCarga()
                        + tiempos1[i - 1];
                tiempos2[i] = montaCarga2.getSubBuques().get(i - 1).getTiempoDeCarga()
                        + tiempos2[i - 1];
                if (tiempos1[i] < tiempos2[i] || tiempos1[i] == tiempos2[i]) {
                    montaCarga1.getSubBuques().add(buques.get(i).getBuque1());
                    montaCarga2.getSubBuques().add(buques.get(i).getBuque2());
                } else {
                    montaCarga2.getSubBuques().add(buques.get(i).getBuque1());
                    montaCarga1.getSubBuques().add(buques.get(i).getBuque2());
                }
            }
            laycans1[i] = montaCarga1.getSubBuques().get(i).getLaycan();
            laycans2[i] = montaCarga2.getSubBuques().get(i).getLaycan();
            montaCarga1.setTiempoInicio(new ArrayList<Integer>(Arrays.asList(this.toIntegerArray(tiempos1))));
            montaCarga2.setTiempoInicio(new ArrayList<Integer>(Arrays.asList(this.toIntegerArray(tiempos2))));
        }
    }

    public int[] compararLaycanTiempo(MontaCarga montaCarga) {
        int[] a = new int[6];
        int[] laycans = new int[6];
        ArrayList<Integer> tiempos = montaCarga.getTiempoInicio();
        for (int i = 0; i < montaCarga.getSubBuques().size(); i++) {
            laycans[i] = montaCarga.getSubBuques().get(i).getLaycan();
        }
        for (int i = 0; i < tiempos.size(); i++) {
            a[i] = tiempos.get(i) - laycans[i];
        }
        return a;
    }

    public int[] compararLaycanTiempoValidada(MontaCarga montaCarga) {
        int[] a = new int[6];
        int[] laycans = new int[6];
        ArrayList<Integer> tiempos = montaCarga.getTiempoInicio();
        for (int i = 0; i < montaCarga.getSubBuques().size(); i++) {
            if (montaCarga.getSubBuques().get(i).getValor().endsWith("1")) {
                laycans[i] = montaCarga.getSubBuques().get(i).getLaycan();
            } else {
                laycans[i] = 0;
            }
        }
        for (int i = 0; i < tiempos.size(); i++) {
            if (laycans[i] == 0) {
                a[i] = 0;
            } else {
                a[i] = tiempos.get(i) - laycans[i];
            }
        }
        return a;
    }

    public int Penalizacion(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                sum += a[i];
            }
        }
        return sum;
    }

    public int valorPenalizacion(int a) {
        return a * 2000;
    }

    public String mostrar(int[] vector) {
        String a = "";
        for (int i = 0; i < vector.length; i++) {
            a += vector[i] + " ";
        }
        return a;
    }

    public double generarAleatorio() {
        return Math.random();
    }

    public void guardarSolucion(ArrayList<Buque> ordenBuques, int penalizacion) {
        this.listaSoluciones.add(new Solucion((ArrayList<Buque>) ordenBuques.clone(), penalizacion, this.listaSoluciones.size()+1));
    }
    
    public ArrayList<Solucion> mostrarSoluciones() {
        return this.listaSoluciones;
    }
    
    public Integer[] toIntegerArray(int[] arr) {
        Integer[] nuevo = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nuevo[i] = arr[i];
        }
        return nuevo;
    }
    
    public ArrayList<Solucion> procesoSolucion() {
        ArrayList<Buque> buques = new ArrayList<>();
        int vector_tiempos[] = {33, 30, 27, 22, 34, 34};
        int vector_laycan[] = {24, 24, 144, 72, 144, 24};
        this.inicializarBuques(buques, 6, vector_tiempos, vector_laycan);
        double aleatorio1 = this.generarAleatorio();
        this.cambiarPosiciones(aleatorio1, buques);
        double aleatorio2 = this.generarAleatorio();
        int[] posiciones = this.escogerPosiciones(aleatorio2);
        double aleatorio3 = this.generarAleatorio();
        this.cambiarPosiciones2(aleatorio3, buques, posiciones[0], posiciones[1]);
        this.llenarMontaCarga(buques);
        int[] comparacion1 = this.compararLaycanTiempoValidada(this.verMontaCarga1());
        int[] comparacion2 = this.compararLaycanTiempoValidada(this.verMontaCarga2());
        int penalizacion = this.Penalizacion(comparacion1) + this.Penalizacion(comparacion2);
        int valorPenalizacion = this.valorPenalizacion(penalizacion);
        this.guardarSolucion(buques, valorPenalizacion);
        return this.mostrarSoluciones();
    }
    
    public Solucion validar(double To, int L, int l, double alpha) {
        int i = 1;
        this.procesoSolucion();
        Solucion inicial = this.listaSoluciones.get(0);
        Solucion mejor = inicial;
        double T = To;
        do {
            this.procesoSolucion();
            Solucion nueva = this.listaSoluciones.get(i);
            double dPen = nueva.getPenalizacion() - inicial.getPenalizacion();
            if (dPen < 0) {
                inicial = nueva;
                if (inicial.getPenalizacion() < mejor.getPenalizacion()) {
                    mejor = inicial;
                }
            } else {
                double p = Math.exp(-dPen/T);
                if (p <= Math.random()) {
                    inicial = nueva;
                } else {
                    inicial = inicial;
                }
            }
            l = l + 1;
            if (l > L) {
                T = alpha * T;
            }
            i++;
        } while (T > 0.005 * To);
       // System.out.println(this.mostrarSoluciones());
        return mejor;
    }
      
}
