public class RegularUser extends User {
  public RegularUser(String username, String name) {
      super(username, name);
  }

  // Membuat postingan
  public void createPost(Network network, String content, String timestamp) {
      Post post = new Post(content, this, timestamp);
      network.addPost(post);
  }
}