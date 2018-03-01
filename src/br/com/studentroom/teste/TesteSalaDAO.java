package br.com.studentroom.teste;

import java.sql.SQLException;

import br.com.studentroom.DAO.EmpresaDAO;
import br.com.studentroom.DAO.SalaDAO;
import br.com.studentroom.domain.Empresa;
import br.com.studentroom.domain.Sala;

public class TesteSalaDAO {
	public static void main(String[]args) throws ClassNotFoundException, SQLException {
			Empresa empresa = new Empresa();
			empresa.setCnpj("123");
			EmpresaDAO acessoDAOEmpresa = new EmpresaDAO();
			acessoDAOEmpresa.salvarEmpresa(empresa);
			Sala s1 = new Sala("BV","computador, 3 tomadas","123",2.3,empresa);
			SalaDAO acessoDAO = new SalaDAO();
			acessoDAO.salvarSala(s1);
			acessoDAO.buscarCodigoSala("123");
			acessoDAO.excluirSala(s1);
			
	}

}
