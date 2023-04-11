package dev;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		int  NPay,NMuñ, Muñeca = 75, Payaso = 112;
				
		System.out.println("Número de muñecas vendidas: ");
		Scanner sc = new Scanner(System.in);
		
		NMuñ = sc.nextInt();
		System.out.println("Número de payasos vendidos: ");
		NPay = sc.nextInt();
		
		System.out.println("El peso total del paquete es " + (NMuñ*Muñeca+NPay*Payaso) + " g");
			
	}
	
	
}
