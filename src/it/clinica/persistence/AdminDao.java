package it.clinica.persistence;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

import it.clinica.model.Admin;

import java.util.List;

@Stateless(name= "ADao")
public class AdminDao {

		
	    @PersistenceContext(unitName = "unit-clinica")
	    private EntityManager em;
	    
		public Admin createAdmin(String username, String psw) {
			Admin admin = new Admin(username, psw);
			em.persist(admin);
			return admin;
		}
		
		public Admin getAdmin(String username) {
			Admin admin = em.find(Admin.class, username);
			return admin;
		}
		
		public List<Admin> getAllAdmins() {
	        CriteriaQuery<Admin> cq = em.getCriteriaBuilder().createQuery(Admin.class);
	        cq.select(cq.from(Admin.class));
	        List<Admin> admins = em.createQuery(cq).getResultList();
			return admins;
		}

		public void updateAdmin(Admin admin) {
	        em.merge(admin);
		}
		
	    private void deleteAdmin(Admin admin) {
	        em.remove(admin);
	    }

		public void deleteAdmin(String username) {
			Admin admin = em.find(Admin.class, username);
	        deleteAdmin(admin);
		}
}
