package br.com.studentroom.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import br.com.studentroom.domain.Empresa;
import br.com.studentroom.factory.ConexaoBD;


public class EmpresaDAO {
	
	public void salvarEmpresa(Empresa empresa)throws SQLException, ClassNotFoundException{
		ConexaoBD conexao = new ConexaoBD();
		Connection conn =  conexao.getConnection();
		String sql = "INSERT into empresa (cnpj, nome, email, telefone, qtddSala) VALUES (?,?,?,?,?)";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1, empresa.getCnpj());
		stmt.setString(2, empresa.getNomeEmpresa());
		stmt.setString(3, empresa.getEmail());
		stmt.setInt(4, empresa.getQuantidadeSala());
		stmt.execute();
		System.out.println("Empresa inserida no banco com sucesso!!!");
	}
	
	public void excluirEmpresa(Empresa empresa)throws SQLException, ClassNotFoundException{
		ConexaoBD conexao = new ConexaoBD();
		Connection conn = conexao.getConnection();
		String sql = "DELETE from empresa WHERE cnpj=?";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1, empresa.getCnpj());
		stmt.execute();
		System.out.println("Cliente removido do banco com sucesso!!!");

	}
    
	public void editarEmpresa(Empresa empresa)throws SQLException, ClassNotFoundException{
		ConexaoBD conexao = new ConexaoBD();
		Connection conn = conexao.getConnection();
		//TODO: encontrar o erro de lógica;
		String sql = "UPDATE cliente SET telefone = ?, email=?,qtddSala=? WHERE cnpj=? ";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1, empresa.getTelefone());
		stmt.setString(2, empresa.getEmail());
		stmt.setInt(3, empresa.getQuantidadeSala());
		stmt.setString(4, empresa.getCnpj());
		stmt.execute();
		System.out.println("Dados do cliente atualizados com sucesso");
		
	}
	public void buscarCodigoempresa(Empresa empresa)throws SQLException{
		
	}
	public ArrayList<Empresa> lista()throws SQLException{
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
