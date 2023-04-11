/************************************************
 * Autor: Arleth Machuca Fabian					*
 * Fecha de creación: 10 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Un número de cuatro cifras es	*
 * 		feliz si los dos primeros dígitos son	*
 * 		mayores que los dos últimos dígitos.	*
 * 		Por ejemplo, 5613 es feliz porque 56	*
 * 		es mayor que 12. Un número de cuatro	*
 * 		cifras es creciente si cada dígito es	*
 * 		mayor al anterior. Por ejemplo, 1569	*
 * 		es creciente 1 < 5 < 6 < 9 (o 9 > 6 >	*
 * 		5 > 1). Todo número que es feliz y		*
 * 		creciente se dice que es un número muy	*
 * 		feliz. Todo número que no es feliz ni 	*
 * 		creciente se dice que es infeliz. Haga	*
 * 		un programa que tome como entrada un	*
 * 		número de cuatro dígitos e imprima el	*	
 * 		tipo de número encontrado, según la		*
 * 		clasificación descrita.					*
 ************************************************/

package dev;

import java.util.Scanner;

public class Condicional7 {
	public static void main(String[] args) {
		String st = new String();
		boolean Feliz = false,Creci = false;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa el número");
		st = sc.nextLine();
		
			
		if (Integer.parseInt(st.substring(0,2)) > Integer.parseInt(st.substring(2,4)) ) {
			Feliz = true;
		}
		if (st.charAt(0) < st.charAt(1) && st.charAt(1) < st.charAt(2)&& st.charAt(2) < st.charAt(3)) {
			System.out.println("Es creciente.");
		}
		
		if(Feliz && Creci) {
			System.out.println("Es un número feliz ");
		}else {
			System.out.println("No es un número feliz");
		}
}
}