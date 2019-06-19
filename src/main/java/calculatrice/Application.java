package calculatrice;

import java.util.Scanner;


public class Application {

	public static void main(String[] args) {
		
		
		ICalculatrice vCalculator =  new Calculatrice();
		
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Valeur 1 : ");
			String premiereValeur = sc.nextLine();
			
			System.out.println("Valeur 2: ");
			String deuxiemeValeur = sc.nextLine();
			
			System.out.println("L'opération (addition) ? ");
			String operation = sc.nextLine();
			
			String resultat = Constantes.EMPTY;
			
			if (!premiereValeur.isEmpty() & !deuxiemeValeur.isEmpty())
			{
					switch (operation) {
					case Constantes.ADD_KEY:
						resultat = vCalculator.addition(premiereValeur, deuxiemeValeur);
						break;
					default:
						resultat = "Operation non trouvé";
						break;
			}
			
			
			System.out.println("Le résultat est : ");
			System.out.println(resultat);

			}
			else System.out.println("erreur dans la saisie");
			System.out.println("----------------------------------------------------------------");

	
	}
	
	
}
