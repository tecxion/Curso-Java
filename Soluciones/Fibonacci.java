
public class Fibonacci {
	
	/*
	 * Escribe un programa que imprima los 50 primeros números de la sucesión
	 * de Fibonacci empezando en 0.
	 * - La serie Fibonacci se compone por una sucesión de números en
	 *   la que el siguiente siempre es la suma de los dos anteriores.
	 *   0, 1, 1, 2, 3, 5, 8, 13...
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Hay muchas formas de hacer la serie de fibonacci y con menos código yo he elegido está que aún así se puede reducir
		 * el código.
		 * Primero inicio las variables con los 3 primeros valores, y en el bucle for modifico las variables.
		 */
		
		long numero1 = 1;  //uso las variables de tipo long ya que al ir hasta 50 sino saldrían números negativos.
		long numero2 = 2;
		long numero3 = 0;
		
		System.out.print(numero3 + " ");  //Imprimo los 3 primeros números.
		System.out.print(numero1 + " ");
		System.out.print(numero2 + " ");
		
		for (int i = 0; i <= 50; i++ ) { //Creo el bucle for que va de 0 a 50 para imprimir los 50 primeros valores de la serie
			
			numero3 = numero1 + numero2;
			System.out.print(numero3 + " ");
			numero1 = numero2;
			numero2 = numero3;
			
		}

	}

}
