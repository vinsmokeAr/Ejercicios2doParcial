/************************************************
 * Autor: Arleth Machuca Fabian					*
 * Fecha de creación: 10 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Escriba un programa que dados	*
 * 		la distancia recorrida por un objeto y	*
 * 		el tiempo que tomó el objeto en			*
 * 		recorrer esa distancia, calcule su		*
 * 		velocidad.								*
 ************************************************/

package dev;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		float dist,tiem, result;
		
		System.out.println("Ingrese la distancia: ");
		Scanner sc = new Scanner(System.in);
		dist = sc.nextFloat();
		System.out.println("Ingresa el tiempo: ");
		tiem = sc.nextFloat();
		result = dist/tiem;
		System.out.println("La velocidad que alcanzo fue " + result + " m/s");
	}
	
}
