package br.com.studentroom.controller;
import java.sql.SQLException;
import br.com.studentroom.domain.Empresa;
import br.com.studentroom.DAO.EmpresaDAO;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.application.FacesMessage;
@ManagedBean(name="empresaBean")
@RequestScoped


public class EmpresaController {
	private Empresa empresa;
	
	
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	
	
	public void preparanovaempresa() {
		
		empresa = new Empresa();
			
	}
	
	public void novaempresa()throws SQLException,ClassNotFoundException {
		try {
			if(empresa.getCnpj()!= null) {
				
				System.out.println("Empresa ja cadastrada!");
			}else {
		      EmpresaDAO empresadao = new EmpresaDAO();
		
		      empresadao.salvarEmpresa(empresa);
			}
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
