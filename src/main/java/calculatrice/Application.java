package calculatrice;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		ICalculatrice vCalculator = new Calculatrice();

		Scanner sc = new Scanner(System.in);

		boolean estCalculable = true;

		do {
			System.out.println("L'op�ration + ? ou q pour quitter ! ");
			String operation = sc.nextLine();
			
			switch(operation) {
			case Constantes.QUIT_APPLI:
				System.out.println("Arr�t de la calculatrice");
				System.exit(0);
				break;
			
			case "+":
				System.out.println("Valeur 1 : ");
				String premiereValeur = sc.nextLine(); 
				System.out.println("Valeur 2: ");
				String deuxiemeValeur = sc.nextLine();
				
				
				String resultat = Constantes.EMPTY;

				if (!premiereValeur.isEmpty() & !deuxiemeValeur.isEmpty()) {
					switch (operation) {
					case Constantes.ADD_KEY:
						resultat = vCalculator.addition(premiereValeur, deuxiemeValeur);
						break;
					default:
						resultat = "Operation non trouv�e";
						break;
					}
					System.out.println("Le r�sultat est : ");
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
