package org.park;

public class Produto {

	private String codigo;
	private Especificacao espc;

	public Produto(String codigo, Especificacao espc){
		this.codigo = codigo;
		this.espc = espc;

	}

	public String getCodigo(){
		return this.codigo;
	}

	public Especificacao getEspc(){
		return espc;
	}


}