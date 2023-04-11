/************************************************
 * Autor: Arleth Machuca Fabian					*
 * Fecha de creación: 10 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Escribir un programa que		*
 * 		pida al usuario un número entero		*
 * 		positivo y muestre por pantalla todos	*
 * 		los números impares desde 1 hasta		*
 * 		ese número.								*
 ************************************************/

package dev;

import java.util.Scanner;

public class Ciclos1 {

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Dame el número");
			n = sc.nextInt();
			if(n<0)
				System.out.println("No es entero positivo.");
		}while (n<0);
		
		for (int k = 1; k <= n; k++) {
			if(k%2 != 0)
				System.out.print(k + "-");
		}
	}
	
}
