package jeu;

import java.util.Scanner;

public class Jeu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0;
		boolean stockChoice = true;
		do {
			Scanner sc = new Scanner(System.in);
			if (stockChoice) {
				System.out.println("Que voulez vous faire ?");
				System.out.println("1. Deviner le nombre myst�re.");
				System.out.println("2. Faire deviner le nombre myst�re.");
				System.out.println("3. Quitter l'application");
				choice = sc.nextInt();
			}
			
			switch (choice) {
			case 1:
				String nbMyst = String.valueOf((int)Math.floor(Math.random() * (9999 - 1000 + 1)) + 1000);
				Nombre numberMyst = new Nombre(nbMyst);
				choice = numberMyst.Mode1(numberMyst);
				if (choice == 1) {
					stockChoice = false;
				} else {
					stockChoice = true;
				}
				break;
			case 2:
				System.out.println("Veuillez saisir un nombre � 4 chiffres.");
				Nombre numberMyst2 = new Nombre(sc.next());
				numberMyst2.Mode2(numberMyst2);
				break;
			case 3:
				break;
			default :
				System.out.println("Merci de saisir une valeur entre 1 et 3.");
				break;
			}
			
		} while(choice != 3);
		
		System.out.println("Fermeture de l'application.");
	}

}
