class Main {
  public static void main(String[] args) {
    Car car1 = new Car("Audi");
    Car car2 = new Car("Mercedes", 12345);
    Car car3 = new Car("Opel", true, 12345);
    System.out.println("This car is an " + car1.getMake());
    System.out.println("This car is an " + car2.getMake());
    System.out.println("This car is an " + car3.getMake());
  }
}
