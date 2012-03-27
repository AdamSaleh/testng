/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author jrusnack
 */
public class dummyTest {
    dummy d;
    
    @BeforeClass
    public void setUp() {
        // code that will be invoked before this test starts
	d = new dummy();
    }
    
    @Test
    public void incTest(){
        int a;
	assertEquals(d.inc(3), 4);
    }
    
    @AfterClass
    public void cleanUp() {
        // code that will be invoked after this test ends
    }
}
