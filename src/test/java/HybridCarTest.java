import Components.Engine;
import Components.Tyres;
import Vehicle.HybridCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

        HybridCar hybridcar;
        Engine engine;

        @Before
        public void before() {
            hybridcar = new HybridCar(100, "Blue", engine);
        }

        @Test
        public void hasPrice() {
            assertEquals(100, hybridcar.getPrice(),0.1);
        }

        @Test
        public void hasColour() {
            assertEquals("Blue", hybridcar.getColour());
        }

        @Test
        public void canAssemble() {
            Engine engine = new Engine(1000, "Ford", 999);
            assertEquals("", hybridcar.getAssembly(""));
        }
        @Test
        public void canAssembleEngine() {
            Engine engine = new Engine(1000,"Ford", 999);
            assertEquals("My engine is assembled", hybridcar.getAssembly("engine"));
        }

        @Test
        public void canAssembleTyres(){
            Tyres tyres = new Tyres("Dunlop", "V500", 99);
            hybridcar.setAssemlyComponent(tyres);
            assertEquals("My tyres are assembled", hybridcar.getAssembly("tyres"));

        }
        //inherit from vehicle (price, colour)
        //includes engine/tyre

        //methods
    }