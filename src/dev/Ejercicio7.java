/************************************************
 * Autor: Arleth Machuca Fabian					*
 * Fecha de creación: 10 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Una juguetería tiene mucho		*
 * 		éxito en dos de sus productos: payasos	*
 * 		y muñecas. Suele hacer venta por correo	*
 * 		y la empresa de logística les cobra por	*
 * 		peso de cada paquete así que deben		*
 * 		calcular el peso de los payasos y		*
 * 		muñecas que saldrán en cada paquete		*
 * 		a demanda. Cada payaso tiene un peso	*
 * 		de 112 g y cada muñeca 75 g. Escribe	*
 * 		un programa que lea el número de payasos*
 * 		y muñecas vendidos en el último			*
 * 		pedido y calcule el peso total del		*
 * 		paquete que será enviado.				*
 ************************************************/

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
