package calculatrice;

public class Calculatrice implements ICalculatrice {
	/**
	 * {@inheritDoc}
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
	}
	

	@Override
	public String soustraction(String a_premiereValeur, String a_deuxiemeValeur) {
		float l_premiereValeur = Float.valueOf(a_premiereValeur);
		float l_deuxiemeValeur = Float.valueOf(a_deuxiemeValeur);
		return String.valueOf(l_premiereValeur - l_deuxiemeValeur);
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

	/**
	 * {@inheritDoc}
	 */
	/*
	 * @Override public String multiplication(String a_premiereValeur, String
	 * a_deuxiemeValeur) { float l_premiereValeur = Float.valueOf(a_premiereValeur);
	 * float l_deuxiemeValeur = Float.valueOf(a_deuxiemeValeur); return
	 * String.valueOf(l_premiereValeur*l_deuxiemeValeur); }
	 */

	/**
	 * {@inheritDoc}
	 */


}
