/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Random;
import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author jrusnack
 */
public class dummyTest {
    
    
    @Test
    public void randomTest(){
	Random randomGenerator = new Random();
	assertEquals(1, randomGenerator.nextInt(2));
    }
    
    
}
