package dev;

import java.util.Scanner;

public class Ciclos2 {

	public static void main(String[] args) {
		
		int num;
		
		
			System.out.println("Ingresa el número");
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();
		
		if(esPrimo(num)) {
			System.out.println("Es primo");
		}else {
			System.out.println("No es primo");
		}
		
	}
	  	
	public static boolean esPrimo(int numero) {
		  if (numero == 0 || numero == 1 || numero == 4) {
		    return false;
		  }
		  for (int x = 2; x < numero / 2; x++) {
		    if (numero % x == 0)
		      return false;
		  }
		  return true;
		}	
	
}
