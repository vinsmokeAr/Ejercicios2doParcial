 /************************************************
 * Autor: Arleth Machuca Fabian					*
 * Fecha de creación: 10 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Solicitar números al usuario 	*
 * 		hasta que ingrese el cero. Por cada		*
 * 		uno, mostrar la suma de sus dígitos 	*
 * 		(utilizando una función que realice		*
 * 		dicha suma).							*
 ************************************************/

package dev;
import java.util.Scanner;


public class Funciones6 {
	public static void main(String[] args) {
		
		int num;
		
		System.out.println("Ingresa los números");
		Scanner sc = new Scanner(System.in);
			num = sc.nextInt();
			System.out.println("Suma de los dígitos " + sumDig(num));
		
	}
	public static int sumDig(int l) {
		String s = new String();
		s =String.valueOf(l);
		int suma = 0;
		
		for (int k = 0; k < s.length(); k++) {
			suma += Integer.parseInt( s.substring(k,k+1) );
		}
		
		return suma;
	}
}
