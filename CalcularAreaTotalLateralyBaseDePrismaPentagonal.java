package com.ejercicio10;

import java.util.Scanner;

public class CalcularAreaTotalLateralyBaseDePrismaPentagonal {

	public static void main(String[] args) {
		//Escribe un algoritmo que calcule el área total, lateral y el área de la base de un prisma pentagonal, 
		//solicitando para esto el perímetro de la base, apotema y altura del prisma.
		Scanner entrada = new Scanner(System.in);
		double perimetro, apotema, altura, aTotal, aLateral, aBase;
		System.out.println("Ingresa el perimetro de la Base: ");
		perimetro = entrada.nextDouble();
		System.out.println("Ingresa la apotema: ");
		apotema = entrada.nextDouble();
		System.out.println("Ingresa la altura: ");
		altura = entrada.nextDouble();
		//
		aBase = (perimetro * apotema) / 2;
		aLateral = (perimetro * altura) / 2;
		aTotal = (2 * aBase) + aLateral;
		//
		System.out.println("El area de la base es: " + aBase);
		System.out.println("El area lateral es: " + aLateral);
		System.out.println("El area total es: " + aTotal);
		entrada.close();
		//EJERCICIOS 72
	}

}
