import Actors.Dealer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {


    Dealer dealer;

    //id
    @Before
    public void before(){
        dealer = new Dealer(55);

    }

    @Test
    public void hasIdentifier(){
        assertEquals(55, dealer.getIdentifier());
    }


    //methods


}
