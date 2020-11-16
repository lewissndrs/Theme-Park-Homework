package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1,5);
        visitor1 = new Visitor(11,200.00,150.0);
        visitor2 = new Visitor(19,100.00,30.00);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void canSellToOver18(){
        assertEquals(true,tobaccoStall.isAllowedTo(visitor2));
    }

    @Test
    public void cannotSellToUnder18(){
        assertEquals(false,tobaccoStall.isAllowedTo(visitor1));
    }

    @Test
    public void hasRating(){
        assertEquals(5,tobaccoStall.getRating());
    }
}
