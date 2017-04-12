package io.github.vanm0012.symphonymanager.domain;

public class Soloist extends SymphonyEmployee
{
    private String id;

    public Soloist() {}

    public Soloist(String name, String address, int phone, String id)
    {
        super(name, address, phone);
        this.id = id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
    }
}
