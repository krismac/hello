import Actors.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void before(){
        customer = new Customer("Dave", 9999.99);
    }

    @Test
    public void hasName(){
        assertEquals("Dave", customer.getName());

    }

    @Test
    public void hasMoney(){
        assertEquals(9999.99, customer.getMoney(),0.1);

    }

}
