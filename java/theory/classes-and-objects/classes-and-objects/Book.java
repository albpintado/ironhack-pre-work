class Book {
  private String title;
  private String author;
  private int length;

  public Book(String title, String author, int length) {
    setTitle(title);
    setAuthor(author);
    setLength(length);
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return this.author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getLength() {
    return this.length;
  }

  public void setLength(int length) {
    if (length > 100) {
      this.length = length;
    } else {
      this.length = 100;
    }
  }

  public void getBookDetails() {
    System.out.println("The book " + getTitle() + " has a length of " + getLength());
  }
}
