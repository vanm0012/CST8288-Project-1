package io.github.vanm0012.symphonymanager.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestSoloist
{
    String testID = "123abc";
    Soloist solo = new Soloist();
    @Test
    public void setId()
    {
        solo.setId(testID);
        assertEquals(solo.getId(),testID);

    }

    @Test
    public void getId()
    {
        assertEquals(solo.getId(),testID);
    }

}