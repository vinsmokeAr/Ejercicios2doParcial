package dev;

import java.util.Scanner;

public class Condicional1 {
	
	public static void main(String[] args) {
		
		double divid, divi, result;
		
		System.out.println("Digita el dividendo: ");
		Scanner sc = new Scanner(System.in);
		divid = sc.nextDouble();
		System.out.println("Digita el divisor: ");
		divi = sc.nextDouble();
		
		if(divi == 0) {
			System.out.println("Error.");
		}else {
			result = divid / divi;
			System.out.println("La división es " + result );
		}
	}
}
