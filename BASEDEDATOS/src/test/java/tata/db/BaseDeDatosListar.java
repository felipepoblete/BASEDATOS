package tata.db;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BaseDeDatosListar {
	private BaseDeDatos dataBase;
	@Before
	public void setUp() throws Exception {
		this.dataBase = new BaseDeDatos();
	}
	
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void cuandoNoAgregaEntoncesListaSize0() {
		int largo = this.dataBase.listar().size();
		assertTrue("Es " + largo + " pero debería ser 0", largo == 0);
	}
	@Test
	public void cuandoAgrega1EntoncesListaSize1() {
		this.dataBase.agregar(new Dato("A2","DATA DE A2"));
		int largo = this.dataBase.listar().size();
		assertTrue("Es " + largo + " pero debería ser 1", largo == 1);
	}
	@Test
	public void cuandoAgrega5EntoncesListaSize5() {
		this.dataBase.agregar(new Dato("A1","DATA DE A1"));
		this.dataBase.agregar(new Dato("A2","DATA DE A2"));
		this.dataBase.agregar(new Dato("A3","DATA DE A3"));
		this.dataBase.agregar(new Dato("A4","DATA DE A4"));
		this.dataBase.agregar(new Dato("A5","DATA DE A5"));
		int largo = this.dataBase.listar().size();
		assertTrue("Es " + largo + " pero debería ser 5", largo == 5);
	}

}
