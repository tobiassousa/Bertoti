package Cadastro;

public class Especificacao {
	private String linha;
	private String numero_do_onibus;
	private String km;
	 
	
	
	public Especificacao(String linha, String numero_do_onibus, String km, String media ) {
		this.linha = linha;
		this.numero_do_onibus = numero_do_onibus;
		this.km = km; 
		
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