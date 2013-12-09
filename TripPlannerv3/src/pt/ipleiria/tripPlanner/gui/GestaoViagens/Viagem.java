/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pt.ipleiria.tripPlanner.gui.GestaoViagens;

import java.util.LinkedList;
import pt.ipleiria.tripPlanner.gui.GestaoAlojamento.Alojamento;
import pt.ipleiria.tripPlanner.gui.Models.Etapa;

/**
 *
 * @author Ricardo
 */
public class Viagem {
    String designacao;
    LinkedList<Etapa> etapas;
    LinkedList<Alojamento> alojamentos;

    public Viagem(String designacao, LinkedList<Etapa> etapas, LinkedList<Alojamento> alojamentos, String tipoViagem) {
        this.designacao = designacao;
        this.etapas = etapas;
        this.alojamentos = alojamentos;
    }  

    public String getDesignacao() {
        return designacao;
    }
    
    
}
