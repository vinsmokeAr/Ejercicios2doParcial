/************************************************
 * Autor: Arleth Machuca Fabian					*
 * Fecha de creación: 10 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Escriba un programa que, dadas	*
 * 		las longitudes de los catetos de un		*
 * 		triángulo rectángulo, calcule la 		*
 * 		longitud de su hipotenusa.				*
 ************************************************/

package dev;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		double cat,cat1;
		
		
		System.out.println("Primer cateto: ");
		Scanner sc = new Scanner(System.in);
		cat = sc.nextDouble();
		System.out.println("Segundo cateto: ");
		cat1 = sc.nextDouble();
	
		System.out.println("La longitud de la hipotenusa es " + Math.sqrt(Math.pow(cat,2) + Math.pow(cat1,2)));
		
	}
		
}
