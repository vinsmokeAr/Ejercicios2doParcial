/************************************************
 * Autor: Arleth Machuca Fabian					*
 * Fecha de creación: 10 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Desarrolle un programa que		*
 * 		reciba como entrada un número entre		*
 * 		1 y 12 e imprima el nombre del mes		*
 * 		correspondiente. Tome teniendo en		*
 * 		cuenta, posibles valores erróneos en	*
 * 		la entrada.								*
 ************************************************/

package dev;

import java.util.Scanner;

public class Condicional6 {

	public static void main(String[] args) {
		int NMes;
		
		
		System.out.println("Escriba el número de mes:");
		Scanner sc = new Scanner(System.in);
		NMes = sc.nextInt();
	  
		switch (NMes) {
		case 1:
			System.out.println("Enero");
			break;
		case 2:
			System.out.println("Febrero");
			break;
		case 3:
			System.out.println("Marzo");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Mayo");
			break;
		case 6:
			System.out.println("Junio");
			break;
		case 7:
			System.out.println("Julio");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Septiembre");
			break;
		case 10:
			System.out.println("Octubre");
			break;
		case 11:
			System.out.println("Noviembre");
			break;
		case 12:
			System.out.println("Diciembre");
			break;
		default:
			break;
		}
		
		
		
	}
		
}
