package br.com.studentroom.controller;
import java.sql.SQLException;
import java.util.List;
import br.com.studentroom.DAO.SalaDAO;
import br.com.studentroom.domain.Sala;

//TODO: Metodos buscaLocal e exibirEmpresa;
public class SalaController {
	
	private Sala sala;
	private Sala localSala;
	private List<Sala>itenProcurado;
	

	public List<Sala> getItenProcurado() {
		return itenProcurado;
	}

	public void setItenProcurado(List<Sala> itenProcurado) {
		this.itenProcurado = itenProcurado;
	}
	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}
	
	public void prepararsala() {
		sala = new Sala();
	}
	
	public void procurarlocal()throws SQLException,ClassNotFoundException{
		
		
		
		
	}
	
	

	
	
	
	
}