package it.clinica.model;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQuery(name="findAllPazienti",query="SELECT p FROM Paziente p")
public class Paziente {

	@Id
	private String username;
	private String CF;
	private String nome;
	private String cognome;
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
    private String psw;

	public Paziente(String username, String nome, String cognome, Date dateOfBirth, String CF,String psw) {
		this.nome = nome;
		this.username=username;
		this.cognome = cognome;
		this.dateOfBirth = dateOfBirth;
		this.CF = CF;
		this.psw = psw;
	}

	public Paziente() {}

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

	public String getCF() {
		return CF;
	}

	public void setCF(String cF) {
		CF = cF;
	}

	public String getUsername() {
		return username;
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
		Paziente other = (Paziente) obj;
		if (CF == null) {
			if (other.CF != null)
				return false;
		} else if (!CF.equals(other.CF))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Paziente [nome=" + nome + ", cognome=" + cognome + ", dateOfBirth=" + dateOfBirth + ", CF=" + CF
				+ ", username=" + username + ", psw=" + psw + "]";
	}




}
