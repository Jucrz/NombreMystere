package jeu.mode;

import jeu.nombre.Nombre;

public abstract class Mode {
	protected static Nombre nbr;
	
	public Mode(Nombre Nbr) {
		Mode.nbr = Nbr;
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
}
