package Ejercicio5;

public class Partido {

	private int jornada;
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	private int golesLocal;
	private int golesVisitante;
	private char resultadoQuiniela;
	private boolean jugando;
	
	//Constructor
	public Partido (int jornada, Equipo equipoLocal, Equipo equipoVisitante) throws LigaException{
		this.equipoLocal=equipoLocal;
		this.equipoVisitante=equipoVisitante;
		
		jugando=false;
		
		if(jornada<1 || jornada>38) {
			throw new LigaException ("La liga tiene que ser entre 1 y 38");
		}
		if(equipoLocal.equals(equipoVisitante)) {
			throw new LigaException ("No pueden ser iguales");
		}
	}
	// get and set
	public int getJornada() {
		return jornada;
	}

	public Equipo getEquipoLocal() {
		return equipoLocal;
	}

	public Equipo getEquipoVisitante() {
		return equipoVisitante;
	}

	public int getGolesLocal() {
		return golesLocal;
	}

	public void setGolesLocal(int golesLocal) {
		this.golesLocal = golesLocal;
	}

	public int getGolesVisitante() {
		return golesVisitante;
	}

	public void setGolesVisitante(int golesVisitante) {
		this.golesVisitante = golesVisitante;
	}

	public char getResultadoQuiniela() {
		return resultadoQuiniela;
	}

	public void setResultadoQuiniela(char resultadoQuiniela) {
		this.resultadoQuiniela = resultadoQuiniela;
	}
	//toString
	
	public String toString() {
		
		if(!jugando)
		return "Partido entre equipo local "+ equipoLocal.getNombreEquipo()+" y equipo visitante "+ equipoVisitante.getNombreEquipo()+ " todavia no se ha jugado";
		else {
			return "Partido entre equipo local "+ equipoLocal.getNombreEquipo()+" y equipo visitante "+ equipoVisitante.getNombreEquipo()+" jugado en el estadio "+ equipoLocal.getNombreEstadio()+
					" de la ciudad "+ equipoLocal.getCiudad()+ " ha finalizado con " +golesLocal+ " goles de equipo local y "+ golesVisitante+
					" goles del equipo visitante. Resultado quiniela= "+resultadoQuiniela;
		}
	}
	// otros
	
	public void ponerResultado( String resultado) throws LigaException{
		
		String[] partes = resultado.split("-");
		
		String golLocal = partes[0];
        String golVisitante = partes[1];
		jugando=true;
		
		golesLocal=Integer.valueOf(golLocal);
		golesVisitante= Integer.valueOf(golVisitante);
		
		if (golesLocal>golesVisitante) {
			resultadoQuiniela='1';
			equipoLocal.incrementarPartidosGanados();
		}else {
				if(golesLocal<golesVisitante) {
					resultadoQuiniela='2';
					equipoVisitante.incrementarPartidosGanados();
				}else {
					resultadoQuiniela='x';
				}
			}
		}
	
	
	}
	
	
	
	
	
	

