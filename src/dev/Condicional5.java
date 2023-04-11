/************************************************
 * Autor: Arleth Machuca Fabian					*
 * Fecha de creación: 10 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Escriba un programa que dado	*
 * 		el peso de una persona en libras		*
 * 		(1 libra=0.453592 Kg) y su estatura		*
 * 		en centímetros, calcule su IMC e		*
 * 		indique como salida el peso en			*
 * 		kilogramos, el valor de IMC de la		*
 * 		persona y la categoría en la cual fue	*
 * 		clasificado.							*
 ************************************************/

package dev;
import java.util.Scanner;

public class Condicional5 {

	public static void main(String[] args) {
		
		double Cent, Met, Lib, Kg, imc;
		
		System.out.println("Ingresa tu peso en libras: ");
		Scanner sc = new Scanner(System.in);
		Lib = sc.nextDouble();
		
		System.out.println("Ingresa tu estatura en centimetros: ");
		Cent = sc.nextDouble();
		
		Kg = Lib*0.453592;
		Met = Cent/100;
		imc = Kg/Math.pow(Met, 2);
		
		System.out.println("Masa en kilogramos es " + Kg);
		
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
