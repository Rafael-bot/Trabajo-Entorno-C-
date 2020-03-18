
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

	public String Funcion4(String[] CadenaNombres) {

		String CadenaConcatenada = null;
		for (int i = 0; i < CadenaNombres.length; i++) {

			CadenaConcatenada = CadenaNombres[0] + "-" + CadenaNombres[1] + "-" + CadenaNombres[2] + "-"
					+ CadenaNombres[3];
		}
		CadenaConcatenada = CadenaConcatenada.replaceAll("[AaEeIiOoUu]", "");
		CadenaConcatenada = CadenaConcatenada.replaceAll("[A-Z]", "");
		System.out.println(CadenaConcatenada);
		return CadenaConcatenada;

	}
	

}

