package cars;

import java.util.Comparator;

/**
 * Created by Ievgen on 04/10/2015.
 */
public abstract class Cars {
    protected Integer maxSpeed;
    protected Integer avgSpeed;
    protected String name;

    public Integer getAvgSpeed() {
        return avgSpeed;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public String getName() {
        return name;
    }
}
