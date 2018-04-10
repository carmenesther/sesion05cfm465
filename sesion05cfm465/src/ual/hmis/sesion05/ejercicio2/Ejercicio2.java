package ual.hmis.sesion05.ejercicio2;

public class Ejercicio2 {
	public boolean login (String username, String password) {
		// Comprobar que las cadenas no son vacías
		if(username.isEmpty()||password.isEmpty())
			return false;
		// Comprabar que las cadenas son < 30
		if(username.length()>30||password.length()>30)
			return false;
		// Llamada al método
		return compruebaLoginEnBD(username, password);
		}

	public boolean compruebaLoginEnBD(String username, String password) {
		//mock
		return true;
	}
}
