package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitor1 = new Visitor(23,185.00,14.50);
        visitor2 = new Visitor(11,185.00,14.50);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void canChargeVisitorsToRide(){
        dodgems.sellTicket(visitor1);
        assertEquals(10.0,visitor1.getMoney(),0.01);
    }

    @Test
    public void chargeHalfPriceToUnder12s(){
        dodgems.sellTicket(visitor2);
        assertEquals(12.25,visitor2.getMoney(),0.01);
    }
}
