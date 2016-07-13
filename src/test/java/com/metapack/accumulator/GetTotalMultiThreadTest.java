package com.metapack.accumulator;

import static org.junit.Assert.*;

import com.anarsoft.vmlens.concurrent.junit.ConcurrentTestRunner;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Arpitha.V on 13/07/2016.
 */
@RunWith(ConcurrentTestRunner.class)
public class GetTotalMultiThreadTest {


    private Accumulator accumulator = new AccumulatorImpl();

    @Test
    public void accumulate()
    {
        accumulator.accumulate(1,2,3);
    }

    @After
    public void testCount()
    {
        assertEquals("4 Threads running accumulate in paralled should lead to 24",24,accumulator.getTotal());
    }
}
