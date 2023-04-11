 /************************************************
 * Autor: Arleth Machuca Fabian					*
 * Fecha de creación: 10 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Escribir un programa que		*
 * 		solicite el ingreso de una cantidad		*
 * 		indeterminada de números mayores que 1,	*
 * 		finalizando cuando se reciba un cero.	*
 * 		Imprimir la cantidad de números primos	*
 * 		ingresados.								*
 ************************************************/

package dev;

import java.util.Scanner;

public class Ciclos6 {

	public static void main(String[] args) {
		int aux,n=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ingresa números y finaliza con la insersión con un 0");
		do {
			aux = sc.nextInt();
			if(aux == 0) {
				break;
			}else if(esPrimo(aux)) {
				n++;
			}			
		}while(aux > 1);
		
		System.out.println("El número de números primos " + n);
	}
	
	public static boolean esPrimo(int numero){
	  int contador = 2;
	  boolean primo=true;
	  while ((primo) && (contador!=numero)){
	    if (numero % contador == 0)
	      primo = false;
	    contador++;
	  }
	  return primo;
	}
	
	
	
	
	
}
