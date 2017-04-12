package io.github.vanm0012.symphonymanager.domain;

public class Conductor extends SymphonyEmployee
{
    private int id;

    public Conductor() {}

    public Conductor(String name, String address, int phone, int id)
    {
        super(name, address, phone);
        this.id = id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return id;
    }
}
