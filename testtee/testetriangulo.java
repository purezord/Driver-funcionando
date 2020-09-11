package testtee;

import junit.framework.TestCase;

public class testetriangulo extends TestCase {
	  
	 
		 public static int testando(int lado1,int lado2,int lado3) {
	//1 - Equilatero, 2 - Isosceles, 3 - Escaleno, 0 - Nao existe
	        if ((lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2)) {
	            if (lado1 == lado2 && lado1 == lado3) {
	                return 1;
	            } else if ((lado1 == lado2) || (lado1 == lado3)) {
	            	return 2;
	            } else
	            	return 3;
	        } else {
	        	return 0;
	        
	       
	

}
}
}