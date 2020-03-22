package telran.data;

public class User {
    private String name;
    private int secretCode;

    public User(String name, int secretCode) {
        this.name = name;
        this.secretCode = secretCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSecretCode() {
        return secretCode;
    }



    public static User getUserByName(User[] users, String name){

        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    public static User getUserByCode(User[] users, int secretCode){
        for (User user : users) {
            if (user.getSecretCode() == (secretCode)) {
                return user;
            }
        }
        return null;
    }
    @Override
    public String toString() {
        return "User: " + name + ", Code:  " + secretCode + '.';
    }
}
