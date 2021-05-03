class NumberInWordWithIfElse {
  public static void main(String[] args) {
    printNumberToWord(6);
  }

  public static void printNumberToWord(int number) {
    if (number == 1) {
      System.out.println("ONE");
      return;
    } else if (number == 2) {
      System.out.println("TWO");
      return;
    } else if (number == 3) {
      System.out.println("THREE");
      return;
    } else if (number == 4) {
      System.out.println("FOUR");
      return;
    } else if (number == 5) {
      System.out.println("FIVE");
      return;
    } else if (number == 6) {
      System.out.println("SIX");
      return;
    } else if (number == 7) {
      System.out.println("SEVEN");
      return;
    } else if (number == 8) {
      System.out.println("EIGHT");
      return;
    } else if (number == 9) {
      System.out.println("NINE");
      return;
    } else {
      System.out.println("OTHER");
      return;
    }
  }
}
