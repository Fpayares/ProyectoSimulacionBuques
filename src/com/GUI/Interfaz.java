/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.GUI;

import com.clases.buques.Buque;
import com.clases.buques.BuqueHijo;
import com.clases.buques.MontaCarga;
import com.clases.buques.Principal;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author Fernando
 */
public class Interfaz extends javax.swing.JFrame {
    Principal capitan = new Principal();
    
    ArrayList<Buque> buques = new ArrayList<>();
    
    int vector_tiempos[] = {33, 30, 27, 22, 34, 34};
    int vector_laycan[] = {24, 24, 144, 72, 144, 24};
    
    ArrayList<BuqueHijo> lista1 = new ArrayList<>();
    ArrayList<BuqueHijo> lista2 = new ArrayList<>();
    
    MontaCarga montaCarga1 = capitan.verMontaCarga1();
    MontaCarga montaCarga2 = capitan.verMontaCarga2();

    DefaultListModel modeloLista = new DefaultListModel();
    DefaultListModel modeloLista2 = new DefaultListModel();
    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        jList1.setModel(modeloLista);
        jList2.setModel(modeloLista2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        Jpanel1 = new javax.swing.JPanel();
        OnloadShip = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea3 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextArea1 = new javax.swing.JTextArea();
        jLabel35 = new javax.swing.JLabel();
        TextField1 = new javax.swing.JTextField();
        BotonBorrar = new javax.swing.JButton();
        TxAleatorio1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        TxAleatorio2 = new javax.swing.JTextField();
        OnLoadShip2 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextArea4 = new javax.swing.JTextArea();
        jLabel33 = new javax.swing.JLabel();
        TextField3 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        TxAleatorio3 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jLabel38 = new javax.swing.JLabel();
        TxPenalizacion = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TextArea5 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel39.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        jLabel39.setText("Comparación metaheurística ");

        jLabel40.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        jLabel40.setText("para carga a granel ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel39)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel40)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Inicio", jPanel1);

        Jpanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OnloadShip.setText("On load Ship");
        OnloadShip.setName(""); // NOI18N
        OnloadShip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnloadShipActionPerformed(evt);
            }
        });
        Jpanel1.add(OnloadShip, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Laicans");
        Jpanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        jLabel2.setText("11");
        Jpanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel3.setText("32");
        Jpanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel4.setText("21");
        Jpanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel5.setText("34");
        Jpanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        jLabel6.setText("22");
        Jpanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel7.setText("31");
        Jpanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel8.setText("41");
        Jpanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel9.setText("51");
        Jpanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel10.setText("61");
        Jpanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel11.setText("62");
        Jpanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jLabel12.setText("52");
        Jpanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel13.setText("42");
        Jpanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Buques ");
        Jpanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Tiempo de carga");
        Jpanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        jLabel16.setText("12");
        Jpanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        jLabel17.setText("24");
        Jpanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));

        jLabel18.setText("30");
        Jpanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        jLabel19.setText("27");
        Jpanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        jLabel20.setText("22");
        Jpanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        jLabel21.setText("34");
        Jpanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jLabel22.setText("33 ");
        Jpanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        jLabel23.setText("24");
        Jpanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        jLabel24.setText("24");
        Jpanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        jLabel25.setText("144");
        Jpanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        jLabel26.setText("144");
        Jpanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, -1));

        jLabel27.setText("72");
        Jpanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        jLabel28.setText("Numero aleatorio 1: ");
        Jpanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        jLabel29.setText("Generar Buques: ");
        Jpanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel30.setText("Buques / Primera condición:");
        Jpanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));

        TextArea3.setColumns(20);
        TextArea3.setRows(5);
        jScrollPane1.setViewportView(TextArea3);

        Jpanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 200, 150));

        TextArea1.setColumns(20);
        TextArea1.setRows(5);
        jScrollPane2.setViewportView(TextArea1);

        Jpanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 210, 140));

        jLabel35.setText("Posiciones:");
        Jpanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));
        Jpanel1.add(TextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 200, -1));

        BotonBorrar.setText("Borrar");
        BotonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBorrarActionPerformed(evt);
            }
        });
        Jpanel1.add(BotonBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, -1, -1));
        Jpanel1.add(TxAleatorio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 200, -1));

        jTabbedPane1.addTab("Generacion de buques", Jpanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setText("Numero Aleatorio 2:");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        jPanel2.add(TxAleatorio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 170, -1));

        OnLoadShip2.setText("On load ship 2");
        OnLoadShip2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnLoadShip2ActionPerformed(evt);
            }
        });
        jPanel2.add(OnLoadShip2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, -1, -1));

        jLabel32.setText("Buques / Segunda condición :");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        TextArea4.setColumns(20);
        TextArea4.setRows(5);
        jScrollPane3.setViewportView(TextArea4);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 210, 140));

        jLabel33.setText("Posiciones :");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));
        jPanel2.add(TextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 170, -1));

        jLabel34.setText("Numero Aleatorio 3:");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));
        jPanel2.add(TxAleatorio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 170, -1));

        jLabel36.setText("Montacarga 1:");
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jScrollPane4.setViewportView(jList1);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 100, 120));

        jLabel37.setText("Montacarga 2:");
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));

        jScrollPane5.setViewportView(jList2);

        jPanel2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 100, 120));

        jLabel38.setText("Penalización:");
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, -1, -1));
        jPanel2.add(TxPenalizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 160, -1));

        jTabbedPane1.addTab("Condiciones", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel41.setText("Secuencia:");
        jPanel3.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        TextArea5.setColumns(20);
        TextArea5.setRows(5);
        jScrollPane6.setViewportView(TextArea5);

        jPanel3.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 240, 170));

        jTabbedPane1.addTab("Mejor Respuesta", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OnLoadShip2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnLoadShip2ActionPerformed
        this.modeloLista.removeAllElements();
        this.modeloLista2.removeAllElements();
        this.capitan.vaciarMontacargas(montaCarga1,montaCarga2);
        
        double aleatorio2 = capitan.generarAleatorio();
        this.TxAleatorio2.setText(aleatorio2+"\n");

        int[] posiciones = capitan.escogerPosiciones(aleatorio2);
        this.TextField3.setText(Arrays.toString(posiciones));

        double aleatorio3 = capitan.generarAleatorio();
        this.TxAleatorio3.setText(aleatorio3+"\n");

        ArrayList<Buque> e = capitan.cambiarPosiciones2(aleatorio3, buques, posiciones[0], posiciones[1]);
        this.TextArea4.setText(e.toString());

        capitan.llenarMontaCarga(buques);
                
        for(int i=0; i< montaCarga1.getSubBuques().size(); i++) {
            //Añadir cada elemento del ArrayList en el modelo de la lista
            modeloLista.add(i, montaCarga1.getSubBuques().get(i));
        }
        
        for (int i = 0; i < montaCarga2.getSubBuques().size(); i++) {
            modeloLista2.add(i,montaCarga2.getSubBuques().get(i));
        }
        
        int [] comparacion1 = capitan.compararLaycanTiempoValidada(capitan.verMontaCarga1());
        int [] comparacion2 = capitan.compararLaycanTiempoValidada(capitan.verMontaCarga2());
        
        int penalizacion = capitan.Penalizacion(comparacion1) + capitan.Penalizacion(comparacion2); 
        int valorPenalizacion = capitan.valorPenalizacion(penalizacion);
        this.TxPenalizacion.setText("$ "+valorPenalizacion);
        
        
    }//GEN-LAST:event_OnLoadShip2ActionPerformed

    private void OnloadShipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnloadShipActionPerformed
        double aleatorio1 = capitan.generarAleatorio();
        this.TxAleatorio1.setText(aleatorio1+"\n");

        capitan.inicializarBuques(buques, 6, vector_tiempos, vector_laycan);
        this.TextArea1.setText(buques.toString());

        Arrays.toString(capitan.cambiarPosiciones(aleatorio1, buques));
        int[] res = capitan.cambiarPosiciones(aleatorio1, buques);
        this.TextField1.setText(Arrays.toString(res));
        this.TextArea3.setText(buques.toString());
    }//GEN-LAST:event_OnloadShipActionPerformed

    private void BotonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBorrarActionPerformed
        capitan.setVacios(buques);
        this.TextArea1.setText(null);
        this.TxAleatorio1.setText(null);
        this.TextArea3.setText(null);
        this.TextArea4.setText(null);
        this.TextField1.setText(null);
        this.TxAleatorio2.setText(null);
        this.TextField3.setText(null);
        this.TxAleatorio3.setText(null);
        this.TxPenalizacion.setText(null);
        this.modeloLista.removeAllElements();
        this.modeloLista2.removeAllElements();
    }//GEN-LAST:event_BotonBorrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
           // UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
           // UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBorrar;
    private javax.swing.JPanel Jpanel1;
    private javax.swing.JButton OnLoadShip2;
    private javax.swing.JButton OnloadShip;
    private javax.swing.JTextArea TextArea1;
    private javax.swing.JTextArea TextArea3;
    private javax.swing.JTextArea TextArea4;
    private javax.swing.JTextArea TextArea5;
    private javax.swing.JTextField TextField1;
    private javax.swing.JTextField TextField3;
    private javax.swing.JTextField TxAleatorio1;
    private javax.swing.JTextField TxAleatorio2;
    private javax.swing.JTextField TxAleatorio3;
    private javax.swing.JTextField TxPenalizacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
