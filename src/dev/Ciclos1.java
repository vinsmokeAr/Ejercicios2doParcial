package dev;

import java.util.Scanner;

public class Ciclos1 {

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Dame el número");
			n = sc.nextInt();
			if(n<0)
				System.out.println("No es entero positivo.");
		}while (n<0);
		
		for (int k = 1; k <= n; k++) {
			if(k%2 != 0)
				System.out.print(k + "-");
		}
	}
	
}
