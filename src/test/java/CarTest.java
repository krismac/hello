import Components.Engine;
import Components.Tyres;
import Vehicle.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {


    Car car;
    Engine engine;
    Tyres tyres;

    @Before
    public void before() {
        car = new Car(100, "Blue", engine);
        engine = new Engine(1000, "Ford", 999);
    }
    @Test
    public void hasPrice() {
        assertEquals(100, car.getPrice(),0.1);
    }

    @Test
    public void hasColour() {
        assertEquals("Blue", car.getColour());
    }

    @Test
    public void canAssembleEngine() {
        Engine engine = new Engine(1000,"Ford", 999);
        assertEquals("My engine is assembled", car.getAssembly("engine"));
    }

    @Test
    public void canAssembleTyres(){
        Tyres tyres = new Tyres("Dunlop", "V500", 99);
        car.setAssemlyComponent(tyres);
        assertEquals("My tyres are assembled", car.getAssembly("tyres"));

    }

        //inherit from vehicle (price, colour)
        //includes engine/tyre

    //methods
}
