package br.com.studentroom.domain;

public class Sala {
 private String codigoSala;
 private String localSala;
 private String estrutura;
 private String reservaSala;
 private double precoSala;
 private String horarioDisponivel;
 //TODO: Criar atributo Empresa get e set
 public Sala() {
	super();
 }
 
 public Sala(String codigoSala,String localSala,String estrutura,String reservaSala,double precoSala,String horarioDisponivel ) {
     super();
     
     this.codigoSala = codigoSala;
     this.localSala = localSala;
     this.estrutura = estrutura;
     this.reservaSala = reservaSala;
     this.precoSala = precoSala;
     this.horarioDisponivel = horarioDisponivel;
     
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
 
 
 
}
 
 
 
 
