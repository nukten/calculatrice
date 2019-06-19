package calculatrice;

import java.util.Scanner;


public class Application {

	public static void main(String[] args) {
		
		ICalculatrice vCalculator =  new Calculatrice();
		
		// Now interact with user!
		Scanner sc = new Scanner(System.in);
		//while(true) {
			System.out.println("Valeur 1 : ");
			String premiereValeur = sc.nextLine();
			
			System.out.println("Valeur 2: ");
			String deuxiemeValeur = sc.nextLine();
			
			System.out.println("L'opération (addition ) ? ");
			String vOperationKey = sc.nextLine();
			
			String resultat = Constantes.EMPTY;
			
			switch (vOperationKey) {
			case Constantes.ADD_KEY:
				resultat = vCalculator.addition(premiereValeur, deuxiemeValeur);
				break;
			default:
				resultat = "Operation not found";
				break;
		}
			
			// Do the operation and show results
			System.out.println("Le résultat est : ");
			System.out.println(resultat);
			
			sc.nextLine();
			
			System.out.println("----------------------------------------------------------------");

		//}
	}
	
	
}
