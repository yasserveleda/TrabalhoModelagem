/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author 13205050
 */



import java.util.ArrayList;
import model.Aluno;

public class GerenciaAluno {
    
    private ArrayList<Aluno> alunos;
    
    public GerenciaAluno()
    {
        this.alunos = new ArrayList<>();
        
    }
    
    public void InsereAluno(String nome, String login, String senha)
    {
        Aluno aluno = new Aluno(nome,login,senha);
        alunos.add(aluno);
    }
    
      public ArrayList<Aluno> getAlunos()
     {
          return alunos;
     }
    
      public void mostraAlunos()
     {
        for (Aluno a : alunos)
        {
            System.out.println(a.getNome());
        }        
                
     }
      
      public boolean validaAluno(String login)
      {
          for (Aluno a : alunos)
        {
            if(a.getLogin().equals(login))
            {
                return false;
            }
        }            
          return true;
      }
}
