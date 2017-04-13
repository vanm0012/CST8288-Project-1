package io.github.vanm0012.symphonymanager.domain;

import io.github.vanm0012.symphonymanager.exceptions.ConcertSeasonIndexOutOfBoundsException;
import io.github.vanm0012.symphonymanager.util.Date;

import java.util.ArrayList;

/**
 * Holds and manipulates data for a concert season
 */
public class ConcertSeason
{
    private ArrayList<Concert> concerts;
    private Date openDate;
    private int duration;

    /**
     * Default constructor
     */
    public ConcertSeason()
    {
        concerts = new ArrayList<>();
    }

    /**
     * Constructor adds all data members from given variables
     * @param concerts Arraylist of the concerts in a season
     * @param openDate The start date of a season
     * @param duration The length of a concert season
     */
    public ConcertSeason(ArrayList<Concert> concerts, Date openDate, int duration)
    {
        this.concerts = concerts;
        this.openDate = openDate;
        this.duration = duration;
    }

    /**
     * Sets a new arraylist of the concerts from a given arraylist
     * @param concerts new arraylist of concerts
     */
    public void setConcerts(ArrayList<Concert> concerts)
    {
        this.concerts = concerts;
    }

    /**
     * Sets a new open date for the season from a given Date
     * @param openDate new open date
     */
    public void setOpenDate(Date openDate)
    {
        this.openDate = openDate;
    }

    /**
     * Sets a new length of a season from a given integer
     * @param duration new duration
     */
    public void setDuration(int duration)
    {
        this.duration = duration;
    }

    /**
     * Returns the current list of concerts in a season
     * @return current arraylist of concerts
     */
    public ArrayList<Concert> getConcerts()
    {
        return concerts;
    }

    /**
     * Returns the Current open date for the season
     * @return Current open date for the season
     */
    public Date getOpenDate()
    {
        return openDate;
    }

    /**
     * Returns the current length of the season
     * @return Current duration of season
     */
    public int getDuration()
    {
        return duration;
    }

    /**
     * Adds a concert to the list from given concert object
     * @param concert New concert to be added
     */
    public void addConcert(Concert concert)
    {
        this.concerts.add(concert);
    }

    /**
     * Returns A concert at index given
     * @param index index of concert requested
     * @return The concert requested
     * @throws ConcertSeasonIndexOutOfBoundsException Exception if the index it out of the list's bounds
     */
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
