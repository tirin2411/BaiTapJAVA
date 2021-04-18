/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class Bai4Test {
    
    public Bai4Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of KTSoNguyenTo method, of class Bai4.
     */
    @Test
    public void testKTSoNguyenTo() {
        System.out.println("KTSoNguyenTo");
        int n = 0;
        Bai4 instance = new Bai4();
        boolean expResult = false;
        boolean result = instance.KTSoNguyenTo(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertIntegers method, of class Bai4.
     */
    @Test
    public void testConvertIntegers() {
        System.out.println("convertIntegers");
        ArrayList<Integer> integers = null;
        int[] expResult = null;
        int[] result = Bai4.convertIntegers(integers);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Bai4.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Bai4.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
