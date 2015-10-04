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
import java.util.Arrays;

/**
 *
 * @author Estudiante
 */
public class Test {

    public static void main(String[] args) {

        Principal main = new Principal();
        
        ArrayList<Buque> buques = new ArrayList<>();
        
        int vector_tiempos[] = {33, 30, 27, 22, 34, 34};
        int vector_laycan[] = {24, 24, 144, 72, 144, 24};
        
        ArrayList<BuqueHijo> lista1 = new ArrayList<>();
        ArrayList<BuqueHijo> lista2 = new ArrayList<>();

        MontaCarga montaCarga1 = new MontaCarga(new int[6], new ArrayList<>());
        MontaCarga montaCarga2 = new MontaCarga(new int[6], new ArrayList<>());       

        main.inicializarBuques(buques, 6, vector_tiempos, vector_laycan);
        System.out.println(buques);
        double aleatorio1 = main.generarAleatorio();
        System.out.println("Numero 1 Aleatorio: " + aleatorio1);
        System.out.println(Arrays.toString(main.cambiarPosiciones(aleatorio1, buques)));
        System.out.println(buques);
        double aleatorio2 = main.generarAleatorio();
        System.out.println("Numero 2 Aleatorio: " + aleatorio2);
        int[] posiciones = main.escogerPosiciones(aleatorio2);
        System.out.println(Arrays.toString(posiciones));
        double aleatorio3 = main.generarAleatorio();
        System.out.println("Numero 3 Aleatorio: " + aleatorio3);
        System.out.println(main.cambiarPosiciones2(aleatorio3, buques, posiciones[0], posiciones[1]));
        main.llenarMontaCarga(montaCarga1, montaCarga2, buques);
        System.out.println("\n");
        System.out.println(montaCarga1);
        System.out.println(montaCarga2);
        
    }
}
