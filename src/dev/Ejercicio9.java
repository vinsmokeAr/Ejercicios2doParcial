package dev;

import java.util.Scanner;

public class Ejercicio9 {
	
	public static void main(String[] args) {
		
		double a,b,c;
		
		System.out.println("Ingrese el valor del coeficiente: ");
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextDouble();
		System.out.println("Ingrese el coeficiente b:");
		b = sc.nextDouble();
		System.out.println("Ingrese el coeficiente c:");
		c = sc.nextDouble();
		
		System.out.println("el valor de X1 es: = " + ( ( -b + Math.sqrt( Math.pow(b,2) - 4*(a*c) ) )/(2*a) ));
		System.out.println("el valor de X2 es: = " + ( ( -b - Math.sqrt( Math.pow(b,2) - 4*(a*c) ) )/(2*a) ));
	}
}
