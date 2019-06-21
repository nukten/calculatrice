package calculatrice;

public interface ICalculatrice {

    /**
     * Fait l'addition.
     *
     * @param premiereValeur La première valeur
     * @param deuxiemeValeur La deuxième valeur
     * @return la somme entre les deux valeurs
     */
    public String addition(String premiereValeur, String deuxiemeValeur);

    /**
     * Fait la soustraction.
     *
     * @param premiereValeur La première valeur
     * @param deuxiemeValeur La deuxième valeur
     * @return la soustraction entre les deux valeurs
     */
    public String soustraction(String premiereValeur, String deuxiemeValeur);

    /**
     * Fait la multiplication.
     * @param premiereValeur La première valeur
     * @param deuxiemeValeur La deuxième valeur
     * @return la multiplication entre les deux valeurs
     */
    public String multiplication(String premiereValeur, String deuxiemeValeur);

    /**
     * Realise les calculs.
     * @param premiereValeur La première valeur
     * @param deuxiemeValeur La deuxième valeur
     * @param operateur l operateur de l operation
     * @return Le resultat
     */
    public String calcul(String premiereValeur, String deuxiemeValeur, String operateur);

}
