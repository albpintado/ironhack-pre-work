class CalculateTheAverage {
  public static void main(String[] args) {
    int[] numberList = { 9, 7, 0 };
    System.out.println(calculateTheAverage(numberList));
  }

  public static double calculateTheAverage(int[] numberList) {
    double accumulator = 0.0;
    for (int number : numberList) {
      accumulator += number;
    }
    return accumulator / numberList.length;
  }
}
