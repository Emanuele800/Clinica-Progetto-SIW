package beanControllers;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import it.clinica.model.Indicatore;
import it.clinica.persistence.IndicatoreDao;

@ManagedBean
public class IndicatoreController {

	@EJB
	private IndicatoreDao indicatoreDao;
	private String nome;
	private String descrizione;
	private Indicatore indicatore;
	
	
	public String createIndicatore(){
		this.indicatore = indicatoreDao.createIndicatore(nome, descrizione);
		return "indicatore";
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDescrizione() {
		return descrizione;
	}


	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}


	public Indicatore getIndicatore() {
		return indicatore;
	}


	public void setIndicatore(Indicatore indicatore) {
		this.indicatore = indicatore;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descrizione == null) ? 0 : descrizione.hashCode());
		result = prime * result + ((indicatore == null) ? 0 : indicatore.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		IndicatoreController other = (IndicatoreController) obj;
		if (descrizione == null) {
			if (other.descrizione != null)
				return false;
		} else if (!descrizione.equals(other.descrizione))
			return false;
		if (indicatore == null) {
			if (other.indicatore != null)
				return false;
		} else if (!indicatore.equals(other.indicatore))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "IndicatoreController [nome=" + nome + ", descrizione=" + descrizione + ", indicatore=" + indicatore
				+ "]";
	}
	
	
}