public class AdminUser extends User {
  public AdminUser(String username, String name) {
      super(username, name);
  }

  // Menambah pengguna baru
  public void addUserToNetwork(Network network, User user) {
      network.addUser(user);
  }

  // Menghapus pengguna
  public void removeUserFromNetwork(Network network, User user) {
      network.removeUser(user);
  }
}