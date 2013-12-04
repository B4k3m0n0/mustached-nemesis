package pt.ipleiria.tripPlanner.gui.GestaoAlojamento;

import java.util.ArrayList;
import java.util.List;
import pt.ipleiria.tripPlanner.gui.GestaoLocalidades.*;
import pt.ipleiria.tripPlanner.gui.cenario.*;
import pt.ipleiria.tripPlanner.gui.events.CriarEditarAlojamentoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.CriarEditarAlojamentoClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.VisualizarAlojamentoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.VisualizarAlojamentoClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.VoltarMenuPrincipalEvent;
import pt.ipleiria.tripPlanner.gui.events.VoltarMenuPrincipalListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class GestaodeAlojamentos extends javax.swing.JPanel {

    private List<CriarEditarAlojamentoClicadoListener> criarEditarAlojamentoClicadoListener;
    private List<VisualizarAlojamentoClicadoListener> visualizarAlojamentoClicadoListener;
    private List<VoltarMenuPrincipalListener> voltarMenuPrincipalListener;
    /**
     * Creates new form GestãodeCenáriodeAlojamento
     */
    public GestaodeAlojamentos() {
        initComponents();
        
        this.criarEditarAlojamentoClicadoListener = new ArrayList<>();
        this.visualizarAlojamentoClicadoListener = new ArrayList<>();
        this.voltarMenuPrincipalListener = new ArrayList<>();
    }
    
    public synchronized void addCriarEditarAlojamentoClicadoListener(CriarEditarAlojamentoClicadoListener listener){
        this.criarEditarAlojamentoClicadoListener.add(listener);
    }
    
    public synchronized void removeCriarEditarAlojamentoClicadoListener(CriarEditarAlojamentoClicadoListener listener){
        this.criarEditarAlojamentoClicadoListener.remove(listener);
    }

    protected synchronized void fireCriarEditarAlojamentoClicadoEvent(){
        for(CriarEditarAlojamentoClicadoListener listener : this.criarEditarAlojamentoClicadoListener){
        CriarEditarAlojamentoClicadoEvent evento = new CriarEditarAlojamentoClicadoEvent(this);
        listener.criarEditarAlojamentoClicado(evento);
        }
    }
    
    public synchronized void addVisualizarAlojamentoClicadoListener(VisualizarAlojamentoClicadoListener listener){
        this.visualizarAlojamentoClicadoListener.add(listener);
    }
    
    public synchronized void removeVisualizarAlojamentoClicadoListener(VisualizarAlojamentoClicadoListener listener){
        this.visualizarAlojamentoClicadoListener.remove(listener);
    }

    protected synchronized void fireVisualizarAlojamentoClicadoEvent(){
        for(VisualizarAlojamentoClicadoListener listener : this.visualizarAlojamentoClicadoListener){
        VisualizarAlojamentoClicadoEvent evento = new VisualizarAlojamentoClicadoEvent(this);
        listener.visualizarAlojamentoClicado(evento);
        }
    }
    
        public synchronized void addVoltarMenuPrincipalListener(VoltarMenuPrincipalListener listener){
        this.voltarMenuPrincipalListener.add(listener);
    }
    
    public synchronized void removeVoltarMenuPrincipalListener(VoltarMenuPrincipalListener listener){
        this.voltarMenuPrincipalListener.remove(listener);
    }

    protected synchronized void fireVoltarMenuPrincipalEvent(){
        for(VoltarMenuPrincipalListener listener : this.voltarMenuPrincipalListener){
        VoltarMenuPrincipalEvent evento = new VoltarMenuPrincipalEvent(this);
        listener.voltarMenuPrincipal(evento);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jbCriar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbPesquisar = new javax.swing.JButton();
        jbVoltar = new javax.swing.JButton();
        tfPesquisar = new javax.swing.JTextField();
        lblAlojamentos = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(640, 480));
        setMinimumSize(new java.awt.Dimension(640, 480));

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jbCriar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/ipleiria/tripPlanner/gui/Imagens/Inserir1.png"))); // NOI18N
        jbCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCriarActionPerformed(evt);
            }
        });

        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/ipleiria/tripPlanner/gui/Imagens/eliminar1.png"))); // NOI18N

        jbEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/ipleiria/tripPlanner/gui/Imagens/editar.png"))); // NOI18N
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/ipleiria/tripPlanner/gui/Imagens/lupa.png"))); // NOI18N
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        jbVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/ipleiria/tripPlanner/gui/Imagens/back-trans.png"))); // NOI18N
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });

        tfPesquisar.setText("Pesquisar");

        lblAlojamentos.setText("Alojamentos");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/ipleiria/tripPlanner/gui/Imagens/synchronize_256.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Alojamento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfPesquisar)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jbCriar)
                                    .addGap(28, 28, 28)
                                    .addComponent(jbEliminar)
                                    .addGap(40, 40, 40)
                                    .addComponent(jbEditar)))
                            .addComponent(lblAlojamentos))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jbVoltar)
                            .addComponent(jbPesquisar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel1)))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jbPesquisar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAlojamentos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbEditar)
                        .addComponent(jbVoltar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbCriar)
                        .addComponent(jbEliminar)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCriarActionPerformed
        this.fireCriarEditarAlojamentoClicadoEvent();
    }//GEN-LAST:event_jbCriarActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
       this.fireCriarEditarAlojamentoClicadoEvent();
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        this.fireVisualizarAlojamentoClicadoEvent();
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
        this.fireVoltarMenuPrincipalEvent();
    }//GEN-LAST:event_jbVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCriar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JLabel lblAlojamentos;
    private javax.swing.JTextField tfPesquisar;
    // End of variables declaration//GEN-END:variables
}
