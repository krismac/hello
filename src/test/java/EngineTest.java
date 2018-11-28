import Components.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before(){
        engine = new Engine (1000, "Ford", 999);

        //capacity
        //brand
        //price
    }

   @Test
    public void hasCapacity(){
        assertEquals(1000, engine.getCapacity());
    }

    @Test
    public void hasBrand(){
        assertEquals("Ford", engine.getBrand());
    }

    @Test
    public void hasPrice(){
        assertEquals(999, engine.getPrice(), 0.1);
    }
}
