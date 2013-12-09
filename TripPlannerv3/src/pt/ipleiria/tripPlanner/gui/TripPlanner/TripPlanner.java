package pt.ipleiria.tripPlanner.gui.TripPlanner;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JPanel;
import pt.ipleiria.tripPlanner.gui.events.AlojamentoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.AlojamentoClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.AssociarEtapasClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.AssociarEtapasClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.AssociarViagensClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.AssociarViagensClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.CompararCenarioAlojamentoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.CompararCenarioAlojamentoClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.ConfirmarAssociacaoViagensEvent;
import pt.ipleiria.tripPlanner.gui.events.ConfirmarAssociacaoViagensListener;
import pt.ipleiria.tripPlanner.gui.events.ConfirmarClicadoAlojamentoEvent;
import pt.ipleiria.tripPlanner.gui.events.ConfirmarClicadoAlojamentoListener;
import pt.ipleiria.tripPlanner.gui.events.ConfirmarClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.ConfirmarClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.ConfirmarInsercaoViagensEvent;
import pt.ipleiria.tripPlanner.gui.events.ConfirmarInsercaoViagensListener;
import pt.ipleiria.tripPlanner.gui.events.CriarEditarAlojamentoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.CriarEditarAlojamentoClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.EditarCenarioAlojamentoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.EditarCenarioAlojamentoClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.EditarEtapasClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.EditarEtapasClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.EditarParticipantesClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.EditarParticipantesClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.EtapasClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.EtapasClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.GestaoCenarioAlojamentoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.GestaoCenarioAlojamentoClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.InserirCenarioAlojamentoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.InserirCenarioAlojamentoClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.InserirEtapasClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.InserirEtapasClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.InserirParticipantesClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.InserirParticipantesClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.InserirViagemClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.InserirViagemClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.LoginEfetuadoEvent;
import pt.ipleiria.tripPlanner.gui.events.LoginEfetuadoListener;
import pt.ipleiria.tripPlanner.gui.events.MenuCenariosClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.MenuCenariosClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.OkAssociarEtapasClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.OkAssociarEtapasClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.OkEditarCenarioAlojamentoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.OkEditarCenarioAlojamentoClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.OkInserirCenarioAlojamentoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.OkInserirCenarioAlojamentoClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.OkInserirEtapasClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.OkInserirEtapasClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.OkVisualizarEtapasClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.OkVisualizarEtapasClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.ParticipantesClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.ParticipantesClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.PrimeiroLoginEfetuadoEvent;
import pt.ipleiria.tripPlanner.gui.events.PrimeiroLoginEfetuadoListener;
import pt.ipleiria.tripPlanner.gui.events.TerminarSessaoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.TerminarSessaoClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.ViagensClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.ViagensClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.VisualizarAlojamentoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.VisualizarAlojamentoClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.VisualizarCenarioAlojamentoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.VisualizarCenarioAlojamentoClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.VisualizarEtapasClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.VisualizarEtapasClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.VisualizarParticipantesClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.VisualizarParticipantesClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.VoltarGestaoCenarioAlojamentoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.VoltarGestaoCenarioAlojamentoClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.VoltarMenuCenariosClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.VoltarMenuCenariosClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.VoltarMenuPrincipalEvent;
import pt.ipleiria.tripPlanner.gui.events.VoltarMenuPrincipalListener;
import pt.ipleiria.tripPlanner.gui.participantes.MostrarParticipante;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ricardo
 */
public class TripPlanner extends javax.swing.JFrame implements LoginEfetuadoListener, ParticipantesClicadoListener, InserirParticipantesClicadoListener, EditarParticipantesClicadoListener, VisualizarParticipantesClicadoListener, ConfirmarClicadoListener, CriarEditarAlojamentoClicadoListener, VisualizarAlojamentoClicadoListener, AlojamentoClicadoListener, VisualizarCenarioAlojamentoClicadoListener, CompararCenarioAlojamentoClicadoListener, ViagensClicadoListener, InserirViagemClicadoListener, ConfirmarInsercaoViagensListener, VoltarMenuPrincipalListener, AssociarViagensClicadoListener, ConfirmarAssociacaoViagensListener, EtapasClicadoListener, InserirEtapasClicadoListener, EditarEtapasClicadoListener, VisualizarEtapasClicadoListener,
        AssociarEtapasClicadoListener, OkInserirEtapasClicadoListener, OkVisualizarEtapasClicadoListener,
        OkAssociarEtapasClicadoListener, GestaoCenarioAlojamentoClicadoListener, MenuCenariosClicadoListener,
        InserirCenarioAlojamentoClicadoListener, EditarCenarioAlojamentoClicadoListener, OkInserirCenarioAlojamentoClicadoListener,
        OkEditarCenarioAlojamentoClicadoListener, VoltarGestaoCenarioAlojamentoClicadoListener, ConfirmarClicadoAlojamentoListener, VoltarMenuCenariosClicadoListener, TerminarSessaoClicadoListener, PrimeiroLoginEfetuadoListener {

    /**
     * Creates new form TripPlanner
     */
    public TripPlanner() {
        initComponents();
        this.login.addLoginEfetuadoListener(this);
        this.menuPrincipal.addParticipantesClicadoListener(this);
        this.menuPrincipal.addAlojamentoClicadoListener(this);
//        this.menuParticipantes.addInserirParticipantesClicadoListener(this);
//        this.menuParticipantes.addEditarParticipantesClicadoListener(this);
//        this.menuParticipantes.addVisualizarParticipantesClicadoListener(this);
//        this.inserirEditarParticipante.addConfirmarClicadoListener(this);
//        this.mostrarParticipante.addConfirmarClicadoListener(this);
//        this.gestaodeAlojamentos.addCriarEditarAlojamentoClicadoListener(this);
//        this.gestaodeAlojamentos.addVisualizarAlojamentoClicadoListener(this);
//        this.gestaodeCenariodeAlojamento.addVisualizarCenarioAlojamentoClicadoListener(this);
//        this.gestaodeCenariodeAlojamento.addCompararCenarioAlojamentoClicadoListener(this);
        this.menuPrincipal.addViagensListener(this);
//        this.gestaodeViagens.addInserirViagemClicadoListener(this);
//        this.inserirEditarViagens.addConfirmarInsercaoViagensListener(this);
//        this.gestaodeViagens.addVoltarMenuPrincipalListener(this);
//        this.gestaodeViagens.addAssociarViagensClicadoListener(this);
//        this.associarViagens.addConfirmarAssociacaoViagensListener(this);
//        this.menuParticipantes.addVoltarMenuPrincipalListener(this);
//        this.gestaodeCenariodeAlojamento.addVoltarMenuCenariosClicadoListener(this);
        this.menuPrincipal.addEtapasClicadoListener(this);
//        this.gestaodeEtapas.addInserirEtapasClicadoListener(this);
//        this.gestaodeEtapas.addEditarEtapasClicadoListener(this);
//        this.gestaodeEtapas.addVisualizarEtapasClicadoListener(this);
//        this.gestaodeEtapas.addAssociarEtapasClicadoListener(this);
//        this.inserirEditarEtapa.addOkInserirEtapasClicadoListener(this);
//        this.visualizarEtapa.addOkVisualizarEtapasClicadoListener(this);
//        this.associarEtapas.addOkAssociarEtapasClicadoListener(this);
        this.menuPrincipal.addMenuCenariosClicadoListener(this);
        this.menuCenarios.addGestaoCenarioAlojamentoClicadoListener(this);
//        this.gestaodeCenariodeAlojamento.addInserirCenarioAlojamentoClicadoListener(this);
//        this.gestaodeCenariodeAlojamento.addEditarCenarioAlojamentoClicadoListener(this);
//        this.criarEditarCenarioAlojamento.addOkInserirCenarioAlojamentoClicadoListener(this);
        //this.gestaodeCenariodeAlojamento.addVoltarGestaoCenarioAlojamentoClicadoListener(this);
//        this.gestaodeEtapas.addVoltarMenuPrincipalListener(this);
//        this.criarEditarAlojamento.addConfirmarClicadoAlojamentoistener(this);
//        this.mostrarAlojamento.addConfirmarClicadoAlojamentoistener(this);
//        this.gestaodeAlojamentos.addVoltarMenuPrincipalListener(this);
//        this.mostrarCenarioAlojamento.addOkInserirCenarioAlojamentoClicadoListener(this);
//        this.compararCenarioAlojamento.addOkInserirCenarioAlojamentoClicadoListener(this);
        this.menuCenarios.addVoltarMenuPrincipalListener(this);
        this.menuPrincipal.addTerminarSessaoClicadoListener(this);
        this.dadosAcesso1.addTerminarSessaoClicadoListener(this);
       jPanel1.setPreferredSize(new Dimension(400, 300));
        
        Component[] components = jPanel1.getComponents();
        for (Component component : components) {
            if (component instanceof JPanel) {
                ((JPanel) component).setPreferredSize(new Dimension(400, 300)); //tamanho default do panel
                ((JPanel) component).setMinimumSize(new Dimension(400, 300)); //o tamanho minimo do painel
                ((JPanel) component).setMaximumSize(new Dimension(400, 300)); //o tamanho maximo do painel
                

            }
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

        jPanel1 = new javax.swing.JPanel();
        login = new pt.ipleiria.tripPlanner.gui.TripPlanner.Login();
        menuPrincipal = new pt.ipleiria.tripPlanner.gui.TripPlanner.MenuPrincipal();
        menuCenarios = new pt.ipleiria.tripPlanner.gui.TripPlanner.MenuCenarios();
        dadosAcesso1 = new pt.ipleiria.tripPlanner.gui.TripPlanner.DadosAcesso();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(640, 480));
        setMinimumSize(new java.awt.Dimension(640, 480));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(640, 480));
        jPanel1.setMinimumSize(new java.awt.Dimension(640, 480));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(640, 480));
        jPanel1.setLayout(new java.awt.CardLayout());
        jPanel1.add(login, "login");
        jPanel1.add(menuPrincipal, "menuPrincipal");
        jPanel1.add(menuCenarios, "card3");
        jPanel1.add(dadosAcesso1, "card5");

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Windows look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TripPlanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TripPlanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TripPlanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TripPlanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TripPlanner().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private pt.ipleiria.tripPlanner.gui.TripPlanner.DadosAcesso dadosAcesso1;
    private javax.swing.JPanel jPanel1;
    private pt.ipleiria.tripPlanner.gui.TripPlanner.Login login;
    private pt.ipleiria.tripPlanner.gui.TripPlanner.MenuCenarios menuCenarios;
    private pt.ipleiria.tripPlanner.gui.TripPlanner.MenuPrincipal menuPrincipal;
    // End of variables declaration//GEN-END:variables

    @Override
    public void loginEfetuado(LoginEfetuadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "menuPrincipal");
        menuPrincipal.atualizar();
    }

    @Override
    public void participantesClicado(ParticipantesClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "menuParticipantes");
    }

    @Override
    public void InserirParticipantesClicado(InserirParticipantesClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "inserirEditarParticipante");
    }

    @Override
    public void EditarParticipantesClicado(EditarParticipantesClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "inserirEditarParticipante");
    }

    @Override
    public void visualizarParticipantesClicado(VisualizarParticipantesClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        mostrarParticipante.preencherCampos(evt.getParticipante());
        cl.show(this.jPanel1, "mostrarParticipante");
    }

    @Override
    public void confirmarClicado(ConfirmarClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "menuParticipantes");
    }

    @Override
    public void criarEditarAlojamentoClicado(CriarEditarAlojamentoClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "criarEditarAlojamento");
    }

    @Override
    public void visualizarAlojamentoClicado(VisualizarAlojamentoClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "mostrarAlojamento");
    }

    @Override
    public void alojamentosClicado(AlojamentoClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "gestaodeAlojamentos");
    }

    @Override
    public void visualizarCenarioAlojamentoClicado(VisualizarCenarioAlojamentoClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "mostrarCenarioAlojamento");
    }

    @Override
    public void compararCenarioAlojamentoClicado(CompararCenarioAlojamentoClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "compararCenarioAlojamento");
    }

    @Override
    public void viagensClicado(ViagensClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "gestaodeViagens");
    }

    @Override
    public void inserirViagemClicado(InserirViagemClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "inserirEditarViagens");
    }

    @Override
    public void confirmarInsercaoViagens(ConfirmarInsercaoViagensEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "gestaodeViagens");
    }

    @Override
    public void voltarMenuPrincipal(VoltarMenuPrincipalEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "menuPrincipal");
    }

    @Override
    public void associarViagensClicado(AssociarViagensClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "associarViagens");
    }

    @Override
    public void confirmarAssociacaoViagens(ConfirmarAssociacaoViagensEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "gestaodeViagens");
    }

    @Override
    public void etapasClicado(EtapasClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "gestaodeEtapas");
    }

    @Override
    public void inserirEtapasClicado(InserirEtapasClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "inserirEditarEtapa");
    }

    @Override
    public void editarEtapasClicado(EditarEtapasClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "inserirEditarEtapa");
    }

    @Override
    public void visualizarEtapasClicado(VisualizarEtapasClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "visualizarEtapa");
    }

    @Override
    public void associarEtapasClicado(AssociarEtapasClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "associarEtapas");
    }

    @Override
    public void okInserirEtapasClicado(OkInserirEtapasClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "gestaodeEtapas");
    }

    @Override
    public void okVisualizarEtapasClicado(OkVisualizarEtapasClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "gestaodeEtapas");
    }

    @Override
    public void okAssociarEtapasClicado(OkAssociarEtapasClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "gestaodeEtapas");
    }

    @Override
    public void gestaoCenarioAlojamentoClicado(GestaoCenarioAlojamentoClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "gestaodeCenariodeAlojamento");
    }

    @Override
    public void menuCenariosClicado(MenuCenariosClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "menuCenarios");
    }

    @Override
    public void inserirCenarioAlojamentoClicado(InserirCenarioAlojamentoClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "criarEditarCenarioAlojamento");
    }

    @Override
    public void editarCenarioAlojamentoClicado(EditarCenarioAlojamentoClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "criarEditarCenarioAlojamento");
    }

    @Override
    public void okInserirCenarioAlojamentoClicado(OkInserirCenarioAlojamentoClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "gestaodeCenariodeAlojamento");
    }

    @Override
    public void okEditarCenarioAlojamentoClicado(OkEditarCenarioAlojamentoClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "gestaodeCenariodeAlojamento");
    }

    @Override
    public void voltarGestaoCenarioAlojamentoClicado(VoltarGestaoCenarioAlojamentoClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "menuCenarios");
    }

    @Override
    public void confirmarClicadoAlojamento(ConfirmarClicadoAlojamentoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "gestaodeAlojamentos");
    }

    @Override
    public void voltarMenuCenariosAlojamentoClicado(VoltarMenuCenariosClicadoEvent evt) {
                CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "menuCenarios");
    }

    @Override
    public void terminarSessaoClicado(TerminarSessaoClicadoEvent evt) {
                 CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "login");
    }

    @Override
    public void primeiroLoginEfetuado(PrimeiroLoginEfetuadoEvent evento) {
        
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        dadosAcesso.receberParticipante(evento.getParticipante());
        cl.show(this.jPanel1, "primeiroLogin");
    }
    
    
}
