package com.senati.clase3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("#.00");
		
		System.out.print("Ingresa tú nombre..: ");
		String nom = sc.nextLine();
		
		System.out.print("Ingresa nota 1.....: ");
		float not1 = sc.nextFloat();
		
		System.out.print("Ingresa nota 2.....: ");
		float not2 = sc.nextFloat();
		
		System.out.print("Asistencias [1-12].: ");
		float asis = sc.nextFloat();
		
		float prom = not1 * 0.3f + not2 * 0.7f;
		float porcen = asis / 12 * 100;
		String estado = "Desaprobado";
		
		if (prom > 13 && porcen >= 70)
			estado = "Aprobado";
		
		System.out.println("\n--- RESULTADO ---");
		System.out.println("Nombre......: "+ nom.toUpperCase());
		System.out.println("Promedio....: "+ df.format(prom));
		System.out.println("Asistencia..: "+ df.format(porcen)+"%");
		System.out.println("Estado......: "+ estado);

	}

}
