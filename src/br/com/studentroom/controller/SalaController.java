package br.com.studentroom.controller;
import java.sql.SQLException;
import java.util.ArrayList;
import br.com.studentroom.DAO.SalaDAO;
import br.com.studentroom.domain.Sala;

//TODO: Metodos buscaLocal e exibirEmpresa;
public class SalaController {
	
	private Sala sala;
	private ArrayList<Sala>itenProcurado;
	
    public void buscasala () {
    	sala = new Sala();
    }
	public ArrayList<Sala> getItenProcurado() {
		return itenProcurado;
	}

	public void setItenProcurado(ArrayList<Sala> itenProcurado) {
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
	
	/*public void procurarlocal()throws SQLException,ClassNotFoundException{
		
		try {
			SalaDAO saladao = new SalaDAO();
			String local;
			//itenProcurado= (ArrayList<Sala>) saladao.buscarLocalSala(local);
			
		}catch(SQLException e) {
			 throw new RuntimeException(e);
		
		
	}*/
	
	

	
	
	
	}	
