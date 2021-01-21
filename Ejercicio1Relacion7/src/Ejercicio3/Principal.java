package Ejercicio3;

public class Principal {

	public static void main(String[] args) {
		
		try {
			
		
		Categoria videojuegos=new Categoria( "videojuegos", 21);
		
		Producto smashBros =new Producto("Juego de pelea", 50,videojuegos);
		
		System.out.println(smashBros.toString());
		System.out.println("Junto al IVA el precio final seria "+smashBros.precioConIva()+"€");
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
