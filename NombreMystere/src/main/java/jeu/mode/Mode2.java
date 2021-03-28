package jeu.mode;

import java.util.Scanner;
import jeu.nombre.Nombre;

public class Mode2 extends Mode {

	public Mode2(Nombre Nbr) {
		super(Nbr);
	}
	
	//Fonction permettant a l'ordinateur de choisir un nombre par rapport au resultat
	public void chooseNumber(Nombre nbrComputer, String resultat){
		String str[] = resultat.split("");
		for (int i = 0; i < 4; i++) {
			switch (str[i]) {
			case "-":
				nbrComputer.getListChiffres().set(i, nbrComputer.getListChiffres().get(i)-1);
				break;
			case "+":
				nbrComputer.getListChiffres().set(i, nbrComputer.getListChiffres().get(i)+1);
				break;
			case "=":
				break;
			}
		}
	}
	
	//Fonction Play mode du deuxième mode jeu
	public int Play() {
		int choice = 1;
		int count = 0;
		String result;
		Scanner sc = new Scanner(System.in);
		Nombre nbrComputer = new Nombre(String.valueOf((int)Math.floor(Math.random() * (9999 - 1000 + 1)) + 1000));
		do {
			System.out.println("Nombre ordinateur : " + nbrComputer.getListChiffres());
			count += 1;
			result = "";
			result = numberCompare(Mode2.nbr, nbrComputer, result);
			System.out.println(result);
			chooseNumber(nbrComputer, result);
		} while (count < 10 && result != "====");
		if (count == 10) {
			System.out.println("L'ordinateur a perdu.");
		} else {
			System.out.println("L'ordinateur a gagné en " + count + " essais !");
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
