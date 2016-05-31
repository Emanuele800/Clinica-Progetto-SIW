package beanControllers;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;


import it.clinica.model.Admin;
import it.clinica.persistence.AdminDao;

@ManagedBean
public class AdminController {

	@EJB
	private AdminDao adminDao;
	private String username;
	private String psw;
	private Admin admin;
	
	public String getAdmin(){
		this.admin = adminDao.createAdmin(username, psw);
		return "admin";
	}

	public String getUsername() {
		return username;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	@Override
	public String toString() {
		return "AdminController [username=" + username + ", psw=" + psw + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AdminController other = (AdminController) obj;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}
	
}
