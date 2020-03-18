package telran.controller;

import telran.data.User;

import java.util.Scanner;

import static telran.data.User.userNameVerification;

public class UserApp {
     static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        User u1 = new User("Misha");
        User u2 = new User("Olya");
        User u3 = new User("Jack");
        User u4 = new User("Yana");
        User u5 = new User("Vova");


        User[] users = {u1, u2, u3, u4, u5};

        getNameOfUser(users);

        scanner.close();
    }

    public static void getNameOfUser(User[] users) {
        System.out.println("Please,enter you name: ");
        String userName = scanner.nextLine();
        userNameVerification(users, userName);
    }
}