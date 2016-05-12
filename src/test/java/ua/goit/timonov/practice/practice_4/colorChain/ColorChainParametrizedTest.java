package ua.goit.timonov.practice.practice_4.colorChain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Alex on 11.05.2016.
 */
@RunWith(value = Parameterized.class)
public class ColorChainParametrizedTest {
    private int length;
    private int nCases;

    public ColorChainParametrizedTest(int length, int nCases) {
        this.length = length;
        this.nCases = nCases;
    }

    @Parameterized.Parameters(name = "{index}: For length = {0} number of cases is {1}")
    public static Iterable<Object[]> getParametrizedData() {
        return Arrays.asList(new Object[][] {
                {0, 0},
                {1, 1},
                {2, 2},
                {3, 4},
                {4, 7},
                {5, 13},
                {6, 24},
                {7, 44},
                {10, 274},
                {20, 121415}
        });
    }

    @Test
    public void testCount() {
        assertEquals(nCases, new ColorChain().count(length));
    }

}