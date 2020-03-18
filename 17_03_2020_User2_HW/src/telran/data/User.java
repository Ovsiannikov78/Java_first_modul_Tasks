package telran.data;



public class User {
    private  String name;

    public User(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public static void userNameVerification(User[] users, String userName) {
        boolean flag = false;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getName().equals(userName)) {
                System.out.println("Hi " + userName + ", how can I help you?");
                flag = true;
            }
        }
        if(!flag)
        System.out.println("Sorry, we can't identify you :-(");
    }

}







