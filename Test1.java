import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class Rafa {
	//-----------------------------------Caja Negra------------------------------------------------------
		@Test
		@DisplayName("Prueba Comprobacion Resultado")
		void comprobResult() {
			Funcion sum = new Funcion();
			
			int [] num = {2001,02,06};
			
			assertEquals(2009, sum.Funcion5(num));//La salida tiene que ser 2009
			
		}

}

