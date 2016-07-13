package com.metapack.accumulator;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Arpitha.v on 13/07/2016.
 */
public class AccumulatorImpl implements Accumulator {
    private final AtomicInteger count= new AtomicInteger();

    @Override
    public int accumulate(int... values) {
        int tempValue = 0;
        for(int n : values) {
            tempValue += n;
        }
        count.addAndGet(tempValue);
        return tempValue;
    }

    @Override
    public int getTotal() {
        return count.get();
    }

    @Override
    public void reset() {
        count.set(0);
    }
}
