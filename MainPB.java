package HomeWork3;

public class MainPB {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Claudia", 457654907);
        phoneBook.add("Stefinia", 911674532);
        phoneBook.add("Casimir", 380675433);
        phoneBook.add("Casimir", 455555732);

        //Full list
        System.out.println("The telephone directory contains: " +phoneBook.phoneBook1);

        // search by name
        phoneBook.get("Casimir");

    }
}
