package fdu.maven.ex3_maven_openCSV;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	//	fail();
        assertTrue( true );
    }
    
    public void testApp2()
    {
    		fail("it's all Diego's fault");
//        assertTrue( true );
    }
    
    public void testApp3()
    {
//    		fail();
    	assertTrue( true );
    }
}
