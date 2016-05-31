package it.clinica.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQuery(name="findAllEsami",query="SELECT e FROM Esame e")
public class Esame {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long codice;
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date dataPrenotazione;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataEsame;
	@OneToMany
	private Map<String,Risultato> risultati;
	@ManyToOne
	private TipologiaEsame tipologia;
	@OneToOne
	private Medico medico;
	@OneToOne
	private Paziente paziente;
	
	public Esame( Date dataPrenotazione, Date dataEsame, 
			TipologiaEsame tipologia, Medico medico, Paziente paziente) {
		this.dataPrenotazione = dataPrenotazione;
		this.dataEsame = dataEsame;
		this.risultati = new HashMap<>();
		this.tipologia = tipologia;
		this.medico = medico;
		this.paziente = paziente;
	}
	public Esame() {}
	public long getCodice() {
		return codice;
	}
	public void setCodice(long codice) {
		this.codice = codice;
	}
	public Date getDataPrenotazione() {
		return dataPrenotazione;
	}
	public void setDataPrenotazione(Date dataPrenotazione) {
		this.dataPrenotazione = dataPrenotazione;
	}
	public Date getDataEsame() {
		return dataEsame;
	}
	public void setDataEsame(Date dataEsame) {
		this.dataEsame = dataEsame;
	}
	public Map<String, Risultato> getRisultati() {
		return risultati;
	}
	public void setRisultati(Map<String, Risultato> risultati) {
		this.risultati = risultati;
	}
	public TipologiaEsame getTipologia() {
		return tipologia;
	}
	public void setTipologia(TipologiaEsame tipologia) {
		this.tipologia = tipologia;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Paziente getPaziente() {
		return paziente;
	}
	public void setPaziente(Paziente paziente) {
		this.paziente = paziente;
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
		Esame other = (Esame) obj;
		if (codice != other.codice)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Esame [codice=" + codice + ", dataPrenotazione=" + dataPrenotazione + ", dataEsame=" + dataEsame
				+ ", risultati=" + risultati + ", tipologia=" + tipologia + ", medico=" + medico + ", paziente="
				+ paziente + "]";
	}
	
	
	
	
	
}
