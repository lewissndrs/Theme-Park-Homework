package attractions;

import people.Visitor;

public class Dodgems extends Attraction {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    public void sellTicket(Visitor visitor) {
        double ticketPrice = 4.50;
        if (visitor.getAge() < 12) {
            visitor.takeMoney(ticketPrice/2);
        } else
            visitor.takeMoney(ticketPrice);
    }
}
