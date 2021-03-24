package com.senati.trabajoG2;

import java.util.Scanner;

public class Caso13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ingrese n�mero 1: ");
		float n1 = sc.nextFloat();
		System.out.println("Ingrese n�mero 2: ");
		float n2 = sc.nextFloat();
		System.out.println("Operaci�n [1-6]: ");
		int op = sc.nextInt();
		String operacion = "Desconocido";
		float res = 0;
		switch (op) {
		case 1:
			operacion = "Suma";
			res = n1+n2;
			break;
		case 2:
			operacion = "Resta";
			res = n1-n2;
			break;
		case 3:
			operacion = "Producto";
			res = n1*n2;
			break;
		case 4:
			if (n2 == 0) {
				operacion = "No es posible resolver";
				res = 0;
			}
			else {
				operacion = "Divisi�n";
				res = n1 /n2;
			}
			break;
		case 5:
			if (n2 == 0) {
				operacion = "No es posible resolver";
				res = 0;
			}
			else {
				operacion = "Divisi�n";
				res = n1%n2;
			}
			break;
		case 6:
			operacion = "Promedio";
			res = (n1+n2)/2;
			break;
		}
		System.out.println("\n--- RESULTADO ---");
		System.out.println("N�mero 1..: "+n1);
		System.out.println("N�mero 2..: "+n2);
		System.out.println("Operaci�n.: "+operacion);
		System.out.println("Resultado.: "+res);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
