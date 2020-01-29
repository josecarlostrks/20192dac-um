/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trks.atividade.um.persistencia;

import br.com.trks.atividade.um.dominio.Dependente;
import java.util.List;

/**
 *
 * @author carlos
 */
public interface Dependentes {
    public void cadastrarDependente(Dependente dependente); 
    public List<Dependente> listarDependentes();
    public void removerDependente(Dependente dependente);
    public Dependente localizarDependente(String uuid);
}
