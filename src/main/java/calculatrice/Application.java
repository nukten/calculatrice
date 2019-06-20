package calculatrice;

import java.util.Scanner;

public class Application {
	/*
	 * 
	 */
    public static void main(String[] args) {

		ICalculatrice vCalculator = new Calculatrice();
		Scanner sc = new Scanner(System.in);
		boolean estCalculable = true;
		String premiereValeur = null;
		String deuxiemeValeur = null;
		String resultat = null;

		do { 
			System.out.println("Choissisez l'opération (+/-/*) ou q pour quitter ! ");
			String operation = sc.nextLine();

			switch (operation) {
			case Constantes.QUIT_APPLI:
				System.out.println("Arrêt de la calculatrice");
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

		} while (estCalculable);

	}
}
