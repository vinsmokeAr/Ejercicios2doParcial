 /************************************************
 * Autor: Arleth Machuca Fabian					*
 * Fecha de creación: 10 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Solicitar números al usuario	*
 * 		hasta que ingrese el cero. Por cada		*
 * 		uno, mostrar la suma de sus dígitos.	*
 * 		Al finalizar, mostrar la sumatoria de	*
 * 		todos los números ingresados y la suma	*
 * 		de sus dígitos. Reutilizar la misma		*
 * 		función realizada en el Ejercicio N°8.	*
 ************************************************/

package dev;
import java.util.Scanner;



public class Funciones7 {
	int nm;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int sum = 0;
		int sDig = 0;
		
		System.out.println("Ingresa tus números: ");
		do {
			a = sc.nextInt();
			
			if(a == 0) {
				break;
			}
			sum += a;
			sDig += sumDig(a);
			System.out.println("La suma de sus dígitos es " + sumDig(a));
			
		} while (a > 0);
		
		System.out.println(" La Suma final es de: " + sum);
		System.out.println("La Suma final dígitos es de: " + sDig);
		
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
