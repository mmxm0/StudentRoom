package br.com.studentroom.view;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.PreparedStatement;
import br.com.studentroom.domain.Empresa;
import br.com.studentroom.DAO.EmpresaDAO;

public class EmpresaView {
	private Empresa empresa;
	private ArrayList<Empresa>itens;
	
	
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public ArrayList<Empresa> getItens() {
		return itens;
	}
	public void setItens(ArrayList<Empresa> itens) {
		this.itens = itens;
	}
	
	
	public void preparanovaempresa() {
		
		empresa = new Empresa();
			
	}
	
	public void novaempresa()throws SQLException,ClassNotFoundException {
		try {
		EmpresaDAO empresadao = new EmpresaDAO();
		
		empresadao.salvarEmpresa(empresa);
		
		}catch(SQLException e) {
			 throw new RuntimeException(e);
	}
	
	}
	
	
	public void excluirempresaview()throws SQLException,ClassNotFoundException{
		
		try {
			EmpresaDAO empresadao = new EmpresaDAO();
			
			empresadao.excluirEmpresa(empresa);
			
		}catch(SQLException e) {
			 throw new RuntimeException(e);
	
		
	  }
	}		
		
		
  public  void  atualizarempresa()throws SQLException,ClassNotFoundException{
		
		try {
			EmpresaDAO empresadao = new EmpresaDAO();
			
			
			if(empresa.getCnpj()!= null) {
				
				empresadao.editarEmpresa(empresa);
			}else {
				
				System.out.println("Empresa nao cadastrada.");
			}
			
			
		}catch(SQLException e) {
			 throw new RuntimeException(e);
		

	}
	
  }	
	
	

}
