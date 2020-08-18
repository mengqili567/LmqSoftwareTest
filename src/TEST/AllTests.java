package TEST;

import com.sun.java.util.jar.pack.Calculator2Test;
import com.sun.java.util.jar.pack.CalculatorTest;
import junit.framework.Test;
import junit.framework.TestSuite;
/*@RunWith(Suite. class )
@Suite.SuiteClasses( {
        CalculatorTest. class ,
        Calculator2Test. class
} )*/
public class AllTests {
    public static void main (String[] args) {
        junit.textui.TestRunner.run (suite());
    }
    public static Test suite ( ) {
        TestSuite suite= new TestSuite("All JUnit Tests");
        suite.addTest(CalculatorTest.suite());
        suite.addTest(Calculator2Test.suite());
       // suite.addTest(new Test.class);
        return suite;
    }
}
