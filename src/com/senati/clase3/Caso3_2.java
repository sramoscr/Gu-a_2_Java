package com.senati.clase3;

import java.util.Scanner;

public class Caso3_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Ingresa primer n�mero: ");
		float n1 = sc.nextFloat();
		
		System.out.print("Ingresa segundo n�mero: ");
		float n2 = sc.nextFloat();
		
		System.out.print("Ingresa tercer n�mero: ");
		float n3 = sc.nextFloat();
		
		String x = "El tercer n�mero "+ n3 +" es mayor";
		
		if (n1==n2 && n2==n3)
			x = "Los 3 n�meros son iguales";
		else 
			if (n1 > n2 && n1 > n3)
				x = "El primer n�mero "+ n1 +" es mayor";
		else 
			if (n2 > n1 && n2 > n3)
				x = "El segundo n�mero "+ n2 +" es mayor";
			
			
		
		System.out.println("\n--- RESULTADO ---");
		System.out.println("Estado: "+ x);

	}

}
