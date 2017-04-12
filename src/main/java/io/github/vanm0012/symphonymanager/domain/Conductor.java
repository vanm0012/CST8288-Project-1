package io.github.vanm0012.symphonymanager.domain;

public class Conductor
{
    private int id;
    private int phone;
    private String name;
    private String address;

    public Conductor() {}

    public Conductor(int id, int phone, String name, String address)
    {
        this.id = id;
        this.phone = phone;
        this.name = name;
        this.address = address;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setPhone(int phone)
    {
        this.phone = phone;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public int getId()
    {
        return id;
    }

    public int getPhone()
    {
        return phone;
    }

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }
}
