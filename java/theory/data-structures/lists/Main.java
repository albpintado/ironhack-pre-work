import java.util.List;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    List<String> carsList = new ArrayList<>();
    carsList.add("Opel");
    carsList.add("Ford");
    carsList.add("Toyota");
    carsList.add("Renault");

    for (String car : carsList) {
      System.out.println(car);
    }

    carsList.remove(2);

    for (String car : carsList) {
      System.out.println(car);
    }
  }
}
