package ual.hmis.sesion05.ejercicio2;

import static org.junit.Assert.*;

import org.junit.Test;

import ual.hmis.sesion05.ejercicio1.Ejercicio1;

public class Ejercicio2Test {

	@Test
	public void testLoginCaso1(){
		// 1. Arrange
		Ejercicio2 e1 = new Ejercicio2();
		String user = "user";
		String pass = "pass";
		// 2. Act
		boolean resultado = e1.login(user,pass);
		// 3. Assert
		assertEquals(true,resultado);
	}
	@Test
	public void testLoginCaso2(){
		// 1. Arrange
		Ejercicio2 e1 = new Ejercicio2();
		String user = "";
		String pass = "";
		// 2. Act
		boolean resultado = e1.login(user,pass);
		// 3. Assert
		assertEquals(false,resultado);
	}
	@Test
	public void testLoginCaso3(){
		// 1. Arrange
		Ejercicio2 e1 = new Ejercicio2();
		String user = "asddddddddddddddddddddddddddddddddddddddasfadfsdaffd";
		String pass = "asffadffffffffffffffffasfadfadaaaasfadfadfadfafdaafa";
		// 2. Act
		boolean resultado = e1.login(user,pass);
		// 3. Assert
		assertEquals(false,resultado);
	}
	@Test
	public void testLoginCaso4(){
		// 1. Arrange
		Ejercicio2 e1 = new Ejercicio2();
		String user = "";
		String pass = "pass";
		// 2. Act
		boolean resultado = e1.login(user,pass);
		// 3. Assert
		assertEquals(false,resultado);
	}
	@Test
	public void testLoginCaso5(){
		// 1. Arrange
		Ejercicio2 e1 = new Ejercicio2();
		String user = "user";
		String pass = "";
		// 2. Act
		boolean resultado = e1.login(user,pass);
		// 3. Assert
		assertEquals(false,resultado);
	}
	@Test
	public void testLoginCaso6(){
		// 1. Arrange
		Ejercicio2 e1 = new Ejercicio2();
		String user = "Hola";
		String pass = "Hola";
		// 2. Act
		boolean resultado = e1.login(user,pass);
		// 3. Assert
		assertEquals(false,resultado);
	}
}
