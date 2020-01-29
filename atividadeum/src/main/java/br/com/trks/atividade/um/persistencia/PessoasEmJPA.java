package br.com.trks.atividade.um.persistencia;

import br.com.trks.atividade.um.dominio.Pessoa;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author carlos
 */
@Stateless
public class PessoasEmJPA implements Pessoas{

    @PersistenceContext(unitName="dac")
    private EntityManager entityManager;    

    @Override
    public void cadastrarPessoa(Pessoa pessoa){
        entityManager.persist(pessoa);     
    }

    @Override
    public Pessoa buscarPessoa(String cpf){
        Query query = entityManager.createQuery("SELECT p FROM Pessoa p WHERE p.cpf = :cpf");
        query.setMaxResults(1);
        query.setParameter("cpf", cpf);
        return (Pessoa) query.getSingleResult();
    }

    @Override
    public void editarPessoa(Pessoa p){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pessoa> listarPessoa(){
        return entityManager.createQuery("SELECT p FROM pessoa p").getResultList();
    }

    @Override
    public void removerPessoa(Pessoa pessoa){
        entityManager.remove(pessoa);
    }
    
}
