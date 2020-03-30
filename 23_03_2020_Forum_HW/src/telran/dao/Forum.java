package telran.dao;

import telran.data.Post;
import telran.data.User;
import telran.data.UserAdmin;


public class Forum {

    private Post[] posts;
    private int size;

    public Forum(int capacity) {
        posts = new Post[capacity];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean addPost(Post post) {
        if (size < posts.length) {
            posts[size] = post;
            size++;
            return true;
        }
        return false;
    }

    public boolean deletePost(int id) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getPostID() == id) {
                posts[i] = posts[size - 1];
                size--;
                return true;
            }
        }
        return false;
    }

    public void displayPost() {
        for (int i = 0; i < size; i++) {
            System.out.println(posts[i]);
        }
    }

    public Post[] getPostByAuthor(User author, int numberOfPost) {
        Post[] authorPosts = new Post[numberOfPost];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (posts[i].getAuthor().equals(author) && j < numberOfPost) {
                authorPosts[j] = posts[i];
                j++;
            }
        }
        return authorPosts;
    }

    public int getCountOfLikes(String title) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println("User " + posts[i].getAuthor().getUserName() + " has " + posts[i].getLikes() + " likes.");
                return posts[i].getLikes();
            }
        }
        return 0;
    }
}
