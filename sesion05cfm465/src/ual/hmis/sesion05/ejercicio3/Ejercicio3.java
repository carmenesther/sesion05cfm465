package ual.hmis.sesion05.ejercicio3;

public class Ejercicio3 {
	public String cadenaAsteriscos(int num){
		String c="";
		if(num < 0){
			c="numero erroneo";
		} else if(num > 1){
			for(int i=0; i < num; i++){
				c+="*";
			}
		}
		return c;
	}
}
