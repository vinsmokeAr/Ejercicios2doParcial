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