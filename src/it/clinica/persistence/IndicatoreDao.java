package it.clinica.persistence;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

import it.clinica.model.Indicatore;

import java.util.List;

@Stateless(name = "IDao")
public class IndicatoreDao {

		
	    @PersistenceContext(unitName = "unit-clinica")
	    private EntityManager em;
	    
		public Indicatore createIndicatore(String nome, String descrizione) {
			Indicatore indicatore = new Indicatore( nome, descrizione);
			em.persist(indicatore);
			return indicatore;
		}
		
		public Indicatore getIndicatore(String nome) {
			Indicatore indicatore = em.find(Indicatore.class, nome);
			return indicatore;
		}
		
		public List<Indicatore> getAllIndicatori() {
	        CriteriaQuery<Indicatore> cq = em.getCriteriaBuilder().createQuery(Indicatore.class);
	        cq.select(cq.from(Indicatore.class));
	        List<Indicatore> Indicatori = em.createQuery(cq).getResultList();
			return Indicatori;
		}

		public void updateIndicatore(Indicatore indicatore) {
	        em.merge(indicatore);
		}
		
	    private void deleteIndicatore(Indicatore indicatore) {
	        em.remove(indicatore);
	    }

		public void deleteIndicatore(String nome) {
			Indicatore indicatore = em.find(Indicatore.class, nome);
	        deleteIndicatore(indicatore);
		}
}