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
	
	
	
	public int Mode1(Nombre a) {	
		
		int choice = 1;
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String result;
		
		do {
			System.out.println("Vous avez " + (10 - count) + " tentative(s).");
			result = "";
			System.out.println("Tapez un nombre a 4 chiffres.");
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

		do {
			System.out.println("Que voulez vous faire ?");
			System.out.println("1. Rejouer.");
			System.out.println("2. Changer de mode de jeu.");
			System.out.println("3. Quitter l'application.");
			choice = sc.nextInt();
			
			if (choice != 1 && choice != 2 && choice != 3 ) {
				System.out.println("Merci de saisir une valeur entre 1 et 3.");
			}
		} while (choice != 3 && choice != 2 && choice != 1); 
		return choice;
	}	
}
