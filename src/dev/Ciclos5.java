 /************************************************
 * Autor: Arleth Machuca Fabian					*
 * Fecha de creación: 10 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Dado un valor n, utilizar		*
 * 		ciclos para calcular el valor de la		*
 * 		expresión:								*
 ************************************************/

package dev;
import java.util.Scanner;

public class Ciclos5 {

	public static void main(String[] args) {
		
		double resultado = 0;
		System.out.print("Ingresa el número: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
		for (int i = 0; i <= num; i++) {
			resultado += Math.PI * (i * i);
		}
		
		System.out.println("El resultado es: " + resultado);
		

	}

}
	
