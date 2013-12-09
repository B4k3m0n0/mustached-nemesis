/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipleiria.tripPlanner.gui.GestaoEtapas;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import pt.ipleiria.tripPlanner.gui.Models.DadosAplicacao;
import pt.ipleiria.tripPlanner.gui.Models.Etapa;
import pt.ipleiria.tripPlanner.gui.events.InserirEtapasClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.InserirEtapasClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.OkInserirEtapasClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.OkInserirEtapasClicadoListener;

/**
 *
 * @author DELL
 */
public class InserirEditarEtapa extends javax.swing.JPanel {

    private List<OkInserirEtapasClicadoListener> okInserirEtapasClicadoListener;
    private Etapa etapa;
    /**
     * Creates new form InserirEtapa
     */
    public InserirEditarEtapa() {
        initComponents();
        this.okInserirEtapasClicadoListener = new ArrayList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOk = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblLocalidadeFinal = new javax.swing.JLabel();
        lblLocalidadeInicio = new javax.swing.JLabel();
        spListaLocalidades = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        lblListaLocalidades = new javax.swing.JLabel();
        tfLocalidadeInicio = new javax.swing.JTextField();
        tfLocalidadeFinal = new javax.swing.JTextField();
        lblErroLI = new javax.swing.JLabel();
        lblErroLF = new javax.swing.JLabel();
        lblErroListL = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tfAltitudeMaxima = new javax.swing.JTextField();
        tfAltitudeAcumulada = new javax.swing.JTextField();
        lblErroAA = new javax.swing.JLabel();
        lblAltitudeAcumulada = new javax.swing.JLabel();
        tfAltitudeMinima = new javax.swing.JTextField();
        lblAltitudeMaxima = new javax.swing.JLabel();
        lblAltitudeMinima = new javax.swing.JLabel();
        lblErroAMax = new javax.swing.JLabel();
        lblErroAMin = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblDistanciaTotal = new javax.swing.JLabel();
        tfDistanciaTotal = new javax.swing.JTextField();
        lblErroDT = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(640, 480));
        setMinimumSize(new java.awt.Dimension(640, 480));

        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Localidade"));

        lblLocalidadeFinal.setText("*Localidade Final:");

        lblLocalidadeInicio.setText("*Localidade Início:");

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        spListaLocalidades.setViewportView(jList1);

        lblListaLocalidades.setText("*Lista Localidades:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblLocalidadeInicio)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfLocalidadeInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(lblErroLI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblLocalidadeFinal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblErroLF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfLocalidadeFinal, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblListaLocalidades)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblErroListL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                    .addComponent(spListaLocalidades, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLocalidadeInicio)
                    .addComponent(tfLocalidadeInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErroLI, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLocalidadeFinal)
                    .addComponent(tfLocalidadeFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErroLF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblListaLocalidades)
                    .addComponent(spListaLocalidades, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErroListL)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Altitude"));

        tfAltitudeAcumulada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAltitudeAcumuladaActionPerformed(evt);
            }
        });

        lblAltitudeAcumulada.setText("*Altitude Acumulada:");

        lblAltitudeMaxima.setText("*Altitude Máxima:");

        lblAltitudeMinima.setText("*Altitude Mínima:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblErroAA, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(lblAltitudeAcumulada)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfAltitudeAcumulada, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(lblAltitudeMinima)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblErroAMin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfAltitudeMinima)))
                        .addComponent(lblErroAMax, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(lblAltitudeMaxima)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfAltitudeMaxima))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAltitudeAcumulada)
                    .addComponent(tfAltitudeAcumulada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(lblErroAA)
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAltitudeMaxima)
                    .addComponent(tfAltitudeMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(lblErroAMax)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAltitudeMinima)
                    .addComponent(tfAltitudeMinima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErroAMin)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Distância"));

        lblDistanciaTotal.setText("*Distância Total:");

        tfDistanciaTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDistanciaTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblDistanciaTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDistanciaTotal))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblErroDT, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDistanciaTotal)
                    .addComponent(tfDistanciaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErroDT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        lblTitulo.setText("Inserir Etapas");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addComponent(lblTitulo)
                .addGap(0, 343, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(btnOk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOk)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfAltitudeAcumuladaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAltitudeAcumuladaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAltitudeAcumuladaActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        lblErroLI.setText("");
        lblErroLI.setForeground(Color.red);
        lblErroLF.setText("");
        lblErroLF.setForeground(Color.red);
        lblErroListL.setText("");
        lblErroListL.setForeground(Color.red);
        lblErroDT.setText("");
        lblErroDT.setForeground(Color.red);
        lblErroAMax.setText("");
        lblErroAMax.setForeground(Color.red);
        lblErroAMin.setText("");
        lblErroAMin.setForeground(Color.red);

        if (tfLocalidadeInicio.getText() == null) {
            lblErroLI.setText("Insira uma Localidade Inical");
        }
        if (tfLocalidadeFinal.getText() == null) {
            lblErroLF.setText("Insira uma Localidade Final");
        }
        if (jList1.getSelectedIndex() < 0) {
            lblErroListL.setText("Selecione um elemento da lista");
        }
        if (tfDistanciaTotal.getText() == null) {
            lblErroDT.setText("Insira uma Distância Total");
        }
        if (tfAltitudeMaxima.getText() == null) {
            lblErroAMax.setText("Insira uma Altitude Maxima");
        }
        if (tfAltitudeMinima.getText() == null) {
            lblErroAMin.setText("Insira uma Altitude Minima");
        }
        //fazer a lista!!
     //   etapa = new Etapa(tfLocalidadeInicio.getText(), tfLocalidadeFinal.getText(),  ,tfDistanciaTotal.getText(),tfAltitudeMaxima, tfAltitudeMinima);
        DadosAplicacao.getInstance().addEtapa(etapa);
        this.fireOkInserirEtapasClicadoEvent();
    }//GEN-LAST:event_btnOkActionPerformed

    private void tfDistanciaTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDistanciaTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDistanciaTotalActionPerformed

    public synchronized void addOkInserirEtapasClicadoListener(OkInserirEtapasClicadoListener listener) {
        this.okInserirEtapasClicadoListener.add(listener);
    }

    public synchronized void removeOkInserirEtapasClicadoListener(OkInserirEtapasClicadoListener listener) {
        this.okInserirEtapasClicadoListener.remove(listener);
    }

    protected synchronized void fireOkInserirEtapasClicadoEvent() {
        for (OkInserirEtapasClicadoListener listener : this.okInserirEtapasClicadoListener) {
            OkInserirEtapasClicadoEvent evento = new OkInserirEtapasClicadoEvent(this);
            listener.okInserirEtapasClicado(evento);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnOk;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAltitudeAcumulada;
    private javax.swing.JLabel lblAltitudeMaxima;
    private javax.swing.JLabel lblAltitudeMinima;
    private javax.swing.JLabel lblDistanciaTotal;
    private javax.swing.JLabel lblErroAA;
    private javax.swing.JLabel lblErroAMax;
    private javax.swing.JLabel lblErroAMin;
    private javax.swing.JLabel lblErroDT;
    private javax.swing.JLabel lblErroLF;
    private javax.swing.JLabel lblErroLI;
    private javax.swing.JLabel lblErroListL;
    private javax.swing.JLabel lblListaLocalidades;
    private javax.swing.JLabel lblLocalidadeFinal;
    private javax.swing.JLabel lblLocalidadeInicio;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JScrollPane spListaLocalidades;
    private javax.swing.JTextField tfAltitudeAcumulada;
    private javax.swing.JTextField tfAltitudeMaxima;
    private javax.swing.JTextField tfAltitudeMinima;
    private javax.swing.JTextField tfDistanciaTotal;
    private javax.swing.JTextField tfLocalidadeFinal;
    private javax.swing.JTextField tfLocalidadeInicio;
    // End of variables declaration//GEN-END:variables
}
