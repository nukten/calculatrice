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
			System.out.println("Choissisez l'opÃ©ration (+/-/*)"+"\n"+"p et votre signe opératoire pour utiliser le résultat précédent"+"\n"+"h pour l'historique"+"\n"+"q pour quitter");
			System.out.println("\nNous vous souhaitons un bon moment dans l'utilisation de notre MagiCalto");
			String operation = sc.nextLine();
			String operation2 = new String();
			if(!operation.isEmpty() & operation.contains("p") & operation.length() > 1) {
				operation2 = operation.split("p")[1].toString();
				operation = "p";
			}
			switch (operation) {
			case Constantes.QUIT_APPLI:
				System.out.println("ArrÃªt de la calculatrice");
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
					System.out.println("Le rÃ©sultat est : ");
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
					System.out.println("Le rÃ©sultat est : ");
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
					System.out.println("Le rÃ©sultat est : ");
					System.out.println(resultat);
				} else {
					System.out.println("erreur dans la saisie");
				}

				break;
			case Constantes.PREC:
				if(histoList.size() <= 0) {
					System.out.println("Aucun résultat précédent.");
					operation = null;
					premiereValeur = null;
					deuxiemeValeur = null;
					resultat = null;
					calcul = null;
				}else {
					String dernierResultat = histoList.get(histoList.size()-1).split("=")[1].toString();
					System.out.println("Valeur 1 : ");
					System.out.println(dernierResultat);
					premiereValeur = dernierResultat;
					System.out.println("Valeur 2: ");
					deuxiemeValeur = sc.nextLine();
					resultat = Constantes.EMPTY;
					if(operation2 != null) {
						if (!premiereValeur.isEmpty() & !deuxiemeValeur.isEmpty()) {
							switch(operation2) {
							case Constantes.ADD_KEY:
								resultat = vCalculator.addition(premiereValeur, deuxiemeValeur);
								break;
							case Constantes.MUL_KEY:
								resultat = vCalculator.multiplication(premiereValeur, deuxiemeValeur);
								break;
							case Constantes.SUB_KEY:
								resultat = vCalculator.soustraction(premiereValeur, deuxiemeValeur);
								break;
								default:
									System.out.println("Erreur d'opérateur lors de la récupération du résultat précédent");
									operation = null;
									premiereValeur = null;
									deuxiemeValeur = null;
									resultat = null;
									calcul = null;
								break;
							}
							System.out.println("Le rÃ©sultat est : ");
							System.out.println(resultat);
							operation = operation2;
						}else {
							System.out.println("Erreur dans la saisie");
							operation = null;
							premiereValeur = null;
							deuxiemeValeur = null;
							resultat = null;
							calcul = null;
						}
						
					}else {
						System.out.println("Impossible de réaliser l'opération demandée.");
					}
				}
				break;
			default:
				System.out.println("opération non disponible");
				break;

			}
			if(resultat != null) {
				if(premiereValeur != null & operation != null & deuxiemeValeur != null & resultat != null) {
					calcul = premiereValeur + " " + operation + " " + deuxiemeValeur + " = "+resultat;
				}
				if((calcul != null) & (operation != null & operation != Constantes.HISTO) & (premiereValeur != null) & (deuxiemeValeur != null) & (!resultat.contains(" "))) {
					histoList.add(calcul);
					fichier.ecritureApplication(histoList);
				}
			}
		} while (estCalculable);
	}
}