package org.park;


import java.util.List;
import java.util.LinkedList;

public class Model {
	
	private List<Socio> socio = new LinkedList<Socio>();

	public Model() {
		addSocio(new Socio("Tobias", new Especificacao("18", "Efetivo")));
	}
	
	public void addSocio(Socio socio2){
		socio.add(socio2);
	}
	

	
	
	public List<Socio> buscarEspecificacao(Especificacao esp){
		List<Socio> SocioEncontrados = new LinkedList<Socio>();
		
		for(Socio socio:socio){
			 if(esp.comparar(socio.getEspc())) SocioEncontrados.add(socio);
		}
		
		return SocioEncontrados;
		
	}
	
	
	public List<Socio> buscarIdade(String idade){
		List<Socio> socioEncontrados = new LinkedList<Socio>();
		for(Socio socio:socio) {
			if(socio.getEspc().getIdade().equals(idade)) socioEncontrados.add(socio);
		}
		return socioEncontrados;
	}
	
	public List<Socio> getSocio(){
		return socio;
	}

}
