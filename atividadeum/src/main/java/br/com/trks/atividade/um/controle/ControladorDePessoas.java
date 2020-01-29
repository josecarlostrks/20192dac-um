/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trks.atividade.um.controle;


import br.com.trks.atividade.um.dominio.Pessoa;
import br.com.trks.atividade.um.persistencia.PessoasEmJPA;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author carlos
 */

@ManagedBean
@ViewScoped
public class ControladorDePessoas {
    
    @EJB
    private PessoasEmJPA service;
    private List<Pessoa> pessoas;
    private Pessoa pessoa = new Pessoa(); 
    private String cpf;
    

    
    @PostConstruct
    public void init() {
        carregarPessoas();
    }
    
    public String buscar(String cpf){
        pessoa = service.buscarPessoa(this.cpf);
        return "editPessoa";
    }
	
    public void carregarPessoas() {
        this.pessoas = service.listarPessoa();
    }    
    
    public void salvarPessoa() {
	service.cadastrarPessoa(pessoa);
	this.pessoa = new Pessoa();
	carregarPessoas();
    }    
    
    public void excluir(Pessoa pessoa){
        this.service.removerPessoa(pessoa);
    }    

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
   
}
