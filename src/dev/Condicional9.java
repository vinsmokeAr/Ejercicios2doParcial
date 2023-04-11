/************************************************
 * Autor: Arleth Machuca Fabian					*
 * Fecha de creación: 10 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Cree un algoritmo que tome		*
 * 		como entrada la hora exacta (horas,		*
 * 		minutos, segundos y AM/PM) e indique	*
 * 		el número de segundos transcurridos		*
 * 		durante ese día.						*
 ************************************************/

package dev;

import java.util.Scanner;

public class Condicional9 {

	public static void main(String[] args) {
		
		float hora,min,s,Seg;
	
		System.out.println("Ingresa la hora:");
		Scanner sc = new Scanner(System.in);
		hora = sc.nextFloat();
		System.out.println("Ingresa los minutos:");
		min = sc.nextFloat();
		System.out.println("Ingresa los segundos:");
		s = sc.nextFloat();
		
		Seg = (hora*3600) + (min*60) + s;
		System.out.println("Los segundos del día son " + Seg);
	}
}
