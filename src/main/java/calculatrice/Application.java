package calculatrice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    /**
     * Fonction de démarrage du programme
     */
    public static void main(String[] args) {

        ICalculatrice vCalculator = new Calculatrice();
        ArrayList<String> histoList = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        boolean estCalculable = true;
        String premiereValeur = null;
        String deuxiemeValeur = null;
        String resultat = null;
        String calcul = null;
        Fichier fichier = new Fichier();

        do {
            calcul = null;
            premiereValeur = null;
            deuxiemeValeur = null;
            resultat = null;
            System.out.println("Choissisez l'opération (+/-/*), h pour l'historique ou q pour quitter ! ");
            String operation = sc.nextLine();

            switch (operation) {
            case Constantes.QUIT_APPLI:
                System.out.println("Arret de la calculatrice");
                System.exit(0);
                break;

            case Constantes.ADD_KEY:
                System.out.println("Valeur 1 : ");
                premiereValeur = sc.nextLine();
                System.out.println("Valeur 2: ");
                deuxiemeValeur = sc.nextLine();

                resultat = Constantes.EMPTY;

                if (!premiereValeur.isEmpty() & !deuxiemeValeur.isEmpty()) {
                    resultat = vCalculator.addition(premiereValeur, deuxiemeValeur);
                    System.out.println("Le résultat est : ");
                    System.out.println(resultat);
                } else {
                    System.out.println("erreur dans la saisie");
                }
                break;

            case Constantes.SUB_KEY:
                System.out.println("Valeur 1 : ");
                premiereValeur = sc.nextLine();
                System.out.println("Valeur 2: ");
                deuxiemeValeur = sc.nextLine();
                resultat = Constantes.EMPTY;

                if (!premiereValeur.isEmpty() & !deuxiemeValeur.isEmpty()) {
                    resultat = vCalculator.soustraction(premiereValeur, deuxiemeValeur);
                    System.out.println("Le résultat est : ");
                    System.out.println(resultat);
                } else {
                    System.out.println("erreur dans la saisie");
                }
                break;

            case Constantes.HISTO:
                resultat = Constantes.EMPTY;
                fichier.lecture();
                break;
            case Constantes.MUL_KEY:
                System.out.println("Valeur 1 : ");
                premiereValeur = sc.nextLine();
                System.out.println("Valeur 2: ");
                deuxiemeValeur = sc.nextLine();
                resultat = Constantes.EMPTY;

                if (!premiereValeur.isEmpty() & !deuxiemeValeur.isEmpty()) {
                    resultat = vCalculator.multiplication(premiereValeur, deuxiemeValeur);
                    System.out.println("Le résultat est : ");
                    System.out.println(resultat);
                } else {
                    System.out.println("erreur dans la saisie");
                }

                break;

            default:
                System.out.println("opération non disponible");
                break;

            }
            calcul = premiereValeur + " " + operation + " " + deuxiemeValeur + " = "+resultat;
            if((calcul != null) & (operation != null & operation != Constantes.HISTO) & (premiereValeur != null) & (deuxiemeValeur != null) & (!resultat.contains(" "))) {
                histoList.add(calcul);
                fichier.ecritureApplication(histoList);
            }
        } while (estCalculable);
    }
}