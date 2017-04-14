package io.github.vanm0012.symphonymanager.domain;

import io.github.vanm0012.symphonymanager.exceptions.ConcertSeasonIndexOutOfBoundsException;
import io.github.vanm0012.symphonymanager.util.Date;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestConcertSeason
{
    final Concert testConcert = new Concert();
    final Date testOpenDate = new Date("2017-04-14");
    final int testDuration = 3;

    ConcertSeason testConcertSeason;

    @Before
    public void setUp()
    {
        ArrayList<Concert> concerts = new ArrayList<>();
        concerts.add(testConcert);
        testConcertSeason = new ConcertSeason(concerts, testOpenDate, testDuration);
    }

    @Test
    public void setConcerts()
    {
        ArrayList<Concert> concerts = new ArrayList<>();
        concerts.add(testConcert);

        ConcertSeason concertSeason = new ConcertSeason();
        concertSeason.setConcerts(concerts);
        assertEquals(concertSeason.getConcerts().get(0), testConcert);
    }

    @Test
    public void setOpenDate()
    {
        ConcertSeason concertSeason = new ConcertSeason();
        concertSeason.setOpenDate(testOpenDate);
        assertEquals(concertSeason.getOpenDate(), testOpenDate);
    }

    @Test
    public void setDuration()
    {
        ConcertSeason concertSeason = new ConcertSeason();
        concertSeason.setDuration(testDuration);
        assertEquals(concertSeason.getDuration(), testDuration);
    }

    @Test
    public void getConcerts()
    {
        assertEquals(testConcertSeason.getConcerts().get(0), testConcert);
    }

    @Test
    public void getOpenDate()
    {
        assertEquals(testConcertSeason.getOpenDate(), testOpenDate);
    }

    @Test
    public void getDuration()
    {
        assertEquals(testConcertSeason.getDuration(), testDuration);
    }

    @Test
    public void addConcert()
    {
        ConcertSeason concertSeason = new ConcertSeason();
        concertSeason.addConcert(testConcert);
        assertEquals(concertSeason.getConcerts().get(0), testConcert);
    }

    @Test
    public void getConcert()
    {
        try
        {
            assertEquals(testConcertSeason.getConcert(0), testConcert);
        }
        catch (ConcertSeasonIndexOutOfBoundsException e)
        {
            fail();
        }
    }

}