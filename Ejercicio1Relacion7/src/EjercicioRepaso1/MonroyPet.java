package EjercicioRepaso1;

import java.util.Scanner;

public class MonroyPet {
	private static final int TIEMPO_MAXIMO = 20;

	private static Scanner teclado=new Scanner (System.in);
	
	private static final int COMIDA_INICIAL = 2;
	private static final int PUNTOS_INCIALES = 0;
	private String nombre;
	private String tipo;
	private int puntos;
	private int comida;
	private String tipoComida;
	
	private static int totalJugadoEntreTodasMascotas=0;
	//CONSTRUCTOR
	public MonroyPet(String nombre, String tipo) throws MonroyPetException {
		
		if ( !  (tipo.equals("PERRO")  || tipo.equals("GATO"))) {
			throw new MonroyPetException("Tipo de mascota incorrecto");
		}
		
		this.nombre = nombre;
		this.tipo = tipo;
		this.puntos= PUNTOS_INCIALES;
		this.comida=COMIDA_INICIAL;
		
		
	}
	
	// get y set
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public static int getTotalJugadoEntreTodasMascotas() {
		return totalJugadoEntreTodasMascotas;
	}

	//toString

	public String toString() {
		if(tipo.equals("PERRO")) {
			tipoComida="huesos";
		}else {
			tipoComida="pescado";
		}
		return "La MonroyPet se llama " + nombre + ", y es un " + tipo + ", tiene " + puntos + " puntos y " + comida + " de "+ tipoComida+ ".";
	}
	
	public void darComida() throws MonroyPetException {
		System.out.println("Tu mascota come apaciblemente");
		comida--;
		if (comida<0) {
			throw new MonroyPetException("Has consumido más comida de la que se tenía");
		}
	}
	public void comprarComida()throws MonroyPetException {
		int compra;
		int precio;
		do {
			System.out.println("¿Cuánto alimento deseas comprar?");
			compra=Integer.parseInt(teclado.nextLine());
			precio= compra*30;
			if (compra<0) {
				throw new MonroyPetException("No se puede comprar en negativo");
			}
			if (precio>puntos) {
				System.out.println("No dispones de suficientes puntos, cada unidad alimenticia cuesta 30 puntos, dispones de "+ puntos+ " puntos");
			}
		} while (precio>puntos);
			puntos=puntos-precio;
			comida= comida+compra;
	}
	public void jugar() throws MonroyPetException{
		int tiempoJuego;
		do {
			System.out.println("¿Cuántos minutos quieres jugar?");
			tiempoJuego=Integer.parseInt(teclado.nextLine());
			if (tiempoJuego<1) {
				throw new MonroyPetException("Tiempo demasiado pequeño");
			}
			if (tiempoJuego>TIEMPO_MAXIMO) {
				System.out.println("¡Solo puedes jugar 20 minutos seguidos!");
			}
		} while (tiempoJuego>TIEMPO_MAXIMO);
		System.out.println("¡Lo habéis pasado muy bien!");
			puntos=puntos+ (tiempoJuego*3);
			totalJugadoEntreTodasMascotas=totalJugadoEntreTodasMascotas+tiempoJuego;
			
	}
	
	
}
