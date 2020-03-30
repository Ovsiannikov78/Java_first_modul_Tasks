package telran.dao;

import telran.data.Car;

public class CarFleet {
    private Car[] cars;
    private int size;

    public CarFleet(int capacity){
        cars = new Car[capacity];
        size = 0;
    }

    public int getSize() {
        return size;
    }
    public boolean addCar(Car car){
        if(size < cars.length){                // Хотелось бы ещё раз детально разобрать этот метод
            cars[size] = car;
            size++;
            return true;
        }
        return false;
    }
    public boolean deleteCar(Car car){
        for (int i = 0; i < size ; i++) {
            if(cars[i].equals(car)) {
               cars[i] = cars[size - 1];
               size--;
               return true;
            }
        }
        return false;
    }
    public void display(){
        for (int i = 0; i < size; i++) {
            System.out.println(cars[i]);
        }
    }
    public void displayCarByColor(){
        for (int i = 0; i < size ; i++) {
            System.out.println(cars[i].getColor());
        }
    }
    public void getNewestCar(){
        int newestCar = 0;
        for (int i = 0; i < size - 1; i++) {
            if(cars[i].getYearOfManufacture() > newestCar){   // хотел бы вывести машину со всеми полями, типа cars[i]
                newestCar = cars[i].getYearOfManufacture();   // Затупил, и никак не могу это сделать
            }
        }
        System.out.println("Newest car is: " +  newestCar + " year of manufacture");
    }

    public void getBrandCount(CarFleet carFleet) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (cars[i].getBrand().equals(cars[j].getBrand())) {     // тут я совсем потерялся ???
                }
            }
            System.out.println("This brand is repeated " + " times.");
        }
    }
}
