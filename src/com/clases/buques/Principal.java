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

    public void setVacios (ArrayList<Buque> a){
        if (a.isEmpty()== false) {
        a.removeAll(a);    
    }
  
     
    }

    public void inicializarBuques(ArrayList<Buque> buques, int numBuques, int vector_tiempos[], int vector_laycan[]) {
        for (int i = 1; i < 7; i++) {
            String[] detalle = {String.valueOf(i) + "1", String.valueOf(i) + "2"};
            BuqueHijo buqueHijo1 = new BuqueHijo(detalle[0], vector_tiempos[i - 1], vector_laycan[i - 1]);
            BuqueHijo buqueHijo2 = new BuqueHijo(detalle[1], vector_tiempos[i - 1], vector_laycan[i - 1]);
            //System.out.println(buqueHijo1 + " " + buqueHijo2);
            buques.add(new Buque(buqueHijo1, buqueHijo2));
        }
    }

    public int[] cambiarPosiciones(double n1, ArrayList<Buque> buques) {
        int pos1, pos2, pos3, pos4, pos5, pos6;
        int[] res = new int[2];
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

    public void llenarMontaCarga(MontaCarga montaCarga1, MontaCarga montaCarga2, ArrayList<Buque> buques) {
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
            montaCarga1.setTiempoInicio(tiempos1);
            montaCarga2.setTiempoInicio(tiempos2);
        }
        /*montaCarga1.setTiempoInicio(tiempos);
         int[] comparados = this.compararLaycanTiempo(tiempos, laycans);
         System.out.println(this.mostrar(comparados));
         int suma = this.Penalizacion(comparados);
         System.out.println(this.valorPenalizacion(suma));*/
    }

    public int[] compararLaycanTiempo(MontaCarga montaCarga) {
        int[] a = new int[6];
        int[] laycans = new int[6];
        int[] tiempos = montaCarga.getTiempoInicio();
        for (int i = 0; i < montaCarga.getSubBuques().size(); i++) {
            laycans[i] = montaCarga.getSubBuques().get(i).getLaycan();
        }
        for (int i = 0; i < tiempos.length; i++) {
            a[i] = tiempos[i] - laycans[i];
        }
        return a;
    }
    
        /*
        public int[] compararLaycanTiempo(MontaCarga montaCarga) {
        int[] a = new int[6];
        int[] laycans = new int[6];
        int[] tiempos = montaCarga.getTiempoInicio();
        for (int i = 0; i < montaCarga.getSubBuques().size(); i++) {
            laycans[i] = montaCarga.getSubBuques().get(i).getLaycan();
        }
        for (int i = 0; i < montaCarga.getSubBuques().size(); i++) {
            BuqueHijo base1 = montaCarga.getSubBuques().get(i);
            BuqueHijo base2 = montaCarga.getSubBuques().get(i);
            int valor1 = Integer.parseInt(montaCarga.getSubBuques().get(i).getValor());
            int valor2 = Integer.parseInt(montaCarga.getSubBuques().get(i).getValor())+1;
            System.out.println(valor1 + " " + valor2);
            base1.setValor(String.valueOf(valor1));
            base2.setValor(String.valueOf(valor2));
            System.out.println(base1);
            System.out.println(base2 + "\n");
        }
        for (int i = 0; i < tiempos.length; i++) {
            a[i] = tiempos[i] - laycans[i];
        }
        return a;
    }
    */
    
    public int Penalizacion(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                sum += a[i];
            }
        }
        return sum;
    }

    public String valorPenalizacion(int a) {
        return "$" + a * 2000;
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
}
