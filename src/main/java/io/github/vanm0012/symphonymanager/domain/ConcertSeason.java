package io.github.vanm0012.symphonymanager.domain;

import io.github.vanm0012.symphonymanager.exceptions.ConcertSeasonIndexOutOfBoundsException;
import io.github.vanm0012.symphonymanager.util.Date;

import java.util.ArrayList;

public class ConcertSeason
{
    private ArrayList<Concert> concerts;
    private Date openDate;
    private int duration;

    public ConcertSeason()
    {
        concerts = new ArrayList<>();
    }

    public ConcertSeason(ArrayList<Concert> concerts, Date openDate, int duration)
    {
        this.concerts = concerts;
        this.openDate = openDate;
        this.duration = duration;
    }

    public void setConcerts(ArrayList<Concert> concerts)
    {
        this.concerts = concerts;
    }

    public void setOpenDate(Date openDate)
    {
        this.openDate = openDate;
    }

    public void setDuration(int duration)
    {
        this.duration = duration;
    }

    public ArrayList<Concert> getConcerts()
    {
        return concerts;
    }

    public Date getOpenDate()
    {
        return openDate;
    }

    public int getDuration()
    {
        return duration;
    }

    public void addConcert(Concert concert)
    {
        this.concerts.add(concert);
    }

    public Concert getConcert(int index) throws ConcertSeasonIndexOutOfBoundsException
    {
        try
        {
            return concerts.get(index);
        }
        catch (IndexOutOfBoundsException e)
        {
            throw new ConcertSeasonIndexOutOfBoundsException("No concert found at index: " + index);
        }
    }
}
