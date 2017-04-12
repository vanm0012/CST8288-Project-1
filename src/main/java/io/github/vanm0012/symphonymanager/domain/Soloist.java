package io.github.vanm0012.symphonymanager.domain;

/**
 * This holds and manipulates the data for a soloist
 */
public class Soloist extends SymphonyEmployee
{
    private String id;

    /**
     * Default Constructor
     */
    public Soloist() {}

    /**
     * Constructor sets all the variables for a soloist
     * @param name The name of the soloist
     * @param address The address of the soloist
     * @param phone The phone number of the soloist
     * @param id The ID for the soloist
     */
    public Soloist(String name, String address, int phone, String id)
    {
        super(name, address, phone);
        this.id = id;
    }

    /**
     * Sets the id of the solist from the given String
     * @param id The new ID for the soloist
     */
    public void setId(String id)
    {
        this.id = id;
    }

    /**
     * Returns the current Id of the solist
     * @return The current ID if the solist
     */
    public String getId()
    {
        return id;
    }
}
