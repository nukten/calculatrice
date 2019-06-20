package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import calculatrice.Application;
import calculatrice.Calculatrice;
import calculatrice.ICalculatrice;

public class TestCalculatrice {
    
    public static ICalculatrice montest;
    public static String result;
    
    @Before
    public void initialisation() {
        montest =  new Calculatrice();
        result = null;
        //test
    }
    
    @Test
    public void testAddition() {
        result = montest.addition("5", "2");
        Assert.assertEquals("7.0", result);
       
    }

    @Test
    public void testAddition1() {
        result = montest.addition("0", "0");
        Assert.assertEquals("0.0", result);
    }

    @Test
    public void testAddition2() {
        result = montest.addition("-3", "4");
        Assert.assertEquals(result, "Erreur : Un nombre est inférieur à 0.");
         
    }
    
    @Test
    public void testAddition3() {
        result = montest.addition("", "-2");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
         
    }
    
    @Test
    public void testAddition4() {
        result = montest.addition("-2", "");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
         
    }
    
    @Test
    public void testAddition5() {
        result = montest.addition("3", "");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
         
    }
    
    @Test
    public void testAddition6() {
        result = montest.addition("", "3");
        Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
         
    }

    @Test
    public void testAddition7() {
        result = montest.addition("1.0E27", "1.0E27");
        Assert.assertEquals(result, "2.0E27");
         
    }
    
    
    @Test
    public void testSoustraction() {
    result = montest.soustraction("5", "2");
    Assert.assertEquals("3.0", result);
    
    }

    @Test
    public void testSoustraction1() {
     result = montest.soustraction("0", "0");
     Assert.assertEquals("0.0", result);
    }

    @Test
    public void testSoustraction2() {
    result = montest.soustraction("-3", "4");
    Assert.assertEquals(result, "Erreur : Un nombre est inférieur à 0.");
    }
    
    @Test
    public void testSoustraction3() {
    result = montest.soustraction("-3", "");
    Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }

    @Test
    public void testSoustraction4() {
    result = montest.soustraction("", "4");

    Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    
    @Test
    public void testSoustraction5() {
    result = montest.soustraction("4", "");
    Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }

    @Test
    public void testSoustraction6() {
    result = montest.soustraction("", "");
    Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    
    @Test
    public void testSoustraction7() {
    result = montest.soustraction("+", "+");

    Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    
    @Test
    public void testSoustraction8() {
    result = montest.soustraction("", "-2");
    Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    
    
    @Test
    public void testSoustraction9() {
    result = montest.soustraction("82", "+2");
    Assert.assertEquals(result, "80.0");
    }
    
    @Test
    public void testSoustraction10() {
    result = montest.soustraction("1.0E29", "1.0E28");
    Assert.assertEquals(result, "9.0E28");
    }
    
    @Test
    public void testSoustraction11() {
    result = montest.soustraction("Azerttye", "1.0E28");
    Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    
    @Test
    public void testSoustraction12() {
    result = montest.soustraction("1.0E29", "Azerttye");
    Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    
    @Test
    public void testSoustraction13() {
    result = montest.soustraction("Azerttye", "Azerttye");
    Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    
    @Test
    public void testSoustraction14() {
    result = montest.soustraction("Azerttye", "");
    Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    @Test
    public void testSoustraction15() {
    result = montest.soustraction("", "Azerttye");
    Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    
    @Test
    public void testSoustraction16() {
    result = montest.soustraction("Azerttye", "-2");
    Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    
    @Test
    public void testSoustraction17() {
    result = montest.soustraction("-2", "Azerttye");
    Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    
    @Test
    public void testSoustraction18() {
    result = montest.soustraction("Azerttye", "1.0E28");
    Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    
    @Test
    public void testSoustraction19() {
    result = montest.soustraction("1.0E28", "Azerttye");
    Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    

    //--------------------------------------------//
    
    @Test
    public void testMultiplication1() {
    result = montest.multiplication("2", "8");
    Assert.assertEquals(result, "16.0");
    }
    
    @Test
    public void testMultiplication2() {
    result = montest.multiplication("0", "8");
    Assert.assertEquals(result, "0.0");
    }
    
    @Test
    public void testMultiplication3() {
    result = montest.multiplication("8", "0");
    Assert.assertEquals(result, "0.0");
    }

    @Test
    public void testMultiplication4() {
    result = montest.multiplication("", "0");
    Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    
    @Test
    public void testMultiplication5() {
    result = montest.multiplication("0", "");
    Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    
    @Test
    public void testMultiplication6() {
    result = montest.multiplication("", "");
    Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }

    @Test
    public void testMultiplication7() {
    result = montest.multiplication("3", "");
    Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    
    @Test
    public void testMultiplication8() {
    result = montest.multiplication("", "3");
    System.out.println(result);
    Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    
    @Test
    public void testMultiplication9() {
    result = montest.multiplication("Azertty", "2");
    Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    
    @Test
    public void testMultiplication10() {
    result = montest.multiplication("2", "Azertty");
    Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    
    @Test
    public void testMultiplication12() {
    result = montest.multiplication("", "Azertty");
    Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    
    @Test
    public void testMultiplication13() {
    result = montest.multiplication("Azertty", "");
    Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    
    @Test
    public void testMultiplication14() {
    result = montest.multiplication("Azertty", "-33");
    Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }
    
    @Test
    public void testMultiplication15() {
    result = montest.multiplication("-33", "Azertty");
    Assert.assertEquals(result, "Erreur : Une des saisies n'a pas le type attendu.");
    }


}
