package ual.hmis.sesion05.ejercicio3;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Ejercicio3ParametrizadoTest {
	private int numero;
	private String salida;
	private Ejercicio3 e3;

	public Ejercicio3ParametrizadoTest(int numero, String resultado){
		this.numero=numero;
		this.salida=resultado;
	}

	@Before
	public void  setUp() throws Exception{
		e3= new Ejercicio3();
	}

	@Parameters
	public static Collection<Object[]> addedNumbers(){
		return Arrays.asList(new Object[][]{
			{-1,"numero erroneo"},
			{2,"**"},
			{5,"*****"},
			{0,""},
		});
	}


	@Test
	public void testCadena() {
		assertEquals(salida, e3.cadenaAsteriscos(numero));
	}

}
