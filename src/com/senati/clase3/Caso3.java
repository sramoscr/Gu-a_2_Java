package com.senati.clase3;

import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ingresa primer n�mero: ");
		float n1 = sc.nextFloat();
		
		System.out.println("Ingresa segundo n�mero: ");
		float n2 = sc.nextFloat();
		
		String x = "El segundo n�mero "+ n2 +" es mayor";
		
		if (n1==n2)
			x = "Los n�mero son iguales";
		else
			if (n1 > n2)
				x = "El primer n�mero "+ n1 +" es mayor";
		
		System.out.println("\n--- RESULTADO ---");
		System.out.println("Estado: "+ x);
			

	}

}
