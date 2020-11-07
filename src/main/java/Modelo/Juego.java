package Modelo;

public class Juego {
	
	public static int fila = 10;
	public static int columna = 10;
	public static int longitudCodigo = 5;
	public String[][] tablero;
	public String codigo[];
	String vacio = "0";

	public Juego() {
		
		tablero = new String[fila][columna];
		codigo = new String[5];
		
	}
	
	/**
	 * Inicializa el tablero a vacio = 0
	 */
	public void InicializarTablero() {
		
		for (int i=0; i<fila; i++) {
			for (int j=0; j<columna;j++) {
			
				setCasilla(i,j,vacio);
			}
		}
		
	}
	
	public String GenerarCodigoGama(){	        
		
		
		  return "0"; 
	}
	
		
	
	public String getCodigo(int i) {
		
		return codigo[i];	
		
	}
	
	public void setCasilla(int i, int j, String vacio ) {
		
		tablero[i][j] = vacio;
	
	}
	
	public String getCasilla(int i, int j) {
		
		return tablero[i][j];
	}
	
	public int getFila() {
		return fila;
	}

	public int getColumna() {
		return columna;
	}


}
