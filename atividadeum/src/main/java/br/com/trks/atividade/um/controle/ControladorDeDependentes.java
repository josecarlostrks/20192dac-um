/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trks.atividade.um.controle;

import br.com.trks.atividade.um.dominio.Dependente;
import br.com.trks.atividade.um.persistencia.DependentesEmMemoria;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author carlos
 */

@ManagedBean
@SessionScoped
public class ControladorDeDependentes {
    
    @Inject
    DependentesEmMemoria service;

    private List<Dependente> dependentes;
    
    @PostConstruct
    public void init() {
        carregarDependentes();
    }
	
    public void carregarDependentes() {
        this.dependentes = service.listarDependentes();
    }


    public List<Dependente> getDependentes() {
        return dependentes;
    }

    public void setDependentes(List<Dependente> dependentes) {
        this.dependentes = dependentes;
    }




    
}
