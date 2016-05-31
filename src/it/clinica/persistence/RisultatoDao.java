package it.clinica.persistence;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

import it.clinica.model.Indicatore;
import it.clinica.model.Risultato;

import java.util.List;

@Stateless(name = "RDao")
public class RisultatoDao {

		
	    @PersistenceContext(unitName = "unit-clinica")
	    private EntityManager em;
	    
		public Risultato createRisultato(Indicatore indicatore, String valore) {
			Risultato risultato = new Risultato( indicatore,  valore);
			em.persist(risultato);
			return risultato;
		}
		
		public Risultato getRisultato(String id) {
			Risultato risultato= em.find(Risultato.class, id);
			return risultato;
		}
		
		public List<Risultato> getAllRisultati() {
	        CriteriaQuery<Risultato> cq = em.getCriteriaBuilder().createQuery(Risultato.class);
	        cq.select(cq.from(Risultato.class));
	        List<Risultato> risultati = em.createQuery(cq).getResultList();
			return risultati;
		}

		public void updateRisultato(Risultato risultato) {
	        em.merge(risultato);
		}
		
	    private void deleteRisultato(Risultato risultato) {
	        em.remove(risultato);
	    }

		public void deleteRisultato(String id) {
			Risultato risultato = em.find(Risultato.class, id );
	        deleteRisultato(risultato);
		}
}