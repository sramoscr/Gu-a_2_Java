package com.senati.trabajoG2;

import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ingresa primer número: ");
		int n1 = sc.nextInt();
		
		System.out.println("Ingresa segundo número: ");
		int n2 = sc.nextInt();
		
		String x = "El segundo número "+ n2 +" es menor";
		
		if (n1==n2)
			x = "Los número son iguales";
		else
			if (n1 < n2)
				x = "El primer número "+ n1 +" es menor";
		
		System.out.println("\n--- RESULTADO ---");
		System.out.println("Estado: "+ x);

	}

}
