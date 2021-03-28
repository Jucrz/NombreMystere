package jeu.mode;

import java.util.Scanner;
import jeu.nombre.Nombre;

public class Mode1 extends Mode {


	public Mode1(Nombre Nbr) {
		super(Nbr);
	}

	public int Play() {
		int count = 0;
		String result;
		int choice = 1;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Vous avez " + (10 - count) + " tentative(s).");
			result = "";
			System.out.println("Tapez un nombre a 4 chiffres.");
			Nombre nbrUser = new Nombre(sc.next());
			result = numberCompare(Mode1.nbr,nbrUser,result);
			System.out.println(result);
			count += 1;
		} while (count < 10 && result != "====");
		
		if (count == 10) {
			System.out.println("Dommage vous avez perdu. Le nombre était : " + Mode1.nbr.toString());
		} else {
			System.out.println("Bien joué vous avez gagnés !");
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
