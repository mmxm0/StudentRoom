package br.com.studentroom.domain;
import br.com.studentroom.util.*;
import br.com.studentroom.domain.Sala;
public class Empresa {
	private String codigoEmpresa;
	private String nomeEmpresa;
	private String cnpj;
	private Endereco endereco;
	private String telefone;
	private String email;
	private int quantidadeSala;
	private Sala  tipoInstalacao;
	
	
	
	
	public String getCodigoEmpresa() {
		return codigoEmpresa;
	}
	public void setCodigoEmpresa(String codigoEmpresa) {
		codigoEmpresa = codigoEmpresa;
	}
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	public void setNomeEmpresa(String nomeEmpresa) {
		nomeEmpresa = nomeEmpresa;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		cnpj = cnpj;
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
		telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		email = email;
	}
	public int getQuantidadeSala() {
		return quantidadeSala;
	}
	public void setQuantidadeSala(int quantidadeSala) {
		quantidadeSala = quantidadeSala;
	}
	public Sala getTipoInstalacao() {
		return tipoInstalacao;
	}
	public void setTipoInstalacao(Sala tipoInstalacao) {
		tipoInstalacao = tipoInstalacao;
	}
	
	
	
	

}
