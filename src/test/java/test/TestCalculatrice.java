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
        System.out.println(result);
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
        Assert.assertEquals("Erreur", result);
    }
}


