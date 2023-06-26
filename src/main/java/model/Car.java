package model;

public class Car {
    private int id;
    private  String model;
    private  String color;
    private Driver driver;
    private String year;

    public Car(int id, String model, String color, Driver driver, String year) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.driver = driver;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
