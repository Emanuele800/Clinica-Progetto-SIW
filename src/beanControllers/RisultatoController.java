package beanControllers;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import it.clinica.model.Indicatore;
import it.clinica.model.Risultato;
import it.clinica.persistence.RisultatoDao;

@ManagedBean
public class RisultatoController {
	
	@EJB
	private RisultatoDao risultatoDao;
	private Indicatore indicatore;
	private String valore;
	private long id;
	private Risultato risultato;
	
	public String createRisultato(){
		this.risultato = risultatoDao.createRisultato(indicatore, valore);
		return "risultato";
	}

	public Indicatore getIndicatore() {
		return indicatore;
	}

	public void setIndicatore(Indicatore indicatore) {
		this.indicatore = indicatore;
	}

	public String getValore() {
		return valore;
	}

	public void setValore(String valore) {
		this.valore = valore;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Risultato getRisultato() {
		return risultato;
	}

	public void setRisultato(Risultato risultato) {
		this.risultato = risultato;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
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
		RisultatoController other = (RisultatoController) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RisultatoController [indicatore=" + indicatore + ", valore=" + valore + ", id=" + id + ", risultato="
				+ risultato + "]";
	}

	
}
