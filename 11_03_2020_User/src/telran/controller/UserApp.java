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
        User u5 = new User("Volodya", 3434);

        User[] users = {u1, u2, u3, u4, u5};
        String nameUser = getNameOfUser();
        userCollaboration(users, nameUser);
        scanner.close();
    }

    public static String getNameOfUser(){
        System.out.println("Please, enter your name: ");
        String userName = scanner.nextLine();
        return userName;
    }
    public static int operationChoise(){
        System.out.println("If you want to get your secret code, please press 1");
        System.out.println("If you want to change your name, please press 2");
        int operation = scanner.nextInt();
        return operation;
    }

    public static void updateUser(User user){
        System.out.println("Please, enter new name: ");
        String newName = scanner.next();
        user.setName(newName);
        System.out.println("Your new name is: " + user.getName() + ".");
    }

    public static void makeUserOperationChoice(int operation, User user){
        switch (operation){
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
    public static void userCollaboration(User[] users, String name){
        if(User.getUserByName(users,name) == null){
            System.out.println("Sorry, we don#t know you");
        }else{
            System.out.println("Hello dear: " + name + "!.");
            int operation = operationChoise();
            makeUserOperationChoice(operation, User.getUserByName(users, name));
        }
    }

}
