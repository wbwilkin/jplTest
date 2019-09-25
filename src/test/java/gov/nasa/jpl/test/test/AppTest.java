package gov.nasa.jpl.test.test;
import junit.framework.Assert;
import junit.framework.Test;

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
    public void testAdd()
    {
        Assert.assertEquals(App.add(2, 2), 4);
    }


	public void testSubtract()
    {
    	Assert.assertEquals(App.subtract(2, 1), 1);
    }


	public void testMultiply()
    {
    	Assert.assertEquals(App.multiply (2, 2), 4);
    }

	public void testDivide ()
    {
    	Assert.assertEquals(App.divide (10, 2), 5);
    }


}
