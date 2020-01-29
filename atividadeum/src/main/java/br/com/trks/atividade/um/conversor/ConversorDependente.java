/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trks.atividade.um.conversor;

import br.com.trks.atividade.um.dominio.Dependente;
import br.com.trks.atividade.um.persistencia.DependentesEmMemoria;
import br.com.trks.atividade.um.persistencia.Dependentes;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

/**
 *
 * @author carlos
 */
public class ConversorDependente implements Converter{
    
    private Dependentes depEmMemoria = new DependentesEmMemoria();
    

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        if(string == null){
            return null;
        }
        Dependente dependente = depEmMemoria.localizarDependente(string);
        return dependente;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        if (o == null) {
            return null;
        }
        Dependente dep = (Dependente) o;
        return dep.getUuid();        
    }
    
}
