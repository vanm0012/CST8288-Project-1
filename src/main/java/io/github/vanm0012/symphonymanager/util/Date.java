package io.github.vanm0012.symphonymanager.util;

/**
 * This class hold and manipulates date data
 */
public class Date
{
    private String date;

    /**
     * default constructor
     */
    public Date() {}

    /**
     * Constructor sets the data
     * @param date
     */
    public Date(String date)
    {
        this.date = date;
    }

    /**
     * Sets a new data from given String
     * @param date new date
     */
    public void setDate(String date)
    {
        this.date = date;
    }

    /**
     * Returns set data
     * @return date
     */
    public String getDate()
    {
        return date;
    }
}
