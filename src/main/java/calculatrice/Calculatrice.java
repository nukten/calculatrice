package calculatrice;

public class Calculatrice implements ICalculatrice {
	/**
	 * Méthode qui permet l'addition de deux nombres
	 * @param a_premiereValeur La première valeur
	 * @param a_deuxiemeValeur La deuxième valeur
	 * @return l'addition entre les deux paramétres
	 */
	@Override
	public String addition(String a_premiereValeur, String a_deuxiemeValeur) {
		try {
			float l_premiereValeur = Float.parseFloat(a_premiereValeur);
			float l_deuxiemeValeur = Float.parseFloat(a_deuxiemeValeur);
			if (l_premiereValeur >= 0 & l_deuxiemeValeur >= 0) {
				return String.valueOf(l_premiereValeur + l_deuxiemeValeur);
			} else {
				return "Erreur : Un nombre est inférieur à 0.";
			}
		} catch (NumberFormatException e) {
			return "Erreur : Une des saisies n'a pas le type attendu.";
		}
	}//

	/**
	 * Méthode qui permet la soustraction de deux nombres
	 * @param a_premiereValeur La première valeur
	 * @param a_deuxiemeValeur La deuxième valeur
	 * @return la soustraction entre les deux paramétres
	 */
	@Override
	public String soustraction(String a_premiereValeur, String a_deuxiemeValeur) {
		try {
			float l_premiereValeur = Float.valueOf(a_premiereValeur);
			float l_deuxiemeValeur = Float.valueOf(a_deuxiemeValeur);
			if (l_premiereValeur >= 0 & l_deuxiemeValeur >= 0) {
				return String.valueOf(l_premiereValeur - l_deuxiemeValeur);
			} else {
				return "Erreur : Un nombre est inférieur à 0.";
			}
		} catch (NumberFormatException e) {
			return "Erreur : Une des saisies n'a pas le type attendu.";
		}
	}


	/**
	 * Méthode qui permet la multiplication de deux nombres
	 * @param a_premiereValeur La première valeur
	 * @param a_deuxiemeValeur La deuxième valeur
	 * @return la multiplication entre les deux paramétres
	 */
	@Override
	public String multiplication(String a_premiereValeur, String a_deuxiemeValeur) {
		try {
			float l_premiereValeur = Float.valueOf(a_premiereValeur);
			float l_deuxiemeValeur = Float.valueOf(a_deuxiemeValeur);
			if (l_premiereValeur >= 0 & l_deuxiemeValeur >= 0) {
				return String.valueOf(l_premiereValeur * l_deuxiemeValeur);
			} else {
				return "Erreur : Un nombre est inférieur à 0.";
			}
		} catch (NumberFormatException e) {
			return "Erreur : Une des saisies n'a pas le type attendu.";
		}
	}
	
	
	/**
	 * {@inheritDoc}
	 */
	/*
	 * @Override public String division(String a_premiereValeur, String
	 * a_deuxiemeValeur) { float l_premiereValeur = Float.valueOf(a_premiereValeur);
	 * float l_deuxiemeValeur = Float.valueOf(a_deuxiemeValeur); return
	 * String.valueOf(l_premiereValeur / l_deuxiemeValeur); }
	 */

}
