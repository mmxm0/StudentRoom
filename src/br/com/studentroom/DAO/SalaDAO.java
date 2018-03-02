package br.com.studentroom.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.studentroom.domain.Sala;
import br.com.studentroom.factory.ConexaoBD;

public class SalaDAO {

	public void salvarSala(Sala sala) throws SQLException, ClassNotFoundException {

		ConexaoBD conexao = new ConexaoBD();
		Connection conn = conexao.getConnection();
		String sql = "INSERT into sala (local,estrutura, reserva,  preco, id_empresa) VALUES(?,?,?,?,?)";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, sala.getLocalSala());
			stmt.setString(2, sala.getEstrutura());
			stmt.setString(3, sala.getReservaSala());
			stmt.setDouble(4, sala.getPrecoSala());
			stmt.setString(5, sala.getEmpresaCnpj());
			stmt.execute();
			stmt.close();
			System.out.println("Sala inserida no banco com sucesso!!!");

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void excluirSala(Sala sala) throws SQLException, ClassNotFoundException {
		try {
			ConexaoBD conexao = new ConexaoBD();
			Connection conn = conexao.getConnection();
			String sql = "DELETE from sala WHERE id_empresa=?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, sala.getEmpresaCnpj());
			stmt.execute();
			stmt.close();
			System.out.println("Sala removida com sucesso!!!");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void editarSala(Sala sala) throws SQLException, ClassNotFoundException {
		ConexaoBD conexao = new ConexaoBD();
		Connection conn = conexao.getConnection();
		String sql = "UPDATE sala e SET preco = ?, reserva=?,estrutura=? WHERE codigo=? ";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setDouble(1, sala.getPrecoSala());
			stmt.setString(2, sala.getReservaSala());
			stmt.setString(3, sala.getEstrutura());
			stmt.setInt(4, sala.getCodigoSala());
			stmt.execute();
			stmt.close();
			System.out.println("Dados da sala atualizados com sucesso!");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Sala buscarCodigoSala(String id_empresa) throws SQLException, ClassNotFoundException {
		try {
			ConexaoBD conexao = new ConexaoBD();
			Connection conn = conexao.getConnection();
			String sql = "SELECT * FROM sala INNER JOIN empresa ON sala.id_empresa=cnpj";
			java.sql.PreparedStatement stmt = conn.prepareStatement(sql);
			//stmt.setString(1, id_empresa);
			ResultSet rs = stmt.executeQuery();
			Sala sala = new Sala();
			if (rs.next()) {
				sala.setCodigoSala(rs.getInt("codigo"));
				sala.setReservaSala(rs.getString("reserva"));
				sala.setLocalSala(rs.getString("local"));
				sala.setPrecoSala(rs.getDouble("preco"));
				sala.setEstrutura(rs.getString("estrutura"));
				//sala.setEmpresaCnpj(rs.getString("id_empresa"));//cnpj da empresa
			}
			stmt.close();
			return sala;
	} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
<<<<<<< refs/remotes/origin/desenvolve
	public void buscarLocalSala(String localSala) throws ClassNotFoundException {
		
		/* fazer por lista */
		try {
			ConexaoBD conexao = new ConexaoBD();
			Connection conn = conexao.getConnection();
			String sql = "SELECT * FROM sala WHERE local=?";
			java.sql.PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, localSala);
			ResultSet rs = stmt.executeQuery();
			Sala sala = new Sala();
			
			if (rs.next()) {
				sala.setCodigoSala(rs.getInt("codigo"));
				sala.setEstrutura(rs.getString("estrutura"));
				sala.setLocalSala(rs.getString("local"));
				sala.setPrecoSala(rs.getDouble("preco"));
				String qrry = rs.getString("id_empresa");//cnpj da empresa
				sala.setEmpresaCnpj(qrry);
				EmpresaDAO dao1 = new EmpresaDAO();
				sala.setObjEmpresa(dao1.buscarCodigoempresa(qrry));
			
		}else {
			stmt.close();
				
		}
	}catch (SQLException e){
		throw new RuntimeException(e);
		
	}
	
	}	
=======
>>>>>>> Commit do desespero
	public List<Sala> lista() throws SQLException, ClassNotFoundException {
		try {
			ConexaoBD conexao = new ConexaoBD();
			Connection conn = conexao.getConnection();
			String sql = "SELECT * FROM sala";
			java.sql.PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			List<Sala> listaSalas = new ArrayList<Sala>();
			while (rs.next()) {
				Sala sala = new Sala();
				sala.setCodigoSala(rs.getInt("codigo"));
				sala.setEstrutura(rs.getString("estrutura"));
				sala.setLocalSala(rs.getString("local"));
				sala.setPrecoSala(rs.getDouble("preco"));
				String qrry = rs.getString("id_empresa");
				sala.setEmpresaCnpj(qrry);
				EmpresaDAO dao1 = new EmpresaDAO();
				sala.setObjEmpresa(dao1.buscarCodigoempresa(qrry));
				listaSalas.add(sala);

			}
			stmt.close();
			return listaSalas;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
