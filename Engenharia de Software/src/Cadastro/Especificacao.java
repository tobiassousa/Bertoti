package Cadastro;

public class Especificacao {
	private String placa;
	private String combustivel_gasto;
	private String linha;
	private String numero_do_onibus;
	private String km;
	 
	
	
	public Especificacao(String placa, String combustivel_gasto, String linha, String numero_do_onibus, String km, String media ) {
		this.placa = placa;
		this.combustivel_gasto = combustivel_gasto;
		this.linha = linha;
		this.numero_do_onibus = numero_do_onibus;
		this.km = km; 
		
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getCombustivel_gasto() {
		return combustivel_gasto;
	}
	
	public void setCombustivel_gasto(String combustivel_gasto) {
		this.combustivel_gasto = combustivel_gasto;
	}
	
	public String getLinha() {
		return linha;
	}
	
	public void setLinha(String linha) {
		this.linha = linha;
	}
	
	public String getNumero_do_onibus() {
		return numero_do_onibus;
	}
	
	public void setNumero_do_onibus(String numero_do_onibus) {
		this.numero_do_onibus = numero_do_onibus;
	}
	
	public String getkm() {
		return km;
	}
	
	public void setkm(String km) {
		this.km = km;
	}
	
	public boolean comparar(Especificacao especificacao) {
		if(linha.equals(especificacao.linha)&&
				numero_do_onibus.equals(especificacao.numero_do_onibus)) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
	
	
	
}