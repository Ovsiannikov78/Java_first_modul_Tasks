package telran.controller;

import telran.data.User;

import java.util.Scanner;

public class UserApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        User u1 = new User("Gena", 3457);
        User u2 = new User("Misha", 2345);
        User u3 = new User("Sveta", 6834);
        User u4 = new User("Tanya", 1290);
        User u5 = new User("Vova", 3434);

        User[] users = {u1, u2, u3, u4, u5};
        String nameUser = getNameOfUser();

        userIdentificationByName(users, nameUser);
        int secretCode = getSecretCodeOfUser();
        userIdentificationByCode(users, nameUser, secretCode);
        scanner.close();
    }

    public static String getNameOfUser() {
        System.out.println("Please, enter your name: ");
        return scanner.nextLine();
    }

    public static int getSecretCodeOfUser() {
        System.out.println("Please, enter your secret code: ");
        return scanner.nextInt();
    }

    public static int operationChoice() {
        System.out.println("If you want to get your secret code, please press 1");
        System.out.println("If you want to change your name, please press 2");
        return scanner.nextInt();
    }

    public static void updateUser(User user) {
        System.out.println("Please, enter new name: ");
        String newName = scanner.next();
        user.setName(newName);
        System.out.println("Your new name is: " + user.getName() + ".");
    }

    public static void makeUserOperationChoice(int operation, User user) {
        switch (operation) {
            case 1:
                System.out.println(user.getSecretCode());
                break;
            case 2:
                updateUser(user);
                break;
            default:
                System.out.println("Error! Wrong operation number");
        }
    }

    public static void userIdentificationByName(User[] users, String name) {
        if (User.getUserByName(users, name) == null) {
            System.out.println("You have entered wrong name, please try again. ");
        }
    }

    public static void userIdentificationByCode(User[] users, String name, int secretCode) {
        if (User.getUserByCode(users, secretCode) == null) {
            System.out.println("You have entered wrong secret code, please try again. ");

        } else {
            System.out.println("Hello Dear: " + name + "!");
            int operation = operationChoice();
            makeUserOperationChoice(operation, User.getUserByName(users, name));
        }
    }

}
