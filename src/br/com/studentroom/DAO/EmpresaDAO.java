package br.com.studentroom.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import br.com.studentroom.domain.Empresa;
import br.com.studentroom.domain.Sala;
import br.com.studentroom.factory.ConexaoBD;

public class EmpresaDAO {

	public void salvarEmpresa(Empresa empresa) throws SQLException, ClassNotFoundException {
		try {
			ConexaoBD conexao = new ConexaoBD();
			Connection conn = conexao.getConnection();
			String sql = "INSERT into empresa (cnpj, nome, email, telefone, qtddSala) VALUES (?,?,?,?,?)";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, empresa.getCnpj());
			stmt.setString(2, empresa.getNomeEmpresa());
			stmt.setString(3, empresa.getEmail());
			stmt.setInt(4, empresa.getQuantidadeSala());
			stmt.execute();
			stmt.close();
			System.out.println("Empresa inserida no banco com sucesso!!!");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void excluirEmpresa(Empresa empresa) throws SQLException, ClassNotFoundException {
		ConexaoBD conexao = new ConexaoBD();
		Connection conn = conexao.getConnection();
		String sql = "DELETE from empresa WHERE cnpj=?";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1, empresa.getCnpj());
		stmt.execute();
		stmt.close();
		System.out.println("Cliente removido do banco com sucesso!!!");

	}

	public void editarEmpresa(Empresa empresa) throws SQLException, ClassNotFoundException {
		ConexaoBD conexao = new ConexaoBD();
		Connection conn = conexao.getConnection();
		String sql = "UPDATE empresa SET telefone = ?, email=?,qtddSala=? WHERE cnpj=? ";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, empresa.getTelefone());
			stmt.setString(2, empresa.getEmail());
			stmt.setInt(3, empresa.getQuantidadeSala());
			stmt.setString(4, empresa.getCnpj());
			stmt.execute();
			stmt.close();
			System.out.println("Dados do cliente atualizados com sucesso");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public Empresa buscarCodigoempresa(String cnpj) throws SQLException, ClassNotFoundException {
		ConexaoBD conexao = new ConexaoBD();
		Connection conn = conexao.getConnection();
		String sql = "SELECT * FROM empresa INNER JOIN endereco ON empresa.cnpj=endereco.id_empresa;";
		try {
			java.sql.PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, cnpj);
			ResultSet rs = stmt.executeQuery();
			Empresa empresa = new Empresa();
			if (rs.next()) {
				empresa.setCnpj(rs.getString("cnpj"));
				empresa.setNomeEmpresa(rs.getString("nome"));
				empresa.setTelefone(rs.getString("telefone"));
				empresa.setEmail(rs.getString("email"));
				empresa.setQuantidadeSala(rs.getInt("qtddSala"));

			}
			conn.close();
			return empresa;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Empresa> lista() throws SQLException, ClassNotFoundException {
		try {
			ConexaoBD conexao = new ConexaoBD();
			Connection conn = conexao.getConnection();
			String sql = "SELECT * FROM empresa";
			java.sql.PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			List<Empresa> listaEmpresa = new ArrayList<Empresa>();
			while (rs.next()) {
				Empresa empresa = new Empresa();
				empresa.setCnpj(rs.getString("cnpj"));
				empresa.setNomeEmpresa(rs.getString("nome"));
				empresa.setEmail(rs.getString("email"));
				empresa.setQuantidadeSala(rs.getInt("qtddSala"));
				empresa.setTelefone(rs.getString("telefone"));

			}
			stmt.close();
			return listaEmpresa;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	public List<Sala> listaSalas(String cnpj){
		//TODO: Repensar a necessidade desse método;
		return null;
	}

}
