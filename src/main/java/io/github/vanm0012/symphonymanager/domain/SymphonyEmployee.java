package io.github.vanm0012.symphonymanager.domain;

public class SymphonyEmployee
{
    private String name;
    private String address;
    private int phone;

    public SymphonyEmployee() {}

    public SymphonyEmployee(String name, String address, int phone)
    {
        this.name = name;
        this.address = address;
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

    public void setPhone(int phone)
    {
        this.phone = phone;
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
