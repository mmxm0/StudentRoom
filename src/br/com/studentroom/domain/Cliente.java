package br.com.studentroom.domain;
import br.com.studentroom.util.*;
public class Cliente {
	@SuppressWarnings("unused")
	private String CodigoCliente;
	private String NomeCliente;
	private String Cpf;
	private String Rg;
	private Endereco endereco;
	private String Email;
	private String Telefone;
	private String PlanoContratado;
	private String TurnoParaEstudo;
	
	public String getCodigoCliente() {
		return getCodigoCliente();
	}
	public void setCodigoCliente(String codigoCliente) {
		CodigoCliente = codigoCliente;
	}
	public String getNomeCliente() {
		return NomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		NomeCliente = nomeCliente;
	}
	public String getCPF() {
		return Cpf;
	}
	public void setCPF(String cPF) {
		Cpf = cPF;
	}
	public String getRG() {
		return Rg;
	}
	public void setRG(String rG) {
		Rg = rG;
	}
	public Endereco getendereco() {
		return endereco;
	}
	public void setendereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	public String getPlanoContratado() {
		return PlanoContratado;
	}
	public void setPlanoContratado(String planoContratado) {
		PlanoContratado = planoContratado;
	}
	public String getTurnoParaEstudo() {
		return TurnoParaEstudo;
	}
	public void setTurnoParaEstudo(String turnoParaEstudo) {
		TurnoParaEstudo = turnoParaEstudo;
	}
	
	
	

}
