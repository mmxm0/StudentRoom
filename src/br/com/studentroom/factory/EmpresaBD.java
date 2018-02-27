package br.com.studentroom.factory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpresaBD {
	public void criaTabela() {
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			ConexaoBD conexao = new ConexaoBD();
			Connection conn = conexao.getConnection();
			System.out.println("Conectado com o Banco de Dados com sucesso...");
			System.out.println("Criando uma tabela no Banco de Dados...");
			stmt = conn.createStatement();
			String sql = "CREATE TABLE empresa (nome VARCHAR(255), "
					+ " cnpj VARCHAR(15) NOT NULL, telefone VARCHAR(20)," + " email VARCHAR(255), qtddSala INT,"
					+ " PRIMARY KEY (cnpj))";
			stmt.executeUpdate(sql);
			System.out.println("Tabela empresa criada no banco de dados com sucesso...");
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
