package ual.hmis.sesion05.ejercicio5;

public class Ejercicio5 {
	public String subcadenaHastaPunto (String cadena) {
		int posicion;
		boolean comprobar=false;
		String resultado = "";
		if(!cadena.contains(".")){
			resultado = "Error: cadena sin punto";
		} else {
			posicion=cadena.indexOf(".");
			cadena=cadena.substring(0, posicion+1);
			char[] c = cadena.toCharArray();
			for (int i = 0; i < cadena.length()-1; i++) {
				comprobar=Character.isDigit(c[i]);
			}
			if(comprobar){
				resultado = "Error: cadena con digito";
			} else {
				resultado = cadena;
			}
	}
	return resultado;
}


}
