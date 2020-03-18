
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
		
		if(num<=x || num>=y) {
			
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
	
	public int Funcion5(int [] num) {
		
		int tam = num.length;
		int sum = 0; 
		int [] numarray = new int [tam];
		
		for (int cont = 0; cont < tam; cont++) {
			numarray[cont] = num[cont];
			sum = sum + numarray[cont];
		}
		
		return sum;
		
	}
	
		
	public double Funcion6(double [] num1) {

        double [] num2 = new double [num1.length];
        double z = 4;
        double w = 4;


        for (int cont = 0; cont < num1.length; cont++) {
            if (num1[cont]%2==0) {
                num2[cont] = num1[cont]*z; 
                System.out.print("  Numero Par -->  " + num2[cont]);
            }else {
                num2[cont] = num1[cont]*w; 
                System.out.print("  Numero Impar -->  " +num2[cont]);
            }
        }

        
		return z;


        }
	
	public String[] Funcion7(String[] StringsCortados){

		String[] cadenaDeNombres = { "Hipopotamo", "Murcielago", "Locomotora", "Sacapuntas" };

		for (int i = 0; i < cadenaDeNombres.length; i++) {

			cadenaDeNombres[i] = cadenaDeNombres[i].substring(4, 7);

		}
		System.out.println(Arrays.toString(cadenaDeNombres));
		return cadenaDeNombres;
	}

}

