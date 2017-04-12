package symphonymanagertest;

import io.github.vanm0012.symphonymanager.util.Date;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestDate
{
    final static String testDate = "2017-04-12";

    @Test
    public void testConstructor()
    {
        Date date = new Date();
        assertNotNull(date);
    }

    @Test
    public void testConstructorWithParams()
    {
        Date date = new Date(testDate);
        assertNotNull(date);
    }

    @Test
    public void testSetDate()
    {
        Date date = new Date();
        date.setDate(testDate);
        assertEquals(date.getDate(), testDate);
    }

    @Test
    public void testGetDate()
    {
        Date date = new Date(testDate);
        assertEquals(date.getDate(), testDate);
    }
}
