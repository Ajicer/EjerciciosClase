package Ejercicio3;

public class Categoria {
	private static final int IVA_MAXIMO = 21;
	private String nombreCategoria;
	private double iva;
	
	public Categoria (String nombreCategoria, int iva) {
		this.nombreCategoria=nombreCategoria;
		try {
			setIva(iva);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

	public String getNombreCategoria() {
		return nombreCategoria;
	}

	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(int iva) throws Exception{
		if(iva> IVA_MAXIMO || iva<0) {
			throw new VentaException("El IVA no puede ser superior al maximo");
		}
		this.iva = iva;
	}
}
