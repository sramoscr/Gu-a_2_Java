package com.senati.trabajoG2;

import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ingresa primer n�mero: ");
		int n1 = sc.nextInt();
		
		System.out.println("Ingresa segundo n�mero: ");
		int n2 = sc.nextInt();
		
		String x = "El segundo n�mero "+ n2 +" es menor";
		
		if (n1==n2)
			x = "Los n�mero son iguales";
		else
			if (n1 < n2)
				x = "El primer n�mero "+ n1 +" es menor";
		
		System.out.println("\n--- RESULTADO ---");
		System.out.println("Estado: "+ x);

	}

}
