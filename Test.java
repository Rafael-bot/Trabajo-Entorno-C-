import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class Test {
	
	static int cont = 0;
	static Funcion func2 = null;
	
	@BeforeAll
	static void prepararPruebas() {
		func2 = new Funcion();
	}
	
	@AfterAll
	static void terminarPruebas() {
		System.out.println("Se han terminado de ejecutar todas las pruebas");
		System.out.println("Se a realizado "+ cont +" Pruebas.");
		func2 = null;
	}
	
//-----------------------------------Caja Negra------------------------------------------------------
	@Test
	@DisplayName("Test Resultado True")
	void testTrue() {//Tipo de Prueba --> Pruebas Funcionales
		
		cont++;
		
		//Estamo comprobando si la salida es correcta.
		assertTrue(func2.Funcion2(250));//Tiene que salir True
		
	}
	
	@Test
	@DisplayName("Test Resultado False")
	void testFalse() {//Tipo de Prueba --> Pruebas Funcionales
		
		cont++;
		
		//Estamo comprobando si la salida es correcta.
		assertFalse(func2.Funcion2(20));//Tiene que salir False
		
		
	}

	
}
