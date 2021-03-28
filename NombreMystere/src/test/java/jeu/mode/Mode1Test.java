package jeu.mode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import jeu.nombre.Nombre;

public class Mode1Test {
	
	@Test
	public void testNumberCompare(){
		// Arrange
		Nombre a = new Nombre("0011");
		Nombre b = new Nombre("0110");
		Mode1 m = new Mode1(a);
		String resultat = "";
		
		// Act
		resultat = m.numberCompare(a, b, resultat);
		
		// Assert
		assertEquals("=-=+", resultat);
	}
	
}
