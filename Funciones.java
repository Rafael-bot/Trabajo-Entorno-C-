
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

}

