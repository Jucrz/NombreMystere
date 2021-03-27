package jeu;

import java.util.Random;
import java.util.Scanner;

public class Jeu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0;
		
		do {			
			System.out.println("1. Deviner le nombre mystère.");
			System.out.println("2. Faire deviner le nombre mystère.");
			System.out.println("3. Quitter l'application");
			
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				String nbMyst = String.valueOf((int)Math.floor(Math.random() * (9999 - 1000 + 1)) + 1000);
				Nombre numberMyst = new Nombre(nbMyst);
				System.out.println(nbMyst);
				System.out.println("Tapez un nombre a 4 chiffres.");
				Nombre nbr = new Nombre(sc.next());
				break;
				
			case 2:
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
