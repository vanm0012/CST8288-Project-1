package io.github.vanm0012.symphonymanager.util;

public class DateTime extends Date
{
    private String time;

    public DateTime() {}

    public DateTime(String date, String time)
    {
        super(date);
        this.time = time;
    }

    public void setTime(String time)
    {
        this.time = time;
    }

    public String getTime()
    {
        return time;
    }
}
