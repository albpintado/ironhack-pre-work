class NumberInWord {
  public static void main(String[] args) {
    printNumberToWord(17);
  }

  public static void printNumberToWord(int number) {
    if (number >= 0 && number <= 19) {
      System.out.println(convertSimpleNumberToWord(number));
    } else if (number >= 10 && number <= 99) {
      System.out.println(convertComplexNumberToWord(number));
    }
  }

  public static String convertSimpleNumberToWord(int number) {
    String[] simpleNumbers = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
        "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
    return simpleNumbers[number];
  }

  public static String convertComplexNumberToWord(int number) {
    String[] oneDigitNumbers = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
    String[] dozens = { "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
    int firstDigit = number / 10;
    int secondDigit = number % 10;
    return dozens[firstDigit - 2] + "-" + oneDigitNumbers[secondDigit];
  }
}
