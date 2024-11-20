import java.util.HashMap;
import java.util.Map;

public class Network {
    private Map<String, User> users;
    private Map<String, Post> posts;

    // Konstruktor
    public Network() {
        this.users = new HashMap<>();
        this.posts = new HashMap<>();
    }

    // Menambah pengguna
    public void addUser(User user) {
        users.put(user.getUsername(), user);
    }

    // Menghapus pengguna
    public void removeUser(User user) {
        users.remove(user.getUsername());
    }

    // Mendapatkan pengguna
    public User getUser(String username) {
        return users.get(username);
    }

    // Menambah postingan
    public void addPost(Post post) {
        posts.put(post.getTimestamp(), post);
    }

    // Menghapus postingan
    public void removePost(Post post) {
        posts.remove(post.getTimestamp());
    }

    // Mendapatkan postingan
    public Post getPost(String timestamp) {
        return posts.get(timestamp);
    }

    // Menampilkan semua pengguna
    public void listUsers() {
        for (User user : users.values()) {
            user.viewProfile();
        }
    }

    // Menampilkan semua postingan
    public void listPosts() {
        for (Post post : posts.values()) {
            post.viewPost();
        }
    }
}
