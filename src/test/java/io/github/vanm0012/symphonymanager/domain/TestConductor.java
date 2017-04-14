package io.github.vanm0012.symphonymanager.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestConductor
{
    private int testId = 1234;

    @Test
    public void setId()
    {
        Conductor conductor = new Conductor();
        conductor.setId(testId);
        assertEquals(conductor.getId(), testId);
    }

    @Test
    public void getId()
    {
        Conductor conductor = new Conductor("Joe Dong", "12 Pear Dr.", 1234567, testId);
        assertEquals(conductor.getId(), testId);
    }

}