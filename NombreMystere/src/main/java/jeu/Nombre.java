package jeu;

public class Nombre {
	
	public int chiffre1;
	private int chiffre2;
	private int chiffre3;
	private int chiffre4;
	
	public Nombre(String nbr) {
		this.chiffre1 = Integer.parseInt(nbr, nbr.charAt(0));
	}
}
