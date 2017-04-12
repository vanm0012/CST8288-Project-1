package symphonymanagertest;

import io.github.vanm0012.symphonymanager.domain.Composition;
import io.github.vanm0012.symphonymanager.domain.Movement;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestComposition
{
    final static Movement testMovement = new Movement("Movement 1", 123);
    final static String testComposer = "Composer Name";
    final static String testName = "Composition 1";
    final static String testId = "comp_1";

    @Test
    public void testConstructor()
    {
        Composition composition = new Composition();
        assertNotNull(composition);
    }

    @Test
    public void testConstructorWithParams()
    {
        ArrayList<Movement> movements = new ArrayList<Movement>();
        movements.add(testMovement);
        Composition composition = new Composition(testComposer, testName, testId, movements);
        assertNotNull(composition);
    }

    @Test
    public void testSetMovements()
    {
        Composition composition = new Composition();
        ArrayList<Movement> movements = new ArrayList<>();
        movements.add(testMovement);
        composition.setMovements(movements);
        assertEquals(composition.getMovements(), movements);
    }
}
