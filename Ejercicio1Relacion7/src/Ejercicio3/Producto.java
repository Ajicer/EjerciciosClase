package Ejercicio3;

public class Producto {
	private int codigo;
	private String descripcion;
	private int precioSinIva;
	private Categoria categoria;
	private static int siguienteCodigoADar=1;
	
	//Constructor
	public Producto(String descripcion, int precioSinIva, Categoria categoria) throws Exception {
		this.codigo= siguienteCodigoADar;
		siguienteCodigoADar++;
		this.descripcion = descripcion;
		if(precioSinIva<0) {
			throw new VentaException("Precio tiene que ser superior a 0");
		}
		this.precioSinIva = precioSinIva;
		this.categoria = categoria;
	}
	// get y set

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getPrecioSinIva() {
		return precioSinIva;
	}

	public void setPrecioSinIva(int precioSinIva) throws Exception {
		if(precioSinIva<0) {
			throw new VentaException ("El precio no puede ser menor a 0");
		}
		this.precioSinIva = precioSinIva;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	//toString
	
	public String toString() {
		return "Es un "+ descripcion+" de precio sin Iva de "+precioSinIva+"€ y de la categoria "+categoria.getNombreCategoria();
	}
	
	public double precioConIva() {
		double precioFinal;
		precioFinal=(precioSinIva*(categoria.getIva()/100));
		return precioFinal;
	}

	
}
