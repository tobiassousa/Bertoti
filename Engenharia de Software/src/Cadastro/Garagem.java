package Cadastro;

import java.util.LinkedList;
import java.util.List;

public class Garagem {
	private List<Onibus>bus = new LinkedList<Onibus>();

	public void cadastrarbus(Onibus bus){
			Onibus.add(Onibus);
	}
	
	public List<Onibus> getOnibus() {
		return bus;
	}

	public void setOnibus(List<Onibus> bus) {
		this.bus = bus;
	}
	

}