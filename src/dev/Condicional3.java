package dev;

import java.util.Scanner;

public class Condicional3 {

	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		String s = new String();
		int band = 0;
		
		System.out.println("Ingresa un número: ");
		s = rd.nextLine();
		
		for (int i = 0,j = s.length()-1; i < s.length()/2; i++, j--) {
			if(s.charAt(i) != s.charAt(j)) {
				band = 1;
				break;
			}
			
		}
		
		if(band != 1) {
			System.out.println("Capicúa");
		}else {
			System.out.println("No lo es");
		}
	}
}
