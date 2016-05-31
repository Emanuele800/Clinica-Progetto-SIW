package it.clinica.persistence;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

import it.clinica.model.Prerequisito;

import java.util.List;

@Stateless(name = "PRDao")
public class PrerequisitoDao {

		
	    @PersistenceContext(unitName = "unit-clinica")
	    private EntityManager em;
	    
		public Prerequisito createPrerequisito(String nome, String descrizione) {
			Prerequisito prerequisito = new Prerequisito( nome, descrizione);
			em.persist(prerequisito);
			return prerequisito;
		}
		
		public Prerequisito getPrerequisito(String nome) {
			Prerequisito prerequisito = em.find(Prerequisito.class, nome);
			return prerequisito;
		}
		
		public List<Prerequisito> getAllPrerequisiti() {
	        CriteriaQuery<Prerequisito> cq = em.getCriteriaBuilder().createQuery(Prerequisito.class);
	        cq.select(cq.from(Prerequisito.class));
	        List<Prerequisito> prerequisiti = em.createQuery(cq).getResultList();
			return prerequisiti;
		}

		public void updatePrerequisito(Prerequisito prerequisito) {
	        em.merge(prerequisito);
		}
		
	    private void deletePrerequisito(Prerequisito prerequisito) {
	        em.remove(prerequisito);
	    }

		public void deletePrerequisito(String nome) {
			Prerequisito prerequisito = em.find(Prerequisito.class, nome);
	        deletePrerequisito(prerequisito);
		}
}