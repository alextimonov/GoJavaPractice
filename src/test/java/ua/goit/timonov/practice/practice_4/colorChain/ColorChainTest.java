package ua.goit.timonov.practice.practice_4.colorChain;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Alex on 12.05.2016.
 */
public class ColorChainTest {
    ColorChain chain = new ColorChain();

    @Test
    public void testCount() throws Exception {
        assertEquals(7, chain.count(4));
    }
}