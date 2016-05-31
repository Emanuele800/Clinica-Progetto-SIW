package beanControllers;

import java.util.Date;
import java.util.Map;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import it.clinica.model.Esame;
import it.clinica.model.Medico;
import it.clinica.model.Paziente;
import it.clinica.model.Risultato;
import it.clinica.model.TipologiaEsame;
import it.clinica.persistence.EsameDao;

@ManagedBean
public class EsameController {
	
	@EJB
	private EsameDao esameDao;
	private long codice;
	private Date dataPrenotazione;
	private Date dataEsame;
	private Map<String,Risultato> risultati;
	private TipologiaEsame tipologia;
	private Medico medico;
	private Paziente paziente;
	private Esame esame;

	
	public String createEsame(){
		this.esame = esameDao.createEsame(dataPrenotazione, tipologia, medico, paziente);
		return "esame";
	}


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


	public Esame getEsame() {
		return esame;
	}


	public void setEsame(Esame esame) {
		this.esame = esame;
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
		EsameController other = (EsameController) obj;
		if (codice != other.codice)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "EsameController [codice=" + codice + ", dataPrenotazione=" + dataPrenotazione + ", dataEsame="
				+ dataEsame + ", risultati=" + risultati + ", tipologia=" + tipologia + ", medico=" + medico
				+ ", paziente=" + paziente + ", esame=" + esame + "]";
	}
	
	
}
