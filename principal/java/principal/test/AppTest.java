package principal.java.principal.test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

//unit teste simples
public class AppTest
        extends TestCase {
    // nomeção do teste
    public AppTest(String testName) {
        super(testName);
    }

    // retorno
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    public void testApp() {
        assertTrue(true);
    }
}
