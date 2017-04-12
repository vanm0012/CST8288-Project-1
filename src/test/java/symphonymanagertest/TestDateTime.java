package symphonymanagertest;

import io.github.vanm0012.symphonymanager.util.Date;
import io.github.vanm0012.symphonymanager.util.DateTime;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestDateTime
{
    final static String testDate = "2017-04-12";
    final static String testTime = "14:56";

    @Test
    public void testConstructor()
    {
        DateTime dateTime = new DateTime();
        assertNotNull(dateTime);
    }

    @Test
    public void testConstructorWithParams()
    {
        DateTime dateTime = new DateTime(testDate, testTime);
        assertNotNull(dateTime);
    }

    @Test
    public void testSetTime()
    {
        DateTime dateTime = new DateTime();
        dateTime.setTime(testTime);
        assertEquals(dateTime.getTime(), testTime);
    }

    @Test
    public void testGetTime()
    {
        DateTime dateTime = new DateTime(testDate, testTime);
        assertEquals(dateTime.getTime(), testTime);
    }
}
