/**
 * 
 * capacidad, 
	cantidad que tiene en ese momento
	total de agua consumida entre las dos jarras
	to string
	set get (uno de ellos no)
	llenarla
	vaciarla
	volcar una sobre otra
 * 
 * 
 * @author aleja
 *
 */
package Ejercicio4;
public class Jarra {

		
	private static final int MINIMO_AGUA = 0;
	private int capacidad;
	private int cantidad;
	private static int totalAguaConsumida;
	
	
	//CONSTRUCTOR
	
	
	public Jarra(int capacidadJarra, int cantidadJarra) throws JarraException {
		if(capacidad<0) {
			throw new JarraException("Tiene que ser un número positivo");
		}
		capacidad=capacidadJarra;
		cantidad=cantidadJarra;
		
	}
	public Jarra() {
		capacidad=1;
		cantidad=0;
	}
	
	//MASMETODOS
	
	public int getCapacidad() {
		return capacidad;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public static int getTotalAguaConsumida() {
		return totalAguaConsumida;
	}
	
	public String toString() {
		return " Capacidad: " + capacidad + "\n Cantidad de agua actual:  "+ cantidad;
	}
	public void llenarJarra() {
		cantidad=capacidad;
	}
	public void vaciarJarra() {
		totalAguaConsumida= totalAguaConsumida+cantidad;
		cantidad=MINIMO_AGUA;
		
	}
	
	public void volcarJarra(Jarra jarra2) {
		cantidad=jarra2.cantidad+cantidad;
		if (cantidad>capacidad) {
			jarra2.cantidad=cantidad-capacidad;
			cantidad=capacidad;
		}else {
			jarra2.cantidad=0;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
