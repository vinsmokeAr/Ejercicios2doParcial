/************************************************
 * Autor: Arleth Machuca Fabian					*
 * Fecha de creación: 10 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Escriba un programa que			*
 * 		calcule el valor 𝑛 aproximado de			*
 * 		usando la serie:						*
 ************************************************/

package dev;

import java.util.Scanner;

public class Ciclos3 {
	
		public static void main(String[] args) {
			
			double num;
			float p = 0;
			System.out.println("Introduzca n ");
			Scanner sc =  new Scanner(System.in);
			num = sc.nextInt();
			
			for (int i = 1,j=1; i <= num; i+=2,j++) {
				if(j%2 == 0)
					p-= 4.0/i;
				else
					p += 4.0/i;
			}
			
			System.out.println("PI es " + p);
			
		}
	}
