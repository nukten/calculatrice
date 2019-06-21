package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import calculatrice.Calculatrice;
import calculatrice.Constantes;
import calculatrice.ICalculatrice;

public class TestConstantes {

    public static ICalculatrice montest;
    public static String result;

    @Before
    public void initialisation() {
        montest =  new Calculatrice();
        result = null;
        //test
    }

    @Test
    public void testADD_KEY() {
        result = Constantes.ADD_KEY;
        System.out.println(result);
        Assert.assertEquals("+", result);

    }

    @Test
    public void testEMPTY() {
        result = Constantes.EMPTY;
        System.out.println(result);
        Assert.assertEquals("", result);

    }
    @Test
    public void testFLOAT_SEPARATOR() {
        result = Constantes.FLOAT_SEPARATOR;
        System.out.println(result);
        Assert.assertEquals(".", result);

    }
    @Test
    public void testSUB_KEY() {
        result = Constantes.SUB_KEY;
        System.out.println(result);
        Assert.assertEquals("-", result);

    }
    @Test
    public void testDIVIDE_KEY() {
        result = Constantes.DIVIDE_KEY;
        System.out.println(result);
        Assert.assertEquals("/", result);

    }
    @Test
    public void testMUL_KEY() {
        result = Constantes.MUL_KEY;
        System.out.println(result);
        Assert.assertEquals("*", result);

    }
}


