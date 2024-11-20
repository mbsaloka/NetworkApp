import java.util.HashSet;
import java.util.Set;

public class User {
    private String username;
    private String name;
    private String status;
    private Set<User> followers;
    private Set<User> following;

    // Konstruktor
    public User(String username, String name) {
        this.username = username;
        this.name = name;
        this.status = "Hey, I'm using this app!";
        this.followers = new HashSet<>();
        this.following = new HashSet<>();
    }

    // Getter dan Setter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    // Mengikuti pengguna lain
    public void follow(User user) {
        if (!this.equals(user)) {  // Tidak bisa mengikuti diri sendiri
            following.add(user);
            user.addFollower(this);
        }
    }

    // Menambah follower
    public void addFollower(User user) {
        followers.add(user);
    }

    // Menampilkan daftar followers dan following
    public void viewFollowers() {
        System.out.println("Followers of " + name + ": ");
        for (User follower : followers) {
            System.out.println(follower.getName());
        }
    }

    public void viewFollowing() {
        System.out.println(name + " is following: ");
        for (User user : following) {
            System.out.println(user.getName());
        }
    }

    // Menampilkan profil pengguna
    public void viewProfile() {
        System.out.println("Username: " + username);
        System.out.println("Name: " + name);
        System.out.println("Status: " + status);
        viewFollowers();
        viewFollowing();
    }
}
