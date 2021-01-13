
public class Llamadas {

	public static void main(String[] args) {
		int x=1;
		int y=10;
		String entero="Dame un entero ";
		String enteroPositivo= "Dame un entero positivo ";
		String caracter= "Dame un caracter ";
		String caracterSN= "Dime S o N ";
		String mensaje= "Pon una cadena de texto ";
		
		
			
		
		MiEntradaSalida.solicitarEntero(entero);
		MiEntradaSalida.solicitarEnteroPositivo(enteroPositivo);
		MiEntradaSalida.solicitarEnteroEnRango(x, y);
		MiEntradaSalida.solicitarCaracter(caracter);
		MiEntradaSalida.solicitarSN(caracterSN);
		MiEntradaSalida.solicitarCadena(mensaje);
		
	}

}
