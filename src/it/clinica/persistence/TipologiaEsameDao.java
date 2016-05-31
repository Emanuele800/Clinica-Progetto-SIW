package it.clinica.persistence;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

import it.clinica.model.TipologiaEsame;

import java.util.List;

@Stateless(name = "TEDao")
public class TipologiaEsameDao {

		
	    @PersistenceContext(unitName = "unit-clinica")
	    private EntityManager em;
	    
		public TipologiaEsame createTipologiaEsame(String nome, String descrizione, float costo) {
			TipologiaEsame type = new TipologiaEsame(nome, descrizione,costo);
			em.persist(type);
			return type;
		}
		
		public TipologiaEsame getTipologiaEsame( String codice) {
			TipologiaEsame type = em.find(TipologiaEsame.class,  codice);
			return type;
		}
		
		public List<TipologiaEsame> getAllTipologieEsami() {
	        CriteriaQuery<TipologiaEsame> cq = em.getCriteriaBuilder().createQuery(TipologiaEsame.class);
	        cq.select(cq.from(TipologiaEsame.class));
	        List<TipologiaEsame> types = em.createQuery(cq).getResultList();
			return types;
		}

		public void updateTipologiaEsame(TipologiaEsame type) {
	        em.merge(type);
		}
		
	    private void deleteTipologiaEsame(TipologiaEsame type) {
	        em.remove(type);
	    }

		public void deletePaziente(String codice) {
			TipologiaEsame type = em.find(TipologiaEsame.class, codice);
	        deleteTipologiaEsame(type);
		}
}