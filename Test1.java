import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class Test1 {
	//-----------------------------------Caja Negra------------------------------------------------------
		@Test
		@DisplayName("Prueba Comprobacion Resultado")
		void comprobResult() {
			Funcion sum = new Funcion();
			
			int [] num = {5,5,4};
			
			assertEquals(14, sum.Funcion5(num));//La salida tiene que ser 14
			
		}

}

