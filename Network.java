import java.util.ArrayList;
import java.util.List;

public class Network {
    private List<User> users;
    private List<Post> posts;

    // Konstruktor
    public Network() {
        this.users = new ArrayList<>();
        this.posts = new ArrayList<>();
    }

    // Menambah pengguna
    public void addUser(User user) {
        users.add(user);
    }

    // Menghapus pengguna
    public void removeUser(User user) {
        users.remove(user);
    }

    // Menambah postingan
    public void addPost(Post post) {
        posts.add(post);
    }

    // Menghapus postingan
    public void removePost(Post post) {
        posts.remove(post);
    }

    // Menampilkan semua pengguna
    public void listUsers() {
        for (User user : users) {
            user.viewProfile();
        }
    }

    // Menampilkan semua postingan
    public void listPosts() {
        for (Post post : posts) {
            post.viewPost();
        }
    }
}
