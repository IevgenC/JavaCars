package cars;

import cars.Brands.*;

import java.util.ArrayList;

/**
 * Created by Ievgen on 07/10/2015.
 */
public class Actions {
    Audi audi = new Audi();
    BMW bmw = new BMW();
    Ferrari ferrari = new Ferrari();
    KIA kia = new KIA();
    Porsche porsche = new Porsche();

    public ArrayList createCarsList(){
        ArrayList<Cars> cars = new ArrayList();
        cars.add(audi);
        cars.add(bmw);
        cars.add(ferrari);
        cars.add(kia);
        cars.add(porsche);
        return cars;
    }

    public void printCharacteristics(){
        System.out.println("Ferrari max speed: " + ferrari.getMaxSpeed() + " avg speed: " + ferrari.getAvgSpeed());
        System.out.println("KIA max speed: " + kia.getMaxSpeed() + " avg speed: " + kia.getAvgSpeed());
        System.out.println("Porsche max speed: " + porsche.getMaxSpeed() + " avg speed: " + porsche.getAvgSpeed());
        System.out.println("Audi max speed: " + audi.getMaxSpeed() + " avg speed: " + audi.getAvgSpeed());
        System.out.println("BMW max speed: " + bmw.getMaxSpeed() + " avg speed: " + bmw.getAvgSpeed());
    }

    public void printCarsByAvgSpeed() {
        SortCars sortCars = new SortCars();
        ArrayList<Cars> carsByAvgSpeed = sortCars.byAvgSpeed();
        System.out.println("\nCars by average speed:\n");
        for (Cars car : carsByAvgSpeed){
            System.out.println(car.getName());
        }
    }

    public void printCarsByMaxSpeed(){
        SortCars sortCars = new SortCars();
        ArrayList<Cars> carsByMaxSpeed = sortCars.byMaxSpeed();
        System.out.println("\nCars by maximum speed:\n");
        for (Cars car : carsByMaxSpeed){
            System.out.println(car.getName());
        }
    }
}
