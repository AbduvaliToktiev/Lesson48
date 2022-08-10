package exercise3;

public class Pear extends Fruit{
    public Pear(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return getName();
    }
}
