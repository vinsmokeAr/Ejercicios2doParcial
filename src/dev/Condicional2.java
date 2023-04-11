/************************************************
 * Autor: Arleth Machuca Fabian					*
 * Fecha de creación: 10 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Para tributar un determinado 	*
 * 		impuesto se debe ser mayor de 16 años	*
 * 		y tener unos ingresos iguales o			*
 * 		superiores a 500$ mensuales. Escribir	*
 * 		un programa que pregunte al usuario su	*
 * 		edad y sus ingresos mensuales y muestre	*
 * 		por pantalla si el usuario tiene que	*
 * 		tributar o no.							*
 ************************************************/

package dev;

import java.util.Scanner;

public class Condicional2 {

	public static void main(String[] args) {
	
		int edad;
		double ingreso;
		
		System.out.println("Edad:");
		Scanner sc = new Scanner(System.in);
		edad = sc.nextInt();
		System.out.println("Ingreso:");
		ingreso = sc.nextDouble();
		
		if(edad > 16 && ingreso >= 500) {
			System.out.println("Sí tiene que tributar");
		}else {
			System.out.println("No tiene que tributar");
		}
		
	}
	
	
}
