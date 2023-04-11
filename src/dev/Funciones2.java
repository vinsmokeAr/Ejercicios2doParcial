 /************************************************
 * Autor: Arleth Machuca Fabian					*
 * Fecha de creación: 10 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Haga una función que reciba		*
 * 		como entrada un mes del año y			*
 * 		determine el número de días				*
 * 		transcurridos desde el comienzo del		*
 * 		año hasta el primer día del mes.		*
 ************************************************/

package dev;

import java.time.LocalDate;
import java.util.Scanner;

public class Funciones2 {
	public static void main(String[] args) {
		int mes,year;
		
		System.out.println(" ingresa el mes: ");
		Scanner sc=new Scanner(System.in);
		mes = sc.nextInt();
		System.out.println(" ingresa el año: ");
		year = sc.nextInt();
			
		System.out.println("El número de días transcurridos son " + numDias(mes,year));
		
	}
	
	public static int numDias(int mes,int year) {	
		return LocalDate.of(year, mes, 1).getDayOfYear();
	}
}
