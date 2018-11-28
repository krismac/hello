import Components.Engine;
import Components.Tyres;
import Vehicle.ElectricCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

        ElectricCar electricCar;
        Engine engine;

        @Before
        public void before() {
            electricCar = new ElectricCar(100, "Blue", engine);
        }

        @Test
        public void hasPrice() {
            assertEquals(100, electricCar.getPrice(),0.1);
        }

        @Test
        public void hasColour() {
            assertEquals("Blue", electricCar.getColour());
        }

        @Test
        public void canAssemble() {
            Engine engine = new Engine(1000, "Ford",999);
            assertEquals("", electricCar.getAssembly(""));
        }
    //methods
        @Test
        public void canAssembleEngine() {
            Engine engine = new Engine(1000,"Ford", 999);
            assertEquals("My engine is assembled", electricCar.getAssembly("engine"));
        }

        @Test
        public void canAssembleTyres(){
            Tyres tyres = new Tyres("Dunlop", "V500", 99);
            electricCar.setAssemlyComponent(tyres);
            assertEquals("My tyres are assembled", electricCar.getAssembly("tyres"));

        }
            //inherit from vehicle (price, colour)
        //includes engine/tyre

        //methods
    }