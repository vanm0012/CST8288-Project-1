package io.github.vanm0012.symphonymanager.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestSymphonyEmployee

{
    String testName = "Reg", testAddress = "123 Street rd.";
    int phone = 5555555;
    SymphonyEmployee se = new SymphonyEmployee();
    @Test
    public void setName()
    {
        se.setName(testName);
        assertEquals(se.getName(),testName);
    }

    @Test
    public void setAddress()
    {
        se.setAddress(testAddress);
        assertEquals(se.getAddress(),testAddress);
    }

    @Test
    public void setPhone()
    {
        se.setPhone(phone);
        assertEquals(se.getPhone(),phone);
    }

    @Test
    public void getName()
    {
        assertEquals(se.getName(),testName);
    }

    @Test
    public void getAddress()
    {
        assertEquals(se.getAddress(),testAddress);
    }

    @Test
    public void getPhone()
    {
        assertEquals(se.getPhone(),phone);
    }

}