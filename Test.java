import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class Test {
	
	static int cont = 0;
	static Funcion func5 = null;
	
	@BeforeAll
	static void prepararPruebas() {
		func5 = new Funcion();
	}
	
	@AfterAll
	static void terminarPruebas() {
		System.out.println("Se han terminado de ejecutar todas las pruebas");
		System.out.println("Se a realizado "+ cont +" Pruebas.");
		func5 = null;
	}
	
	//-----------------------------------Caja Negra------------------------------------------------------
		@Test
		@DisplayName("Prueba Comprobacion Resultado (Rafael)")
		void Rafael() {
			cont++;
			
			int [] num = {6,2,2001};
			
			assertEquals(2009, func5.Funcion5(num));//La salida tiene que ser 2009
			
		}
		
		@Test
		@DisplayName("Prueba Comprobacion Resultado (Jose)")
		void Jose() {
			cont++;
			
			int [] num = {18,07,1993};
			
			assertEquals(2018, func5.Funcion5(num));//La salida tiene que ser 2018
			
		}
		
		@Test
		@DisplayName("Prueba Comprobacion Resultado (Berny)")
		void Berny() {
			cont++;
			
			int [] num = {12,09,1989};
			
			assertEquals(2010, func5.Funcion5(num));//La salida tiene que ser 2010
			
		}
		
		@Test
		@DisplayName("Prueba Comprobacion Resultado (Vladi)")
		void  Vladi() {
			cont++;
			
			int [] num = {25,04,1998};
			
			assertEquals(2027,func5.Funcion5(num));//La salida tiene que ser 2027
			
		}
		
		
		
		
}
