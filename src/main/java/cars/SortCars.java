package cars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Ievgen on 04/10/2015.
 */
public class SortCars {

    public static final Comparator<Cars> MAX_SPEED = new Comparator<Cars>() {
        public int compare(Cars car1, Cars car2) {
            return car2.getMaxSpeed().compareTo(car1.getMaxSpeed());
        }
    };

    public static final Comparator<Cars> AVG_SPEED = new Comparator<Cars>() {
        public int compare(Cars car1, Cars car2) {
            return car2.getAvgSpeed().compareTo(car1.getAvgSpeed());
        }
    };

    public ArrayList getCarsList() {
        Actions actions = new Actions();
        return actions.createCarsList();
    }

    public ArrayList byAvgSpeed() {
        ArrayList cars = getCarsList();
        Collections.sort(cars, AVG_SPEED);
        return cars;
    }

    public ArrayList byMaxSpeed() {
        ArrayList cars = getCarsList();
        Collections.sort(cars, MAX_SPEED);
        return cars;
    }

}
