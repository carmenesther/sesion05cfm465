package ual.hmis.sesion05.ejercicio1;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class Ejercicio1Test {

	@Test
	@Ignore
	public void testTransformarCaso2() {
		//multiplos de 2
		// 1. Arrange
		Ejercicio1 e1 = new Ejercicio1();
		int entrada = 2;
		// 2. Act
		int resultado = e1.transformar(entrada);
		// 3. Assert
		assertEquals(1,resultado);

	}
	@Test
	@Ignore
	public void testTransformarCaso3() {
		//multiplos de 3
		// 1. Arrange
		Ejercicio1 e1 = new Ejercicio1();
		int entrada = 3;
		// 2. Act
		int resultado = e1.transformar(entrada);
		// 3. Assert
		assertEquals(1,resultado);

	}
	@Test
	@Ignore
	public void testTransformarCaso5() {
		//multiplos de 5
		// 1. Arrange
		Ejercicio1 e1 = new Ejercicio1();
		int entrada = 5;
		// 2. Act
		int resultado = e1.transformar(entrada);
		// 3. Assert
		assertEquals(1,resultado);

	}
	@Test
	@Ignore
	public void testTransformarCasoni2ni3ni5() {
		//multiplos, ni de 2, ni de 3, ni de 5
		// 1. Arrange
		Ejercicio1 e1 = new Ejercicio1();
		int entrada = 7;
		// 2. Act
		int resultado = e1.transformar(entrada);
		// 3. Assert
		assertEquals(7,resultado);

	}
	@Test
	public void testTransformarCasoOtro() {
		//multiplos, ni de 2, ni de 3, ni de 5
		// 1. Arrange
		Ejercicio1 e1 = new Ejercicio1();
		int entrada = 210;
		// 2. Act
		int resultado = e1.transformar(entrada);
		// 3. Assert
		assertEquals(7,resultado);

	}

}
