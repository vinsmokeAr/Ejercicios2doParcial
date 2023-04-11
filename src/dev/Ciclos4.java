/************************************************
 * Autor: Arleth Machuca Fabian					*
 * Fecha de creación: 10 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Dada una secuencia de números	*
 * 		terminada en cero, elaborar un			*
 * 		algoritmo para calcular el porcentaje	*
 * 		y la suma de los números impares, el	*
 * 		porcentaje y la suma de los números		*
 * 		pares, y la suma de todos los números,	*
 * 		y cuántos números fueron ingresados.	*
 ************************************************/

package dev;

import java.util.Scanner;

public class Ciclos4 {
	public static void main(String[] args) {
		
		float Num[] = new float[10];
		
		int nm = 0;
		int numImp=0;
		int numPar=0;
		int sumTot=0; 
		int sumImp=0;
		int sumPar=0;
		Scanner sc = new Scanner(System.in);
				
		do {
			Num[nm] = sc.nextFloat();
			
			nm++;
		}while(Num[nm-1] != 0);
		
		
		for (int j = 0; j < nm; j++) {
			if(Num[j]%2 != 0) { 
				numPar++;
				sumPar+=Num[j];
			}else { 
				numImp++;
				sumImp+=Num[j];
			}
			sumTot+=Num[j];
		}
		
		System.out.println("Pares: " + (numPar*100)/nm + " %");
		System.out.println("Suma de números pares: " + sumPar);
		System.out.println("Impares: " + (numImp*100)/nm + " %");
		System.out.println("Suma de pares: " + sumImp);
		System.out.println("Total: " + nm);
		System.out.println("Suma total: " + sumTot);
	}
}
