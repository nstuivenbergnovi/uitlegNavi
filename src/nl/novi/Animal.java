package nl.novi;

public abstract class Animal {

    protected int distanceTraveled;

    public Animal() {
    }

    protected void walk() {
        distanceTraveled += 1;
    }

}
