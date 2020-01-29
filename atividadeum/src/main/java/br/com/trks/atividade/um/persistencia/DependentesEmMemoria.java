/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trks.atividade.um.persistencia;

import br.com.trks.atividade.um.dominio.Dependente;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author carlos
 */
public class DependentesEmMemoria implements Dependentes{
    
    private final List<Dependente> dependentes = new ArrayList<>();

    public DependentesEmMemoria() {

        this.dependentes.addAll(
            Arrays.asList(
                new Dependente("5366b487-bf9e-46c9-aac1-99e96dcea71c","maria",LocalDate.of(2018, 07, 22)),
                new Dependente("5366b487-bf9e-46c9-aac1-99e96dcea70b","joana",LocalDate.of(2018, 07, 22)),
                new Dependente("db9aee2d-811b-42e8-945a-5d10a4560f33","Manoela",LocalDate.of(2018, 07, 22)),
                new Dependente("21ce7508-5a9e-4f8b-9a41-b497f91c79bb","vitória",LocalDate.of(2018, 07, 22)),
                new Dependente("e41f0a5e-095e-4f4a-9d60-f6fd5465965d","ana",LocalDate.of(2018, 07, 22))
            )
        );
    }
    
    @Override
    public Dependente localizarDependente(String uuid) {
        return listarDependentes()
            .stream()
            .filter(d -> d.getUuid().equals(uuid))
            .findFirst()
            .orElse(Dependente.falso());
    }

    @Override
    public void cadastrarDependente(Dependente dependente){
        this.dependentes.add(dependente);
    }

    @Override
    public List<Dependente> listarDependentes(){
        return this.dependentes;
    }

    @Override
    public void removerDependente(Dependente dependente){
        this.dependentes.remove(dependente);
    }
    
}
