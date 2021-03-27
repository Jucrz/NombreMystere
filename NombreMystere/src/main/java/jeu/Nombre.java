package jeu;

import java.util.Scanner;

public class Nombre {
	
	private int chiffre1;
	private int chiffre2;
	private int chiffre3;
	private int chiffre4;
	
	public Nombre(String nbr) {
		this.chiffre1 = Character.getNumericValue(nbr.charAt(0));
		this.chiffre2 = Character.getNumericValue(nbr.charAt(1));
		this.chiffre3 = Character.getNumericValue(nbr.charAt(2));
		this.chiffre4 = Character.getNumericValue(nbr.charAt(3));
	}
	
	public void Mode1() {
		int count = 0;
		String result;
		do {
			Scanner sc = new Scanner(System.in);
			Nombre nbr = new Nombre(sc.next());
		
		}
		while (count < 10 | result != "====");
	}
	
}
