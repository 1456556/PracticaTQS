package mastermind;

import org.junit.Test;
import static org.junit.Assert.*;

public class TaulerTest {
	
	
	Tauler taulerTest = new Tauler();
	
	/*
	 * Test de la funcion Tauler() (Constructor)
	 * 
	 * Test de caja negra para comprovar que la matriz se ha creado correctamente
	 * comprobando sus limites con los getters de fila y columna para ver si se ha 
	 * creado siguiendo las dimensionnes indicadas (fila=10 y columnma =10).
	 * 
	 */
	@Test public void ConstructorTaulerTest() {
		
		assertNotEquals(null,taulerTest.tauler);
		assertEquals(10, taulerTest.getFila());
		assertEquals(10, taulerTest.getColumna());
		assertNotEquals(9, taulerTest.getFila());
		assertNotEquals(9, taulerTest.getColumna());
		assertNotEquals(11, taulerTest.getFila());
		assertNotEquals(11, taulerTest.getColumna());
		 
		 
	 }
	
	/*
	 * Test de la funcion InicializarTauler()
	 * 
	 * Test de caja negra que comprueba si se ha inicializado correctamente la matriz (Tauler).
	 * 
	 */
	@Test public void InicialitzarTaulerTest() {	
				
		taulerTest.InicialitzarTauler();
		assertNotEquals(0,taulerTest.tauler[0][0]);
				
				
	}		
			
			
		
	
	


}