package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import calculatrice.Calculatrice;
import calculatrice.Constantes;
import calculatrice.ICalculatrice;

public class TestCalculatrice {

    public static ICalculatrice montest;
    public static String result;

    @Before
    /**
     * Initialisation
     */
    public void initialisation() {
        montest =  new Calculatrice();
        result = null;
        //test
    }
    /**
     * Méthode qui permet de tester l'addition de deux nombres
     * test valeurs normales
     */
    @Test
    public void testAddition() {
        result = montest.addition("5", "2");
        Assert.assertEquals("7.0", result);

    }
    /**
     * Méthode qui permet de tester l'addition de deux nombres
     * test valeurs a zero
     */
    @Test
    public void testAddition1() {
        result = montest.addition("0", "0");
        Assert.assertEquals("0.0", result);
    }
    /**
     * Méthode qui permet de tester l'addition de deux nombres
     * test valeurs negative et positive
     */
    @Test
    public void testAddition2() {
        result = montest.addition("-3", "4");
        Assert.assertEquals(result, "Erreur : Un nombre est inférieur à 0.");

    }
    /**
     * Méthode qui permet de tester l'addition de deux nombres
     * test valeurs null et negative
     */
    @Test
    public void testAddition3() {
        result = montest.addition("", "-2");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");

    }
    /**
     * Méthode qui permet de tester l'addition de deux nombres
     * test valeurs negative et null
     */
    @Test
    public void testAddition4() {
        result = montest.addition("-2", "");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");

    }
    /**
     * Méthode qui permet de tester l'addition de deux nombres
     * test valeurs positive et null
     */
    @Test
    public void testAddition5() {
        result = montest.addition("3", "");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");

    }
    /**
     * Méthode qui permet de tester l'addition de deux nombres
     * test valeurs null et positive
     */
    @Test
    public void testAddition6() {
        result = montest.addition("", "3");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");

    }
    /**
     * Méthode qui permet de tester l'addition de deux nombres
     * test de tres grande valeurs positive (avec E)
     */
    @Test
    public void testAddition7() {
        result = montest.addition("1.0E27", "1.0E27");
        Assert.assertEquals(result, "2.0E27");

    }
    /**
     * Méthode qui permet de tester l'addition de deux nombres
     * test de valeur avec operateur +
     */
    @Test
    public void testAddition8() {
        result = montest.addition("+3", "+2");
        System.out.println(result);
        Assert.assertEquals(result, "5.0");

    }
    /**
     * Méthode qui permet de tester l'addition de deux nombres
     * test de valeur avec multiplication à l'interieur
     */
    @Test
    public void testAddition9() {
        result = montest.addition("3*3", "2");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");

    }
    /**
     * Méthode qui permet de tester l'addition de deux nombres
     * test de valeur avec division à l'interieur
     */
    @Test
    public void testAddition10() {
        result = montest.addition("3/2", "1");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");

    }

    //--------------------------------------------//

    /**
     * Méthode qui permet de tester la soustraction de deux nombres
     * test de valeurs normales
     */
    @Test
    public void testSoustraction() {
        result = montest.soustraction("5", "2");
        Assert.assertEquals("3.0", result);

    }
    /**
     * Méthode qui permet de tester la soustraction de deux nombres
     * test de valeurs à zero
     */
    @Test
    public void testSoustraction1() {
         result = montest.soustraction("0", "0");
         Assert.assertEquals("0.0", result);
    }
    /**
     * Méthode qui permet de tester la soustraction de deux nombres
     * test de valeur negative et une valeur positive
     */
    @Test
    public void testSoustraction2() {
        result = montest.soustraction("-3", "4");
        Assert.assertEquals(result, "Erreur : Un nombre est inférieur à 0.");
    }
    /**
     * Méthode qui permet de tester la soustraction de deux nombres
     * test de valeur negative et une valeur null
     */
    @Test
    public void testSoustraction3() {
        result = montest.soustraction("-3", "");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    /**
     * Méthode qui permet de tester la soustraction de deux nombres
     * test de valeur negative et une valeur positive
     */
    @Test
    public void testSoustraction4() {
        result = montest.soustraction("", "4");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    /**
     * Méthode qui permet de tester la soustraction de deux nombres
     * test de valeur negative et une valeur positive
     */
    @Test
    public void testSoustraction5() {
        result = montest.soustraction("4", "");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    /**
     * Méthode qui permet de tester la soustraction de deux nombres
     * test des valeurs null
     */
    @Test
    public void testSoustraction6() {
        result = montest.soustraction("", "");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    /**
     * Méthode qui permet de tester la soustraction de deux nombres
     * test des valeurs avec des operateurs seul
     */
    @Test
    public void testSoustraction7() {
        result = montest.soustraction("+", "+");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    /**
     * Méthode qui permet de tester la soustraction de deux nombres
     * test une valeur null et une valeur negative
     */
    @Test
    public void testSoustraction8() {
        result = montest.soustraction("", "-2");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }

    /**
     * Méthode qui permet de tester la soustraction de deux nombres
     * test une valeur normale et une valeur avec opérateur positif
     */
    @Test
    public void testSoustraction9() {
        result = montest.soustraction("82", "+2");
        Assert.assertEquals(result, "80.0");
    }
    /**
     * Méthode qui permet de tester la soustraction de deux nombres
     * test deux valeurs tres grandes
     */
    @Test
    public void testSoustraction10() {
        result = montest.soustraction("1.0E29", "1.0E28");
        Assert.assertEquals(result, "9.0E28");
    }
    /**
     * Méthode qui permet de tester la soustraction de deux nombres
     * test une valeur tres grande et caracteres
     */
    @Test
    public void testSoustraction11() {
        result = montest.soustraction("Azerttye", "1.0E28");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    /**
     * Méthode qui permet de tester la soustraction de deux nombres
     * test une valeur tres grande et caracteres
     */
    @Test
    public void testSoustraction12() {
        result = montest.soustraction("1.0E29", "Azerttye");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    /**
     * Méthode qui permet de tester la soustraction de deux nombres
     * test avec que des caracteres
     */
    @Test
    public void testSoustraction13() {
        result = montest.soustraction("Azerttye", "Azerttye");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    /**
     * Méthode qui permet de tester la soustraction de deux nombres
     * test avec des caracteres et une valeur null
     */
    @Test
    public void testSoustraction14() {
        result = montest.soustraction("Azerttye", "");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    /**
     * Méthode qui permet de tester la soustraction de deux nombres
     * test avec des caracteres et une valeur null
     */
    @Test
    public void testSoustraction15() {
        result = montest.soustraction("", "Azerttye");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    /**
     * Méthode qui permet de tester la soustraction de deux nombres
     * test avec des caracteres et une valeur negative
     */
    @Test
    public void testSoustraction16() {
        result = montest.soustraction("Azerttye", "-2");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    /**
     * Méthode qui permet de tester la soustraction de deux nombres
     * test avec des caracteres et une valeur negative
     */
    @Test
    public void testSoustraction17() {
        result = montest.soustraction("-2", "Azerttye");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    /**
     * Méthode qui permet de tester la soustraction de deux nombres
     * test avec des caracteres et une valeur tres grande
     */
    @Test
    public void testSoustraction18() {
        result = montest.soustraction("Azerttye", "1.0E28");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    /**
     * Méthode qui permet de tester la soustraction de deux nombres
     * test avec des caracteres et une valeur tres grande
     */
    @Test
    public void testSoustraction19() {
        result = montest.soustraction("1.0E28", "Azerttye");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }


    //--------------------------------------------//
    /**
     * Méthode qui permet de tester la multiplication de deux nombres
     * test avec des valeurs normales
     */
    @Test
    public void testMultiplication1() {
        result = montest.multiplication("2", "8");
        Assert.assertEquals(result, "16.0");
    }
    /**
     * Méthode qui permet de tester la multiplication de deux nombres
     * test avec une valeur a zero et une autre normale
     */
    @Test
    public void testMultiplication2() {
        result = montest.multiplication("0", "8");
        Assert.assertEquals(result, "0.0");
    }
    /**
     * Méthode qui permet de tester la multiplication de deux nombres
     * test avec une valeur a zero et une autre normale
     */
    @Test
    public void testMultiplication3() {
        result = montest.multiplication("8", "0");
        Assert.assertEquals(result, "0.0");
    }
    /**
     * Méthode qui permet de tester la multiplication de deux nombres
     * test avec une valeur a zero et une à null
     */
    @Test
    public void testMultiplication4() {
        result = montest.multiplication("", "0");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    /**
     * Méthode qui permet de tester la multiplication de deux nombres
     * test avec une valeur a zero et une à null
     */
    @Test
    public void testMultiplication5() {
        result = montest.multiplication("0", "");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    /**
     * Méthode qui permet de tester la multiplication de deux nombres
     * test avec les valeurs à null
     */
    @Test
    public void testMultiplication6() {
        result = montest.multiplication("", "");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    /**
     * Méthode qui permet de tester la multiplication de deux nombres
     * test avec une valeur à null et une normale
     */
    @Test
    public void testMultiplication7() {
        result = montest.multiplication("3", "");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    /**
     * Méthode qui permet de tester la multiplication de deux nombres
     * test avec une valeur à null et une normale
     */
    @Test
    public void testMultiplication8() {
        result = montest.multiplication("", "3");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    /**
     * Méthode qui permet de tester la multiplication de deux nombres
     * test avec une valeur avec des caracteres et une normale
     */
    @Test
    public void testMultiplication9() {
        result = montest.multiplication("Azertty", "2");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }

    /**
     * Méthode qui permet de tester la multiplication de deux nombres
     * test avec une valeur avec des caracteres et une normale
     */
    @Test
    public void testMultiplication10() {
        result = montest.multiplication("2", "Azertty");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }

    /**
     * Méthode qui permet de tester la multiplication de deux nombres
     * test avec une valeur avec des caracteres et une null
     */
    @Test
    public void testMultiplication12() {
        result = montest.multiplication("", "Azertty");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }

    /**
     * Méthode qui permet de tester la multiplication de deux nombres
     * test avec une valeur avec des caracteres et une null
     */
    @Test
    public void testMultiplication13() {
        result = montest.multiplication("Azertty", "");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }

    /**
     * Méthode qui permet de tester la multiplication de deux nombres
     * test avec une valeur avec des caracteres et une negative
     */
    @Test
    public void testMultiplication14() {
        result = montest.multiplication("Azertty", "-33");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }

    /**
     * Méthode qui permet de tester la multiplication de deux nombres
     * test avec une valeur avec des caracteres et une negative
     */
    @Test
    public void testMultiplication15() {
        result = montest.multiplication("-33", "Azertty");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }

    /**
     * Méthode qui permet de tester la multiplication de deux nombres
     * test avec deux valeurs negatives
     */
    @Test
    public void testMultiplication16() {
        result = montest.multiplication("-33", "-33");
        Assert.assertEquals(result, "Erreur : Un nombre est inférieur à 0.");
    }

    /**
     * Méthode qui permet de tester la multiplication de deux nombres
     * test une valeur contenant une addition et une valeur normale
     */
    @Test
    public void testMultiplication17() {
        result = montest.multiplication("3+3", "3");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }

    /**
     * Méthode qui permet de tester la multiplication de deux nombres
     * test une valeur contenant une operation et une valeur normale
     */
    @Test
    public void testMultiplication18() {
        result = montest.multiplication("-3*-3", "2");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }

    /**
     * Méthode qui permet de tester la multiplication de deux nombres
     * test une valeur contenant operateur et un chiffre et une valeur normale
     */
    @Test
    public void testMultiplication19() {
        result = montest.multiplication("*3", "2");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }

    /**
     * Méthode qui permet de tester la multiplication de deux nombres
     * test une valeur contenant operateur et un chiffre et une valeur normale
     */
    @Test
    public void testMultiplication20() {
        result = montest.multiplication("2", "*3");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }

    /**
     * Méthode qui permet de tester la multiplication de deux nombres
     * test une valeur contenant une operation et une valeur normale
     */
    @Test
    public void testMultiplication21() {
        result = montest.multiplication("3+3", "2");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }

    /**
     * Méthode qui permet de tester la multiplication de deux nombres
     * test une valeur contenant deux operateur + et une valeur normale
     */
    @Test
    public void testMultiplication22() {
        result = montest.multiplication("++", "2");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }

    /**
     * Méthode qui permet de tester la multiplication de deux nombres
     * test une valeur contenant une operation et une valeur normale
     */
    @Test
    public void testMultiplication23() {
        result = montest.multiplication("2/1", "2");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }

    /**
     * Méthode qui permet de tester la multiplication de deux nombres
     * test des valeurs contenant deux operation
     */
    @Test
    public void testMultiplication24() {
        result = montest.multiplication("2/1", "2/1");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }

    /**
     * Méthode qui permet de tester la multiplication de deux nombres
     * test des valeurs Float
     */
    @Test
    public void testMultiplication25() {
        result = montest.multiplication("2.3", "2.2");
        Assert.assertEquals(result, "5.06");
    }

    /**
     * Méthode qui permet de tester la multiplication de deux nombres
     * test une valeur Float et une valeur avec des caracteres
     */
    @Test
    public void testMultiplication26() {
        result = montest.multiplication("zzzz", "2.2");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }

//--------------------------------------------//

    /**
     * Méthode qui permet de tester la methode operation.
     * test addition avec valeurs normales
     */
    @Test
    public void testOperation1() {
        result = montest.calcul("1", "1", Constantes.ADD_KEY);
        Assert.assertEquals(result, "2.0");
    }

    /**
     * Méthode qui permet de tester la methode operation.
     * test multiplication avec valeurs normales
     */
    @Test
    public void testOperation2() {
        result = montest.calcul("3", "4", Constantes.MUL_KEY);
        Assert.assertEquals(result, "12.0");
    }

    /**
     * Méthode qui permet de tester la methode operation.
     * test soustraction avec valeurs normales
     */
    @Test
    public void testOperation3() {
        result = montest.calcul("11", "1", Constantes.SUB_KEY);
        Assert.assertEquals(result, "10.0");
    }

    /**
     * Méthode qui permet de tester la methode operation.
     * test addition avec valeurs null
     */
    @Test
    public void testOperation4() {
        result = montest.calcul("", "", Constantes.ADD_KEY);
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }

    /**
     * Méthode qui permet de tester la methode operation.
     * test multiplication avec une valeur null
     */
    @Test
    public void testOperation5() {
        result = montest.calcul("", "1", Constantes.MUL_KEY);
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }

    /**
     * Méthode qui permet de tester la methode operation.
     * test soustraction avec une valeur null
     */
    @Test
    public void testOperation6() {
        result = montest.calcul("1", "", Constantes.SUB_KEY);
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }

    /**
     * Méthode qui permet de tester la methode operation.
     * test addition avec une valeur negative
     */
    /*
    @Test
    public void testOperation7() {
        result = montest.calcul("-1", "1", Constantes.ADD_KEY);
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    */
    /**
     * Méthode qui permet de tester la methode operation.
     * test addition avec une valeur negative
     */

    /*
    @Test
    public void testOperation8() {
        result = montest.calcul("1", "-1", Constantes.ADD_KEY);
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    */

    /**
     * Méthode qui permet de tester la methode operation.
     * test addition avec des caracteres
     */
    @Test
    public void testOperation9() {
        result = montest.calcul("azerty", "10", Constantes.ADD_KEY);
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }

    /**
     * Méthode qui permet de tester la methode operation.
     * test addition avec des caracteres
     */
    @Test
    public void testOperation10() {
        result = montest.calcul("1", "uiop", Constantes.ADD_KEY);
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }

    /**
     * Méthode qui permet de tester la methode operation.
     * test addition avec des caracteres
     */
    /*
    @Test
    public void testOperation11() {
        result = montest.calcul("1", "22", "CoucouTuVeuxVoirMa");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    */
    /**
     * Méthode qui permet de tester la methode operation.
     * test addition avec des caracteres
     */

    /*
    @Test

    public void testOperation12() {
        result = montest.calcul("1", "22", "123");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
     */
    /**
     * Méthode qui permet de tester la methode operation.
     * test addition avec des caracteres
     */

    /*
    @Test
    public void testOperation13() {
        result = montest.calcul("1", "33", "-");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }*/
}
