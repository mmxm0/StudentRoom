package br.com.studentroom.util;

public class Endereco {
	private String rua;

	private String numero;

	private String complemento;

	private String bairro;

	private String cep;

	private String cidade;

	private String estado;

	private String id_empresa;
	public Endereco() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Endereco(String rua, String numero, String complemento, String bairro, String cep, String cidade,
			String estado, String id_empresa) {
		super();
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
		this.id_empresa = id_empresa;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getId_empresa() {
		return id_empresa;
	}
	
	public void setId_empresa(String id) {
		this.id_empresa = id;
	}
}
