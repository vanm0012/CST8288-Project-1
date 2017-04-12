package io.github.vanm0012.symphonymanager.domain;

public class Soloist
{
    private String id;
    private String expertise;
    private String name;
    private String address;
    private int phone;

    public Soloist() {}

    public Soloist(String id, String expertise, String name, String address, int phone)
    {
        this.id = id;
        this.expertise = expertise;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public void setExpertise(String expertise)
    {
        this.expertise = expertise;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public void setPhone(int phone)
    {
        this.phone = phone;
    }

    public String getId()
    {
        return id;
    }

    public String getExpertise()
    {
        return expertise;
    }

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public int getPhone()
    {
        return phone;
    }
}
