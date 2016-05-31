package it.clinica.controller;

import it.clinica.model.Admin;
import it.clinica.model.Clinica;
import it.clinica.model.Esame;
import it.clinica.model.Medico;
import it.clinica.model.Paziente;
import it.clinica.model.TipologiaEsame;

public class PortaleClinica {

	private Clinica clinica;
	private Paziente pazienteCorrente;
	private TipologiaEsame tipologiaCorrente;
	private Esame esameCorrente;
	private Medico mediCorrente;
	private Admin adminCorrente;
	
	public PortaleClinica() {}
	
	public PortaleClinica(Clinica clinica, Paziente pazienteCorrente, TipologiaEsame tipologiaCorrente,
			Esame esameCorrente, Medico mediCorrente, Admin adminCorrente) {
		super();
		this.clinica = clinica;
		this.pazienteCorrente = pazienteCorrente;
		this.tipologiaCorrente = tipologiaCorrente;
		this.esameCorrente = esameCorrente;
		this.mediCorrente = mediCorrente;
		this.adminCorrente = adminCorrente;
	}
	public Clinica getClinica() {
		return clinica;
	}
	public void setClinica(Clinica clinica) {
		this.clinica = clinica;
	}
	public Paziente getPazienteCorrente() {
		return pazienteCorrente;
	}
	public void setPazienteCorrente(Paziente pazienteCorrente) {
		this.pazienteCorrente = pazienteCorrente;
	}
	public TipologiaEsame getTipologiaCorrente() {
		return tipologiaCorrente;
	}
	public void setTipologiaCorrente(TipologiaEsame tipologiaCorrente) {
		this.tipologiaCorrente = tipologiaCorrente;
	}
	public Esame getEsameCorrente() {
		return esameCorrente;
	}
	public void setEsameCorrente(Esame esameCorrente) {
		this.esameCorrente = esameCorrente;
	}
	public Medico getMediCorrente() {
		return mediCorrente;
	}
	public void setMediCorrente(Medico mediCorrente) {
		this.mediCorrente = mediCorrente;
	}
	public Admin getAdminCorrente() {
		return adminCorrente;
	}
	public void setAdminCorrente(Admin adminCorrente) {
		this.adminCorrente = adminCorrente;
	}

	@Override
	public String toString() {
		return "PortaleClinica [clinica=" + clinica + ", pazienteCorrente=" + pazienteCorrente + ", tipologiaCorrente="
				+ tipologiaCorrente + ", esameCorrente=" + esameCorrente + ", mediCorrente=" + mediCorrente
				+ ", adminCorrente=" + adminCorrente + "]";
	}
	
	
	
	
	
}
