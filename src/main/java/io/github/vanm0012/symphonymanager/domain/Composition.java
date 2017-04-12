package io.github.vanm0012.symphonymanager.domain;

import java.util.ArrayList;

public class Composition
{
    private ArrayList<Movement> movements;
    private String composer;
    private String name;
    private String id;

    public Composition()
    {
        this.movements = new ArrayList<>();
    }

    public Composition(String composer, String name, String id, ArrayList<Movement> movements)
    {
        this.movements = movements;
        this.composer = composer;
        this.name = name;
        this.id = id;
    }

    public void setMovements(ArrayList<Movement> movements)
    {
        this.movements = movements;
    }

    public void setComposer(String composer)
    {
        this.composer = composer;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public ArrayList<Movement> getMovements()
    {
        return movements;
    }

    public String getComposer()
    {
        return composer;
    }

    public String getName()
    {
        return name;
    }

    public String getId()
    {
        return id;
    }
}
