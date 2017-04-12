package io.github.vanm0012.symphonymanager.domain;

/**
 * This holds and manipulates data common between symphony employees
 */
public class SymphonyEmployee
{
    private String name;
    private String address;
    private int phone;

    /**
     * Default Constructor
     */
    public SymphonyEmployee() {}

    /**
     * Constructor sets all the variables for this class
     * @param name The full name of an employee
     * @param address The home address of an employee
     * @param phone The phone number of the employee
     */
    public SymphonyEmployee(String name, String address, int phone)
    {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    /**
     * Sets the new name of an employee from a given String
     * @param name New name for an employee
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Sets the new addrss for an employee from a given String
     * @param address The new address for an employee
     */
    public void setAddress(String address)
    {
        this.address = address;
    }

    /**
     * Sets the new phone number from a given integer
     * @param phone New phone number for an employee
     */
    public void setPhone(int phone)
    {
        this.phone = phone;
    }

    /**
     * Returns the current name of an employee
     * @return The current name of an employee
     */
    public String getName()
    {
        return name;
    }

    /**
     * Returns the current home address of an employee
     * @return The current home address of an employee
     */
    public String getAddress()
    {
        return address;
    }

    /**
     * Returns the current phone number of an employee
     * @return The current phone number of an employee
     */
    public int getPhone()
    {
        return phone;
    }
}
