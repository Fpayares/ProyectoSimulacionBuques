/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import com.clases.buques.Buque;
import com.clases.buques.BuqueHijo;
import com.clases.buques.MontaCarga;
import com.clases.buques.Principal;
import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Test {

    public static void main(String[] args) {

        ArrayList<Buque> buques = new ArrayList<>();
        int vector_tiempos[] = {33, 30, 27, 22, 34, 34};
        int vector_laycan[] = {24, 24, 144, 72, 144, 24};

        for (int i = 1; i < 7; i++) {
            String[] detalle = {String.valueOf(i) + "1", String.valueOf(i) + "2"};
            BuqueHijo buqueHijo1 = new BuqueHijo(detalle[0], vector_tiempos[i - 1], vector_laycan[i - 1]);
            BuqueHijo buqueHijo2 = new BuqueHijo(detalle[1], vector_tiempos[i - 1], vector_laycan[i - 1]);
            System.out.println(buqueHijo1 + " " + buqueHijo2);
            buques.add(new Buque(buqueHijo1, buqueHijo2));
        }

        System.out.println(buques);

        double n1 = Math.random();

        int pos1, pos2, pos3, pos4, pos5, pos6;

        System.out.println("n1: " + n1);

        if (n1 <= 0.33) {

            do {
                pos1 = (int) (Math.random() * 6);
                pos2 = (int) (Math.random() * 6);
            } while (pos1 == pos2);

            Buque val1 = buques.get(pos1);
            Buque val2 = buques.get(pos2);
            buques.set(pos1, val2);
            buques.set(pos2, val1);
            System.out.println("Posiciones: " + (pos1 + 1) + ", " + (pos2 + 1));
            System.out.println(buques);

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

            System.out.println("Posiciones: " + (pos1 + 1) + ", " + (pos2 + 1) + ", "
                    + (pos3 + 1));
            System.out.println(buques);
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

            System.out.println("Posiciones: " + (pos1 + 1) + ", " + (pos2 + 1) + ", "
                    + (pos3 + 1) + ", " + (pos4 + 1));
            System.out.println(buques);

        }

        double n2 = Math.random();

        int posicion1 = 0;
        int posicion2 = 0;

        System.out.println("n2: " + n2);

        if (n2 <= 0.33) {
            posicion1 = 2;
            posicion2 = 4;
            System.out.println("Posiciones: " + (posicion1) + ", " + (posicion2));
        } else if (0.33 < n2 && n2 <= 0.66) {
            posicion1 = 3;
            posicion2 = 5;
            System.out.println("Posiciones: " + (posicion1) + ", " + (posicion2));
        } else if (0.66 < n2 && n2 <= 1) {
            posicion1 = 4;
            posicion2 = 6;

            System.out.println("Posiciones: " + (posicion1) + ", " + (posicion2));
        }

        double n3 = Math.random();
        System.out.println("n3: " + n3);

        if (n3 <= 0.33) {
            System.out.println(buques);
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

            System.out.println(buques);

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

            System.out.println(buques);

        }

        ArrayList<BuqueHijo> lista1 = new ArrayList<>();
        ArrayList<BuqueHijo> lista2 = new ArrayList<>();

        MontaCarga montaCarga1 = new MontaCarga(new int[6], new ArrayList<>());
        MontaCarga montaCarga2 = new MontaCarga(new int[6], new ArrayList<>());

        Principal main = new Principal();

        System.out.println(main.llenarMontaCarga(montaCarga1, montaCarga2, buques));

    }
}
