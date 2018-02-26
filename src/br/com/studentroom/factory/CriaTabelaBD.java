package br.com.studentroom.factory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriaTabelaBD {
	public void criaTabela(String nomeTabela) {
		Statement stmt = null;
		try { 
			Class.forName("com.mysql.jdbc.Driver");
			ConexaoBD conexao = new ConexaoBD();
			Connection conn = conexao.getConnection();
			System.out.println("Conectado com o Banco de Dados com sucesso...");
			System.out.println("Criando uma tabela no Banco de Dados...");
			stmt = conn.createStatement();
			String sql = "CREATE TABLE "+nomeTabela + "(cpf VARCHAR(11) not NULL, " + " nome VARCHAR(255), sobrenome VARCHAR(255),"
					+ "rg VARCHAR(7), codigoendereco VARCHAR(200), email VARCHAR(255), telefone VARCHAR(20), mensagem VARCHAR(255),"+
					" PRIMARY KEY (cpf))";
			stmt.executeUpdate(sql);
			System.out.println("Tabela "+nomeTabela+" criada no banco de dados com sucesso...");
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}
