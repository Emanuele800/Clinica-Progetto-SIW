package it.clinica.persistence;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

import it.clinica.model.Medico;

import java.util.List;

@Stateless(name = "MDao")
public class MedicoDao {

		
	    @PersistenceContext(unitName = "unit-clinica")
	    private EntityManager em;
	    
		public Medico createMedico( String nome, String cognome, String specializzazione) {
			Medico medico = new Medico( nome,  cognome,  specializzazione);
			em.persist(medico);
			return medico;
		}
		
		public Medico getMedico(long codice) {
			Medico medico = em.find(Medico.class, codice);
			return medico;
		}
		
		public List<Medico> getAllMedici() {
	        CriteriaQuery<Medico> cq = em.getCriteriaBuilder().createQuery(Medico.class);
	        cq.select(cq.from(Medico.class));
	        List<Medico> medici = em.createQuery(cq).getResultList();
			return medici;
		}

		public void updateMedico(Medico medico) {
	        em.merge(medico);
		}
		
	    private void deleteMedico(Medico medico) {
	        em.remove(medico);
	    }

		public void deletePaziente(String codice) {
			Medico medico = em.find(Medico.class, codice);
	        deleteMedico(medico);
		}
}