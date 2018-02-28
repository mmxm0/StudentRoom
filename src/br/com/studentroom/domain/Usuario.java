package br.com.studentroom.domain;
import br.com.studentroom.domain.Empresa;
public class Usuario {
	private Empresa idEmpresa;
	private String senha;
	
	public Usuario () {
		super();
	}
	
	public Usuario(Empresa idEmpresa, String senha) {
		
		super();
		this.idEmpresa= idEmpresa;
		this.senha = senha;
		
	}

	public Empresa getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Empresa idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	

}
