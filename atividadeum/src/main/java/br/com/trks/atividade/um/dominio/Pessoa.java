/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trks.atividade.um.dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 *
 * @author carlos
 */
@Entity
public class Pessoa implements Serializable{
    
    @Id
    @GeneratedValue
    private int id;
    @Column(length=50)
    private String nome;
    @Transient
    private Dependente dependente;
    private String uuidDependente;
    @Column(unique=true)
    private String cpf;

    public Pessoa() {
    }

    public Pessoa(int id, String nome, Dependente dependente) {
        this.id = id;
        this.nome = nome;
        this.dependente = dependente;
        this.uuidDependente = dependente.getUuid();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Dependente getDependente() {
        return dependente;
    }

    public void setDependente(Dependente dependente) {
        this.dependente = dependente;
        this.uuidDependente = dependente.getUuid();
    }

    public String getUuidDependente() {
        return uuidDependente;
    }
   
}
