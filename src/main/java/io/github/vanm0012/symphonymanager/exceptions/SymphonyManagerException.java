package io.github.vanm0012.symphonymanager.exceptions;

/**
 * Exception for errors in the application
 */
public class SymphonyManagerException extends Exception
{
    public SymphonyManagerException() {}

    /**
     * Constructor sends the message used for the exception
     * @param msg Message used for the error
     */
    public SymphonyManagerException(String msg)
    {
        super(msg);
    }
}
