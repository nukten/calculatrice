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
         System.out.println(result);
         //Assert.assertSame("Erreur", result);
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
    
    String result = montest.soustraction("-3", "4");
    System.out.println(result);
    String totest = "Erreur : Un nombre est inférieur à 0.";
    //Assert.assertEquals(totest, result);

    }

}
