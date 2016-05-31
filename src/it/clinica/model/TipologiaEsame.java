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
@NamedQuery(name="findAllTipologie",query="SELECT t FROM TipologiaEsame t")
public class TipologiaEsame {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long codice;
	private String nome;
	private String descrizione;
	private float costo;
	@OneToMany(mappedBy="tipologia")
	private Map<String,Esame> esami;
	@OneToMany
	private Map<String,Prerequisito> prerequisiti;
	
	public TipologiaEsame(String nome, String descrizione, float costo) {
		this.nome = nome;
		this.descrizione = descrizione;
		this.costo = costo;
		this.esami=new HashMap<>();
		this.prerequisiti=new HashMap<>();
	}

	public TipologiaEsame() {}

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

	public Map<String,Prerequisito> getPrerequisiti() {
		return prerequisiti;
	}

	public void setPrerequisiti(Map<String,Prerequisito> prerequisiti) {
		this.prerequisiti = prerequisiti;
	}

	public Map<String,Esame> getEsami() {
		return esami;
	}

	public void setEsami(Map<String,Esame> esami) {
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
		TipologiaEsame other = (TipologiaEsame) obj;
		if (codice != other.codice)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TipologiaEsame [codice=" + codice + ", nome=" + nome + ", descrizione=" + descrizione + ", costo="
				+ costo + ", esami=" + esami + ", prerequisiti=" + prerequisiti + "]";
	}


	
	
	
	
}
