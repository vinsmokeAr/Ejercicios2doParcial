/************************************************
 * Autor: Arleth Machuca Fabian					*
 * Fecha de creación: 10 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Dados dos valores X e Y que		*
 * 		forman un intervalo cerrado, y un		*
 * 		valor W, realice un programa para		*
 * 		determinar si W está dentro o fuera		*
 * 		del intervalo.							*
 ************************************************/

package dev;

public class Condicional8 {
	public static void main(String[] args) {
		
		int x= 12,y=15,w=10;
		
		if(w > x && w < y) {
			System.out.println("Si está en el intervalo");
		}else {
			System.out.println("No está en el intervalo");
		}
	}	
}
