import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

class FindMaximum {
  public static void main(String[] args) {
    int[] numberList = {2, -6, 101, 100, 7};
    System.out.println(maximum(numberList));
  }

  public static int maximum(int[] numberList) {
    int maximumNumber = numberList[0];
    for (int number : numberList) {
      if (number > maximumNumber) {
        maximumNumber = number;
      }
    }
    return maximumNumber;
  }
}