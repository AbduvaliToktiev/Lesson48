package exercise2;

import java.util.Objects;

public class Car {
    private Integer id;
    private String autoNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAutoNumber() {
        return autoNumber;
    }

    public void setAutoNumber(String autoNumber) {
        this.autoNumber = autoNumber;
    }

    @Override
    public String toString() {
        return  "CarsID: " + this.id + "\n" +
                "AutoNumber: " + this.autoNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, autoNumber);
    }
}
