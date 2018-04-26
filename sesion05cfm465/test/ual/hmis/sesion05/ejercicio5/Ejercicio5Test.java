package ual.hmis.sesion05.ejercicio5;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ejercicio5Test {

	@Test
	public void testSinPunto() {
		Ejercicio5 e5 = new Ejercicio5();
		String cadena = "Mayor de edad";
		String resultado=e5.subcadenaHastaPunto(cadena);
		assertEquals("Error: cadena sin punto", resultado);
	}
	@Test
	public void testConDigito() {
		Ejercicio5 e5 = new Ejercicio5();
		String cadena = "Edad 3. años";
		String resultado=e5.subcadenaHastaPunto(cadena);
		assertEquals("Error: cadena con digito", resultado);
	}
	@Test
	public void testCorrecto() {
		Ejercicio5 e5 = new Ejercicio5();
		String cadena = "Menor. De Edad";
		String resultado=e5.subcadenaHastaPunto(cadena);
		assertEquals("Menor.", resultado);
	}
}
