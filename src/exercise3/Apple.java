package exercise3;

public class Apple extends Fruit{

    public Apple(String name) {
        super(name);
    }



    @Override
    public String toString() {
      return getName();
    }
}
