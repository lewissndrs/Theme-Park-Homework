package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }


    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 12 && visitor.getHeight() >= 145.00 ) {
            return true;
        } else {
            return false;
        }
    }

    public void sellTicket(Visitor visitor) {
        double ticketPrice = 8.4;
        if(visitor.getHeight() > 200.00) {
            visitor.takeMoney(ticketPrice * 2);
        } else {
            visitor.takeMoney(ticketPrice);
        }
    }
}
