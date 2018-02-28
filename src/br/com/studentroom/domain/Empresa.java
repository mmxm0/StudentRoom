package br.com.studentroom.domain;

import br.com.studentroom.util.Endereco;
public class Empresa {
	
	private String nomeEmpresa;
	private String cnpj;
	private Endereco endereco;
	private String telefone;
	private String email;
	private int quantidadeSala;
	
	
	public Empresa(){
		super();
	}
	
	public Empresa(String codigoEmpresa,String nomeEmpresa,String cnpj,Endereco endereco,String telefone,String email,
			int quantidadeSala) {
		   super();
		   this.nomeEmpresa = nomeEmpresa;
		   this.cnpj=cnpj;
		   this.endereco= endereco;
		   this.telefone=telefone;
		   this.email = email;
		   this.quantidadeSala = quantidadeSala;
		  
	}


	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getQuantidadeSala() {
		return quantidadeSala;
	}

	public void setQuantidadeSala(int quantidadeSala) {
		this.quantidadeSala = quantidadeSala;
	}


}
