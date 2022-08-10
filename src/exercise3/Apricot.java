package exercise3;

public class Apricot extends Fruit{
    public Apricot(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return getName();
    }
}
