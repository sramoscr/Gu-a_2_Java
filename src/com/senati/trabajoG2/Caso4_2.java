package com.senati.trabajoG2;

import java.util.Scanner;

public class Caso4_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Ingresa primer número: ");
		float n1 = sc.nextFloat();
		
		System.out.print("Ingresa segundo número: ");
		float n2 = sc.nextFloat();
		
		System.out.print("Ingresa tercer número: ");
		float n3 = sc.nextFloat();
		
		String x = "El tercer número "+ n3 +" es menor";
		
		if (n1==n2 && n2==n3)
			x = "Los 3 números son iguales";
		else 
			if (n1 < n2 && n1 < n3)
				x = "El primer número "+ n1 +" es menor";
		else 
			if (n2 < n1 && n2 < n3)
				x = "El segundo número "+ n2 +" es menor";
			
		System.out.println("\n--- RESULTADO ---");
		System.out.println("Estado: "+ x);
	}

}
