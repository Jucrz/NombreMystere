package jeu;

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
}
