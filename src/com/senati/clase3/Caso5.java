package com.senati.clase3;

import java.util.Scanner;

public class Caso5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Ingresa precio: ");
		float pre = sc.nextFloat();
		
		System.out.print("Ingresa cantidad: ");
		float cant = sc.nextFloat();
		
		float  tot=pre*cant;
		
		float dsc = 0;
		
		if (cant > 8)
			dsc=(float) 0.1*tot;
		
		float neto=tot-dsc;
		
		System.out.println("\n--- RESULTADO ---");
		System.out.println("total......: "+ tot);
		System.out.println("Descuento..: "+ dsc);	
		System.out.println("Neto.......: "+ neto);	
			
	}

}
