

package dev;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int hrs, coste;
		
		System.out.println("Ingresa el numero de horas  trabajadas: ");
		Scanner sc = new Scanner(System.in);
		hrs = sc.nextInt();
		
		System.out.println("Ingresa el coste por hora: ");
		coste = sc.nextInt();
		
	    System.out.println("Resultado: "+ hrs*coste);
		
	}
	
	
	
}
