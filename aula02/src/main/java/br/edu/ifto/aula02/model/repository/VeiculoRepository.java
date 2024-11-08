package br.edu.ifto.aula02.model.repository;

import br.edu.ifto.aula02.model.entity.Veiculo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public class VeiculoRepository {

    @PersistenceContext
    private EntityManager em;

    public void save(Veiculo veiculo) {
            em.persist(veiculo);
    }

    public Veiculo buscarVeiculo(int id){
        return em.find(Veiculo.class, id);
    }

    public List<Veiculo> buscarVeiculos() {
       Query query = em.createQuery("from Veiculo");
         return query.getResultList();
    }

    public void deletar(int id) {
        Veiculo veiculo = em.find(Veiculo.class, id);
        em.remove(veiculo);
    }

   public void editar(Veiculo veiculo) {
        em.merge(veiculo);

    }

}

