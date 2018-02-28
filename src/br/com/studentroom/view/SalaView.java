package br.com.studentroom.view;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.studentroom.DAO.SalaDAO;
import br.com.studentroom.domain.Sala;


public class SalaView {
	
	private Sala sala;
	
	public ArrayList<Sala> getItens() {
		return itens;
	}

	public void setItens(ArrayList<Sala> itens) {
		this.itens = itens;
	}

	public List<Sala> getItenProcurado() {
		return itenProcurado;
	}

	public void setItenProcurado(List<Sala> itenProcurado) {
		this.itenProcurado = itenProcurado;
	}

	private ArrayList<Sala>itens;
	private List<Sala>itenProcurado;
	
	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}
	
	

	
	
	
	
}
