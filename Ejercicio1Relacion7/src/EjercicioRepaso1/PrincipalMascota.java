package EjercicioRepaso1;

import java.util.Scanner;

public class PrincipalMascota {
	private static Scanner teclado= new Scanner (System.in);
	public static void main(String[] args) {
		String nombre;
		String tipo;
		String nombre2;
		String tipo2;
		System.out.println("Acabas de adquirir un MonroyPet! \n Dime que nombre quieres darle.");
		nombre=teclado.nextLine();
		System.out.println(nombre+"? ¡Qué buen nombre! \n No lo veo bien, ¿Es un PERRO o un GATO?");
		tipo=teclado.nextLine();
		System.out.println("Claro! Ahora lo veo bien, "+nombre+" es un "+tipo+".");
		System.out.println("Ahora que me fijo, tu mascota está muy solita, elige una nueva MonroyPet");
		System.out.println("¿Cómo se llama?");
		nombre2=teclado.nextLine();
		System.out.println(nombre2+"? ¡Qué buen nombre! \n No lo veo bien, ¿Es un PERRO o un GATO?");
		tipo2=teclado.nextLine();
		try {
			MonroyPet monroyPet1= new MonroyPet(nombre, tipo);
			MonroyPet monroyPet2= new MonroyPet(nombre2, tipo2);
			PrincipalMascota.menu(monroyPet1, monroyPet2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}
	
	
	
	public static void menu(MonroyPet monroyPet1, MonroyPet monroyPet2) {
		int menu;
		boolean salir=false;
		
		do {
			System.out.println("Elige una opción: \n1-Dar comida. \n2-Comprar comida. \n3-Jugar. \n4-Información de mascotas. \n5-Salir.");
			menu=Integer.parseInt(teclado.nextLine());
			
			switch (menu) {
			case 1: {
				PrincipalMascota.darComida(monroyPet1, monroyPet2);
				System.out.println(" ");
				break;
			}
			case 2: {
				PrincipalMascota.comprar(monroyPet1, monroyPet2);
				System.out.println(" ");
				break;
			}
			case 3: {
				PrincipalMascota.sacarAJugar(monroyPet1, monroyPet2);
				System.out.println(" ");
				break;
			}
			case 4: {
				System.out.println("Aquí tienes la información de tus MonroyPets!");
				System.out.println(monroyPet1.toString());
				System.out.println(monroyPet2.toString());
				System.out.println("Total de tiempo jugado con las mascotas: "+MonroyPet.getTotalJugadoEntreTodasMascotas());
				System.out.println(" ");
				PrincipalMascota.menu(monroyPet1, monroyPet2);
				break;
			}
			case 5: {
				System.out.println("Hasta la próxima!");
				salir=true;
				break;
			}
			default:
				System.out.println("Elige una opción del 1 al 5.");
				System.out.println(" ");
			}
		} while (salir);
	}
	
	
	
	public static void sacarAJugar(MonroyPet monroyPet1, MonroyPet monroyPet2) {
		String nombre;
		do {
			System.out.println("Elige a cual de tus MonroyPets sacarás a jugar, a "+monroyPet1.getNombre()+" o "+monroyPet2.getNombre()+".");
			nombre=teclado.nextLine();
		} while (!nombre.equals(monroyPet1.getNombre()) && !nombre.equals(monroyPet2.getNombre()));
		try {
			if (nombre.equals(monroyPet1.getNombre())) {
				monroyPet1.jugar();
			}else {
				monroyPet2.jugar();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		PrincipalMascota.menu(monroyPet1, monroyPet2);
	}
	
	
	
	public static void comprar(MonroyPet monroyPet1, MonroyPet monroyPet2) {
		String nombre;
		do {
			System.out.println("Elige a cual de tus MonroyPets le comprarás comida, a "+monroyPet1.getNombre()+" o "+monroyPet2.getNombre()+".");
			nombre=teclado.nextLine();
		} while (!nombre.equals(monroyPet1.getNombre()) && !nombre.equals(monroyPet2.getNombre()));
		try {	
				if (nombre.equals(monroyPet1.getNombre())) {
					monroyPet1.comprarComida();
				}else {
					monroyPet2.comprarComida();
				}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		PrincipalMascota.menu(monroyPet1, monroyPet2);
	}
	
	
	public static void darComida(MonroyPet monroyPet1, MonroyPet monroyPet2) {
		String nombre;
		do {
			System.out.println("Elige a cual de tus MonroyPets quieres alimentar, a "+monroyPet1.getNombre()+" o "+monroyPet2.getNombre()+".");
			nombre=teclado.nextLine();
		} while (!nombre.equals(monroyPet1.getNombre()) && !nombre.equals(monroyPet2.getNombre()));
		try {
			if (nombre.equals(monroyPet1.getNombre())) {
				monroyPet1.darComida();
			}else {
				monroyPet2.darComida();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		PrincipalMascota.menu(monroyPet1, monroyPet2);
	}
}
