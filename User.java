public class User {
    private String username;
    private String name;
    private String status;

    // Konstruktor
    public User(String username, String name) {
        this.username = username;
        this.name = name;
        this.status = "Hey, I'm using this app!";
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

    // Menampilkan informasi profil
    public void viewProfile() {
        System.out.println("Username: " + username);
        System.out.println("Name: " + name);
        System.out.println("Status: " + status);
    }
}
