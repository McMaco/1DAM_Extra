/*Elaborar un progrma en java que, dado un numero positivo, escriba en pantalla le doble del numero 
 *  entero resultante de invertir sus cifras. Por ejemplo, si la entrada fuese 123 
 *  deberia escrbir en pantalla 642 (el doble de 321)*/ 

/***PROGRAMA QUE DA LA VUELTA A UN NUMERO Y LO MULTIPLICA
* AUTOR: DAVID MCCONNELL VICENTE
* FECHA: 26/10/2018
* CURSO: DM1B
*/

import java.util.Scanner;

public class doble_invertnum {
	
	public static void main(String [] args) {
		
		/*VARIABLES*/
		int n, cifra, inver=0, inver2;
		
		/*PEDIR EL NUMERO*/
		System.out.println();
		System.out.println("-------------------------------------------------------");
		System.out.println("PROGRAMA QUE CALCULA EL DOBLE DEL INVERSO DE UN NUMERO.");
		System.out.println("-------------------------------------------------------");
		System.out.println();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un numero entero positivo");
		n = teclado.nextInt();
		teclado.close();
		
		/*METODOS*/
		while(n>0) {
			cifra=n%10;
			inver=(inver*10)+ cifra;
			n/=10;
	    }
		inver2=inver*2;
		System.out.println("El resultado de invertir el numero es: "+ inver);
		System.out.println("El resultado de invertir el numero y multiplicarlo por 2 es: "+ inver2);
	}
}
