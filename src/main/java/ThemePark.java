import attractions.Attraction;
import attractions.RollerCoaster;
import behaviours.IReviewed;
import people.Visitor;
import stalls.Stall;
import stalls.TobaccoStall;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ThemePark {
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;


    public ThemePark() {
        this.attractions = new ArrayList<Attraction>();
        this.stalls = new ArrayList<Stall>();
    }

    public ArrayList<IReviewed> getAllReviewed(){
        ArrayList<IReviewed> reviewed = new ArrayList<IReviewed>();
        reviewed.addAll(this.attractions);
        reviewed.addAll(this.stalls);
        return reviewed;
    }

    public void visit (Visitor visitor, Attraction attraction) {
        attraction.incrementVisitCount();
        visitor.addAttraction(attraction);
    }

    public void addAttraction(Attraction attraction) {
        this.attractions.add(attraction);
    }

    public void addStall(Stall stall) {
        this.stalls.add(stall);
    }
}
