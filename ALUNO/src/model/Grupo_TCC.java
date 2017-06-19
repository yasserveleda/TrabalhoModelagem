/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author 12205008
 */
public class Grupo_TCC {
    private ArrayList<Aluno> grupo;
    private ArrayList<Areas_Interesse> areas;    
    private String id, observacoes;
    private boolean status;
    private Double coeficienteRendimento;

    public Grupo_TCC(ArrayList<Aluno> grupo, ArrayList<Areas_Interesse> areas, String id, String observacoes, boolean status, Double coeficienteRendimento) {
        this.grupo = grupo;
        this.areas = areas;
        this.id = id;
        this.observacoes = observacoes;
        this.status = status;
        this.coeficienteRendimento = coeficienteRendimento;
    }

    public ArrayList<Aluno> getGrupo() {
        return grupo;
    }

    public void setGrupo(ArrayList<Aluno> grupo) {
        this.grupo = grupo;
    }

    public ArrayList<Areas_Interesse> getAreas() {
        return areas;
    }

    public void setAreas(ArrayList<Areas_Interesse> areas) {
        this.areas = areas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Double getCoeficienteRendimento() {
        return coeficienteRendimento;
    }

    public void setCoeficienteRendimento(Double coeficienteRendimento) {
        this.coeficienteRendimento = coeficienteRendimento;
    }
    
    
    
}
