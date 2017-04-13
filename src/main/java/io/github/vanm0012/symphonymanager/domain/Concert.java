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

    /**
     * Default constructor initializes the compositions arraylist
     */
    public Concert()
    {
        this.compositions = new ArrayList<>();
    }

    /**
     * Constructor sets all data members
     * @param compositions The arraylist of compositions
     * @param startDate The start of the concert
     * @param id The ID number of the concert
     * @param conductor The name of the conductor
     */
    public Concert(ArrayList<Composition> compositions, DateTime startDate, String id, Conductor conductor)
    {
        this.compositions = compositions;
        this.startDate = startDate;
        this.id = id;
        this.conductor = conductor;
    }

    /**
     * Sets  a new arraylist of compositions
     * @param compositions new compositions arraylist
     */
    public void setCompositions(ArrayList<Composition> compositions)
    {
        this.compositions = compositions;
    }

    /**
     * Sets a new start date for the concert from a given DateTime
     * @param startDate Start date
     */
    public void setStartDate(DateTime startDate)
    {
        this.startDate = startDate;
    }

    /**
     * Sets a new ID for the concert from a given String
     * @param id new ID
     */
    public void setId(String id)
    {
        this.id = id;
    }

    /**
     * Sets a new conductor for a concert from a given Conductor object
     * @param conductor new conductor
     */
    public void setConductor(Conductor conductor)
    {
        this.conductor = conductor;
    }

    /**
     * Returns the current composition list
     * @return Arraylist of compositions
     */
    public ArrayList<Composition> getCompositions()
    {
        return compositions;
    }

    /**
     * Returns the current start date of the concert
     * @return Start date
     */
    public DateTime getStartDate()
    {
        return startDate;
    }

    /**
     * Returns the current ID for a concert
     * @return ID of concert
     */
    public String getId()
    {
        return id;
    }

    /**
     * Returns current Conductor object
     * @return Conductor of concert
     */
    public Conductor getConductor()
    {
        return conductor;
    }

    /**
     * Adds a composition to the arraylist from a given Composition object
     * @param composition new composition to be added
     */
    public void addComposition(Composition composition)
    {
        this.compositions.add(composition);
    }
}
