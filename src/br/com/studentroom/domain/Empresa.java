package br.com.studentroom.domain;
import br.com.studentroom.util.*;
import br.com.studentroom.domain.Sala;
public class Empresa {
	private String CodigoEmpresa;
	private String NomeEmpresa;
	private String Cnpj;
	private Endereco endereco;
	private String Telefone;
	private String Email;
	private int QuantidadeSala;
	private Sala  TipoInstalacao;
	
	
	
	
	public String getCodigoEmpresa() {
		return CodigoEmpresa;
	}
	public void setCodigoEmpresa(String codigoEmpresa) {
		CodigoEmpresa = codigoEmpresa;
	}
	public String getNomeEmpresa() {
		return NomeEmpresa;
	}
	public void setNomeEmpresa(String nomeEmpresa) {
		NomeEmpresa = nomeEmpresa;
	}
	public String getCnpj() {
		return Cnpj;
	}
	public void setCnpj(String cnpj) {
		Cnpj = cnpj;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getQuantidadeSala() {
		return QuantidadeSala;
	}
	public void setQuantidadeSala(int quantidadeSala) {
		QuantidadeSala = quantidadeSala;
	}
	public Sala getTipoInstalacao() {
		return TipoInstalacao;
	}
	public void setTipoInstalacao(Sala tipoInstalacao) {
		TipoInstalacao = tipoInstalacao;
	}
	
	
	
	

}
