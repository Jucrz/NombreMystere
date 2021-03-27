package jeu;

import java.util.Scanner;
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
