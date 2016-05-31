package it.clinica.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;


@Entity
@NamedQuery(name="findAllRisultati",query="SELECT r FROM Risultato r")
public class Risultato {

	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@OneToOne
	private Indicatore indicatore;
	private String valore;
	
	public Risultato() {}

	public Risultato(Indicatore indicatore, String valore) {
		super();
		this.indicatore = indicatore;
		this.valore = valore;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
		Risultato other = (Risultato) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Risultato [id=" + id + ", indicatore=" + indicatore + ", valore=" + valore + "]";
	}
	
	
	
	
}
