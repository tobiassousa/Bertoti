package Cadastro;

public class Onibus {
	private String placa;
	private Especificacao espec;
	
	public Onibus(String placa, Especificacao espec){
		this.placa = placa;
		this.espec = espec;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public Especificacao getEspec() {
		return espec;
	}
	
	public void setEspec(Especificacao espec) {
		this.espec = espec;
	}
	

}