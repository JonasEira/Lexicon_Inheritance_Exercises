package se.lexicon.vehicles;

public class Motorcycle extends Vehicle{
    int volume;
    int speed;

    @Override
    public void drive() {
        System.out.println("My motorcycle is driving.");
    }
}
