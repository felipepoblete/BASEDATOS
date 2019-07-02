package tata.db;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BaseDeDatosEliminar {
	private BaseDeDatos dataBase;

	@Before
	public void setUp() throws Exception {
		this.dataBase = new BaseDeDatos();
		this.dataBase.agregar(new Dato("A1", "DATA DE A1"));
		this.dataBase.agregar(new Dato("A2", "DATA DE A2"));
		this.dataBase.agregar(new Dato("A3", "DATA DE A3"));
		this.dataBase.agregar(new Dato("A4", "DATA DE A4"));
		this.dataBase.agregar(new Dato("A5", "DATA DE A5"));
	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void cuandoElimina1Entonces4() {
		this.dataBase.eliminar("A3");
		int largo = this.dataBase.listar().size();
		assertTrue("Es de largo " + largo + " ,pero debería ser 4", largo == 4);
	}

	@Test
	public void cuandoElimina1EntoncesTrue() {
		boolean respuesta = this.dataBase.eliminar("A3");
		assertTrue(respuesta);
	}

	@Test
	public void cuandoNoEliminaEntoncesFalse() {
		boolean respuesta = this.dataBase.eliminar("A10");
		assertFalse(respuesta);
	}

}
