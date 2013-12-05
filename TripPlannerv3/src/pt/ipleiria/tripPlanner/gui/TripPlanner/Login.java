package pt.ipleiria.tripPlanner.gui.TripPlanner;

import com.sun.org.apache.xalan.internal.xsltc.runtime.BasisLibrary;
import pt.ipleiria.tripPlanner.gui.Models.Entrar;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import pt.ipleiria.tripPlanner.gui.Models.DadosAplicacao;
import pt.ipleiria.tripPlanner.gui.Models.Participante;
import pt.ipleiria.tripPlanner.gui.events.LoginEfetuadoEvent;
import pt.ipleiria.tripPlanner.gui.events.LoginEfetuadoListener;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ricardo
 */
public class Login extends javax.swing.JPanel {

    private List<LoginEfetuadoListener> loginEfetuadoListener;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();

        this.loginEfetuadoListener = new ArrayList<>();
    }

    public synchronized void addLoginEfetuadoListener(LoginEfetuadoListener listener) {
        this.loginEfetuadoListener.add(listener);
    }

    public synchronized void removeLoginEfetuadoListener(LoginEfetuadoListener listener) {
        this.loginEfetuadoListener.remove(listener);
    }

    protected synchronized void fireLoginEfetuadoEvent() {
        for (LoginEfetuadoListener listener : this.loginEfetuadoListener) {
            LoginEfetuadoEvent evento = new LoginEfetuadoEvent(this);
            listener.loginEfetuado(evento);
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

        lbUsername = new javax.swing.JLabel();
        lbPassword = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        tfUsername = new javax.swing.JTextField();
        pfPassword = new javax.swing.JPasswordField();
        lblTripPlanner = new javax.swing.JLabel();
        lblErros = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(640, 480));
        setMinimumSize(new java.awt.Dimension(640, 480));
        setPreferredSize(new java.awt.Dimension(640, 480));

        lbUsername.setText("Username");

        lbPassword.setText("Password");

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblTripPlanner.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTripPlanner.setText("Trip Planner");

        lblErros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblErros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lbPassword)
                                        .addGap(18, 18, 18)
                                        .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbUsername)
                                        .addGap(12, 12, 12)
                                        .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblTripPlanner)
                                    .addGap(54, 54, 54)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(btnLogin))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(lblErros, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(lblTripPlanner)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lbPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addComponent(lblErros)
                .addGap(14, 14, 14)
                .addComponent(btnLogin)
                .addContainerGap(176, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        confirmaLogin();
    }//GEN-LAST:event_btnLoginActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JLabel lblErros;
    private javax.swing.JLabel lblTripPlanner;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables

    int conta = 1;

    public void confirmaLogin() {
        lblErros.setText("");
        lblErros.setForeground(Color.red);
        if (pfPassword.getPassword().length <= 0 && tfUsername.getText().isEmpty()) {
            lblErros.setText("Introduza as credênciais!");
        } else {
            if (pfPassword.getPassword().length <= 0) {
                lblErros.setText("Não introduziu a palavra-passe!");
            } else {
                if (tfUsername.getText().isEmpty()) {
                    lblErros.setText("Não introduziu o username!");
                } else {
                    for (Participante participante : DadosAplicacao.getInstance().getParticipantes()) {
                        if (tfUsername.getText().equals(participante.getUsername())
                                && new String(pfPassword.getPassword()).equals(new String(participante.getPassword()))) {
                            fireLoginEfetuadoEvent();
                        } else {
                            if (conta < 3) {
                                lblErros.setText("Username ou Password errada. Tem mais " + (3-conta) + " tentativas!");
                            } else {
                                System.exit(0);
                            }
                        } 
                        conta++;
                    }
                }
            }
        }
    }
}