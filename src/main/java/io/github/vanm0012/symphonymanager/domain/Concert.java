package io.github.vanm0012.symphonymanager.domain;

import io.github.vanm0012.symphonymanager.util.DateTime;

import java.util.ArrayList;

/**
 * Holds and manipulates all the data for a concert
 */
public class Concert
{
    private ArrayList<Composition> compositions;
    private DateTime startDate;
    private String id;
    private Conductor conductor;

    public Concert()
    {
        this.compositions = new ArrayList<>();
    }

    public Concert(ArrayList<Composition> compositions, DateTime startDate, String id, Conductor conductor)
    {
        this.compositions = compositions;
        this.startDate = startDate;
        this.id = id;
        this.conductor = conductor;
    }

    public void setCompositions(ArrayList<Composition> compositions)
    {
        this.compositions = compositions;
    }

    public void setStartDate(DateTime startDate)
    {
        this.startDate = startDate;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public void setConductor(Conductor conductor)
    {
        this.conductor = conductor;
    }

    public ArrayList<Composition> getCompositions()
    {
        return compositions;
    }

    public DateTime getStartDate()
    {
        return startDate;
    }

    public String getId()
    {
        return id;
    }

    public Conductor getConductor()
    {
        return conductor;
    }

    public void addComposition(Composition composition)
    {
        this.compositions.add(composition);
    }
}
