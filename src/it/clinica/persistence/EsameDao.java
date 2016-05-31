package it.clinica.persistence;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

import it.clinica.model.Esame;
import it.clinica.model.Medico;
import it.clinica.model.Paziente;
import it.clinica.model.TipologiaEsame;

import java.util.Date;
import java.util.List;

@Stateless(name = "EDao")
public class EsameDao {

		
	    @PersistenceContext(unitName = "unit-clinica")
	    private EntityManager em;

	    
		public Esame createEsame( Date dataPrenotazione,  
				TipologiaEsame tipologia, Medico medico, Paziente paziente) {
			Esame esame = new Esame(  dataPrenotazione, null , 
					 tipologia, medico, paziente);
			em.persist(esame);
			return esame;
		}
		
		public Esame getEsame(String codice) {
			Esame esame = em.find(Esame.class, codice);
			return esame;
		}
		
		public List<Esame> getAllEsami() {
	        CriteriaQuery<Esame> cq = em.getCriteriaBuilder().createQuery(Esame.class);
	        cq.select(cq.from(Esame.class));
	        List<Esame> esami = em.createQuery(cq).getResultList();
			return esami;
		}

		public void updateEsame(Esame esami) {
	        em.merge(esami);
		}
		
	    private void deleteEsame(Esame esame) {
	        em.remove(esame);
	    }

		public void deleteEsame(String codice) {
			Esame esame = em.find(Esame.class, codice);
	        deleteEsame(esame);
		}
}