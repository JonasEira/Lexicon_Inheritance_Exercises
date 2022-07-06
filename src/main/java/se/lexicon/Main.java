package se.lexicon;

import se.lexicon.vehicles.Car;
import se.lexicon.vehicles.Motorcycle;
import se.lexicon.vehicles.Truck;
import se.lexicon.vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle truck = new Truck();
        Vehicle motorcycle = new Motorcycle();

        car.drive();
        truck.drive();
        motorcycle.drive();
    }
}