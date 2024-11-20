public class Main {
  public static void main(String[] args) {
      // Membuat Network
      Network network = new Network();

      // Membuat User dan AdminUser
      AdminUser admin = new AdminUser("admin01", "Admin");
      RegularUser user1 = new RegularUser("user01", "John Doe");
      RegularUser user2 = new RegularUser("user02", "Jane Smith");

      // Menambahkan pengguna ke jaringan
      network.addUser(admin);
      network.addUser(user1);
      network.addUser(user2);

      // Pengguna mengikuti satu sama lain
      user1.follow(user2);

      // Membuat dan menambah postingan
      user1.createPost(network, "Hello, world!", "2024-11-21");

      // Menambahkan komentar pada postingan
      Post post = network.getPost("2024-11-21");
      Comment comment1 = new Comment("Nice post!", user2, "2024-11-21 10:00");
      post.addComment(comment1);

      // Menampilkan semua pengguna dan postingan
      network.listUsers();
      network.listPosts();

      // Menampilkan informasi tentang followers dan following
      user1.viewFollowers();
      user1.viewFollowing();

      // Menampilkan komentar pada postingan
      post.viewPost();
  }
}
