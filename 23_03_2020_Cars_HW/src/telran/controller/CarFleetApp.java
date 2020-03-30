package telran.controller;

import telran.dao.CarFleet;
import telran.data.Car;



public class CarFleetApp {

    public static void main(String[] args) {

        Car car1 = new Car ("Volvo", "XC90 B5 Mild-Hybrid", "metallic", "diesel", 2018, 60.000);
        Car car2 = new Car ("Volvo", "XC90 T8 TWIN ENGINE", "black", "electricity", 2019, 71.900);
        Car car3 = new Car ("Toyota", "Mirai", "platinum-silver", "hydrogen", 2020, 79.000);
        Car car4 = new Car ("Mercedes-Benz", "GLC 300", "black", "petrol", 2017, 59.500);
        Car car5 = new Car ("Mitsubishi", "Grandis", "grey", "petrol", 2008, 9.500);



        CarFleet carFleet = new CarFleet(150);
        carFleet.addCar(car1);
        carFleet.addCar(car2);
        carFleet.addCar(car3);
        carFleet.addCar(car4);
        carFleet.addCar(car5);



        //carFleet.deleteCar(car2);

        System.out.println("-------- display ---------");
        carFleet.display();

        System.out.println("-------- displayCarByColor ---------");
        carFleet.displayCarByColor();

        System.out.println("-------- getNewestCar ---------");
        carFleet.getNewestCar();

       // System.out.println("-------- getBrandCount ---------");
        //carFleet.getBrandCount(carFleet);
    }
}
