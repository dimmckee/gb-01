package HomeWork3;

import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {
    HashMap<String, HashSet<Integer>> phoneBook1;

    PhoneBook() {
        this.phoneBook1 = new HashMap<>();
    }

    void add(String name, int number) {
        HashSet<Integer> phoneBook = phoneBook1.getOrDefault(name, new HashSet<>());
        phoneBook.add(number);

        phoneBook1.put(name, phoneBook);
    }

    void get(String name) {

        System.out.println("Contact "+name+": "+ phoneBook1.getOrDefault(name, new HashSet<>()));
    }

}
