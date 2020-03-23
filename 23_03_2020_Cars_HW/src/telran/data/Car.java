package telran.data;

import java.text.DecimalFormat;
import java.util.Objects;

public class Car {
    DecimalFormat df = new DecimalFormat("0.000");    // есть вопрос по работе этого метода
    private String brand;
    private String model;
    private String color;
    private String typeOfFuel;
    private int yearOfManufacture;
    private double prise;


    public Car(String brand, String model, String color, String typeOfFuel, int yearOfManufacture, double prise) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.typeOfFuel = typeOfFuel;
        this.yearOfManufacture = yearOfManufacture;
        this.prise = prise;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public double getPrise() {
        return prise;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return yearOfManufacture == car.yearOfManufacture &&
                Double.compare(car.prise, prise) == 0 &&
                Objects.equals(brand, car.brand) &&
                Objects.equals(model, car.model) &&
                Objects.equals(color, car.color) &&
                Objects.equals(typeOfFuel, car.typeOfFuel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, color, typeOfFuel, yearOfManufacture, prise);
    }

    @Override
    public String toString() {

        return "Car ------- " +
                " brand - " + brand + " ; " +
                " model - " + model + " ; " +
                " color - " + color + " ; " +
                " typeOfFuel - " + typeOfFuel + " ; " +
                " yearOfManufacture - " + yearOfManufacture + " ; " +
                " prise  - " + (df.format(prise))  +
                " €";

    }
}
