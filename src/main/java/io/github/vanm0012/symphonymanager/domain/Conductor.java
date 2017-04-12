package io.github.vanm0012.symphonymanager.domain;

/**
 * holds and manipulates the data for a conductor
 */
public class Conductor extends SymphonyEmployee
{
    private int id;

    /**
     * default constructor
     */
    public Conductor() {}

    /**
     * Constructor that sets all the variables
     * @param name The full name of the conductor
     * @param address The address of the conductor
     * @param phone The phone number of the conductor
     * @param id The ID number of the conductor
     */
    public Conductor(String name, String address, int phone, int id)
    {
        super(name, address, phone);
        this.id = id;
    }

    /**
     * Sets the ID number of the conductor
     * @param id The ID of the conductor
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * Returns the ID of the conductor
     * @return The current ID of the conductor
     */
    public int getId()
    {
        return id;
    }
}
