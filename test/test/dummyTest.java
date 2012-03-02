/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author jrusnack
 */
public class dummyTest {
    
    @BeforeClass
    public void setUp() {
        // code that will be invoked before this test starts
    }
    
    @Test
    public void aTest() {
        System.out.println("Test");
    }
    
    @AfterClass
    public void cleanUp() {
        // code that will be invoked after this test ends
    }
}
