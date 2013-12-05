/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pt.ipleiria.tripPlanner.gui.cenario;

import java.util.ArrayList;
import java.util.List;
import pt.ipleiria.tripPlanner.gui.events.ConfirmarClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.ConfirmarClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.OkInserirCenarioAlojamentoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.OkInserirCenarioAlojamentoClicadoListener;

/**
 *
 * @author DELL
 */
public class CompararCenarioAlojamento extends javax.swing.JPanel {

    private List<OkInserirCenarioAlojamentoClicadoListener> okInserirCenarioAlojamentoClicadoListener;
    /**
     * Creates new form PesquisarCenarioAlojamento
     */
    public CompararCenarioAlojamento() {
        initComponents();
        
        this.okInserirCenarioAlojamentoClicadoListener = new ArrayList<>();
    }
        public synchronized void addOkInserirCenarioAlojamentoClicadoListener(OkInserirCenarioAlojamentoClicadoListener listener) {
        this.okInserirCenarioAlojamentoClicadoListener.add(listener);
    }

    public synchronized void removeOkInserirCenarioAlojamentoClicadoListener(OkInserirCenarioAlojamentoClicadoListener listener) {
        this.okInserirCenarioAlojamentoClicadoListener.remove(listener);
    }

    protected synchronized void fireOkInserirCenarioAlojamentoClicadoEvent() {
        for (OkInserirCenarioAlojamentoClicadoListener listener : this.okInserirCenarioAlojamentoClicadoListener) {
            OkInserirCenarioAlojamentoClicadoEvent evento = new OkInserirCenarioAlojamentoClicadoEvent(this);
            listener.okInserirCenarioAlojamentoClicado(evento);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCenarioAlojamento = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lCenarioAlojamento = new javax.swing.JList();
        btnOk = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lCenarioAlojamento1 = new javax.swing.JList();

        setBackground(new java.awt.Color(255, 255, 255));

        lblCenarioAlojamento.setText("Comparar Cenario Alojamento");

        lCenarioAlojamento.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lCenarioAlojamento);

        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        lCenarioAlojamento1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lCenarioAlojamento1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(lblCenarioAlojamento))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(btnOk)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblCenarioAlojamento)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btnOk)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        this.fireOkInserirCenarioAlojamentoClicadoEvent();
    }//GEN-LAST:event_btnOkActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList lCenarioAlojamento;
    private javax.swing.JList lCenarioAlojamento1;
    private javax.swing.JLabel lblCenarioAlojamento;
    // End of variables declaration//GEN-END:variables
}