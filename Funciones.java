package Ejercicios;

public class Funcion {
		
	public Boolean Funcion2(int num) {
		
		Boolean resp = null;
		
		int y = 250-50;
		int x = 250+50;
		
		if(num<x || num>y) {
			
			resp = true;
			
		}else {
			resp = false;
		}
		
		return resp;	
		
	}
	

}

