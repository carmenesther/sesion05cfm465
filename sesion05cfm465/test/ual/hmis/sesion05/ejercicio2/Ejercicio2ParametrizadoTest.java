package ual.hmis.sesion05.ejercicio2;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Ejercicio2ParametrizadoTest {
	private String user;
	private String pass;
	private boolean salida;
	private Ejercicio2 e2;

	public Ejercicio2ParametrizadoTest(String username,String contrasena,boolean resultado){
		this.user=username;
		this.pass=contrasena;
		this.salida=resultado;
	}

	@Before
	public void setUp() throws Exception {
		e2 = new Ejercicio2();
	}

	@Parameters
	public static Collection<Object[]> addedNumbers() {
		return Arrays.asList(new Object[][] {
			{"user", "pass",true},
			{"", "",false},
			{"asddddddddddddddddddddddddddddddddddddddasfadfsdaffd", "asffadffffffffffffffffasfadfadaaaasfadfadfadfafdaafa",false},
			{"", "pass",false},
			{"user", "",false},
			{"Hola", "Hola",false},
		});
	}

	@Test
	public void testLogin() {
		assertEquals(salida, e2.login(user, pass));
	}

}
