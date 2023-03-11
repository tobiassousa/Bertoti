package org.park;

public class Especificacao {
	
	private String idade;
	private String categoria;
	
	public Especificacao(String idade, String categoria) {
		this.idade = idade;
		this.categoria = categoria;
	}
	
	public String getIdade() {
		return idade;
	}
	public String getCategoria() {
		return categoria;
	}
	
	public boolean comparar (Especificacao esp) {
		if(idade.equals(esp.idade)&&categoria.equals(esp.categoria)) {
			return true;
		}else {
			return false;
		}
	}
}