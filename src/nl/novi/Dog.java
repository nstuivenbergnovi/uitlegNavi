package nl.novi;

public class Dog extends Animal {

    public int getDistanceTraveled() {
        return super.distanceTraveled;
    }

    @Override
    public void walk() {
        distanceTraveled += 2;
    }
}
