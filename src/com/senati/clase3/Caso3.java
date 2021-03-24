package com.senati.clase3;

import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ingresa primer número: ");
		float n1 = sc.nextFloat();
		
		System.out.println("Ingresa segundo número: ");
		float n2 = sc.nextFloat();
		
		String x = "El segundo número "+ n2 +" es mayor";
		
		if (n1==n2)
			x = "Los número son iguales";
		else
			if (n1 > n2)
				x = "El primer número "+ n1 +" es mayor";
		
		System.out.println("\n--- RESULTADO ---");
		System.out.println("Estado: "+ x);
			

	}

}
