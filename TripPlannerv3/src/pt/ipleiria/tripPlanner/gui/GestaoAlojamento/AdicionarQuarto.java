/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipleiria.tripPlanner.gui.GestaoAlojamento;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import pt.ipleiria.tripPlanner.gui.Models.DadosAplicacao;
import pt.ipleiria.tripPlanner.gui.Models.Quarto;
import pt.ipleiria.tripPlanner.gui.events.AlojamentoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.AlojamentoClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.CancelarAdicionarQuartoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.CancelarAdicionarQuartoClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.ConfirmarAdicionarQuartoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.ConfirmarAdicionarQuartoClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.CriarEditarAlojamentoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.CriarEditarAlojamentoClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.OkInserirEtapasClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.OkInserirEtapasClicadoListener;

/**
 *
 * @author DELL
 */
public class AdicionarQuarto extends javax.swing.JPanel {

    private List<ConfirmarAdicionarQuartoClicadoListener> confirmarAdicionarQuartoClicadoListener;
    private List<CancelarAdicionarQuartoClicadoListener> cancelarAdicionarQuartoClicadoListener;

    /**
     * Creates new form AdicionarQuarto
     */
    public AdicionarQuarto() {
        initComponents();
        this.confirmarAdicionarQuartoClicadoListener = new ArrayList<>();
        this.cancelarAdicionarQuartoClicadoListener = new ArrayList<>();
    }

    public synchronized void addConfirmarAdicionarQuartoClicadoListener(ConfirmarAdicionarQuartoClicadoListener listener) {
        this.confirmarAdicionarQuartoClicadoListener.add(listener);
    }

    public synchronized void removeConfirmarAdicionarQuartoClicadoListener(ConfirmarAdicionarQuartoClicadoListener listener) {
        this.confirmarAdicionarQuartoClicadoListener.remove(listener);
    }

    protected synchronized void fireConfirmarAdicionarQuartoClicadoEvent() {
        for (ConfirmarAdicionarQuartoClicadoListener listener : this.confirmarAdicionarQuartoClicadoListener) {
            ConfirmarAdicionarQuartoClicadoEvent evento = new ConfirmarAdicionarQuartoClicadoEvent(this);
            listener.confirmarAdicionarQuartoClicado(evento);
        }
    }

    public synchronized void addCancelarAdicionarQuartoClicadoListener(CancelarAdicionarQuartoClicadoListener listener) {
        this.cancelarAdicionarQuartoClicadoListener.add(listener);
    }

    public synchronized void removeCancelarAdicionarQuartoClicadoListener(CancelarAdicionarQuartoClicadoListener listener) {
        this.cancelarAdicionarQuartoClicadoListener.remove(listener);
    }

    protected synchronized void fireCancelarAdicionarQuartoClicadoEvent() {
        for (CancelarAdicionarQuartoClicadoListener listener : this.cancelarAdicionarQuartoClicadoListener) {
            CancelarAdicionarQuartoClicadoEvent evento = new CancelarAdicionarQuartoClicadoEvent(this);
            listener.cancelarAdicionarQuartoClicado(evento);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        btnOk = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rbIndividualBliche = new javax.swing.JRadioButton();
        lblNCamas = new javax.swing.JLabel();
        rbIndividual = new javax.swing.JRadioButton();
        rbCasalTwin = new javax.swing.JRadioButton();
        tfNCamas = new javax.swing.JTextField();
        lblTipoCama = new javax.swing.JLabel();
        lblErrCamas = new javax.swing.JLabel();
        lblErrTipoCama = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblTipoCusto = new javax.swing.JLabel();
        tfCusto = new javax.swing.JTextField();
        lblCusto = new javax.swing.JLabel();
        rbQuarto = new javax.swing.JRadioButton();
        rbCama = new javax.swing.JRadioButton();
        lblErrCusto = new javax.swing.JLabel();
        lblErrTipoCusto = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        lblDesign = new javax.swing.JLabel();
        tfDesign = new javax.swing.JTextField();
        lblErrDesign = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Cama"));

        buttonGroup1.add(rbIndividualBliche);
        rbIndividualBliche.setText("Individual ou Bliche");

        lblNCamas.setText("*Nº Camas:");

        buttonGroup1.add(rbIndividual);
        rbIndividual.setText("Individual");

        buttonGroup1.add(rbCasalTwin);
        rbCasalTwin.setText("Casal ou Twin");

        lblTipoCama.setText("*Tipo Cama:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblNCamas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblErrCamas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfNCamas)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTipoCama)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblErrTipoCama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(rbIndividual)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbCasalTwin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbIndividualBliche)
                                .addGap(0, 25, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNCamas)
                    .addComponent(tfNCamas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrCamas, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoCama)
                    .addComponent(rbIndividual)
                    .addComponent(rbCasalTwin)
                    .addComponent(rbIndividualBliche))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblErrTipoCama, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Custo"));

        lblTipoCusto.setText("*Tipo Custo:");

        lblCusto.setText("*Custo:");

        buttonGroup2.add(rbQuarto);
        rbQuarto.setText("Quarto");

        buttonGroup2.add(rbCama);
        rbCama.setText("Cama");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblTipoCusto)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rbQuarto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbCama))
                            .addComponent(lblErrTipoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblCusto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblErrCusto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfCusto))
                        .addGap(10, 10, 10))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCusto)
                    .addComponent(tfCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(lblErrCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipoCusto)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbQuarto)
                        .addComponent(rbCama)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addComponent(lblErrTipoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        lblTitulo.setText("Quarto");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Designação"));

        lblDesign.setText("*Designação:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDesign)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblErrDesign, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfDesign))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDesign)
                    .addComponent(tfDesign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrDesign, javax.swing.GroupLayout.DEFAULT_SIZE, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(btnOk)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator1)
                    .addComponent(lblTitulo))
                .addGap(154, 154, 154))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOk)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        adicionarQuarto();
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.fireCancelarAdicionarQuartoClicadoEvent();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnOk;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCusto;
    private javax.swing.JLabel lblDesign;
    private javax.swing.JLabel lblErrCamas;
    private javax.swing.JLabel lblErrCusto;
    private javax.swing.JLabel lblErrDesign;
    private javax.swing.JLabel lblErrTipoCama;
    private javax.swing.JLabel lblErrTipoCusto;
    private javax.swing.JLabel lblNCamas;
    private javax.swing.JLabel lblTipoCama;
    private javax.swing.JLabel lblTipoCusto;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rbCama;
    private javax.swing.JRadioButton rbCasalTwin;
    private javax.swing.JRadioButton rbIndividual;
    private javax.swing.JRadioButton rbIndividualBliche;
    private javax.swing.JRadioButton rbQuarto;
    private javax.swing.JTextField tfCusto;
    private javax.swing.JTextField tfDesign;
    private javax.swing.JTextField tfNCamas;
    // End of variables declaration//GEN-END:variables

    public void adicionarQuarto() {
        lblErrCamas.setText("");
        lblErrCamas.setForeground(Color.red);
        lblErrTipoCama.setText("");
        lblErrTipoCama.setForeground(Color.red);
        lblErrCusto.setText("");
        lblErrCusto.setForeground(Color.red);
        lblErrTipoCusto.setText("");
        lblErrTipoCusto.setForeground(Color.red);
        lblErrDesign.setText("");
        lblErrDesign.setForeground(Color.red);

        boolean isOk = true;

        if (tfDesign.getText().isEmpty()) {
            lblErrDesign.setText("Insira uma designacao");
            isOk = false;
        }
        if (tfNCamas.getText().isEmpty()) {
            lblErrCamas.setText("Insira o numero de camas");
            isOk = false;
        }
        if (!rbCasalTwin.isSelected() && !rbIndividual.isSelected() && !rbIndividualBliche.isSelected()) {
            lblErrTipoCama.setText("Escolha um tipo de Cama!");
            isOk = false;
        }
        if (tfCusto.getText().isEmpty()) {
            lblErrCusto.setText("Insira um valor para o custo");
            isOk = false;
        }
        if (!rbCama.isSelected() && !rbQuarto.isSelected()) {
            lblErrTipoCusto.setText("Escolha um tipo de Quarto.");
            isOk = false;
        }

        if (isOk) {
            String tipoCama = null;
            String tipoCusto = null;
            if (rbIndividual.isSelected()) {
                tipoCama = "Individual";
            } else if (rbCasalTwin.isSelected()) {
                tipoCama = "Casal ou Twin";
            } else if (rbIndividualBliche.isSelected()) {
                tipoCama = "Individual ou bliche";
            }
            if (rbQuarto.isSelected()) {
                tipoCusto = "Quarto";
            } else if (rbCama.isSelected()) {
                tipoCusto = "Pensao";
            }

            Quarto quarto = new Quarto(tfDesign.getText(), tfNCamas.getText(), tipoCama, tfCusto.getText(), tipoCusto);
            //selecionar os radio buttons
            DadosAplicacao.getInstance().addQuarto(quarto);
            JOptionPane.showMessageDialog(this, "Quarto Inserido com Sucesso!", "Inserção Realizada Com Sucesso", JOptionPane.INFORMATION_MESSAGE);
            this.fireConfirmarAdicionarQuartoClicadoEvent();

        }

    }
}
