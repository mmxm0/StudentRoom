package br.com.studentroom.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import br.com.studentroom.domain.Cliente;
import br.com.studentroom.factory.ConexaoBD;

public class ClienteDAO {
	
	public void salvarCliente(Cliente cliente)throws SQLException, ClassNotFoundException{
		ConexaoBD conexao = new ConexaoBD();
		Connection conn =  conexao.getConnection();
		String sql = "INSERT into cliente (cpf, nome, sobrenome, rg, codigoendereco, email, telefone, mensagem) VALUES (?,?,?,?,?,?,?,?)";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1,cliente.getCpf());
		stmt.setString(2,cliente.getNomeCliente());
		stmt.setString(3,cliente.getSobrenomeCliente());
		stmt.setString(4,cliente.getRg());
		stmt.setString(5,cliente.getEndereco());
		stmt.setString(6,cliente.getEmail());
		stmt.setString(7, cliente.getTelefone());
		stmt.setString(8, cliente.getMensagem());
		stmt.execute();
		System.out.println("Cliente inserido no banco com sucesso!!!");
	}
	public void excluirCliente(Cliente cliente)throws SQLException, ClassNotFoundException{
		ConexaoBD conexao = new ConexaoBD();
		Connection conn = conexao.getConnection();
		String sql = "DELETE from cliente WHERE cpf=?";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1, cliente.getCpf());
		stmt.execute();
		System.out.println("Cliente removido do banco com sucesso!!!");
	}
	
	public void editarCliente(Cliente cliente)throws SQLException, ClassNotFoundException{
		ConexaoBD conexao = new ConexaoBD();
		Connection conn = conexao.getConnection();
		Cliente buscaCliente = ClienteDAO.buscarCodigocliente(cliente.getCpf());
		//TODO: encontrar o erro nessa porra
		if ( buscaCliente.getCpf()== cliente.getCpf()) {
			String sql = "UPDATE cliente SET telefone = ?, codigoendereco=?,email=?,mensagem=? WHERE cpf=? ";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, cliente.getTelefone());
			stmt.setString(2, cliente.getEndereco());
			stmt.setString(3, cliente.getEmail());
			stmt.setString(4, cliente.getEmail());
			stmt.setString(5, cliente.getCpf());
			stmt.executeQuery();
			System.out.println("Dados do cliente atualizados com sucesso");
		}else {System.out.println("Cliente não encontrado na base de dados...");}
	}
    public static Cliente buscarCodigocliente(String cpf)throws SQLException, ClassNotFoundException{
    	ConexaoBD conexao = new ConexaoBD();
		Connection conn = conexao.getConnection();
		String sql = "SELECT * FROM cliente WHERE cpf=?";
		java.sql.PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1,cpf);
		ResultSet rs = stmt.executeQuery();
		Cliente cliente = new Cliente();
		if(rs.next()) {
			cliente.setCpf(rs.getString("cpf"));
			cliente.setEmail(rs.getString("email"));
			cliente.setEndereco(rs.getString("codigoendereco"));
			cliente.setMensagem(rs.getString("mensagem"));
			cliente.setRg(rs.getString("rg"));
			cliente.setNomeCliente(rs.getString("nome"));
			cliente.setSobrenomeCliente(rs.getString("sobrenome"));
			cliente.setTelefone(rs.getString("telefone"));
			//System.out.println("O cliente "+cliente.getNomeCliente()+" está no bd ");
		}

		return cliente;
    }
    public ArrayList<Cliente> lista()throws SQLException{
    	
    return null;
    }
	

}
