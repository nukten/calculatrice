package calculatrice;

public class Calculatrice implements ICalculatrice {
    /**
     * Méthode qui permet l'addition de deux nombres
     * @param aPremiereValeur La première valeur
     * @param aDeuxiemeValeur La deuxième valeur
     * @return l'addition entre les deux paramétres
     */
    @Override
    public String addition(String aPremiereValeur, String aDeuxiemeValeur) {
        try {
            float lPremiereValeur = Float.parseFloat(aPremiereValeur);
            float lDeuxiemeValeur = Float.parseFloat(aDeuxiemeValeur);
            if (lPremiereValeur >= 0 & lDeuxiemeValeur >= 0) {
                return String.valueOf(lPremiereValeur + lDeuxiemeValeur);
            } else {
                return "Erreur : Un nombre est inférieur à 0.";
            }
        } catch (NumberFormatException exp) {
            return "Erreur : Une des saisies n'a pas le type attendu.";
        }
    }

    /**
     * Méthode qui permet la soustraction de deux nombres
     * @param aPremiereValeur La première valeur
     * @param aDeuxiemeValeur La deuxième valeur
     * @return la soustraction entre les deux paramétres
     */
    @Override
    public String soustraction(String aPremiereValeur, String aDeuxiemeValeur) {
        try {
            float lPremiereValeur = Float.valueOf(aPremiereValeur);
            float lDeuxiemeValeur = Float.valueOf(aDeuxiemeValeur);
            if (lPremiereValeur >= 0 & lDeuxiemeValeur >= 0) {
                return String.valueOf(lPremiereValeur - lDeuxiemeValeur);
            } else {
                return "Erreur : Un nombre est inférieur à 0.";
            }
        } catch (NumberFormatException exp) {
            return "Erreur : Une des saisies n'a pas le type attendu.";
        }
    }


    /**
     * Méthode qui permet la multiplication de deux nombres
     * @param aPremiereValeur La première valeur
     * @param aDeuxiemeValeur La deuxième valeur
     * @return la multiplication entre les deux paramétres
     */
    @Override
    public String multiplication(String aPremiereValeur, String aDeuxiemeValeur) {
        try {
            float lPremiereValeur = Float.valueOf(aPremiereValeur);
            float lDeuxiemeValeur = Float.valueOf(aDeuxiemeValeur);
            if (lPremiereValeur >= 0 & lDeuxiemeValeur >= 0) {
                return String.valueOf(lPremiereValeur * lDeuxiemeValeur);
            } else {
                return "Erreur : Un nombre est inférieur à 0.";
            }
        } catch (NumberFormatException exp) {
            return "Erreur : Une des saisies n'a pas le type attendu.";
        }
    }

    /**
     * Méthode qui permet la realisation du calcul
     * @param aPremiereValeur La première valeur
     * @param aDeuxiemeValeur La deuxième valeur
     * @param aoperateur operateur
     * @return le resultat
     */
    @Override
    public String calcul(String apremierevaleur, String adeuxiemeValeur, String aoperateur) {
        String result = "Erreur sur l'operation";
        try {
            switch (aoperateur) {
                case Constantes.ADD_KEY:
                    result = this.addition(apremierevaleur, adeuxiemeValeur);
                    break;
                case Constantes.SUB_KEY:
                    result = this.soustraction(apremierevaleur, adeuxiemeValeur);
                    break;
                case Constantes.MUL_KEY:
                    result = this.multiplication(apremierevaleur, adeuxiemeValeur);
                    break;
                default:
                    result = "Erreur sur l'operation";
                    break;
            }
        } catch (NumberFormatException exp) {
            result = "Erreur : Une des saisies n'a pas le type attendu.";
        }
        return result;
    }


}
