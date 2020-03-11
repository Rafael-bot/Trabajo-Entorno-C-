import static org.junit.Assert.*;
import org.junit.Test;

public class Test1 {

//-----------------------------------Caja Negra------------------------------------------------------
	@Test
	@DisplayName("Primera Prueba")
	void testTrue() {
		Funcion interval = new Funcion();
		
		//Estamo comprobando si la salida es correcta.
		assertTrue(interval.Funcion2(250));//Tiene que salir True
		assertFalse(interval.Funcion2(50));//Tiene que salir False
	}
	
}
