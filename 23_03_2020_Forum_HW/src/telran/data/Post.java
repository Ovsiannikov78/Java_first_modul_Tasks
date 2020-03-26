package telran.data;


public class Post {
    private User author;
    private static int postID;
    private String title;
    private static String content;
    private static int likes = 0;

    public Post(User author, int postID, String title, String content) {
        this.author = author;
        Post.postID = postID;
        this.title = title;
        Post.content = content;
    }

    public User getAuthor() {
        return author;
    }

    public int getPostID() {
        return postID;
    }

    public String getTitle() {
        return title;
    }

    public static String getContent() {
        return content;
    }

    public static int getLikes() {
        return likes;
    }

    public static void setContent(String content) {
        Post.content = content;
    }

    @Override
    public String toString() {
        return "Post ID - " + postID +
                ": posted by - " + author +
                title.toUpperCase() + " : "
                + content + "\n" +
                "likes: " + likes +
                "\n";
    }

    public int addLike() {
        return likes++;
    }

    public int disLike() {
        return (likes < 1) ? 0 : likes--;
    }

    public static void printPostArray(Object[] objects) {
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] != null) {
                System.out.println(objects[i]);
            }
        }
    }
}


