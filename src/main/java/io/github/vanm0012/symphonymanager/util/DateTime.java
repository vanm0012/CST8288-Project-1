package io.github.vanm0012.symphonymanager.util;

/**
 * This class holds the time related to a date
 */
public class DateTime extends Date
{
    private String time;

    /**
     * Default constructor
     */
    public DateTime() {}

    /**
     * Constructor sets the time and date
     * @param date the date of an event
     * @param time the time of an event
     */
    public DateTime(String date, String time)
    {
        super(date);
        this.time = time;
    }

    /**
     * Sets a new time from a given String
     * @param time
     */
    public void setTime(String time)
    {
        this.time = time;
    }

    /**
     * Returns the set time
     * @return Time
     */
    public String getTime()
    {
        return time;
    }
}
