package com.senati.clase3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingresa tú sueldo: ");
		int suel = sc.nextInt();
		
		float tasa = (float) 0.03;
		
		if (suel > 1500 && suel <= 3000)
			tasa = (float)0.08;
		else if (suel > 3000)
			tasa = (float) 0.12;
		
		float imp = tasa * suel;
		
		System.out.println("\n--- RESULTADO ---");
		System.out.println("Sueldo......: "+ df.format(suel));
		System.out.println("Impuesto....: "+ df.format(imp));

	}

}
