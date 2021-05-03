class Employee extends Person {
  private String title;

  public Employee(String name, int age, String title) {
    super(name, age);
    this.setTitle(title);
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void sayHi() {
    super.sayHi();
    System.out.println("I am the " + this.getTitle() + ".");
  }
}
