package se.lexicon.vehicles;

public class Truck extends Vehicle {
    int maxWeight;
    int length;

    @Override
    public void drive() {
        System.out.println("My truck is driving.");
    }
}
