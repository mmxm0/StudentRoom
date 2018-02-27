package br.com.studentroom.domain;
import br.com.studentroom.domain.Empresa;
public class Sala {
 private String codigoSala;
 private String localSala;
 private String estrutura;
 private String reservaSala;
 private double precoSala;
 private String horarioDisponivel;
 @SuppressWarnings("unused")
private Empresa empresa;
 public Empresa getEmpresa() {
	return empresa;
}

public void setEmpresa(Empresa empresa) {
	this.empresa = empresa;
}

//TODO: Criar atributo Empresa get e set
 public Sala() {
	super();
 }
 
 public Sala(String codigoSala,String localSala,String estrutura,String reservaSala,double precoSala,String horarioDisponivel,Empresa empresa ) {
     super();
     
     this.codigoSala = codigoSala;
     this.localSala = localSala;
     this.estrutura = estrutura;
     this.reservaSala = reservaSala;
     this.precoSala = precoSala;
     this.horarioDisponivel = horarioDisponivel;
     this.empresa = empresa;
     
 }

public String getCodigoSala() {
	return codigoSala;
}

public void setCodigoSala(String codigoSala) {
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

public String getHorarioDisponivel() {
	return horarioDisponivel;
}

public void setHorarioDisponivel(String horarioDisponivel) {
	this.horarioDisponivel = horarioDisponivel;
}
 
public Empresa getempresa() {
	return empresa;
}
 
 public  void setempresa(Empresa empresa) {
	 this.empresa = empresa;
 }
}
 
 
 
 
