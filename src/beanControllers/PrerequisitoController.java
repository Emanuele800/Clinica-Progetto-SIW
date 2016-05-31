package beanControllers;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import it.clinica.model.Prerequisito;
import it.clinica.persistence.PrerequisitoDao;

@ManagedBean
public class PrerequisitoController {
	
	@EJB
	private PrerequisitoDao prerequisitoDao;
	private String nome;
	private String descrizione;
	private Prerequisito prerequisito;
	
	public String createPrerequisito(){
		this.prerequisito = prerequisitoDao.createPrerequisito(nome, descrizione);
		return "prerequisito";
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

	public Prerequisito getPrerequisito() {
		return prerequisito;
	}

	public void setPrerequisito(Prerequisito prerequisito) {
		this.prerequisito = prerequisito;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descrizione == null) ? 0 : descrizione.hashCode());
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
		PrerequisitoController other = (PrerequisitoController) obj;
		if (descrizione == null) {
			if (other.descrizione != null)
				return false;
		} else if (!descrizione.equals(other.descrizione))
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
		return "PrerequisitoController [nome=" + nome + ", descrizione=" + descrizione + ", prerequisito="
				+ prerequisito + "]";
	}

	
}
