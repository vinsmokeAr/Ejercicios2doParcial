package dev;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		
	
	int n,m,r;
	float c;
	
	System.out.println("Ingrese el numerador");
	
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	
	System.out.println("Ingrese el donominador");
	m = sc.nextInt();
	
	c = n/m;
	r = n%m;
	
	System.out.println(n + " entre "+ m +" da un cociente "+ c +
			" y un resto " + r);
}
	
}
