package Ejercicio5;

public class Principal {

	public static void main(String[] args) {
		boolean error;

		Equipo betis= new Equipo ("REAL BETIS", "Benito Villamarín", "Sevilla");
		Equipo sevilla= new Equipo("SEVILLA", "Sanchez Pizjuan", "Sevilla");
		
		try {
			Partido partido1=new Partido (3, betis, sevilla);
			System.out.println(partido1);
			partido1.ponerResultado("3-0");
			System.out.println(partido1);
		} catch (LigaException e) {
			e.printStackTrace();
		}
		
		do {
			try {
				Partido partido2=new Partido (4, betis, sevilla);
				System.out.println(partido2);
				partido2.ponerResultado("5-2");
				System.out.println(partido2);
				
				
				Partido partido3=new Partido (5, betis, sevilla);
				System.out.println(partido3);
				partido3.ponerResultado("3-8");
				System.out.println(partido3);
				error=false;
			} catch (LigaException e) {
				e.printStackTrace();
				error=true;
			}
		} while (error);
		
		
		

	}

}
