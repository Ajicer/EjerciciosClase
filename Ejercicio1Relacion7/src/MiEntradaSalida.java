import java.util.Scanner;

public class MiEntradaSalida {
	private static Scanner teclado=new Scanner(System.in);
	
	public static int solicitarEntero(String mensaje) {
		int entero=0;
		boolean correcto=false;
		
		do {
		System.out.println(mensaje);
		try {
		entero=Integer.parseInt(teclado.nextLine());
		correcto=true;
		} catch (Exception e) {
			System.out.println("No es un numero");
		}
		} while (correcto==false);
		
		return entero;
	}
	
	public static int solicitarEnteroPositivo(String mensaje) {
		int enteroPositivo=0;
		boolean correcto=false;
		do {
			System.out.println(mensaje);
			try {
			enteroPositivo=Integer.parseInt(teclado.nextLine());
			correcto=true;
			} catch (Exception e) {
			}
		} while (enteroPositivo<0 || correcto==false);
		
		return enteroPositivo;
	}
	
	public static int solicitarEnteroEnRango(int x, int y) {
		int enteroRango;
		boolean verdad=false;
		do{
		System.out.println("Dame un entero entre "+ x+" y "+y);
		enteroRango=Integer.parseInt(teclado.nextLine());
		if (enteroRango>x && enteroRango<y) {
			verdad=true;
		}
		}while (verdad==false);
		return enteroRango;
	}
	
	public static char solicitarCaracter(String mensaje) {
		char caracter=0;
		boolean correcto=false;
		System.out.println(mensaje);
		do {
		try {
			caracter=teclado.nextLine().charAt(0);
			correcto=true;
		} catch (Exception e) {
			System.out.println("Eso no es u caracter, dame un caracter ");
		}
		} while (correcto==false);
		
		return caracter;
	}
	public static char solicitarSN(String mensaje) {
		char caracter;
		do {
		System.out.println(mensaje);
		caracter=teclado.nextLine().charAt(0);
		}while(caracter!='S'&& caracter!='N');
		return caracter;
	}
	public static String solicitarCadena(String mensaje) {
		String respuesta="0";
		boolean correcto=false;
			
		do {
		System.out.println(mensaje);
		try {
		respuesta=teclado.nextLine();
		correcto=true;
		} catch (Exception e) {
			System.out.println("Eso no es una cadena, introduce una cadena");
		}
		} while (correcto==false);
		return respuesta;
	}
	
	
	
	
	
}
