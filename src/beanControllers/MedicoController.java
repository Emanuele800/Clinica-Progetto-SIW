package beanControllers;

import java.util.Map;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import it.clinica.model.Esame;
import it.clinica.model.Medico;
import it.clinica.persistence.MedicoDao;

@ManagedBean
public class MedicoController {
	
	@EJB
	private MedicoDao medicoDao;
	private long codice;
	private String nome;
	private String cognome;
	private String specializzazione;
	private Map<String,Esame> esami;
	private Medico medico;
	
	public String createMedico(){
		this.medico = medicoDao.createMedico(nome, cognome, specializzazione);
		return "medico";
	}

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

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
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
		MedicoController other = (MedicoController) obj;
		if (codice != other.codice)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MedicoController [codice=" + codice + ", nome=" + nome + ", cognome=" + cognome + ", specializzazione="
				+ specializzazione + ", esami=" + esami + ", medico=" + medico + "]";
	}

	
}
