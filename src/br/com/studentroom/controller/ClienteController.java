package br.com.studentroom.controller
;

import java.sql.SQLException;
import br.com.studentroom.domain.Cliente;
import br.com.studentroom.DAO.ClienteDAO;



public class ClienteController {
	
	
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
