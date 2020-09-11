package testtee;

import junit.framework.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class testetrianguloTest {
	//1 - Equilatero, 2 - Isosceles, 3 - Escaleno, 0 - Nao existe
	@Test
	void testTestando() {
		int lado1 = 2;
		int lado2 = 2;
		int lado3 = 4;
		int retornoEsperado = 0;
		int retornoFeito = testetriangulo.testando(lado1, lado2, lado3);
		if (retornoEsperado==retornoFeito) {
			System.out.println("OK");
		} else
			System.out.println("NOK");
		assertEquals(retornoEsperado, retornoFeito);
		
		
		
		
	}

}
