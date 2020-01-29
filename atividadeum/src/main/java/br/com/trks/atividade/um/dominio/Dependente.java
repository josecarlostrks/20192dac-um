/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trks.atividade.um.dominio;

import java.time.LocalDate;

/**
 *
 * @author carlos
 */
public class Dependente {
    
    private String uuid;
    private String nome;
    private LocalDate dataDeNascimento;

    public Dependente() {
    }

    public Dependente(String uuid, String nome) {
        this.uuid = uuid;
        this.nome = nome;
    }

    public Dependente(String nome, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }
    

    public Dependente(String uuid, String nome, LocalDate dataDeNascimento) {
        this.uuid = uuid;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }
    
    public static Dependente falso() {
        return new Dependente("-1","-1");
    }
    

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    
    
    public boolean nomeVazio(){
        return this.nome == null || this.nome.trim().equals("");        
    }
    public boolean nascimentoInvalido(){
        return this.dataDeNascimento == null || this.dataDeNascimento.isAfter(LocalDate.now()) 
                || this.dataDeNascimento.isEqual(LocalDate.now());
    }
    public boolean naoValido(){
        return nomeVazio()||nascimentoInvalido();
    }
    
    
}
