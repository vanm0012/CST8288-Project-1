package io.github.vanm0012.symphonymanager;

public class SymphonyManagerController
{
    private static SymphonyManagerController instance = new SymphonyManagerController();

    public static SymphonyManagerController getInstance()
    {
        return instance;
    }

    private SymphonyManagerController()
    {
    }
}
