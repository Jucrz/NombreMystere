package jeu;

import java.util.Scanner;
import java.util.ArrayList;

public class Nombre {
	
	//Déclaration de l'attribut listChiffres en privé de notre objet.
	private ArrayList<Integer> listChiffres = new ArrayList<Integer>();

	//Constructeur de l'objet Nombre.
	public Nombre(String nbr) {
		for (int i = 0; i < 4; i++) {
			this.listChiffres.add(Character.getNumericValue(nbr.charAt(i)));
		}
	}
	
	//Get de l'attribut listChiffres pour pouvoir accéder a ses valeurs
	public ArrayList<Integer> getListChiffres() {
		return listChiffres;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 4; i++) {
			sb.append(listChiffres.get(i));
		}

		return sb.toString();
	}
	
	public String numberCompare(Nombre a, Nombre b, String resultat) {
		int count = 0;
		for (int i=0; i<4; i++) {
			if (a.getListChiffres().get(i) < b.getListChiffres().get(i)) {
				resultat += "-";
			} else if (a.getListChiffres().get(i) > b.getListChiffres().get(i)) {
				resultat += "+";
			} else {
				count += 1;
				resultat += "=";
				if (count == 4) {
					resultat = "====";
				}
			}
		}
		return resultat;
	}
	
	public void Mode1(Nombre a) {
		int count = 0;
		String result;
		do {
			result = "";
			System.out.println("Tapez un nombre a 4 chiffres.");
			Scanner sc = new Scanner(System.in);
			Nombre nbrUser = new Nombre(sc.next());
			result = numberCompare(a,nbrUser,result);
			System.out.println(result);
			count += 1;
		} while (count < 10 && result != "====");
		if (count == 10) {
			System.out.println("Dommage vous avez perdu. Le nombre était : " + a.toString());
		} else {
			System.out.println("Bien joué vous avez gagné !");
		}
	}	
}
