import java.util.HashSet;
import java.util.Set;

public class Post {
    private String content;
    private String timestamp;
    private User author;
    private Set<User> likes;
    private Set<Comment> comments;  // Menambahkan set komentar

    // Konstruktor
    public Post(String content, User author, String timestamp) {
        this.content = content;
        this.timestamp = timestamp;
        this.author = author;
        this.likes = new HashSet<>();
        this.comments = new HashSet<>();
    }

    // Getter dan Setter
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    // Menambah atau menghapus like
    public void addLike(User user) {
        likes.add(user);
    }

    public void removeLike(User user) {
        likes.remove(user);
    }

    // Menambah komentar
    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public void removeComment(Comment comment) {
        comments.remove(comment);
    }

    // Menampilkan informasi postingan
    public void viewPost() {
        System.out.println("Post by " + author.getName() + " on " + timestamp);
        System.out.println("Content: " + content);
        System.out.println("Likes: " + likes.size());
        System.out.println("Comments: ");
        for (Comment comment : comments) {
            comment.viewComment();
        }
    }
}
