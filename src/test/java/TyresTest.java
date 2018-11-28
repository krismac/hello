import Components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest {


    Tyres tyres;

    @Before
    public void before(){
        tyres = new Tyres ("Dunlop", "V500", 99);

    }

    @Test
    public void hasMake(){
        assertEquals(1000, tyres.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Ford", tyres.getModel());
    }

    @Test
    public void hasPrice(){
        assertEquals(999, tyres.getPrice(), 0.1);
    }
}
