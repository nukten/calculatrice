package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import calculatrice.Calculatrice;
import calculatrice.Constantes;
import calculatrice.ICalculatrice;

public class TestConstantes {

    public static String result;

    @Before
    /**
     * Initialisation
     */
    public void initialisation() {
        result = null;
        //test
    }

    @Test
    /**
     * test de la constante ADD_KEY
     */
    public void testAdd_key() {
        result = Constantes.ADD_KEY;
        Assert.assertEquals("+", result);

    }

    @Test
    /**
     * test de la constante EMPTY
     */
    public void testEmpty() {
        result = Constantes.EMPTY;
        Assert.assertEquals("", result);

    }
    @Test
    /**
     * test de la constante FLOAT_SEPARATOR
     */
    public void testFloat_separator() {
        result = Constantes.FLOAT_SEPARATOR;
        Assert.assertEquals(".", result);

    }
    @Test
    /**
     * test de la constante SUB_KEY
     */
    public void testSub_key() {
        result = Constantes.SUB_KEY;
        Assert.assertEquals("-", result);

    }
    @Test
    /**
     * test de la constante DIVIDE_KEY
     */
    public void testDivide_key() {
        result = Constantes.DIVIDE_KEY;
        Assert.assertEquals("/", result);

    }
    @Test
    /**
     * test de la constante MUL_KEY
     */
    public void testMul_key() {
        result = Constantes.MUL_KEY;
        Assert.assertEquals("*", result);

    }
}


