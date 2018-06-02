package ual.hmis.sesion05.ejercicio3;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ejercicio3Test {

	@Test
	public void testCadenaAsteriscosNegativo() {
		Ejercicio3 e3 = new Ejercicio3();
		int num = -1;
		String resultado = e3.cadenaAsteriscos(num);
		assertEquals("numero erroneo", resultado);
	}
	@Test
	public void testCadenaAsteriscos2() {
		Ejercicio3 e3 = new Ejercicio3();
		int num = 2;
		String resultado = e3.cadenaAsteriscos(num);
		assertEquals("**", resultado);
	}
	@Test
	public void testCadenaAsteriscos5() {
		Ejercicio3 e3 = new Ejercicio3();
		int num = 5;
		String resultado = e3.cadenaAsteriscos(num);
		assertEquals("*****", resultado);
	}
	@Test
	public void testCadenaAsteriscos() {
		Ejercicio3 e3 = new Ejercicio3();
		int num = 0;
		String resultado = e3.cadenaAsteriscos(num);
		assertEquals("", resultado);
	}
}
