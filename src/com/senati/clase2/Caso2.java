package com.senati.clase2;

import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese un n�mero: ");
		int num = sc.nextInt();
		
		String estado = "El n�mero  es impar";
		
		if (num % 2 == 0)
			estado = "El n�mero es par";
		
		System.out.println("\n--- RESULTADO ---");
		System.out.println("Estado: "+ estado);
		
		

	}

}
