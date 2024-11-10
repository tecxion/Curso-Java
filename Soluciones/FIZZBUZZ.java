public class FIZZBUZZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String f = "FIZZ"; // Variables con lo que imprimirá por pantalla
		String b = "BUZZ";
		
		for (int i = 1; i <=100; i++) { // Un bucle for para imprimir los números y generar las expresiones FIZZ, BUZZ y FIZZBUZZ
			if (i%3 == 0) {
				System.out.println(f); //Si es múltiplo de 3 imprimira f
			}
			else if (i%5 == 0) {
				System.out.println(b);   // Si es múltiplo de 5 imprime b
			}
			else if (i%3==0 || i%5==0) {  //Si al ser múltiplo de 3 y de 5 imprimira f+b
				System.out.println(f+b);
			}
			else
				System.out.println(i);  // Si no es ninguna de las anteriores imprime i
				
				
		}

	}

}
