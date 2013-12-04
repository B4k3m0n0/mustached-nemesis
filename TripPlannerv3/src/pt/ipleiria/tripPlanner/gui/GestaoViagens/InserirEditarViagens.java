/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipleiria.tripPlanner.gui.GestaoViagens;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import pt.ipleiria.tripPlanner.gui.events.ConfirmarInsercaoViagensEvent;
import pt.ipleiria.tripPlanner.gui.events.ConfirmarInsercaoViagensListener;

/**
 *
 * @author DELL
 */
public class InserirEditarViagens extends javax.swing.JPanel {

    private List<ConfirmarInsercaoViagensListener> confirmarInsercaoViagensListener;

    /**
     * Creates new form InserirEditarViagens
     */
    public InserirEditarViagens() {
        initComponents();
        this.confirmarInsercaoViagensListener = new ArrayList<>();
    }

    public synchronized void addConfirmarInsercaoViagensListener(ConfirmarInsercaoViagensListener listener) {
        this.confirmarInsercaoViagensListener.add(listener);
    }

    public synchronized void removeConfirmarInsercaoViagensListener(ConfirmarInsercaoViagensListener listener) {
        this.confirmarInsercaoViagensListener.remove(listener);
    }

    protected synchronized void fireConfirmarInsercaoViagensListener() {
        for (ConfirmarInsercaoViagensListener listener : this.confirmarInsercaoViagensListener) {
            ConfirmarInsercaoViagensEvent evento = new ConfirmarInsercaoViagensEvent(this);
            listener.confirmarInsercaoViagens(evento);
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

        lblDesignacao = new javax.swing.JLabel();
        lblEtapas = new javax.swing.JLabel();
        spListaEtapas = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        btnAdicionarEtapas = new javax.swing.JButton();
        btnRemoverEtapas = new javax.swing.JButton();
        lblAlojamentos = new javax.swing.JLabel();
        spListaAlojamentos = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();
        btnAdicionarAlojamentos = new javax.swing.JButton();
        btnRemoverAlojamentos = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        tfDesignacao = new javax.swing.JTextField();
        lblTipoViagem = new javax.swing.JLabel();
        cbTipoViagem = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(640, 480));
        setMinimumSize(new java.awt.Dimension(640, 480));

        lblDesignacao.setText("Designação");

        lblEtapas.setText("Etapas");

        jList2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        spListaEtapas.setViewportView(jList2);

        btnAdicionarEtapas.setText("+");

        btnRemoverEtapas.setText("-");

        lblAlojamentos.setText("Alojamentos");

        jList3.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        spListaAlojamentos.setViewportView(jList3);

        btnAdicionarAlojamentos.setText("+");

        btnRemoverAlojamentos.setText("-");

        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");

        lblTipoViagem.setText("Tipo Viagem");

        cbTipoViagem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDesignacao)
                        .addGap(18, 18, 18)
                        .addComponent(tfDesignacao, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTipoViagem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbTipoViagem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAlojamentos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spListaAlojamentos))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEtapas)
                                .addGap(36, 36, 36)
                                .addComponent(spListaEtapas, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAdicionarEtapas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdicionarAlojamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRemoverEtapas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRemoverAlojamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(326, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addGap(105, 105, 105))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDesignacao)
                    .addComponent(tfDesignacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoViagem)
                    .addComponent(cbTipoViagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEtapas)
                    .addComponent(spListaEtapas, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdicionarEtapas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemoverEtapas)))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAlojamentos)
                    .addComponent(spListaAlojamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdicionarAlojamentos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemoverAlojamentos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOk)
                    .addComponent(btnCancelar))
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        if (tfDesignacao.getText().isEmpty()) {
            JOptionPane.showMessageDialog(btnOk, "Campo Designação não preenchido");
        } else {
            this.fireConfirmarInsercaoViagensListener();
        }
    }//GEN-LAST:event_btnOkActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarAlojamentos;
    private javax.swing.JButton btnAdicionarEtapas;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnRemoverAlojamentos;
    private javax.swing.JButton btnRemoverEtapas;
    private javax.swing.JComboBox cbTipoViagem;
    private javax.swing.JList jList2;
    private javax.swing.JList jList3;
    private javax.swing.JLabel lblAlojamentos;
    private javax.swing.JLabel lblDesignacao;
    private javax.swing.JLabel lblEtapas;
    private javax.swing.JLabel lblTipoViagem;
    private javax.swing.JScrollPane spListaAlojamentos;
    private javax.swing.JScrollPane spListaEtapas;
    private javax.swing.JTextField tfDesignacao;
    // End of variables declaration//GEN-END:variables
}
