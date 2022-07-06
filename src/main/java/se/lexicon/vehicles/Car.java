package se.lexicon.vehicles;

public class Car extends Vehicle {
    int passengers;
    int type;

    @Override
    public void drive() {
        System.out.println("My car is driving.");
    }
}
