package br.com.studentroom.teste;

import java.sql.SQLException;

import br.com.studentroom.DAO.EmpresaDAO;
import br.com.studentroom.domain.Empresa;
import br.com.studentroom.factory.EmpresaBD;
import br.com.studentroom.util.Endereco;
public class TesteEmpresa {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	 EmpresaBD bancoEmpresa = new EmpresaBD();
	 bancoEmpresa.criaTabela();
	 Endereco  endereco = new Endereco("115","16","prox. a","São José","5433333","Recife","PE");
	 Empresa e1 = new Empresa("1234","Empresa Falsa S/A","12345123451234",endereco,"354123","a@mail.com");
	 EmpresaDAO setDB = new EmpresaDAO();
	 setDB.salvarEmpresa(e1);
	}

}
