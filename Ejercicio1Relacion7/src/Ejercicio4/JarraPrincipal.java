package Ejercicio4;

import java.util.Scanner;

public class JarraPrincipal {
	private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		try {
		Jarra jarraA= new Jarra(7,0);
		Jarra jarraB= new Jarra(4,0);
		
		
		System.out.println("Hola, qué desea realizar?");
		JarraPrincipal.menu(jarraA, jarraB);
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}		
public static void menu(Jarra jarraA, Jarra jarraB) {	
		boolean continuar=true;
		char respuesta;
		
		do {
			int menu;
			System.out.println(" 1. LLenar jarra \n 2. Vaciar jarra \n 3. Volcar jarra A en B \n 4. Volcar jarra B en A \n 5. Ver estado de las jarras \n 6. Salir");
			menu=Integer.parseInt(teclado.nextLine());
			
		switch (menu) {
		case 1: {
			do {
				System.out.println("Qué jarra quieres llenar (A/B)? ");
				respuesta=teclado.nextLine().charAt(0);
				} while (respuesta!='A' && respuesta!='B');
			if (respuesta=='A') {
				jarraA.llenarJarra();
			}else {
				jarraB.llenarJarra();
			}
			System.out.println("Jarra llenada correctamente ");
			System.out.println("");
			break;
			
		}
		case 2: {
			do {
				System.out.println("Qué jarra quieres vaciar (A/B)? ");
				respuesta=teclado.nextLine().charAt(0);
				} while (respuesta!='A' && respuesta!='B');
			if (respuesta=='A') {
				jarraA.vaciarJarra();
			}else {
				jarraB.vaciarJarra();
			}
			System.out.println("Jarra vaciada correctamente ");
			System.out.println("");
			break;
		}
		case 3: {
			jarraB.volcarJarra(jarraA);
			System.out.println("cantidad Jarra A "+jarraA.getCantidad());
			System.out.println("cantidad Jarra B "+jarraB.getCantidad());
			System.out.println("");
			break;
		}
		case 4: {
			jarraA.volcarJarra(jarraB);
			System.out.println("cantidad Jarra A "+jarraA.getCantidad());
			System.out.println("cantidad Jarra B "+jarraB.getCantidad());
			System.out.println("");
			break;
		}
		case 5: {
			System.out.println("La jarra A tiene :"+ jarraA.toString());
			System.out.println("La jarra B tiene :"+ jarraB.toString());
			System.out.println("");
			break;
		}
		case 6:{
			System.out.println("El agua consumida fue "+ Jarra.getTotalAguaConsumida());
			System.out.println("");
			continuar=false;
			break;
		}
		default:
			System.out.println("Error, seleccione opción del menú del 1 al 6");
		}
			
		
		}while(continuar);
	}

	
	public static void opcion1() {
	
		
	}
	
	
}
