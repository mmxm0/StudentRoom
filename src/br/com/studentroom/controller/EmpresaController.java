
package br.com.studentroom.controller;

import javax.faces.component.html.HtmlInputText;

import java.io.Serializable;
import java.sql.SQLException;
import br.com.studentroom.domain.Empresa;
import br.com.studentroom.DAO.EmpresaDAO;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.application.FacesMessage;

@ManagedBean(name = "empresaBean")
@ViewScoped

public class EmpresaController implements Serializable{
	private Empresa empresa;
	private String cnpj;

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public void novaempresa()throws SQLException,ClassNotFoundException {
        Empresa empresa = new Empresa();
        empresa.setCnpj(cnpj);
		try {
			if(empresa.getCnpj()!= null) {
				
				System.out.println("Empresa ja cadastrada!");
			}else {
		      EmpresaDAO empresadao = new EmpresaDAO();
		
		      empresadao.salvarEmpresa(empresa);
			}
		}catch(SQLException e) {
			 throw new RuntimeException(e);
	}
	
}}
