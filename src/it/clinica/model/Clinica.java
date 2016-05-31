package it.clinica.model;

import java.util.Map;


public  class Clinica {

	
	private Map<String,Medico> medici;
	private Map<String,TipologiaEsame> tipologie;
	private Map<String,Paziente> pazienti;
	
	public Clinica() {}
	
	public Map<String, Medico> getMedici() {
		return medici;
	}
	public void setMedici(Map<String, Medico> medici) {
		this.medici = medici;
	}
	public Map<String, TipologiaEsame> getTipologie() {
		return tipologie;
	}
	public void setTipologie(Map<String, TipologiaEsame> tipologie) {
		this.tipologie = tipologie;
	}
	public Map<String, Paziente> getPazienti() {
		return pazienti;
	}
	public void setPazienti(Map<String, Paziente> pazienti) {
		this.pazienti = pazienti;
	}
	
	
}
