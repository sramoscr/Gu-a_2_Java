package com.senati.trabajoG2;

import java.util.Scanner;

public class Cajero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arrNum_tarj = {"A-123", "A-456", "A-789", "A-777"};
		String[] arrNombre = {"Yulisa Mamani", "Rosa Flores", "Karla Ramos", "Ricardo Montes"};
		String[] arrClave = {"2334","4556", "7889", "9001"};
		int   [] arrSaldo = {2000,1500,780,900};
		
		System.out.println("\n===========================");
		System.out.println("          CAJERO           ");
		System.out.println("===========================\n");
		System.out.print("Número de tarjeta......: ");
		String num_tarj = sc.nextLine();
		System.out.println("-----------------------");
		
		int p = -1;
		
		for (int x = 0; x < arrNum_tarj.length; x++) {
			if (num_tarj.equals(arrNum_tarj[x])) {
				p = x;
				break;
			}	
		}
		
		if (p == -1) {
			System.out.println("\n==========================");
			System.out.println("   TARJETA NO ENCONTRADA   ");
			System.out.println("===========================\n");
		}
		else {
			System.out.print("Clave de la tarjeta....: ");
			String clave = sc.nextLine();
			System.out.println("-----------------------");
			int k = -1;
			
			for (int y = 0; y < arrClave.length; y++) {
				if (clave.equals(arrClave[y])) {
					k = y;
					break;
				}
			}
			if (k == -1) {
				System.out.println("\n==========================");
				System.out.println("   CLAVE INVÁLIDA, ADIOS  ");
				System.out.println("===========================\n");
			}
			else {
				String resp="si";
				while (resp == "si") {
					System.out.println("\n===========================");
					System.out.println("Cliente: "+arrNombre[p]);
					System.out.print("Operaciones: \n1. Retiro\n2. Ver saldo\n3. Tranferencia\nINGRESA UNA OPCIÓN: ");
					String op = sc.nextLine();
					System.out.println("===========================\n");
					switch (op) {
						case "1":
							System.out.println("\n==========================");
							System.out.println("Ingresa el monto a retirar :");
							int monto = sc.nextInt();
							
							if (monto > arrSaldo[p]) {
								System.out.println("\n======================");
								System.out.println(" ¡SALDO INSUFICIENTE! ");
								System.out.println("======================\n");
							}
							else {
								int nsaldo = arrSaldo[p] - monto;
								System.out.println("\n=======================");
								System.out.println("Monto a retirar.: "+monto);
								System.out.println("Nuevo Saldo.....: "+nsaldo);
								System.out.println("=======================\n");
								
							}
							
							System.out.println("\n¿DESEA REALIZAR OTRA OPERACIÓN?\n [si/no] ");
							resp = sc.nextLine();
							break;
							
						case "2":
							System.out.println("\n======================");
							System.out.println("Saldo.....: "+arrSaldo[p]);
							System.out.println("======================\n");
							
							System.out.println("\n¿DESEA REALIZAR OTRA OPERACIÓN?\n [si/no] ");
							resp = sc.nextLine();
							break;
						
						case "3":
							System.out.println("\n==========================");
							System.out.println("Ingresa el monto a transferir :");
							int monto1 = sc.nextInt();
							
							if (monto1 > arrSaldo[p]) {
								System.out.println("\n======================");
								System.out.println(" ¡SALDO INSUFICIENTE! ");
								System.out.println("======================\n");
							}
							else {
								int nsaldo1 = arrSaldo[p] - monto1;
								System.out.println("\n=======================");
								System.out.println("Monto a transferir.: "+monto1);
								System.out.println("Nuevo Saldo........: "+nsaldo1);
								System.out.println("=======================\n");
							}
							
							System.out.println("\n¿DESEA REALIZAR OTRA OPERACIÓN?\n [si/no]: ");
							resp = sc.nextLine();
							break;
						
					}
				}
			}
		}
			
	}

}

