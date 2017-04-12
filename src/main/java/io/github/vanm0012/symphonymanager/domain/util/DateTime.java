package io.github.vanm0012.symphonymanager.domain.util;


public class DateTime
{
    private String date;
    private String time;

    public DateTime() {}

    public DateTime(String date)
    {
        this.date = date;
        this.time = null;
    }

    public DateTime(String date, String time)
    {
        this.date = date;
        this.time = time;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public void setTime(String time)
    {
        this.time = time;
    }

    public String getDate()
    {
        return date;
    }

    public String getTime()
    {
        return time;
    }
}
