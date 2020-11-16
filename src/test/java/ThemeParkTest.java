import attractions.Attraction;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    private ThemePark themePark;
    private RollerCoaster rollerCoaster;
    private TobaccoStall tobaccoStall;
    private Visitor visitor1;

    @Before
    public void before(){
        themePark = new ThemePark();
        rollerCoaster = new RollerCoaster("Splash Mountain",3);
        tobaccoStall = new TobaccoStall("Pantweed's Slim Panatella's","Bob", ParkingSpot.A1,5);
        visitor1 = new Visitor(25,185.00,50.00);
    }

    @Test
    public void canAddAttraction(){
        themePark.addAttraction(rollerCoaster);
        int actual = themePark.getAllReviewed().size();
        assertEquals(1,actual);
    }

    @Test
    public void canAddStall(){
        themePark.addStall(tobaccoStall);
        int actual = themePark.getAllReviewed().size();
        assertEquals(1,actual);
    }

    @Test
    public void visitorCanVisitAttraction(){
        themePark.visit(visitor1,rollerCoaster);
        assertEquals(1,visitor1.getVisitedAttractions().size());
    }

    @Test
    public void visitorCanVisitAttraction2(){
        themePark.visit(visitor1,rollerCoaster);
        assertEquals(1,rollerCoaster.getVisitCount());
    }
}
