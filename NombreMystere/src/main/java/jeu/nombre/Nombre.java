package jeu.nombre;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Nombre {
	
	//eclaration de l'attribut listChiffres en priv� de notre objet.
	private ArrayList<Integer> listChiffres = new ArrayList<Integer>();

	//Constructeur de l'objet Nombre.
	public Nombre(String nbr) {
		for (int i = 0; i < 4; i++) {
			this.listChiffres.add(Character.getNumericValue(nbr.charAt(i)));
		}
	}
	
	//Get de l'attribut listChiffres pour pouvoir acceder a ses valeurs
	public ArrayList<Integer> getListChiffres() {
		return listChiffres;
	}
}
