package jeu;

import java.util.Scanner;

import jeu.mode.Mode1;
import jeu.mode.Mode2;
import jeu.nombre.Nombre;

public class Jeu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0;
		boolean stockChoice = true;
		do {
			Scanner sc = new Scanner(System.in);
			if (stockChoice) {
				System.out.println("Que voulez vous faire ?");
				System.out.println("1. Deviner le nombre mystère.");
				System.out.println("2. Faire deviner le nombre mystère.");
				System.out.println("3. Quitter l'application");
				choice = sc.nextInt();
			}
			
			switch (choice) {
			case 1:
				String nbMyst = String.valueOf((int)Math.floor(Math.random() * (9999 - 1000 + 1)) + 1000);
				Mode1 m = new Mode1(new Nombre(nbMyst));
				choice = m.Play();
				if (choice == 1) {
					stockChoice = false;
				} else {
					stockChoice = true;
				}
				break;
			case 2:
				System.out.println("Veuillez saisir un nombre à 4 chiffres.");
				Mode2 m2 = new Mode2(new Nombre(sc.next()));
				choice = m2.Play();
				if (choice == 1) {
					stockChoice = false;
					choice = 2;
				} else {
					stockChoice = true;
				}
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
