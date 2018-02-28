package br.com.studentroom.view;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.studentroom.DAO.SalaDAO;
import br.com.studentroom.domain.Sala;


public class SalaView {
	
	private Sala sala;
	
	private ArrayList<Sala>itens;
	private List<Sala>itenProcurado;
	
	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}
	
	

	
	
	
	
}
