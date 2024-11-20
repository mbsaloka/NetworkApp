public class Comment {
  private String content;
  private String timestamp;
  private User author;

  // Konstruktor
  public Comment(String content, User author, String timestamp) {
      this.content = content;
      this.timestamp = timestamp;
      this.author = author;
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

  // Menampilkan komentar
  public void viewComment() {
      System.out.println("Comment by " + author.getName() + " on " + timestamp);
      System.out.println("Content: " + content);
  }
}
