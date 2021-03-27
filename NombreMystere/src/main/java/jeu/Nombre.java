package jeu;

import java.util.ArrayList;

public class Nombre {
	
	private ArrayList<Integer> listChiffres = new ArrayList<Integer>();

	
	public Nombre(String nbr) {
		for (int i = 0; i < 4; i++) {
			this.listChiffres.add(Character.getNumericValue(nbr.charAt(i)));
		}
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 4; i++) {
			sb.append(listChiffres.get(i));
		}

		return sb.toString();
	}
	
	public void numberCompare() {
		
	}
}
