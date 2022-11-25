package Cadastro;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void test() {
		
		Garagem garagem = new Garagem ();
		
		assertEquals(garagem.getOnibus().size(),0);
		
		garagem.cadastraronibus(new Onibus("ABC1111", new Especificacao("ABC1111", "20", "Putim1", "3011")));
		garagem.cadastraronibus(new Onibus("ABC2222", new Especificacao("ABC2222", "20", "Putim", "3015")));
		
		assertEquals(garagem.getOnibus().size(),2);
		
		Onibus busEncontrado = garagem.buscaronibusPorPlaca("ABC2222");
		
		assertEquals(busEncontrado.getEspec().getLinha(), "Putim1");
		
		List<Onibus> busEncontrados = garagem.buscarOnibusPorEspecificacao(new Especificacao("ABC2222", "20", "P", "3015"));
		
		assertEquals(busEncontrados.get(0).getEspec().getLinha(),"Putim");
		
	}

}
