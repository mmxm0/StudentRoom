package br.com.studentroom.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.studentroom.domain.Cliente;
import br.com.studentroom.factory.ConexaoBD;

public class ClienteDAO {

	public void salvarCliente(Cliente cliente) throws SQLException, ClassNotFoundException {
		ConexaoBD conexao = new ConexaoBD();
		Connection conn = conexao.getConnection();
		String sql = "INSERT into cliente (cpf, nome, sobrenome,  email, telefone, mensagem) VALUES (?,?,?,?,?,?)";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, cliente.getCpf());
			stmt.setString(2, cliente.getNomeCliente());
			stmt.setString(3, cliente.getSobrenomeCliente());
			stmt.setString(4, cliente.getEmail());
			stmt.setString(5, cliente.getTelefone());
			stmt.setString(6, cliente.getMensagem());
			stmt.execute();
			stmt.close();
			System.out.println("Cliente inserido no banco com sucesso!!!");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void excluirCliente(Cliente cliente) throws SQLException, ClassNotFoundException {
		try {
			ConexaoBD conexao = new ConexaoBD();
			Connection conn = conexao.getConnection();
			String sql = "DELETE from cliente WHERE cpf=?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, cliente.getCpf());
			stmt.execute();
			stmt.close();
			System.out.println("Cliente removido do banco com sucesso!!!");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void editarCliente(Cliente cliente) throws SQLException, ClassNotFoundException {
		ConexaoBD conexao = new ConexaoBD();
		Connection conn = conexao.getConnection();
		String sql = "UPDATE cliente SET telefone = ?, email=?,mensagem=? WHERE cpf=? ";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, cliente.getTelefone());
			stmt.setString(2, cliente.getEmail());
			stmt.setString(3, cliente.getMensagem());
			stmt.setString(4, cliente.getCpf());
			stmt.execute();
			stmt.close();
			System.out.println("Dados do cliente atualizados com sucesso!");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public static Cliente buscarCodigocliente(String cpf) throws SQLException, ClassNotFoundException {
		try {
			ConexaoBD conexao = new ConexaoBD();
			Connection conn = conexao.getConnection();
			String sql = "SELECT * FROM cliente WHERE cpf=?";
			java.sql.PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, cpf);
			ResultSet rs = stmt.executeQuery();
			Cliente cliente = new Cliente();
			if (rs.next()) {
				cliente.setCpf(rs.getString("cpf"));
				cliente.setNomeCliente(rs.getString("nome"));
				cliente.setSobrenomeCliente(rs.getString("sobrenome"));
				cliente.setEmail(rs.getString("email"));
				cliente.setTelefone(rs.getString("telefone"));
				cliente.setMensagem(rs.getString("mensagem"));
			}
			stmt.close();
			return cliente;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Cliente> lista() throws SQLException, ClassNotFoundException {
		try {
			ConexaoBD conexao = new ConexaoBD();
			Connection conn = conexao.getConnection();
			String sql = "SELECT * FROM cliente";
			java.sql.PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			List<Cliente> listaCliente = new ArrayList<Cliente>();
			while (rs.next()) {
				Cliente cliente = new Cliente();
				cliente.setCpf(rs.getString("cpf"));
				cliente.setNomeCliente(rs.getString("nome"));
				cliente.setSobrenomeCliente(rs.getString("sobrenome"));
				cliente.setEmail(rs.getString("email"));
				cliente.setTelefone(rs.getString("telefone"));
				cliente.setMensagem(rs.getString("mensagem"));
				listaCliente.add(cliente);

			}
			stmt.close();
			return listaCliente;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
