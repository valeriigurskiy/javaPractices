package javapractice4.task1;

import java.util.Objects;

public class Car {
    private String brand;
    private int power;
    private Owner owner;
    private int price;
    private int year;

    @Override
    public String toString() {
        return "task1.Car{" +
                "brand='" + brand + '\'' +
                ", power=" + power +
                ", owner=" + owner +
                ", price=" + price +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return power == car.power &&
                price == car.price &&
                year == car.year &&
                Objects.equals(brand, car.brand) &&
                Objects.equals(owner, car.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, power, owner, price, year);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Car(String brand, int power, Owner owner, int price, int year) {
        this.brand = brand;
        this.power = power;
        this.owner = owner;
        this.price = price;
        this.year = year;
    }
}
