package com.senati.clase3;

import java.util.Scanner;

public class Caso12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Datos del trabajador: ");
		String nom = sc.nextLine();
		
		System.out.print("Ingrese tu nivel....: ");
		int nivel = sc.nextInt();
		
		System.out.print("Sueldo..............: ");
		float sueldo = sc.nextFloat();
		float incremento = 0;
		switch (nivel) {
			case 1:
				incremento = 0.045f;
				break;
			case 2:
				incremento = 0.06f;
				break;
			case 3:
				incremento = 0.085f;
				break;
			case 4:
				incremento = 0.11f;
				break;
			default:
				incremento = 0;
				break;
		}
		float nsueldo=sueldo+(sueldo*incremento);
		System.out.println("\n--- RESULTADO ---");
		System.out.println("Trabajador...: "+nom);
		System.out.println("Nivel........: "+nivel);
		System.out.println("Sueldo.......: "+sueldo+" $");
		System.out.println("Incremento...: "+incremento*100+" %");
		System.out.println("Nuevo sueldo.: "+nsueldo+" $");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
