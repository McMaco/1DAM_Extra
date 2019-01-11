import java.util.Scanner;

/*Escribir un programa Java que escriba en pantalla los factores primos de un número entero estrictamente 
 * positivo dado como entrada. 
 */

/***
 * PROGRAMA QUE DA LOS FACTORES PRIMOS DE UN NUMERO AUTOR: DAVID MCCONNELL
 * VICENTE FECHA: 26/10/2018 
 * CURSO: DM1B
 */

public class factores_primos {

	public static void main(String[] args) {

		/* VARIABLES */
		int n, primo=1;

		/* PEDIR EL NUMERO */
		System.out.println();
		System.out.println("-------------------------------------------------------");
		System.out.println("PROGRAMA QUE CALCULA LOS FACTORES PRIMOS DE UN NUMERO.");
		System.out.println("-------------------------------------------------------");
		System.out.println();
		
		/*METODOS*/
		do {
			Scanner teclado = new Scanner(System.in);
			System.out.println("Introduzca un numero entero positivo");
			n = teclado.nextInt();
			teclado.close();
			
			do {
				if (n % primo == 0) {
					System.out.println(primo);
					n /= primo;
				}
				primo++;
				
			} while (n != 0);

		} while (n <= 0);

	}

}
