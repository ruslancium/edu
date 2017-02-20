package by.epam.jmp.hw_test;

import org.junit.Test;

import static by.epam.jmp.homework.hw_01.HomeWork_01.calcMult;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Ruslan_Arifullin on 2/20/2017.
 * Тесткейс для проверки умножения элементов чисел
 * Оригинал by.epam.jmp.homework.hw_01.HomeWork_01.calcMult
 */

public class HW01_Test {

    @Test
    public void testTrueSquare() {
        assertTrue(6 == calcMult("123"));
    }


    @Test
    public void testFalsecalcMult() {
        assertFalse(7 == calcMult("1234"));
    }

}
