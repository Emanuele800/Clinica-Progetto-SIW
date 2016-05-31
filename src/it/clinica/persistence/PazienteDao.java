package it.clinica.persistence;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

import it.clinica.model.Paziente;

import java.util.Date;
import java.util.List;

@Stateless(name = "PDao")
public class PazienteDao {

		
	    @PersistenceContext(unitName = "unit-clinica")
	    private EntityManager em;
	    
		public Paziente createPaziente(String username, String nome, String cognome, Date dateOfBirth, String CF, String psw) {
			Paziente paziente = new Paziente(username, nome, cognome, dateOfBirth,  CF, psw);
			em.persist(paziente);
			return paziente;
		}
		
		public Paziente getPaziente(String username) {
			Paziente paziente = em.find(Paziente.class, username);
			return paziente;
		}
		
		public List<Paziente> getAllPazienti() {
	        CriteriaQuery<Paziente> cq = em.getCriteriaBuilder().createQuery(Paziente.class);
	        cq.select(cq.from(Paziente.class));
	        List<Paziente> pazienti = em.createQuery(cq).getResultList();
			return pazienti;
		}

		public void updatePaziente(Paziente paziente) {
	        em.merge(paziente);
		}
		
	    private void deletePaziente(Paziente paziente) {
	        em.remove(paziente);
	    }

		public void deletePaziente(String username) {
			Paziente paziente = em.find(Paziente.class, username);
	        deletePaziente(paziente);
		}
}
