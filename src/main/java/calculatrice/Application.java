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
			
			System.out.println("L'op�ration (addition) ? ");
			String operation = sc.nextLine();
			
			String resultat = Constantes.EMPTY;
			
			
			
					switch (operation) {
					case Constantes.ADD_KEY:
						resultat = vCalculator.addition(premiereValeur, deuxiemeValeur);
						break;
					default:
						resultat = "Operation non trouv�";
						break;
					}
			
			
			System.out.println("Le r�sultat est : ");
			System.out.println(resultat);
			
			sc.nextLine();
			
			System.out.println("----------------------------------------------------------------");

	
	}
	
	
}
