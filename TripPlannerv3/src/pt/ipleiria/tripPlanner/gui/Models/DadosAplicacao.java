/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipleiria.tripPlanner.gui.Models;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import pt.ipleiria.tripPlanner.gui.GestaoAlojamento.Alojamento;

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
    private ArrayList<Localidade> localidades;
    private Participante logado;
    private ArrayList<Quarto> quartos;
   

    private DadosAplicacao() {
        participantes = new ArrayList<>();
        etapas = new ArrayList<>();
        alojamentos = new ArrayList<>();
        viagens = new ArrayList<>();

        adicionarParticipante();
    }

    private void adicionarParticipante() {

        Calendar dataNascJoao = Calendar.getInstance();

        dataNascJoao.setTime(new Date(90, 2, 11));

        ArrayList<String> permissoes;
        permissoes = new ArrayList<>();

        String pass = "noob";
        String pass1 = "a";

        Participante participante1;

        participante1 = new Participante("Joao", dataNascJoao, 12175988, "Leiria", 5, true, "jonny0015", pass.toCharArray(), true, permissoes, false);
        adicionarParticipante(participante1);


        participantes.add(participante1);
        Participante participante2;
        participante2 = new Participante("a", dataNascJoao, 12175988, "Leiria", 5, true, "a", pass1.toCharArray(), true, permissoes, false);
        adicionarParticipante(participante2);
    }

    


    private void addAlojamento(Alojamento alojamento) {
       alojamentos.add(alojamento);
    }

    public void addViagem(Viagem viagem) {
        viagens.add(viagem);
    }

    public void addEtapa(Etapa etapa) {
        etapas.add(etapa);
    }


    public void addLocalidades() {
        Localidade localidade1;
        localidade1 = new Localidade("Leiria");
    }
    
    public void addQuarto(Quarto quarto){
        quartos.add(quarto);
    }

    public ArrayList<Quarto> getQuartos() {
        return quartos;
    }
    

    public ArrayList<Alojamento> getAlojamentos() {
        return alojamentos;
    }

    public ArrayList<Localidade> getLocalidades() {
        return localidades;
    }

    public ArrayList<Viagem> getViagens() {
        return (ArrayList<Viagem>) viagens.clone();
    }

    public ArrayList<Etapa> getEtapas() {
        return (ArrayList<Etapa>) etapas.clone();
    }

    public void adicionarParticipante(Participante p) {
        participantes.add(p);
    }

    public ArrayList<Participante> getParticipantes() {
        return (ArrayList<Participante>) participantes.clone();
    }

    public void setLogado(Participante participante) {
        this.logado = participante;
    }

    public Participante getLogado() {
        return logado;
    }
}
