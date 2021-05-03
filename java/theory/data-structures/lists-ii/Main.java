import java.util.List;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    List<Contact> contactList = new ArrayList<>();
    Contact luisPintado = new Contact("Luis Pintado", 6762);
    Contact borjaIglesias = new Contact("Borja Iglesias", 6682);
    Contact me = new Contact("Yo", 1000);
    contactList.add(luisPintado);
    contactList.add(borjaIglesias);
    contactList.add(me);

    for (Contact contact : contactList) {
      System.out.println(contact.getName());
    }
  }
}
