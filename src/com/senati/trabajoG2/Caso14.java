package com.senati.trabajoG2;

import java.util.Scanner;

public class Caso14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Alumno: ");
		String al = sc.nextLine();
		System.out.print("*CARRERA*\nDesarrollo de Software (DS)\nRedes y Conectividad (RC)\nDiseño Gráfico (DG)\n*ESCOJA CAFRRERA*: ");
		String ca = sc.nextLine();
		System.out.print("Turno [M/T/N]: ");
		String tu = sc.nextLine();
		String operacion = "Desconocido";
		float monto = 0;
		float desc = 0;
		String turno = "";
		switch (ca) {
		case "DS":
			monto=1500;
			break;
		case "RC":
			monto=1400;
			break;
		case "DG":
			monto=1300;
			break;
		}
		switch (tu) {
		case "M":
			desc = 0.10f;
			turno = "Mañana";
			break;
		case "T":
			desc = 0.20f;
			turno = "Tarde";
			break;
		case "N":
			desc = 0.15f;
			turno = "Noche";
			break;
		}
		float total = monto-(monto * desc);
		float dolar = total /(float) 3.33;
		System.out.println("\n--- RESULTADO ---");
		System.out.println("Alumno......: "+al);
		System.out.println("Turno.......: "+turno.toUpperCase());
		System.out.println("Monto.......: "+monto);
		System.out.println("Descuento...: "+desc*100+" %");
		System.out.println("Total.......: "+total);
		System.out.println("Eq. Dolares.: "+dolar);

	}

}
