package tech.tftinker.helloworld;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class TestMain {
    private String outputText = "Hello Gradle and Github Actions!\n";

    @Test
    public void testOutputOfMain() {
        PrintStream outputStream = System.out;

        ByteArrayOutputStream myOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOut));

        Main.main(new String[0]);

        assertEquals(outputText, myOut.toString().replace("\r",""));

        System.setOut(outputStream);
    }

    @Test
    public void thisTestWillPass() {
        assertTrue(true);
    }
}
