class IsOddOrEven {
  public static void main(String[] args) {
    if (isOdd(5)) {
      System.out.println("Odd Number");
    } else {
      System.out.println("Even Number");
    }
  }

  public static boolean isOdd(int number) {
    if (number % 2 == 0) {
      return true;
    }
    return false;
  }
}
