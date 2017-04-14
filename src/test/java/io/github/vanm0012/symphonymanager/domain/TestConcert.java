package io.github.vanm0012.symphonymanager.domain;

import io.github.vanm0012.symphonymanager.util.DateTime;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestConcert
{
    final Composition testComposition = new Composition();
    final DateTime testStartDate = new DateTime("2017-04-14", "13:40");
    final String testId = "conc1";
    final Conductor testConductor = new Conductor("Joe", "12 Pear ave", 705278456, 126578);

    Concert testConcert;

    @Before
    public void setUp()
    {
        ArrayList<Composition> compositions = new ArrayList<>();
        compositions.add(testComposition);

        testConcert = new Concert(compositions, testStartDate, testId, testConductor);
    }

    @Test
    public void setCompositions()
    {
        ArrayList<Composition> compositions = new ArrayList<>();
        compositions.add(testComposition);

        Concert concert = new Concert();
        concert.setCompositions(compositions);

        assertEquals(concert.getCompositions(), compositions);
    }

    @Test
    public void setStartDate()
    {
        Concert concert = new Concert();
        concert.setStartDate(testStartDate);
        assertEquals(concert.getStartDate(), testStartDate);
    }

    @Test
    public void setId()
    {
        Concert concert = new Concert();
        concert.setId(testId);
        assertEquals(concert.getId(), testId);
    }

    @Test
    public void setConductor()
    {
        Concert concert = new Concert();
        concert.setConductor(testConductor);
        assertEquals(concert.getConductor(), testConductor);
    }

    @Test
    public void getCompositions()
    {
        assertEquals(testConcert.getCompositions().get(0), testComposition);
    }

    @Test
    public void getStartDate()
    {
        assertEquals(testConcert.getStartDate(), testStartDate);
    }

    @Test
    public void getId()
    {
        assertEquals(testConcert.getId(), testId);
    }

    @Test
    public void getConductor()
    {
        assertEquals(testConcert.getConductor(), testConductor);
    }

    @Test
    public void addComposition()
    {
        Concert concert = new Concert();
        concert.addComposition(testComposition);

        assertEquals(concert.getCompositions().get(0), testComposition);
    }

}