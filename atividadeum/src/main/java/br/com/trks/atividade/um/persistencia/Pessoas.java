/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trks.atividade.um.persistencia;

import br.com.trks.atividade.um.dominio.Pessoa;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author carlos
 */
interface Pessoas {
    public void cadastrarPessoa(Pessoa p);
    public Pessoa buscarPessoa(String cpf); 
    public void editarPessoa(Pessoa p);
    public List<Pessoa> listarPessoa();
    public void removerPessoa(Pessoa p);    
}
