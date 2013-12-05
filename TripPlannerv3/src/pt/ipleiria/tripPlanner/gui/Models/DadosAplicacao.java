/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipleiria.tripPlanner.gui.Models;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import pt.ipleiria.tripPlanner.gui.GestaoAlojamento.Alojamento;
import pt.ipleiria.tripPlanner.gui.GestaoEtapas.Etapa;
import pt.ipleiria.tripPlanner.gui.GestaoViagens.Viagem;

import sun.util.calendar.BaseCalendar;


/**
 *
 * @author Cristiano
 */
public class DadosAplicacao {

    private static final DadosAplicacao instance = new DadosAplicacao();

    public static DadosAplicacao getInstance() {
        return instance;
    }

    private ArrayList<Participante> participantes;
    private ArrayList<Viagem> viagens;
    private ArrayList<Etapa> etapas;
    private ArrayList<Alojamento> alojamentos;

    private DadosAplicacao() {
        participantes = new ArrayList<>();

        adicionarParticipante();
        addAlojamento();
        addEtapa();
    }

    private void adicionarParticipante() {

        Calendar dataNascJoao = Calendar.getInstance();

        dataNascJoao.setTime(new Date(90, 2, 11));


        

        ArrayList<String> permissoes;
        permissoes = new ArrayList<>();

        String pass = "noob";

        Participante participante1;

        participante1 = new Participante("Joao", dataNascJoao, 12175988, "Leiria", 5, true, "jonny0015", pass.toCharArray(), true, permissoes);
        adicionarParticipante(participante1);

        //participante1 = new Participante("Joao", dataNascJoao, 12175988, "Leiria", 5, true, "Jonny0015", "noob", true, permissoes);

    }    
    private void addAlojamento() {       
        Alojamento alojamento1;
        alojamento1 = new Alojamento("Bom e Barato");
        //alojamentos.add(alojamento1);
    }

    public void addViagem(Viagem viagem) {
        viagens.add(viagem);
    }

    private void addEtapa() {
        Etapa etapa1;
        etapa1 = new Etapa("A");
        //etapas.add(etapa1);
    }

    public ArrayList<Viagem> getViagens() {
        return viagens;
    }

    public ArrayList<Etapa> getEtapas() {
        return etapas;
    }
    
    public void adicionarParticipante(Participante p){
        participantes.add(p);
    }

    public ArrayList<Participante> getParticipantes() {
        return (ArrayList<Participante>) participantes.clone();
    }
}
