package telran.data;

import java.util.Scanner;

public class UserAdmin extends User {
    static Scanner scanner = new Scanner(System.in);
    private static String password;

    public UserAdmin(String userName, int age, String password) {
        super(userName, age);
        UserAdmin.password = password;
    }

    public static String getPassword() {
        return password;
    }

    public static boolean verificationByCode() {
        int count = 0;
        while (count < 3) {
            System.out.println("Please, enter you Password: ");
            String password = scanner.nextLine();
            if (password.equals(UserAdmin.getPassword())) {
                System.out.println("Hello . You are successfully identified.");
                return true;
            } else {
                count++;
            }
        }
        System.out.println("You are not authorized. Please,check your password and try again.");
        return false;
    }

    public static void updatePostByAdmin(Post[] posts) {
        boolean flag = false;
        if (verificationByCode()) {
            System.out.println("Please, enter ID of the post you want to change; ");
            int postId = scanner.nextInt();
            System.out.println(postId);
            for (int i = 0; i < posts.length; i++) {
                if (posts[i].getPostID() == postId) {
                    System.out.println("Enter new content: ");
                    String newContent = scanner.nextLine();
                    Post.setContent(newContent);
                    System.out.println(postId + " content change to: " + Post.getContent());
                    flag = true;
                }
            }
        }
        if (!flag) {
            System.out.println("Unfortunately, no post with this ID. Please, try again.");
        }
    }
}
