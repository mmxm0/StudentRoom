package br.com.studentroom.teste;

import br.com.studentroom.factory.DBHelper;

public class TesteDBHelper {

	public static void main(String[] args) {
		// Cria tabelas Sala, CLiente, Empresa, Endereço
		DBHelper tabelaEmpresa = new DBHelper();
		tabelaEmpresa.criaTabelaEmpresa();
		DBHelper tabelaCliente = new DBHelper();
		tabelaCliente.criaTabelaCliente();
		DBHelper tabelaSala = new DBHelper();
		tabelaSala.criaTabelaSala();
		DBHelper tabelaEndereco = new DBHelper();
		tabelaEndereco.criaTabelaEndereco();

	}

}
