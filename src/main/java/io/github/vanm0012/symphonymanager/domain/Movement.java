package io.github.vanm0012.symphonymanager.domain;

public class Movement
{
    private String name;
    private int id;

    public Movement() {}

    public Movement(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public int getId()
    {
        return id;
    }
}
