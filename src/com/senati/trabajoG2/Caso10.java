package com.senati.trabajoG2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("#.0");
		
		System.out.print("Ingresa tú nombre y apellido: ");
		String nom = sc.nextLine();
		
		System.out.print("Ingrese horas trabajadas....: ");
		int horas = sc.nextInt();
		
		System.out.print("Tarifa por hora.............: ");
		float tarifa = sc.nextFloat();
		
		System.out.print("Ingresa minutos de tardanza.: ");
		float tardanza = sc.nextFloat();
		
		float importe = horas * tarifa;
		float bono = 0.04f*importe;
		float descuento = 0;
		if (horas > 60)
			bono = 0.13f*importe;
		if (tardanza > 15)
			descuento = 0.03f*importe;
		float neto = importe+bono-descuento;
		float alcanzado = horas*100/70;
		
		System.out.println("\n--- RESULTADO ---");
		System.out.println("Trabajador........: "+nom);
		System.out.println("Horas trabajadas..: "+horas);
		System.out.println("Tarifa por hora...: "+tarifa);
		System.out.println("Importe...........: "+df.format(importe)+" $");
		System.out.println("Bono..............: "+df.format(bono)+" $");
		System.out.println("Descuento.........: "+df.format(descuento)+" $");
		System.out.println("Neto..............: "+df.format(neto)+" $");
		System.out.println("Meta alcanzada....: "+alcanzado+" %");
			
	}

}
