package ual.hmis.sesion05.ejercicio5;

public class Ejercicio5 {
	public String subcadenaHastaPunto (String cadena) {
		cadena = "";
		if(!cadena.contains(".")){
			cadena = "Error: cadena sin punto";
		}
		char c = '0';
		if(cadena.equals(Character.isDigit(c))){
			cadena = "Error: cadena con dígito";
		}
		return cadena;
	}


}
