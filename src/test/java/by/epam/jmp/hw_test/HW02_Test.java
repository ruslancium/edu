package by.epam.jmp.hw_test;

import org.junit.Test;

import static by.epam.jmp.homework.hw_02.HomeWork_02.calculateLength;
import static by.epam.jmp.homework.hw_02.HomeWork_02.calculateSquare;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Ruslan_Arifullin on 2/20/2017.
 */
public class HW02_Test {

    @Test
    public void testTrueCalculateSquare() {
        assertTrue( Math.PI * Math.pow(2, 2)== calculateSquare(2));
    }

    @Test
    public void testFalseCalculateSquare() {
        assertTrue(Math.PI * Math.pow(3, 2) == calculateSquare(2));
    }

    @Test
    public void testTrueCalculateLength() {
        assertTrue(2 * Math.PI * 2== calculateLength(2));
    }

    @Test
    public void testFalseCalculateLength() {
        assertFalse(2 * Math.PI * 3 == calculateLength(2));
    }
}
