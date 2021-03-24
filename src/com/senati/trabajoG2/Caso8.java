package com.senati.trabajoG2;

import java.util.Scanner;

public class Caso8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		System.out.print("Ingresa tú nota: ");
		int not = sc.nextInt();
		
		String mens = "";
		
		if (not <= 7)
			mens = "Sin palabras.";
		else if (not >= 8 && not <= 10)
			mens = "Malo.";
		else if (not >= 11 && not <= 14)
			mens = "Regular.";
		else if (not >= 15 && not <= 17)
			mens = "Notable.";
		else if (not >= 18 && not <= 20)
			mens = "Excelente.";
		
		System.out.println("\n--- RESULTADO ---");
		System.out.println("Nota......: "+not);
		System.out.println("Impuesto..: "+mens);

	}

}
