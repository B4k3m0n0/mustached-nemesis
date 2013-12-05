/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipleiria.tripPlanner.gui.Models;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import sun.util.calendar.BaseCalendar;

/**
 *
 * @author Cristiano
 */
public class DadosAplicacao {
    private static final DadosAplicacao instance=new DadosAplicacao();
    
    public static DadosAplicacao getInstance() {
        return instance;
    }
    
    private ArrayList<Participante> participantes;
    //private ArrayList<Viagem> viagem;
    
    private DadosAplicacao() {
        participantes = new ArrayList<>();
        
        
        adicionarParticipante();
    }

    private void adicionarParticipante() {
        
        Calendar dataNascJoao = Calendar.getInstance();
        dataNascJoao.setTime(new Date(90, 1, 11));
        
        ArrayList<String> permissoes;
        permissoes = new ArrayList<>();
        
        String pass = "noob";
        
        Participante participante1;
        participante1 = new Participante("Joao", dataNascJoao, 12175988, "Leiria", 5, true, "Jonny0015", pass.toCharArray(), true, permissoes);
    }
    
    public void adicionarParticipante(Participante p){
        participantes.add(p);
    }
    
    public ArrayList<Participante> getParticipantes() {
        return (ArrayList<Participante>) participantes.clone();
    }
}
