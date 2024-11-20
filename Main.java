public class Main {
  public static void main(String[] args) {
      // Membuat Network
      Network network = new Network();

      // Membuat User dan AdminUser
      AdminUser admin = new AdminUser("admin01", "Admin");
      RegularUser user1 = new RegularUser("user01", "John Doe");

      // Menambahkan pengguna ke jaringan
      admin.addUserToNetwork(network, admin);
      admin.addUserToNetwork(network, user1);

      // Membuat dan menambah postingan
      user1.createPost(network, "Hello, world!", "2024-11-21");

      // Menampilkan semua pengguna dan postingan
      network.listUsers();
      network.listPosts();

      // Interaksi dengan postingan (memberikan like)
      Post post = network.getPosts().get(0);  // Mendapatkan postingan pertama
      post.addLike(user1);  // Memberikan like

      // Menampilkan postingan setelah memberi like
      post.viewPost();
  }
}
