package ual.hmis.sesion05.ejercicio4;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ejercicio4Test {

	@Test
	public void testCadenasDiferentes() {
		Ejercicio4 e4 = new Ejercicio4();
		String p1 = "holi";
		String p2 = "adeu";
		String res = e4.cadena(p1, p2);
		assertEquals("holi", res);
	}
	@Test
	public void testCadenasConUnaMismaLetra() {
		Ejercicio4 e4 = new Ejercicio4();
		String p1 = "holi";
		String p2 = "o";
		String res = e4.cadena(p1, p2);
		assertEquals("hli", res);
	}
	@Test
	public void testCadenasIguales() {
		Ejercicio4 e4 = new Ejercicio4();
		String p1 = "holi";
		String p2 = "holi";
		String res = e4.cadena(p1, p2);
		assertEquals("", res);
	}
	@Test
	public void testPrimeraCadenaVacia() {
		Ejercicio4 e4 = new Ejercicio4();
		String p1 = "";
		String p2 = "holi";
		String res = e4.cadena(p1, p2);
		assertEquals("", res);
	}
}
