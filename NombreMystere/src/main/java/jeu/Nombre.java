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
	
	public String numberCompare(Nombre a, Nombre b, String resultat) {
		for (int i=0; i<4; i++) {
			if (a.getListChiffres().get(i) < b.getListChiffres().get(i)) {
				resultat = resultat + "-";
			} else if (a.getListChiffres().get(i) > b.getListChiffres().get(i)) {
				resultat = resultat + "+";
			} else {
				resultat = resultat + "=";
			}
		}
		return resultat;
	}
	
	public void Mode1(Nombre a) {
		int count = 0;
		String result;
		String win = "====";
		do {
			result = "";
			System.out.println("Tapez un nombre a 4 chiffres.");
			Scanner sc = new Scanner(System.in);
			Nombre nbr = new Nombre(sc.next());
			result = numberCompare(a,nbr,result);
			System.out.println(result);
			System.out.println(result.length());
			count += 1;
		} while (count < 10 && result != win);
		if (count == 10) {
			System.out.println("Dommage vous avez perdu. Le nombre était : " + a.toString());
		} else {
			System.out.println("Bien joué vous avez gagné !");
		}
	}

	public ArrayList<Integer> getListChiffres() {
		return listChiffres;
	}

	public void setListChiffres(ArrayList<Integer> listChiffres) {
		this.listChiffres = listChiffres;
	}
	
	
	
}
