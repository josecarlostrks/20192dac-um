/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trks.atividade.um.validador;

import br.com.trks.atividade.um.dominio.Dependente;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author carlos
 */
public class ValidadorDeDependentes implements Validator{

    @Override
    public void validate(FacesContext fc, UIComponent uic, Object o) throws ValidatorException {
        Dependente dependente = (Dependente) o; 
        
        if(dependente.naoValido()){
            FacesMessage fm = new FacesMessage("dependente inválido");
            throw new ValidatorException(fm);
        }
    }
    
}
