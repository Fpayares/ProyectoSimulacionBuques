/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clases.buques;

/**
 *
 * @author Estudiante
 */
public class Buque {

    private BuqueHijo buque1;
    private BuqueHijo buque2;

    public BuqueHijo getBuque1() {
        return buque1;
    }

    public void setBuque1(BuqueHijo buque1) {
        this.buque1 = buque1;
    }

    public BuqueHijo getBuque2() {
        return buque2;
    }

    public void setBuque2(BuqueHijo buque2) {
        this.buque2 = buque2;
    }

    public Buque(BuqueHijo buque1, BuqueHijo buque2) {
        this.buque1 = buque1;
        this.buque2 = buque2;
    }

    @Override
    public String toString() {
        return buque1 + " " + buque2+" \n";
    }

}
