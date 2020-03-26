package telran.controller;

import telran.dao.Forum;
import telran.data.Post;
import telran.data.User;
import telran.data.UserAdmin;

import static telran.data.Post.printPostArray;
import static telran.data.UserAdmin.*;

public class PostApp {
    public static void main(String[] args) {

        UserAdmin admin = new UserAdmin("Valentin", 37, "Val-1234");


        User author1 = new User("Misha", 34);
        User author2 = new User("Gina", 17);
        User author3 = new User("Jack", 26);
        User author4 = new User("Igor", 46);


        Post p1 = new Post(author1, 1111, "Happy Birthday !", "Happy Birthday dear friend. Best wishes to you.");
        Post p2 = new Post(author2, 1112, "Vacation", "In two weeks start my vacation. I'm very happy and exciting !!!");
        Post p3 = new Post(author2, 1113, "Vacation", "There is exactly one week till my vacation start !!!");
        Post p4 = new Post(author2, 1122, "Vacation", "F...ing corona. All flights canceled. I'm so upset.");
        Post p5 = new Post(author3, 1133, "Corona virus panic", "WTF, I can't buy toilet paper anywhere.");
        Post p6 = new Post(author3, 1144, "Corona virus panic", "I found a place, where I can buy it. I will take a lot.");
        Post p7 = new Post(author3, 1115, "Corona virus panic", "What? Allowed to take only one package.");
        Post p8 = new Post(author3, 1125, "Corona virus panic", "What? The saleswoman called me a hamster.");
        Post p9 = new Post(author4, 1136, "Corona virus", "Stay at home. Save lives.");
        Post p10 = new Post(author4, 1116, "Corona virus", "Enjoy your time with family. Watch the serials.");

        Post[] posts = new Post[]{p1, p2, p3, p4, p5, p6, p7, p8, p9, p10};


        Forum myForum = new Forum(20);
        myForum.addPost(p1);
        myForum.addPost(p2);
        myForum.addPost(p3);
        myForum.addPost(p4);
        myForum.addPost(p5);
        myForum.addPost(p6);
        myForum.addPost(p7);
        myForum.addPost(p8);
        myForum.addPost(p9);
        myForum.addPost(p10);

        p9.getLikes();
        p9.getLikes();
        p9.getLikes();

        Post[] postByAuthor = myForum.getPostByAuthor(author2, 4);
        printPostArray(postByAuthor);   /* метод не работатет. Так как в самом методе в Forum параметр User author
                                          не сравнивается через equals с другим параметром(String)*/


        System.out.println("----------------");
        //printPostArray(posts);

        System.out.println("-----------------");
        //verificationByCode();

        //System.out.println("-----------------");
        //updatePostByAdmin(posts);                    // этот метод в UserAdmin не работает. Почему не понимаю
    }


}
