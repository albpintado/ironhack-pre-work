import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Pet nilo = new Pet("Nilo", 6);
    Pet alberto = new Pet("Alberto", 23);
    List<Pet> paolasPets = new ArrayList();
    paolasPets.add(nilo);
    paolasPets.add(alberto);

    Pet paola = new Pet("Paola", 22);
    List<Pet> albertosPets = new ArrayList();
    paolasPets.add(paola);

    HashMap<String, List<Pet>> petList = new HashMap<>();
    petList.put("paola@email.com", paolasPets);
    petList.put("alberto@email.com", albertosPets);

    for (List<Pet> pets : petList.values()) {
      for (Pet pet : pets) {
        System.out.println(pet.getName());
      }
    }
  }
}
