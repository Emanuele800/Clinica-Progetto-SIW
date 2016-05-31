package beanControllers;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.persistence.criteria.CriteriaQuery;

import it.clinica.model.Paziente;
import it.clinica.persistence.PazienteDao;

@ManagedBean
public class PazienteController {

	@EJB
	private PazienteDao pazienteDao;
	private String username;
	private String CF;
	private String nome;
	public Paziente getPaziente() {
		return paziente;
	}


	public void setPaziente(Paziente paziente) {
		this.paziente = paziente;
	}

	private String cognome;
	private Date dateOfBirth;
	private String psw;
    private Paziente paziente;
    
    public String createPaziente(){
    	this.paziente = pazienteDao.createPaziente(username, nome, cognome, dateOfBirth, CF, psw);
    	return "paziente";
    }
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCF() {
		return CF;
	}

	public void setCF(String cF) {
		CF = cF;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}
	
	@Override
	public String toString() {
		return "PazienteController [username=" + username + ", CF=" + CF + ", nome=" + nome + ", cognome=" + cognome
				+ ", dateOfBirth=" + dateOfBirth + ", psw=" + psw + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CF == null) ? 0 : CF.hashCode());
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
		PazienteController other = (PazienteController) obj;
		if (CF == null) {
			if (other.CF != null)
				return false;
		} else if (!CF.equals(other.CF))
			return false;
		return true;
	}

}
