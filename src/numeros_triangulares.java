/*Haz un programa que calcule el n-ésimo numero triangular*/

/***
 * PROGRAMA QUE DA LOS FACTORES PRIMOS DE UN NUMERO AUTOR: DAVID MCCONNELL
 * VICENTE FECHA: 26/10/2018 
 * CURSO: DM1B
 */

import java.util.Scanner;

public class numeros_triangulares {
	
	public static void getNumerostriangulares(int n) {
		int i=1;
		for (i=1; i<=n; i++) {
			int triangular=(+i*(i+1)/2);
			if (triangular<=n) {
				System.out.println(triangular);
			}
		}
		System.out.println("Esos los numeros triangulares desde el 1 hasta el "+ n);
	}	
	
	public static void main(String [] args) {
		
		int n;
		
		System.out.println("---------------------------------------------");
		System.out.println("PROGRAMA QUE CALCULA LOS NUMEROS TRIANGULARES");
		System.out.println("---------------------------------------------");
		System.out.println();
		
		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduzca un número");
		n= teclado.nextInt();
		teclado.close();
		
		getNumerostriangulares(n);
	}

}
