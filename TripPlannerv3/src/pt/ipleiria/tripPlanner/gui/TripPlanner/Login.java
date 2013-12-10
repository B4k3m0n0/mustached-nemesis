package pt.ipleiria.tripPlanner.gui.TripPlanner;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import pt.ipleiria.tripPlanner.gui.Models.DadosAplicacao;
import pt.ipleiria.tripPlanner.gui.Models.Participante;
import pt.ipleiria.tripPlanner.gui.events.LoginEfetuadoEvent;
import pt.ipleiria.tripPlanner.gui.events.LoginEfetuadoListener;
import pt.ipleiria.tripPlanner.gui.events.PrimeiroLoginEfetuadoEvent;
import pt.ipleiria.tripPlanner.gui.events.PrimeiroLoginEfetuadoListener;

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
    private List<PrimeiroLoginEfetuadoListener> primeiroLoginEfetuadoListener;
    private int conta = 0;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        
        this.loginEfetuadoListener = new ArrayList<>();
        this.primeiroLoginEfetuadoListener = new ArrayList<>();

//       setLayout(new BorderLayout());
//	JLabel background=new JLabel(new ImageIcon("C:\\Users\\Cristiano\\Desktop\\Ride-in-Israel_Bike-riders.jpg"));
//	add(background);
//	background.setLayout(new FlowLayout());
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

    public synchronized void addPrimeiroLoginEfetuadoListener(PrimeiroLoginEfetuadoListener listener) {
        this.primeiroLoginEfetuadoListener.add(listener);
    }

    public synchronized void removePrimeiroLoginEfetuadoListener(PrimeiroLoginEfetuadoListener listener) {
        this.primeiroLoginEfetuadoListener.remove(listener);
    }

    protected synchronized void firePrimeiroLoginEfetuadoEvent(Participante participante) {
        for (PrimeiroLoginEfetuadoListener listener : this.primeiroLoginEfetuadoListener) {
            PrimeiroLoginEfetuadoEvent evento = new PrimeiroLoginEfetuadoEvent(this, participante);
            listener.primeiroLoginEfetuado(evento);
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
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(640, 480));
        setMinimumSize(new java.awt.Dimension(640, 480));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(640, 480));

        lbUsername.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbUsername.setText("Username:");

        lbPassword.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbPassword.setText("Password:");

        btnLogin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        tfUsername.setText("jonny0015");
        tfUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EnterPressed(evt);
            }
        });

        pfPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EnterPressed(evt);
            }
        });

        lblTripPlanner.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        lblTripPlanner.setText("Trip Planner");

        lblErros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblErros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setText("(Se este o seu primeiro acesso use o seu BI como Username e Data de Nascimento como Password)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lbPassword)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pfPassword))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lbUsername)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTripPlanner)
                                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblErros, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(187, 187, 187))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogin)
                .addGap(292, 292, 292))
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel1)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(221, Short.MAX_VALUE)
                .addComponent(lblTripPlanner)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblErros, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        confirmaLogin();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void EnterPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EnterPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnLogin.doClick();
        }
    }//GEN-LAST:event_EnterPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JLabel lblErros;
    private javax.swing.JLabel lblTripPlanner;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables

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
                                && new String(pfPassword.getPassword()).equals(new String(participante.getPassword())) && !participante.isPrimeiroLogin()) {
                            DadosAplicacao.getInstance().setLogado(participante);
                            fireLoginEfetuadoEvent();
                            mudarNome();
                        } else if (participante.isPrimeiroLogin()) {
                            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

                            String dataNasc = formatter.format(participante.getDataNasc().getTime());
                            System.out.println(dataNasc);
                            System.out.println(new String(pfPassword.getPassword()).equals(dataNasc));
                            System.out.println(new String(pfPassword.getPassword()));
                            if (tfUsername.getText().equals(participante.getBI() + "") && new String(pfPassword.getPassword()).equals(dataNasc) && participante.isPrimeiroLogin()) {
                                mudarNome();
                                firePrimeiroLoginEfetuadoEvent(participante);

                            } else {
//                                if (conta < 4) {
                                lblErros.setText("Username ou Password errada.");// Tem mais " + (3 - conta + 1) + " tentativa(s)!");
//                                    conta++;
//                                } else {
//                                    System.exit(0);
//                                }
                            }
                        } else if (tfUsername.getText().equals(participante.getUsername())
                                && !new String(pfPassword.getPassword()).equals(new String(participante.getPassword()))) {
//                            if (conta < 4) {
                            lblErros.setText("Username ou Password errada.");// Tem mais " + (3 - conta + 1) + " tentativa(s)!");
//                                conta++;
//                            } else {
//                                System.exit(0);
//                            }
                        }
                    }
                }
            }
        }
    }

    public void mudarNome() {
        tfUsername.setText("");
        pfPassword.setText("");
    }
}
