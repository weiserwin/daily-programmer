package com.reddit.dailyprogrammer;

import org.junit.Assert;
import org.junit.Test;

import static com.reddit.dailyprogrammer.C259.NOS2int;

public class C259Test extends Assert{

    @Test
    public void readEmpty() {
        assertEquals(NOS2int(""), 0);
    }
    @Test
    public void read0() {
        assertEquals(NOS2int("0"), 1);
    }

    @Test
    public void read1() {
        assertEquals(NOS2int("1"), -1);
    }

    @Test
    public void read2() {
        assertEquals(NOS2int("2"), 0);
    }

    @Test
    public void read00() {
        assertEquals(NOS2int("00"), 3);
    }

    @Test
    public void read01() {
        assertEquals(NOS2int("01"), -1);
    }

    @Test
    public void read02() {
        assertEquals(NOS2int("02"), 2);
    }

    @Test
    public void read11() {
        assertEquals(NOS2int("11"), -3);
    }

    @Test
    public void read12() {
        assertEquals(NOS2int("12"), -2);
    }

    @Test
    public void read22() {
        assertEquals(NOS2int("22"), 0);
    }

    @Test
    public void read10020() {
        assertEquals(NOS2int("10020"), 21);
    }

}
