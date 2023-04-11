 /************************************************
 * Autor: Arleth Machuca Fabian					*
 * Fecha de creación: 10 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Haga una función para			*
 * 		determinar si un punto (X, Y) está		*
 * 		dentro de un rectángulo. El rectángulo	*
 * 		es definido por la coordenada del		*
 * 		vértice superior izquierdo, su altura	*
 * 		y su ancho.								*
 ************************************************/

package dev;
import java.util.Scanner;


public class Funciones3 {
	public static void main(String[] args) {
		
		float x,y;
		
		System.out.println("Ingresa la x ");
		Scanner sc = new Scanner(System.in);
		x = sc.nextFloat();
		
		System.out.println("Ingresa la Y");
		y = sc.nextFloat();
		
		if(fun(x,y)) {
			System.out.println("Esta dentro.");
		}else {
			System.out.println("No esta dentro. ");
		}
	}
	
	
	public static boolean fun (float x, float y) {
		float ancho,alto;
		System.out.println("Ingresa el ancho: ");
		Scanner sc = new Scanner(System.in);
		ancho = sc.nextFloat();
		
		System.out.println("Ingresa el alto: ");
		alto = sc.nextFloat();

		
		if (x < ancho && y < alto) {
			return true;
		}
		return false;
	}
}
