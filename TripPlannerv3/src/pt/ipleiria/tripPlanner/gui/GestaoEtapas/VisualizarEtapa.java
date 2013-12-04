/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pt.ipleiria.tripPlanner.gui.GestaoEtapas;

import java.util.ArrayList;
import java.util.List;
import pt.ipleiria.tripPlanner.gui.events.OkInserirEtapasClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.OkInserirEtapasClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.OkVisualizarEtapasClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.OkVisualizarEtapasClicadoListener;

/**
 *
 * @author DELL
 */
public class VisualizarEtapa extends javax.swing.JPanel {
    private List<OkVisualizarEtapasClicadoListener> okVisualizarEtapasClicadoListener;
    /**
     * Creates new form InserirEtapa
     */
    public VisualizarEtapa() {
        initComponents();
        this.okVisualizarEtapasClicadoListener = new ArrayList<>();
    }

    public synchronized void addOkVisualizarEtapasClicadoListener(OkVisualizarEtapasClicadoListener listener) {
        this.okVisualizarEtapasClicadoListener.add(listener);
    }

    public synchronized void removeOkVisualizarEtapasClicadoListener(OkVisualizarEtapasClicadoListener listener) {
        this.okVisualizarEtapasClicadoListener.remove(listener);
    }

    protected synchronized void fireOkVisualizarEtapasClicadoEvent() {
        for (OkVisualizarEtapasClicadoListener listener : this.okVisualizarEtapasClicadoListener) {
            OkVisualizarEtapasClicadoEvent evento = new OkVisualizarEtapasClicadoEvent(this);
            listener.okVisualizarEtapasClicado(evento);
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

        lblLocalidadeInicio = new javax.swing.JLabel();
        lblLocalidadeFinal = new javax.swing.JLabel();
        lblListaLocalidades = new javax.swing.JLabel();
        lblDistanciaTotal = new javax.swing.JLabel();
        lblAltitudeAcumulada = new javax.swing.JLabel();
        lblAltitudeMaxima = new javax.swing.JLabel();
        lblAltitudeMinima = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        spListaLocalidades = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        lblMostrarLocalidadeInicio = new javax.swing.JLabel();
        lblMostrarLocalidadeFinal = new javax.swing.JLabel();
        lblMostrarDistanciaTotal = new javax.swing.JLabel();
        lblMostrarAltitudeAcumulada = new javax.swing.JLabel();
        lblMostrarAltitudeMaxima = new javax.swing.JLabel();
        lblMostrarAltitudeMinima = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(640, 480));
        setMinimumSize(new java.awt.Dimension(640, 480));
        setRequestFocusEnabled(false);

        lblLocalidadeInicio.setText("Localidade Início:");

        lblLocalidadeFinal.setText("Localidade Final:");

        lblListaLocalidades.setText("Lista Localidades:");

        lblDistanciaTotal.setText("Distância Total:");

        lblAltitudeAcumulada.setText("Altitude Acumulada:");

        lblAltitudeMaxima.setText("Altitude Máxima:");

        lblAltitudeMinima.setText("Altitude Mínima:");

        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        spListaLocalidades.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblLocalidadeFinal, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLocalidadeInicio, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMostrarLocalidadeInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblMostrarLocalidadeFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblDistanciaTotal)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblMostrarDistanciaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblAltitudeAcumulada)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblMostrarAltitudeAcumulada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblAltitudeMaxima)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblMostrarAltitudeMaxima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblAltitudeMinima)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblMostrarAltitudeMinima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblListaLocalidades)
                                            .addGap(22, 22, 22)
                                            .addComponent(spListaLocalidades, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 123, Short.MAX_VALUE)))
                        .addContainerGap(304, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnOk)
                        .addGap(37, 37, 37)
                        .addComponent(btnCancelar)
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLocalidadeInicio)
                    .addComponent(lblMostrarLocalidadeInicio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLocalidadeFinal)
                    .addComponent(lblMostrarLocalidadeFinal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblListaLocalidades)
                    .addComponent(spListaLocalidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDistanciaTotal)
                    .addComponent(lblMostrarDistanciaTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAltitudeAcumulada)
                    .addComponent(lblMostrarAltitudeAcumulada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAltitudeMaxima)
                    .addComponent(lblMostrarAltitudeMaxima))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAltitudeMinima)
                    .addComponent(lblMostrarAltitudeMinima))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOk)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("");
        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        this.fireOkVisualizarEtapasClicadoEvent();
    }//GEN-LAST:event_btnOkActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnOk;
    private javax.swing.JList jList1;
    private javax.swing.JLabel lblAltitudeAcumulada;
    private javax.swing.JLabel lblAltitudeMaxima;
    private javax.swing.JLabel lblAltitudeMinima;
    private javax.swing.JLabel lblDistanciaTotal;
    private javax.swing.JLabel lblListaLocalidades;
    private javax.swing.JLabel lblLocalidadeFinal;
    private javax.swing.JLabel lblLocalidadeInicio;
    private javax.swing.JLabel lblMostrarAltitudeAcumulada;
    private javax.swing.JLabel lblMostrarAltitudeMaxima;
    private javax.swing.JLabel lblMostrarAltitudeMinima;
    private javax.swing.JLabel lblMostrarDistanciaTotal;
    private javax.swing.JLabel lblMostrarLocalidadeFinal;
    private javax.swing.JLabel lblMostrarLocalidadeInicio;
    private javax.swing.JScrollPane spListaLocalidades;
    // End of variables declaration//GEN-END:variables
}
