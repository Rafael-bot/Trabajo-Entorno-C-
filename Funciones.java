
public class Funcion {
	public Boolean Funcion1(int num) {
		
		Boolean resp = null;
		
		
		int x = 7;
		
		if(num%x==0) {
			
			resp = true;
			
		}else {
			resp = false;
		}
		
		return resp;	
		
	}
	
		
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

