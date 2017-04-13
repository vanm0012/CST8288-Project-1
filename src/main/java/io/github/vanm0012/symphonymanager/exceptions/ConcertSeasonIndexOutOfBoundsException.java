package io.github.vanm0012.symphonymanager.exceptions;

/**
 * Exceptin for the concert season list index being out of bounds
 */
public class ConcertSeasonIndexOutOfBoundsException extends SymphonyManagerException
{
    public ConcertSeasonIndexOutOfBoundsException() {}

    /**
     * Constructor sets the message given for the error
     * @param msg Message to send for exception
     */
    public ConcertSeasonIndexOutOfBoundsException(String msg)
    {
        super(msg);
    }
}
