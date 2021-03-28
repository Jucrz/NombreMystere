package jeu.mode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import jeu.nombre.Nombre;

public class Mode2Test {
	@Test
	public void testNumberCompare(){
		// Arrange
		Nombre a = new Nombre("0011");
		Nombre b = new Nombre("0110");
		Mode2 m = new Mode2(a);
		String resultat = "";
		
		// Act
		resultat = m.numberCompare(a, b, resultat);
		
		// Assert
		assertEquals("=-=+", resultat);
	}
	
	@Test
	public void testchooseNumber() {
		// Arrange
		Nombre a = new Nombre("0110");
		Mode2 m = new Mode2(a);
		String resultat = "=-=+";
		
		// Act
		m.chooseNumber(a, resultat);
		
		// Assert
		assertEquals("[0, 0, 1, 1]", String.valueOf(a.getListChiffres()));
		
	}
}
