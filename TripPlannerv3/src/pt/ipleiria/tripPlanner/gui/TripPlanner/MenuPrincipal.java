package pt.ipleiria.tripPlanner.gui.TripPlanner;

import java.util.ArrayList;
import java.util.List;
import pt.ipleiria.tripPlanner.gui.Models.DadosAplicacao;
import pt.ipleiria.tripPlanner.gui.Models.Participante;
import pt.ipleiria.tripPlanner.gui.events.AlojamentoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.AlojamentoClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.EtapasClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.EtapasClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.MenuCenariosClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.MenuCenariosClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.ParticipantesClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.ParticipantesClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.TerminarSessaoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.TerminarSessaoClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.ViagensClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.ViagensClicadoListener;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ricardo
 */
public class MenuPrincipal extends javax.swing.JPanel {

    private List<ParticipantesClicadoListener> participantesClicadoListener;
    private List<AlojamentoClicadoListener> alojamentoClicadoListener;
    private List<ViagensClicadoListener> viagensClicadoListener;
    private List<EtapasClicadoListener> etapasClicadoListener;
    private List<MenuCenariosClicadoListener> menuCenariosClicadoListener;
    private List<TerminarSessaoClicadoListener> terminarSessaoClicadoListener;

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();

        this.participantesClicadoListener = new ArrayList<>();
        this.alojamentoClicadoListener = new ArrayList<>();
        this.viagensClicadoListener = new ArrayList<>();
        this.etapasClicadoListener = new ArrayList<>();
        this.menuCenariosClicadoListener = new ArrayList<>();
        this.terminarSessaoClicadoListener = new ArrayList<>();
    }

    public synchronized void addParticipantesClicadoListener(ParticipantesClicadoListener listener) {
        this.participantesClicadoListener.add(listener);
    }

    public synchronized void removeParticipantesClicadoListener(ParticipantesClicadoListener listener) {
        this.participantesClicadoListener.remove(listener);
    }

    protected synchronized void fireParticipantesClicadoEvent() {
        for (ParticipantesClicadoListener listener : this.participantesClicadoListener) {
            ParticipantesClicadoEvent evento = new ParticipantesClicadoEvent(this);
            listener.participantesClicado(evento);
        }
    }

    public synchronized void addAlojamentoClicadoListener(AlojamentoClicadoListener listener) {
        this.alojamentoClicadoListener.add(listener);
    }

    public synchronized void removeAlojamentoClicadoListener(AlojamentoClicadoListener listener) {
        this.alojamentoClicadoListener.remove(listener);
    }

    protected synchronized void fireAlojamentoClicadoEvent() {
        for (AlojamentoClicadoListener listener : this.alojamentoClicadoListener) {
            AlojamentoClicadoEvent evento = new AlojamentoClicadoEvent(this);
            listener.alojamentosClicado(evento);
        }
    }

    public synchronized void addViagensListener(ViagensClicadoListener listener) {
        this.viagensClicadoListener.add(listener);
    }

    public synchronized void removeViagensListener(ViagensClicadoListener listener) {
        this.viagensClicadoListener.remove(listener);
    }

    protected synchronized void fireViagensClicadoEvent() {
        for (ViagensClicadoListener listener : this.viagensClicadoListener) {
            ViagensClicadoEvent evento = new ViagensClicadoEvent(this);
            listener.viagensClicado(evento);
        }
    }

    public synchronized void addEtapasClicadoListener(EtapasClicadoListener listener) {
        this.etapasClicadoListener.add(listener);
    }

    public synchronized void removeEtapasClicadoListener(EtapasClicadoListener listener) {
        this.etapasClicadoListener.remove(listener);
    }

    protected synchronized void fireEtapasClicadoEvent() {
        for (EtapasClicadoListener listener : this.etapasClicadoListener) {
            EtapasClicadoEvent evento = new EtapasClicadoEvent(this);
            listener.etapasClicado(evento);
        }
    }

    public synchronized void addMenuCenariosClicadoListener(MenuCenariosClicadoListener listener) {
        this.menuCenariosClicadoListener.add(listener);
    }

    public synchronized void removeMenuCenariosClicadoListener(MenuCenariosClicadoListener listener) {
        this.menuCenariosClicadoListener.remove(listener);
    }

    protected synchronized void fireMenuCenariosClicadoEvent() {
        for (MenuCenariosClicadoListener listener : this.menuCenariosClicadoListener) {
            MenuCenariosClicadoEvent evento = new MenuCenariosClicadoEvent(this);
            listener.menuCenariosClicado(evento);
        }
    }


    public synchronized void addTerminarSessaoClicadoListener(TerminarSessaoClicadoListener listener) {
        this.terminarSessaoClicadoListener.add(listener);
    }

    public synchronized void removeTerminarSessaoClicadoListener(TerminarSessaoClicadoListener listener) {
        this.terminarSessaoClicadoListener.remove(listener);
    }

    protected synchronized void fireTerminarSessaoClicadoEvent() {
        for (TerminarSessaoClicadoListener listener : this.terminarSessaoClicadoListener) {
            TerminarSessaoClicadoEvent evento = new TerminarSessaoClicadoEvent(this);
            listener.terminarSessaoClicado(evento);
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

        btnParticipantes = new javax.swing.JButton();
        btnViagens = new javax.swing.JButton();
        btnEtapas = new javax.swing.JButton();
        btnAlojamento = new javax.swing.JButton();
        btnLocalidades = new javax.swing.JButton();
        btnDeslocacoes = new javax.swing.JButton();
        btnCenarios = new javax.swing.JButton();
        btnDespesas = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        lblWelcome = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(640, 480));
        setMinimumSize(new java.awt.Dimension(640, 480));
        setPreferredSize(new java.awt.Dimension(640, 480));

        btnParticipantes.setBackground(new java.awt.Color(255, 255, 255));
        btnParticipantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/ipleiria/tripPlanner/gui/Imagens/utilizador.png"))); // NOI18N
        btnParticipantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParticipantesActionPerformed(evt);
            }
        });

        btnViagens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/ipleiria/tripPlanner/gui/Imagens/viagem.png"))); // NOI18N
        btnViagens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViagensActionPerformed(evt);
            }
        });

        btnEtapas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/ipleiria/tripPlanner/gui/Imagens/iconRouting.png"))); // NOI18N
        btnEtapas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEtapasActionPerformed(evt);
            }
        });

        btnAlojamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/ipleiria/tripPlanner/gui/Imagens/alojamento.png"))); // NOI18N
        btnAlojamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlojamentoActionPerformed(evt);
            }
        });

        btnLocalidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/ipleiria/tripPlanner/gui/Imagens/localidades 12.png"))); // NOI18N

        btnDeslocacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/ipleiria/tripPlanner/gui/Imagens/deslocacao.png"))); // NOI18N

        btnCenarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/ipleiria/tripPlanner/gui/Imagens/cenario.png"))); // NOI18N
        btnCenarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCenariosActionPerformed(evt);
            }
        });

        btnDespesas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/ipleiria/tripPlanner/gui/Imagens/fundoManeio.png"))); // NOI18N

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/ipleiria/tripPlanner/gui/Imagens/TerminarSessao.png"))); // NOI18N
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        lblWelcome.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLocalidades)
                            .addComponent(btnParticipantes))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnViagens)
                            .addComponent(btnDeslocacoes))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEtapas)
                            .addComponent(btnCenarios))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLogout)
                            .addComponent(btnAlojamento)
                            .addComponent(btnDespesas)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnParticipantes)
                    .addComponent(btnViagens)
                    .addComponent(btnEtapas)
                    .addComponent(btnAlojamento))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLocalidades)
                    .addComponent(btnDeslocacoes)
                    .addComponent(btnCenarios)
                    .addComponent(btnDespesas))
                .addGap(26, 26, 26)
                .addComponent(lblWelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViagensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViagensActionPerformed
        this.fireViagensClicadoEvent();
    }//GEN-LAST:event_btnViagensActionPerformed

    private void btnParticipantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParticipantesActionPerformed
        this.fireParticipantesClicadoEvent();
    }//GEN-LAST:event_btnParticipantesActionPerformed

    private void btnAlojamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlojamentoActionPerformed
        this.fireAlojamentoClicadoEvent();
    }//GEN-LAST:event_btnAlojamentoActionPerformed

    private void btnEtapasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEtapasActionPerformed
        this.fireEtapasClicadoEvent();
    }//GEN-LAST:event_btnEtapasActionPerformed

    private void btnCenariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCenariosActionPerformed
        this.fireMenuCenariosClicadoEvent();
    }//GEN-LAST:event_btnCenariosActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed

        DadosAplicacao.getInstance().setLogado(null);
        this.fireTerminarSessaoClicadoEvent();
    }//GEN-LAST:event_btnLogoutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlojamento;
    private javax.swing.JButton btnCenarios;
    private javax.swing.JButton btnDeslocacoes;
    private javax.swing.JButton btnDespesas;
    private javax.swing.JButton btnEtapas;
    private javax.swing.JButton btnLocalidades;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnParticipantes;
    private javax.swing.JButton btnViagens;
    private javax.swing.JLabel lblWelcome;
    // End of variables declaration//GEN-END:variables

    void atualizar() {
        lblWelcome.setText("Bem Vindo " + DadosAplicacao.getInstance().getLogado().getNome());
    }
}
