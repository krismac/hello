import Dealership.Dealership;
import Parents.Vehicle;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;

    @Before
    public void before(){
        ArrayList<Vehicle> VehicleStock = new ArrayList<>();
        dealership = new Dealership(200000, VehicleStock);
    }

    @Test
    public void hasTill() {
        assertEquals(200000, dealership.getTill(),0.1);
    }

    @Test
    public void hasVehicleStock(){
        
        assertEquals(2, dealership.vehicleStock().size());
    }
}
