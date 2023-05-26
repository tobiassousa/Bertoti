package org.park;

public class Especificacao {

	private String nome;
	private String diretor;
	private String ano;

	public Especificacao(String nome, String diretor, String ano){
		this.nome = nome;
		this.diretor = diretor;
		this.ano = ano;
	}

	public String getNome(){
		return nome;
	}

	public String getDiretor(){
		return diretor;
	}

	public String getAno(){
		return ano;
	}

	public boolean comparar(Especificacao esp){
		if(nome.equals(esp.nome) && diretor.equals(esp.diretor) && ano.equals(esp.ano)){
			return true;
		} else {
			return false;
		}
	}

}