package io.github.vanm0012.symphonymanager;

/**
 * The is the controller for the application
 */
public class SymphonyManagerController
{
    private static SymphonyManagerController instance = new SymphonyManagerController();

    /**
     * Returns instance of this class
     * @return SymphonyManagerController class
     */
    public static SymphonyManagerController getInstance()
    {
        return instance;
    }

    /**
     * Default constructor
     */
    private SymphonyManagerController()
    {
    }
}
