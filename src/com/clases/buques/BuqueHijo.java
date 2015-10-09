/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clases.buques;

/**
 *
 * @author Fernando
 */
public class BuqueHijo {

    private String valor;
    private int tiempoDeCarga;
    private int Laycan;
    private boolean contabilizado;

    public BuqueHijo(String valor, int tiempoDeCarga, int Laycan) {
        this.valor = valor;
        this.tiempoDeCarga = tiempoDeCarga;
        this.Laycan = Laycan;
        this.contabilizado = false;
    }

    public boolean isContabilizado() {
        return contabilizado;
    }
    
    public int getTiempoDeCarga() {
        return tiempoDeCarga;
    }

    public void setTiempoDeCarga(int tiempoDeCarga) {
        this.tiempoDeCarga = tiempoDeCarga;
    }

    public int getLaycan() {
        return Laycan;
    }

    public void setLaycan(int Laycan) {
        this.Laycan = Laycan;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setContabilizado(boolean contabilizado) {
        this.contabilizado = contabilizado;
    }
    
    @Override
    public String toString() {
        return this.getValor() + "(" + this.getTiempoDeCarga() + " " + this.getLaycan() + ")";
    }

}
