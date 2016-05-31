package it.clinica.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQuery(name="findAllMedici",query="SELECT m FROM Medico m")
public class Medico {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long codice;
	private String nome;
	private String cognome;
	private String specializzazione;
	@OneToMany(mappedBy="medico")
	private Map<String,Esame> esami;
	
	
	public Medico( String nome, String cognome, String specializzazione) {
		this.nome = nome;
		this.cognome = cognome;
		this.specializzazione = specializzazione;
		this.esami=new HashMap<>();
	}

	public Medico() {}

	public long getCodice() {
		return codice;
	}

	public void setCodice(long codice) {
		this.codice = codice;
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

	public String getSpecializzazione() {
		return specializzazione;
	}

	public void setSpecializzazione(String specializzazione) {
		this.specializzazione = specializzazione;
	}

	public Map<String, Esame> getEsami() {
		return esami;
	}

	public void setEsami(Map<String, Esame> esami) {
		this.esami = esami;
	}





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (codice ^ (codice >>> 32));
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
		Medico other = (Medico) obj;
		if (codice != other.codice)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Medico [codice=" + codice + ", nome=" + nome + ", cognome=" + cognome + ", specializzazione="
				+ specializzazione + ", esami=" + esami + "]";
	}



	
	
}
