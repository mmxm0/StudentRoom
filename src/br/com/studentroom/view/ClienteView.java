package br.com.studentroom.view;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.studentroom.domain.Cliente;
import br.com.studentroom.DAO.ClienteDAO;
import br.com.studentroom.factory.ConexaoBD;

@SuppressWarnings("unused")
public class ClienteView {
	
	
	private Cliente cliente;

	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
		
	public void preparanovocliente() {
		@SuppressWarnings("unused")
		Cliente cliente = new Cliente();
		
	}
	
	public void novoCliente()throws SQLException,ClassNotFoundException {
		try {
			ClienteDAO clientedao = new ClienteDAO();
			
			clientedao.salvarCliente(cliente);
			
			System.out.println("Cliente Salvo com sucesso");
			
		}catch(SQLException e) {
			 throw new RuntimeException(e);
			
			
		}
	}

}
