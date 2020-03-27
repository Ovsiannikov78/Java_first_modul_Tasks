package telran.data;

import java.util.Scanner;

public class UserAdmin extends User {
    static Scanner scanner = new Scanner(System.in);
    private String password;

    public UserAdmin(String userName, int age, String password) {
        super(userName, age);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public boolean verificationByCode() {
        int count = 0;
        while (count < 3) {
            System.out.println("Please, enter you Password: ");
            String password = scanner.nextLine();
            if (password.equals(this.getPassword())) {
                System.out.println("Hello . You are successfully identified.");
                return true;
            } else {
                count++;
            }
        }
        System.out.println("You are not authorized. Please,check your password and try again.");
        return false;
    }

    public void updatePostByAdmin(Post[] posts) {
        boolean flag = false;
        if (this.verificationByCode()) {
            System.out.println("Please, enter ID of the post you want to change; ");
            int postId = Integer.parseInt(scanner.nextLine()); // 2 способ
            //scanner.nextLine();                              // 1 способ

            for (int i = 0; i < posts.length; i++) {
                if (posts[i].getPostID() == postId) {
                    System.out.println("Enter new content: ");
                    String newContent = scanner.nextLine();
                    posts[i].setContent(newContent);
                    System.out.println(postId + " content change to: " + posts[i].getContent());
                    flag = true;
                }
            }
        }
        if (!flag) {
            System.out.println("Unfortunately, no post with this ID. Please, try again.");
        }
    }
}
