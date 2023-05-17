package testes;

import org.junit.Test;

import metodos.MetodosDeTestes;

public class ValidarTitile {

	MetodosDeTestes metodo = new MetodosDeTestes();
	
	
	@Test
	public void testValidarTitle() {
		metodo.abrirNavegador();
		metodo.printScreen ("CT01 - ValidarTitle");
		metodo.fecharNavegador();
				
	}
	
	
}
