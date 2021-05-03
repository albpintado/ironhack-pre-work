class Main {
  public static void main(String[] args) {
    Person me = new Person("Alberto", 23);
    Employee meWorker = new Employee("Alberto", 23, "Content Executive");

    me.sayHi();
    meWorker.sayHi();
  }
}
