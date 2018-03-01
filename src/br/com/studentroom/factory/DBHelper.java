package br.com.studentroom.factory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DBHelper {
	public void criaTabelaCliente() {
		try {
			Statement stmt = null;
			Class.forName("com.mysql.jdbc.Driver");
			ConexaoBD conexao = new ConexaoBD();
			Connection conn = conexao.getConnection();
			System.out.println("Conectado com o Banco de Dados com sucesso...");
			System.out.println("Criando uma tabela no Banco de Dados...");
			stmt = conn.createStatement();
			String sql = "CREATE TABLE cliente (cpf VARCHAR(11) not NULL, " + " nome VARCHAR(255), sobrenome VARCHAR(255),"
					+ " email VARCHAR(255), telefone VARCHAR(20), mensagem VARCHAR(255),"+
					" PRIMARY KEY (cpf))";
			stmt.executeUpdate(sql);
			System.out.println("Tabela cliente criada no banco de dados com sucesso...");
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public void criaTabelaEmpresa() {

		try {
			Statement stmt = null;
			Class.forName("com.mysql.jdbc.Driver");
			ConexaoBD conexao = new ConexaoBD();
			Connection conn = conexao.getConnection();
			System.out.println("Conectado com o Banco de Dados com sucesso...");
			System.out.println("Criando uma tabela no Banco de Dados...");
			stmt = conn.createStatement();
			String sql = "CREATE TABLE empresa (nome VARCHAR(255), "
					+ " cnpj VARCHAR(15) NOT NULL, telefone VARCHAR(20)," + " email VARCHAR(255), "
					+ " PRIMARY KEY (cnpj))";
			stmt.executeUpdate(sql);
			System.out.println("Tabela empresa criada no banco de dados com sucesso...");
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void criaTabelaSala() {

		try { 
			Statement stmt = null;
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
	public void criaTabelaEndereco() {

		try {
			Statement stmt = null;
			Class.forName("com.mysql.jdbc.Driver");
			ConexaoBD conexao = new ConexaoBD();
			Connection conn = conexao.getConnection();
			System.out.println("Conectado com o Banco de Dados com sucesso...");
			System.out.println("Criando uma tabela no Banco de Dados...");
			stmt = conn.createStatement();
			String sql = "CREATE TABLE endereco (codigo INT NOT NULL AUTO_INCREMENT,  "
					+ "rua VARCHAR(255), numero CHAR(8),"
					+ " complemento VARCHAR(255), bairro VARCHAR(50), cep CHAR(8) ,cidade VARCHAR(50), estado VARCHAR(50),id_empresa VARCHAR(14), PRIMARY KEY (codigo))";
			stmt.executeUpdate(sql);
			System.out.println("Tabela endereço criada no banco de dados com sucesso...");
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
}
