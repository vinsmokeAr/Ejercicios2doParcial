 /************************************************
 * Autor: Arleth Machuca Fabian					*
 * Fecha de creación: 10 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Escribir una función que		* 
 * 		calcule el área de un círculo y otra	*
 * 		que calcule el volumen de un cilindro	*
 * 		usando la primera función.				*
 ************************************************/

package dev;
import java.util.Scanner;


public class Funciones1 {
	public static void main(String[] args) {
		double radio ,altura;
		System.out.println("Ingrese el radio: ");
		Scanner sc = new Scanner(System.in);
		radio = sc.nextDouble();
		System.out.println("Ingrese el radio: ");
		altura = sc.nextDouble();
		
		System.out.println("El de la base es " + Area(radio));
		System.out.println("El volumen del cilindro es " + Volumen(radio,altura));
	}
	
	public static double Area(double radio) {
		return Math.PI * Math.pow(radio, 2) / 2.0;
	}
	
 	public static double Volumen(double radio, double altura) {
		return Area(radio) * altura;
	}
	
	
}
