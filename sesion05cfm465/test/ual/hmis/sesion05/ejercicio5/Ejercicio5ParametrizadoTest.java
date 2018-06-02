package ual.hmis.sesion05.ejercicio5;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Ejercicio5ParametrizadoTest {
	private String cadena;
	private String salida;
	private Ejercicio5 e5;

	public Ejercicio5ParametrizadoTest(String cadena, String resultado){
		this.cadena=cadena;
		this.salida=resultado;
	}

	@Before
	public void  setUp() throws Exception{
		e5= new Ejercicio5();
	}

	@Parameters
	public static Collection<Object[]> addedNumbers(){
		return Arrays.asList(new Object[][]{
			{"Mayor de edad","Error: cadena sin punto"},
			{"Edad 3. años","Error: cadena con digito"},
			{"Menor. De Edad","Menor."},

		});
	}

	@Test
	public void testCadena() {
		assertEquals(salida, e5.subcadenaHastaPunto(cadena));
	}

}
