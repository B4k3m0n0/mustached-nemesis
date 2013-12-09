/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pt.ipleiria.tripPlanner.gui.Models;

/**
 *
 * @author DELL
 */
public class Quarto {
    private int camas;
    private String tipoCama;
    private int custo;
    private String tipoCusto;

    public Quarto(int camas, String tipoCama, int custo, String tipoCusto) {
        this.camas = camas;
        this.tipoCama = tipoCama;
        this.custo = custo;
        this.tipoCusto = tipoCusto;
    }

    public int getCamas() {
        return camas;
    }

    public String getTipoCama() {
        return tipoCama;
    }

    public int getCusto() {
        return custo;
    }

    public String getTipoCusto() {
        return tipoCusto;
    }        
}
