/************************************************
 * Autor: Arleth Machuca Fabian					*
 * Fecha de creación: 10 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Escriba un programa que lea 	*
 * 		un número de cuatro dígitos y muestre	*
 * 		en pantalla el número escrito en		*
 * 		reverso. Por ejemplo, si el número 		*
 * 		salida debería ser 2345.				*
 ************************************************/


package dev;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int num, invertido = 0, resto;
		 
	      
	      System.out.println( "Introduce un número: " );
	      Scanner sc = new Scanner( System.in );
	      num = sc.nextInt();
	 
	      while( num > 0 ) {
	         resto = num % 10;
	         invertido = invertido * 10 + resto;
	         num /= 10;
	      }
	 
	      System.out.println( "Número invertido: " + invertido );
	   }
	
}
