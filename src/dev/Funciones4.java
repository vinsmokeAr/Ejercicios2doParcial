 /************************************************
 * Autor: Arleth Machuca Fabian					*
 * Fecha de creación: 10 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Haga un algoritmo para una		*
 * 		función que reciba dos parámetros N y	*
 * 		K y que retorne los K dígitos más a		*
 * 		la izquierda de N.						*
 ************************************************/

package dev;

import java.util.Scanner;

public class Funciones4 {
	public static void main(String[] args) {
		
		int k,n;
		
		System.out.println("Ingresa la x ");
		Scanner sc = new Scanner(System.in);
		k = sc.nextInt();
		
		System.out.println("Ingresa la Y");
		n = sc.nextInt();
		
		System.out.println("Extraido " + extrarNums(k,n));
	}
	
	public static String extrarNums(int k, int n) {
		String s = String.valueOf(k);
		
		return s.substring(0,n);		
	}
}
