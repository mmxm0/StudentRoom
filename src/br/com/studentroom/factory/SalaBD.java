package br.com.studentroom.factory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SalaBD {
	public void criaTabela() {
		Statement stmt = null;
		try { 
			Class.forName("com.mysql.jdbc.Driver");
			ConexaoBD conexao = new ConexaoBD();
			Connection conn = conexao.getConnection();
			System.out.println("Conectado com o Banco de Dados com sucesso...");
			System.out.println("Criando uma tabela no Banco de Dados...");
			stmt = conn.createStatement();
			String sql = "CREATE TABLE sala (codigo INT NOT NULL AUTO_INCREMENT,  "
					+ "local VARCHAR(255), estrutura VARCHAR(255),"
					+ " reserva VARCHAR(255), preco DOUBLE,  id_empresa VARCHAR(14), PRIMARY KEY (codigo))";
			stmt.executeUpdate(sql);
			System.out.println("Tabela sala criada no banco de dados com sucesso...");
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
