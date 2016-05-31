package beanControllers;

import java.util.Map;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import it.clinica.model.Esame;
import it.clinica.model.Prerequisito;
import it.clinica.model.TipologiaEsame;
import it.clinica.persistence.TipologiaEsameDao;

@ManagedBean
public class TipologiaEsameController {

	@EJB
	private TipologiaEsameDao tipologiaEsameDao;
	private long codice;
	private String nome;
	private String descrizione;
	private float costo;
	private TipologiaEsame tipologiaEsame;
	private Map<String,Esame> esami;
	private Map<String,Prerequisito> prerequisiti;
	
	public String createTipologiaEsame(){
		this.tipologiaEsame = tipologiaEsameDao.createTipologiaEsame(nome, descrizione, costo);
		return "TipologiaEsame";
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

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public float getCosto() {
		return costo;
	}

	public void setCosto(float costo) {
		this.costo = costo;
	}

	public TipologiaEsame getTipologiaEsame() {
		return tipologiaEsame;
	}

	public void setTipologiaEsame(TipologiaEsame tipologiaEsame) {
		this.tipologiaEsame = tipologiaEsame;
	}


	public Map<String, Esame> getEsami() {
		return esami;
	}

	public void setEsami(Map<String, Esame> esami) {
		this.esami = esami;
	}

	public Map<String, Prerequisito> getPrerequisiti() {
		return prerequisiti;
	}

	public void setPrerequisiti(Map<String, Prerequisito> prerequisiti) {
		this.prerequisiti = prerequisiti;
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
		TipologiaEsameController other = (TipologiaEsameController) obj;
		if (codice != other.codice)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TipologiaEsameController [codice=" + codice + ", nome=" + nome + ", descrizione=" + descrizione
				+ ", costo=" + costo + ", esami=" + esami + ", prerequisiti=" + prerequisiti
				+ ", createTipologiaEsame()=" + createTipologiaEsame() + ", getCodice()=" + getCodice() + ", getNome()="
				+ getNome() + ", getDescrizione()=" + getDescrizione() + ", getCosto()=" + getCosto()
				+ ", getTipologiaEsame()=" + getTipologiaEsame() + ", getEsami()=" + getEsami() + ", getPrerequisiti()="
				+ getPrerequisiti() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
