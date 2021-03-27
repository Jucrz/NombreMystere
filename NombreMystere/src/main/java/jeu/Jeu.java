package jeu;

import java.util.Random;
import java.util.Scanner;

public class Jeu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0;
		System.out.println("Que voulez vous faire ?");
		System.out.println("1. Deviner le nombre myst�re.");
		System.out.println("2. Faire deviner le nombre myst�re.");
		System.out.println("3. Quitter l'application");
		
		do {
			if (choice == 1) {
				
			}
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				String nbMyst = String.valueOf((int)Math.floor(Math.random() * (9999 - 1000 + 1)) + 1000);
				Nombre numberMyst = new Nombre(nbMyst);
				numberMyst.Mode1(numberMyst);
				break;
			case 2:
				System.out.println("Tapez un nombre a 4 chiffres.");
				Nombre nbr2 = new Nombre(sc.next());
				System.out.println(nbr2.toString());
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
