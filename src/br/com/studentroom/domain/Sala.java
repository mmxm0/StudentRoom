package br.com.studentroom.domain;
import br.com.studentroom.domain.Empresa;
public class Sala {
 private int codigoSala;
 private String localSala;
 private String estrutura;
 private String reservaSala;
 private double precoSala;
 //private String horarioDisponivel;
 private Empresa empresa;
 

 public Sala() {
	super();
 }
 
 public Sala(int codigoSala,String localSala,String estrutura,String reservaSala,double precoSala,Empresa empresa ) {
     super();
     this.codigoSala = codigoSala;
     this.localSala = localSala;
     this.estrutura = estrutura;
     this.reservaSala = reservaSala;
     this.precoSala = precoSala;
     //this.horarioDisponivel = horarioDisponivel;
     this.empresa = empresa;
     
 }

 public Empresa getObjEmpresa() {
	return empresa;
}

public void setObjEmpresa(Empresa empresa) {
	this.empresa = empresa;
}

public int getCodigoSala() {
	return codigoSala;
}

public void setCodigoSala(int codigoSala) {
	this.codigoSala = codigoSala;
}

public String getLocalSala() {
	return localSala;
}

public void setLocalSala(String localSala) {
	this.localSala = localSala;
}

public String getEstrutura() {
	return estrutura;
}

public void setEstrutura(String estrutura) {
	this.estrutura = estrutura;
}

public String getReservaSala() {
	return reservaSala;
}

public void setReservaSala(String reservaSala) {
	this.reservaSala = reservaSala;
}

public double getPrecoSala() {
	return precoSala;
}

public void setPrecoSala(double precoSala) {
	this.precoSala = precoSala;
}

 
public String getEmpresaCnpj() {
	return this.empresa.getCnpj();
}
public void setEmpresaCnpj(String cnpj) {
	this.empresa.setCnpj(cnpj);
}
}
 