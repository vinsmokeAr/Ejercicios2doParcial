/************************************************
 * Autor: Arleth Machuca Fabian					*
 * Fecha de creación: 10 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Escribir un programa que pida	*
 * 		al usuario dos números y muestre por	*
 * 		pantalla su división. Si el divisor		*
 * 		es cero, el programa debe mostrar un	*
 * 		mensaje de error.						*
 ************************************************/

package dev;

import java.util.Scanner;

public class Condicional1 {
	
	public static void main(String[] args) {
		
		double divid, divi, result;
		
		System.out.println("Digita el dividendo: ");
		Scanner sc = new Scanner(System.in);
		divid = sc.nextDouble();
		System.out.println("Digita el divisor: ");
		divi = sc.nextDouble();
		
		if(divi == 0) {
			System.out.println("Error.");
		}else {
			result = divid / divi;
			System.out.println("La división es " + result );
		}
	}
}
