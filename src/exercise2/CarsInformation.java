package exercise2;

import java.util.Objects;

public class CarsInformation {
    private Integer id;
    private Integer carsId;
    private Integer yearOfIssue;
    private String model;
    private Integer price;
    private String color;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCarsId() {
        return carsId;
    }

    public void setCarsId(Integer carsId) {
        this.carsId = carsId;
    }

    public Integer getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(Integer yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, carsId, yearOfIssue, model, price, color);
    }

    @Override
    public String toString() {
        return  "\nAutoID: " + this.carsId + "\n" +
                "ID: " + this.id + "\n" +
                "YearOfIssue: " + this.yearOfIssue + "\n" +
                "Model: " + this.model + "\n" +
                "Price: " + this.price + "\n" +
                "Color: " + this.color;
    }
}


