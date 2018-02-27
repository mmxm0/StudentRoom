package br.com.studentroom.domain;


public class Cliente {
	private String nomeCliente;
	private String sobrenomeCliente;
	private String cpf;
	private String email;
	private String telefone;
	private String mensagem;
	
	
	
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(String nomeCliente, String sobrenomeCliente, String cpf,  String email,
			String telefone, String mensagem) {
		super();
		this.nomeCliente = nomeCliente;
		this.sobrenomeCliente = sobrenomeCliente;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.mensagem = mensagem;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getSobrenomeCliente() {
		return sobrenomeCliente;
	}
	public void setSobrenomeCliente(String sobrenomeCliente) {
		this.sobrenomeCliente = sobrenomeCliente;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	
}
