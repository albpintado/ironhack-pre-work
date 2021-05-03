class Main {
  public static void main(String[] args) {
    String fullname = getFullname("Alberto", "Pintado");
    System.out.println(fullname);
  }

  private static String getFullname(String firstName, String lastName) {
    return firstName + " " + lastName;
  }
}
