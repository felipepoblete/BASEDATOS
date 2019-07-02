package tata.db;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BaseDeDatosModificar {
	private BaseDeDatos dataBase;
	@Before
	public void setUp() throws Exception {
		this.dataBase = new BaseDeDatos();
		}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void cuandoModificaEntoncesTrue() {
		this.dataBase.agregar(new Dato("A3","DATA DE A3"));
		boolean resultado = this.dataBase.modificar(new Dato("A3", "DATA DE A5"));
		assertTrue(resultado);
	}
	@Test
	public void cuandoNoModificaEntoncesFalse() {
		boolean resultado = this.dataBase.modificar(new Dato("A6", "DATA DE A6"));
		assertFalse(resultado);
	}

}
