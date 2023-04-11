package dev;

import java.util.Scanner;

public class Condicional2 {

	public static void main(String[] args) {
	
		int edad;
		double ingreso;
		
		System.out.println("Edad:");
		Scanner sc = new Scanner(System.in);
		edad = sc.nextInt();
		System.out.println("Ingreso:");
		ingreso = sc.nextDouble();
		
		if(edad > 16 && ingreso >= 500) {
			System.out.println("Sí tiene que tributar");
		}else {
			System.out.println("No tiene que tributar");
		}
		
	}
	
	
}
