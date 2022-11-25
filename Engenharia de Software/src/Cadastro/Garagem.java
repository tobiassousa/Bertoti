package Cadastro;

import java.util.LinkedList;
import java.util.List;

public class Garagem {
	private List<Onibus>bus = new LinkedList<Onibus>();

	public void cadastraronibus(Onibus onibus){
			bus.add(onibus);
	}
	
	public List<Onibus> buscarOnibusPorEspecificacao(Especificacao espec) {
		List<Onibus> busEncontrados = new LinkedList<Onibus>();
		for(Onibus onibus:bus) {
			if(onibus.getEspec().comparar(espec)) busEncontrados.add(onibus);
		}
		return busEncontrados;
	}
	
	public Onibus buscaronibusPorPlaca(String placa) {
			for(Onibus onibus:bus) {
				if(onibus.getPlaca().equals(placa)) {
					return onibus;
				}	
			}
			return null;
	}
}