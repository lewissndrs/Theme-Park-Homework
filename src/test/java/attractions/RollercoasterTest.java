package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(13,145.00,13.00);
        visitor2 = new Visitor(13,143.00,13.00);
        visitor3 = new Visitor(20,210.00,26.8);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canAllowVisitorOnRideIfOver12And145cm() {
        assertEquals(true,rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void cannotAllowVisitorOnRideIfNotTallEnough(){
        assertEquals(false,rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void canChargeVisitorsToRide(){
        rollerCoaster.sellTicket(visitor1);
        assertEquals(4.6,visitor1.getMoney(),0.01);
    }

    @Test
    public void chargesTallPeopleDouble(){
        rollerCoaster.sellTicket(visitor3);
        assertEquals(10.0,visitor3.getMoney(),0.01);
    }
}
