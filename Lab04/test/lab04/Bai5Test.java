/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class Bai5Test {
    
    public Bai5Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of displayContent method, of class Bai5.
     */
    @Test
    public void testDisplayContent() {
        System.out.println("displayContent");
        String fpath = "";
        Bai5 instance = new Bai5();
        instance.displayContent(fpath);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Bai5.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Bai5.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
