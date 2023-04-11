/************************************************
 * Autor: Arleth Machuca Fabian					*
 * Fecha de creación: 10 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: El IMC resulta de la división	*
 * 		de la masa del individuo				*
 * 		(en kilogramos) entre el cuadrado de la	*
 * 		estatura (en metros). El índice de masa	*
 * 		corporal es un indicador del peso de	*
 * 		una persona en relación con su altura.	*
 ************************************************/

package dev;

import java.util.Scanner;

public class Condicional4 {
	
	public void main(String[] args) {
		
		double peso,altura,imc;
		System.out.println("Ingresa tu masa en kg: ");
		Scanner sc = new Scanner(System.in);
		peso = sc.nextDouble();
		
		System.out.println("Ingresa tu altura en metros: ");
		altura = sc.nextDouble();
		
		imc = peso / Math.pow(altura,2);
	
		if(imc < 16) {
			System.out.println("Criterio de ingreso");
		}else if(imc >= 16 && imc <= 16.9) {
			System.out.println("Infrapeso");
		}else if(imc >= 17 && imc <= 18.4) {
			System.out.println("Bajo peso");
		}else if(imc >= 18.5 && imc <= 24.9) {
			System.out.println("Peso normal");
		}else if(imc >= 25 && imc <= 29.9) {
			System.out.println("Sobrepeso");
		}else if(imc >= 30 && imc <= 34.9) {
			System.out.println("Obesidad premórbida");
		}else if(imc >= 40 && imc <= 45) {
			System.out.println("Obesidad mórbida");
		}else if(imc > 45) {
			System.out.println("Obesidad hipermórbida");
		}
	}
}
