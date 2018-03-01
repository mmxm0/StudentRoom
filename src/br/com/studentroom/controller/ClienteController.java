package br.com.studentroom.view;

import java.sql.SQLException;
import br.com.studentroom.domain.Cliente;
import br.com.studentroom.DAO.ClienteDAO;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
@ManagedBean(name = "MBCliente")
@ViewScoped


public class ClienteView {
	
	
	private Cliente cliente;

	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
		
	public void preparanovocliente() {
		
		 cliente = new Cliente();
		
	}
	
	public void novoCliente()throws SQLException,ClassNotFoundException {
		try {
			ClienteDAO clientedao = new ClienteDAO();
			
			clientedao.salvarCliente(cliente);
			
						
		}catch(SQLException e) {
			 throw new RuntimeException(e);
			
			
		}
	}

}
