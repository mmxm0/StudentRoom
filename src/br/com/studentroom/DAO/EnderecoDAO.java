package br.com.studentroom.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.studentroom.factory.ConexaoBD;
import br.com.studentroom.util.Endereco;

public class EnderecoDAO {
	public void salvarEndereco(Endereco endereco) throws SQLException, ClassNotFoundException {

		ConexaoBD conexao = new ConexaoBD();
		Connection conn = conexao.getConnection();
		String sql = "INSERT into endereco (rua,numero, complemento, bairro, cep, cidade, estado, id_empresa) VALUES(?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, endereco.getRua());
			stmt.setString(2, endereco.getNumero());
			stmt.setString(3, endereco.getComplemento());
			stmt.setString(4, endereco.getBairro());
			stmt.setString(5, endereco.getCep());
			stmt.setString(6, endereco.getCidade());
			stmt.setString(7, endereco.getEstado());
			stmt.setString(8, endereco.getId_empresa());
			stmt.execute();
			stmt.close();
			System.out.println("Endereco inserido no banco com sucesso!!!");

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void excluirSala(Endereco endereco) throws SQLException, ClassNotFoundException {
		try {
			ConexaoBD conexao = new ConexaoBD();
			Connection conn = conexao.getConnection();
			String sql = "DELETE from endereco WHERE id_empresa=?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, endereco.getId_empresa());
			stmt.execute();
			stmt.close();
			System.out.println("Endereco removido do banco com sucesso!!!");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
