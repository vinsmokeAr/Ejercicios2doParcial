/************************************************
 * Autor: Arleth Machuca Fabian					*
 * Fecha de creación: 10 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Escribir un programa que 
 * 		pregunte al usuario por el número de 
 * 		horas trabajadasy el coste por hora. 
 * 		Después debe mostrar por la pantalla 
 * 		la paga total que le corresponde al 
 * 		usuario.
 ************************************************/

package dev;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int hrs, coste;
		
		System.out.println("Ingresa el numero de horas  trabajadas: ");
		Scanner sc = new Scanner(System.in);
		hrs = sc.nextInt();
		
		System.out.println("Ingresa el coste por hora: ");
		coste = sc.nextInt();
		
	    System.out.println("Resultado: "+ hrs*coste);
		
	}
	
	
	
}
