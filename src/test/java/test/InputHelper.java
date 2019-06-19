package test;

import java.io.ByteArrayInputStream;

public final class InputHelper {

    public static void simulateKb(String im) {
        ByteArrayInputStream in = new ByteArrayInputStream(im.getBytes());
        System.setIn(in);

        // optionally, reset System.in to its original
        System.setIn(System.in);
    }
}
