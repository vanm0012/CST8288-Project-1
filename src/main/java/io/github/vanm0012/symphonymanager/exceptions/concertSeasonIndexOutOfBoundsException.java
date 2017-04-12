package io.github.vanm0012.symphonymanager.exceptions;

/**
 * Exceptin for the concert season list index being out of bounds
 */
public class concertSeasonIndexOutOfBoundsException extends SymphonyManagerException
{
    public concertSeasonIndexOutOfBoundsException() {}

    /**
     * Constructor sets the message given for the error
     * @param msg Message to send for exception
     */
    public concertSeasonIndexOutOfBoundsException(String msg)
    {
        super(msg);
    }
}
