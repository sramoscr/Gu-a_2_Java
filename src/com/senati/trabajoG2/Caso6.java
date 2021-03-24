package com.senati.trabajoG2;

import java.util.Scanner;

public class Caso6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Ingresa tú sueldo: ");
		int suel = sc.nextInt();
		
		
		float tasa = (float) 0.02;
		
		if (suel > 2800)
			tasa = (float)0.05;
		
		float imp = tasa * suel;
		
		System.out.println("\n--- RESULTADO ---");
		System.out.println("Impuesto......: "+ imp);
			

	}

}
