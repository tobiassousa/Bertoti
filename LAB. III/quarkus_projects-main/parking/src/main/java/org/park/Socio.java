package org.park;

public class Socio {
	private String nome;
	private Especificacao espc;
	
	public Socio(String nome, Especificacao espc) {
		this.nome = nome;
		this.espc = espc;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public Especificacao getEspc() {
		return espc;
	}
}
