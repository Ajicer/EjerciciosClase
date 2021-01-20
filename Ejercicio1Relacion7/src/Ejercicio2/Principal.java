package Ejercicio2;

import java.util.Scanner;

public class Principal {
	private static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		
		Punto puntoOrigen= new Punto(3,4);
		Punto puntoDestino= new Punto(-3,-4);
		
		Linea linea1=new Linea(puntoOrigen, puntoDestino);
		try {
		System.out.println(linea1);
		Principal.menu(linea1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	public static void menu(Linea linea) throws Exception{
		boolean salir=false;
		do {
			int menu;
			System.out.println("Elija una opción: \n 1. Mover linea \n 2. Mostrar linea \n 3. Salir");
			menu=Integer.parseInt(teclado.nextLine());
			if(menu>3 || menu<1) {
				throw new LineaException ("Usa una opción del menú 1, 2 o 3");
			}
			
		try {
		switch (menu) {
		case 1: {
				Principal.submenu(linea);
				break;
		}
		case 2: {
					System.out.println(linea.toString());
					System.out.println(" ");
					Principal.menu(linea);
				}
		case 3: {
			salir=false;
			break;
		}
		default:
			System.out.println("Elije una de las opciones que se dan para elegir");
			break;
		}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		} while (salir);
	}
	public static void submenu (Linea linea)  throws Exception {


			char menu;
			double desplazado;
			System.out.println("Elija una opción: \n A-arriba \n B-abajo \n I-izquierda \n D-derecha");
			menu=teclado.nextLine().charAt(0);
			
		
		switch (menu) {
		case 'A': {
			System.out.println("Cuanto quieres desplazarlo?");
			desplazado=Double.parseDouble(teclado.nextLine());
			if(desplazado<0) {
				throw new LineaException("Para desplazarte tienes que poner un número positivo!");
			}
			Principal.desplazarArriba(linea, desplazado);
			Principal.menu(linea);
				break;
		}
		case 'B': {
			System.out.println("Cuanto quieres desplazarlo?");
			desplazado=Double.parseDouble(teclado.nextLine());
			if(desplazado<0) {
				throw new LineaException("Para desplazarte tienes que poner un número positivo!");
			}
			Principal.desplazarAbajo(linea, desplazado);
			Principal.menu(linea);
				break;
				}
		case 'I': {
			System.out.println("Cuanto quieres desplazarlo?");
			desplazado=Double.parseDouble(teclado.nextLine());
			if(desplazado<0) {
				throw new LineaException("Para desplazarte tienes que poner un número positivo!");
			}
			Principal.desplazarIzquierda(linea, desplazado);
			Principal.menu(linea);
				break;
		}
		case 'D': {
			System.out.println("Cuanto quieres desplazarlo?");
			desplazado=Double.parseDouble(teclado.nextLine());
			if(desplazado<0) {
				throw new LineaException("Para desplazarte tienes que poner un número positivo!");
			}
			Principal.desplazarDerecha(linea, desplazado);
			Principal.menu(linea);
				break;
		}
		default:
			System.out.println("Elije una de las opciones que se dan para elegir");
				break;
		}

	}

	private static void desplazarDerecha(Linea linea, double movimiento){
		Punto punto;
		double nuevaPos;
		double x;
		
		punto=linea.getPunto1();
		x= punto.getX();
		nuevaPos=x+movimiento;
		punto.setX(nuevaPos);
		
		punto=linea.getPunto2();
		x= punto.getX();
		nuevaPos=x+movimiento;
		punto.setX(nuevaPos);
		
	}

	private static void desplazarIzquierda(Linea linea, double movimiento) {
		Punto punto;
		double nuevaPos;
		double x;
		punto=linea.getPunto1();
		x= punto.getX();
		nuevaPos=x-movimiento;
		punto.setX(nuevaPos);
		
		punto=linea.getPunto2();
		x= punto.getX();
		nuevaPos=x-movimiento;
		punto.setX(nuevaPos);
		
	}

	private static void desplazarAbajo(Linea linea, double movimiento) {
		Punto punto;
		double nuevaPos;
		double y;
		punto=linea.getPunto1();
		y= punto.getY();
		nuevaPos=y-movimiento;
		punto.setY(nuevaPos);
		
		punto=linea.getPunto2();
		y= punto.getY();
		nuevaPos=y-movimiento;
		punto.setY(nuevaPos);
		
	}

	private static void desplazarArriba(Linea linea, double movimiento) {
		Punto punto;
		double nuevaPos;
		double y;
		punto=linea.getPunto1();
		y= punto.getY();
		nuevaPos=y+movimiento;
		punto.setY(nuevaPos);
		
		punto=linea.getPunto2();
		y= punto.getY();
		nuevaPos=y+movimiento;
		punto.setY(nuevaPos);
	}
}
