package calculatrice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    public static String premiereValeur = null;
    public static String deuxiemeValeur = null;
    public static String resultat = null;
    public static String calcul = null;
    public static String operation = null;
    public static String operation2 = null;
    public static Scanner sc = null;
    
    
    /**
     * Fonction de démarrage du programme
     */
    public static void main(String[] args) {

        ICalculatrice vcalculator = new Calculatrice();
        ArrayList<String> histoList = new ArrayList<String>();
        boolean estCalculable = true;
        Fichier fichier = new Fichier();
        sc = new Scanner(System.in);
        do {
        	initVariables ();
            System.out.println("Choissisez l'opération (+/-/*)" + "\n" + "p et votre signe opératoire pour utiliser le résultat précédent" + "\n" + "h pour l'historique" + "\n" + "q pour quitter");
            System.out.println("\nNous vous souhaitons un bon moment dans l'utilisation de notre MagiCalto");
            String operation = inputChecker();
            String operation2 = new String();
            if (!operation.isEmpty() & operation.contains("p") & operation.length() > 1) {
                operation2 = operation.split("p")[1].toString();
                operation = "p";
            }
            switch (operation) {
                case Constantes.QUIT_APPLI:
                    System.out.println("Arret de la calculatrice");
                    System.exit(0);
                    break;
                case Constantes.ADD_KEY:
                case Constantes.SUB_KEY:
                case Constantes.MUL_KEY:
                    System.out.println("Valeur 1 : ");
                    premiereValeur = inputChecker();
                    System.out.println("Valeur 2: ");
                    deuxiemeValeur = inputChecker();
                    resultat = Constantes.EMPTY;
                    if (!premiereValeur.isEmpty() & !deuxiemeValeur.isEmpty()) {
                        resultat = vcalculator.calcul(premiereValeur, deuxiemeValeur, operation);
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
                case Constantes.PREC:
                    if (histoList.size() <= 0) {
                        System.out.println("Aucun résultat précédent.");
                        initVariables ();
                    } else {
                        String dernierResultat = histoList.get(histoList.size() - 1).split("=")[1].toString();
                        System.out.println("Valeur 1 : ");
                        System.out.println(dernierResultat);
                        premiereValeur = dernierResultat;
                        System.out.println("Valeur 2: ");
                        deuxiemeValeur = inputChecker();
                        resultat = Constantes.EMPTY;
                        if (operation2 != null) {
                            if (!premiereValeur.isEmpty() & !deuxiemeValeur.isEmpty()) {
                                switch (operation2) {
                                    case Constantes.ADD_KEY:
                                    case Constantes.MUL_KEY:
                                    case Constantes.SUB_KEY:
                                    	resultat = vcalculator.calcul(premiereValeur, deuxiemeValeur, operation2);
                                        System.out.println("Le résultat est : ");
                                        System.out.println(resultat);
                                        operation = operation2;
                                    	break;
                                    default:
                                        System.out.println("Erreur d'opérateur lors de la récupération du résultat précédent");
                                        initVariables ();
                                        break;
                                }
                            } else {
                                System.out.println("Erreur dans la saisie");
                                initVariables ();
                            }
                        } else {
                            System.out.println("Impossible de réaliser l'opération demandée.");
                        }
                    }
                    break;
                default:
                    System.out.println("opération non disponible");
                    break;
            }
            if (resultat != null) {
                if (premiereValeur != null & operation != null & deuxiemeValeur != null & resultat != null) {
                    calcul = premiereValeur + " " + operation + " " + deuxiemeValeur + " = " + resultat;
                }
                if ((calcul != null) & (operation != null & operation != Constantes.HISTO) & (premiereValeur != null) & (deuxiemeValeur != null) & (!resultat.contains(" "))) {
                    histoList.add(calcul);
                    fichier.ecritureApplication(histoList);
                }
            }
        } while (estCalculable);
    }
    
    /**
     * Fonction de controle de saisie
     */
    public static String inputChecker() {
    	return sc.nextLine();
    }
    
    /**
     * Fonction d'initialisation de variables
     */
    public static void initVariables () {
        premiereValeur = null;
        deuxiemeValeur = null;
        resultat = null;
        calcul = null;
        operation = null;
        operation2 = null;
    }
}