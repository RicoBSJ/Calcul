package com.calcul.beans;

public class Operation {
	private Double resultat, nbr1, nbr2;
	private String operateur;

	public Operation(Double nbr1, String operateur, Double nbr2) {
		// Mis à jour des Atributs
		this.nbr1 = nbr1;
		this.operateur = operateur;
		this.nbr2 = nbr2;

		// Calculs
		if (operateur.equals("+")) // cas de l'addition
			this.resultat = nbr1 + nbr2;

		else if (operateur.equals("-")) // cas de la soustraction
			this.resultat = nbr1 - nbr2;

		else if (operateur.equals("×")) // cas de la multiplication
			this.resultat = nbr1 * nbr2;

		else // cas de la division
		{
			if (nbr2 == 0) // traitement de la division par 0
			{
				System.out.println("Math Erreur : Tentative de diviser par 0");
			} else
				this.resultat = nbr1 / nbr2;
		}

	}

	public String toString() {
		String str = new String();
		switch (this.operateur) {
		case "+": {
			str = "La somme de " + this.nbr1 + " et de " + this.nbr2 + " donne " + this.resultat;
			return str;
		}
		case "-": {
			str = "La différence de " + this.nbr1 + " et de " + this.nbr2 + " donne " + this.resultat;
			return str;
		}
		case "×": {
			str = "Le produit de " + this.nbr1 + " par " + this.nbr2 + " donne " + this.resultat;
			return str;
		}
		case "÷": {
			str = "Le quotien de " + this.nbr1 + " par " + this.nbr2 + " donne " + this.resultat;
			return str;
		}
		default:
			return null;

		}
	}

}