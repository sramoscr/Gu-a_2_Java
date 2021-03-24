package com.senati.clase2;

import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese un número: ");
		int num = sc.nextInt();
		
		String estado = "El número  es impar";
		
		if (num % 2 == 0)
			estado = "El número es par";
		
		System.out.println("\n--- RESULTADO ---");
		System.out.println("Estado: "+ estado);
		
		

	}

}
