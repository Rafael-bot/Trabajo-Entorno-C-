import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Test1 {

//-----------------------------------Caja Negra------------------------------------------------------
	@Test
	@DisplayName("Test Resultado True")
	void testTrue() {
		Funcion interval = new Funcion();
		
		//Estamo comprobando si la salida es correcta.
		assertTrue(interval.Funcion2(250));//Tiene que salir True
	}
	
	@Test
	@DisplayName("Test Resultado False")
	void testFalse() {
		Funcion interval = new Funcion();
		
		//Estamo comprobando si la salida es correcta.
		assertFalse(interval.Funcion2(20));//Tiene que salir False
	}
	
}
