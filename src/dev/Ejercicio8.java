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
