/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipleiria.tripPlanner.gui.Models;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Cristiano
 */
public class DadosAplicacao {
    private static final DadosAplicacao instance=new DadosAplicacao();
    
    public static DadosAplicacao getInstance() {
        return instance;
    }
    
    private ArrayList<Participante> participante;
    //private ArrayList<Viagem> viagem;
    
    private DadosAplicacao() {
        participante = new ArrayList<>();
        
        
        adicionarParticipante();
    }

    private void adicionarParticipante() {
        
        Calendar dataNascJoao = Calendar.getInstance();
        dataNascJoao.setTime(Date(90, 2, 11));
        
        ArrayList<String> permissoes;
        permissoes = new ArrayList<>();
        
        Participante participante1;
        participante1 = new Participante("Joao", dataNascJoao, 12175988, "Leiria", 5, true, "Jonny0015", "noob", true, permissoes);
    }
}
