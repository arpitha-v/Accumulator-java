package com.metapack.accumulator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Arpitha.V on 13/07/2016.
 */
public class AccumulatorTest {

    private Accumulator accumulator;
    @Before
    public void setUp() {
       accumulator =new AccumulatorImpl();
    }

    @Test
    public void testAccumulate()
    {
        assertEquals(12,accumulator.accumulate(3,4,5));
    }

    @Test
    public void testGetCount()
    {
        accumulator.accumulate(2,3,5);
        accumulator.accumulate(4,5);
        assertEquals(19,accumulator.getTotal());
    }

    @Test
    public void testReset()
    {
        accumulator.accumulate(2,3,5);
        accumulator.accumulate(4,5);
        assertEquals(19,accumulator.getTotal());
        accumulator.reset();
        assertEquals(0,accumulator.getTotal());
    }
}
