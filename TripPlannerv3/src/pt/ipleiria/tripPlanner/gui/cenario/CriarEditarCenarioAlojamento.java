/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pt.ipleiria.tripPlanner.gui.cenario;

import java.util.ArrayList;
import java.util.List;
import pt.ipleiria.tripPlanner.gui.events.OkEditarCenarioAlojamentoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.OkEditarCenarioAlojamentoClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.OkInserirCenarioAlojamentoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.OkInserirCenarioAlojamentoClicadoListener;

/**
 *
 * @author DELL
 */
public class CriarEditarCenarioAlojamento extends javax.swing.JPanel {

    private List<OkInserirCenarioAlojamentoClicadoListener> okInserirCenarioAlojamentoClicadoListener;
//    private List<OkEditarCenarioAlojamentoClicadoListener> okEditarCenarioAlojamentoClicadoListener;
    
    /**
     * Creates new form CriarCenarioAlojamento
     */
    public CriarEditarCenarioAlojamento() {
        initComponents();
        this.okInserirCenarioAlojamentoClicadoListener = new ArrayList<>();
//        this.okEditarCenarioAlojamentoClicadoListener = new ArrayList<>();
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

//    public synchronized void addOkEditarCenarioAlojamentoClicadoListener(OkEditarCenarioAlojamentoClicadoListener listener) {
//        this.okEditarCenarioAlojamentoClicadoListener.add(listener);
//    }
//
//    public synchronized void removeOkEditarCenarioAlojamentoClicadoListener(OkEditarCenarioAlojamentoClicadoListener listener) {
//        this.okEditarCenarioAlojamentoClicadoListener.remove(listener);
//    }
//
//    protected synchronized void fireOkEditarCenarioAlojamentoClicadoEvent() {
//        for (OkEditarCenarioAlojamentoClicadoListener listener : this.okEditarCenarioAlojamentoClicadoListener) {
//            OkEditarCenarioAlojamentoClicadoEvent evento = new OkEditarCenarioAlojamentoClicadoEvent(this);
//            listener.okEditarCenarioAlojamentoClicado(evento);
//        }
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lReservas = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        lCenario = new javax.swing.JList();
        btnAdicionar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();
        lblReservas = new javax.swing.JLabel();
        lblCenario = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        lReservas.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lReservas);

        lCenario.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lCenario);

        btnAdicionar.setText(">>");

        btnRemover.setText("<<");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        lblReservas.setText("Reservas");

        lblCenario.setText("Cenário");

        btnCancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblReservas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRemover, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAdicionar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblCenario)
                        .addGap(130, 130, 130))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(btnOk)
                .addGap(27, 27, 27)
                .addComponent(btnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReservas)
                    .addComponent(lblCenario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnAdicionar)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemover)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOk)
                    .addComponent(btnCancelar))
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        this.fireOkInserirCenarioAlojamentoClicadoEvent();
    }//GEN-LAST:event_btnOkActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnRemover;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList lCenario;
    private javax.swing.JList lReservas;
    private javax.swing.JLabel lblCenario;
    private javax.swing.JLabel lblReservas;
    // End of variables declaration//GEN-END:variables
}