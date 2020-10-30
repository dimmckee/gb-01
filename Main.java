package HomeWork3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Raspberry");
        fruits.add("Tangerine");
        fruits.add("Grapefruit");
        fruits.add("Avocado");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Plum");
        fruits.add("Watermelon");
        fruits.add("Tangerine");
        fruits.add("Lime");
        fruits.add("Watermelon");
        fruits.add("Kiwi");
        fruits.add("Tangerine");
        fruits.add("Mango");
        fruits.add("Plum");
        fruits.add("Orange");
        fruits.add("Kiwi");
        fruits.add("Peach");
        fruits.add("Orange");

        System.out.println("The complete collection of fruits is: "+fruits+"\n");

        Set<String> stringSet = new LinkedHashSet<>(fruits);
        System.out.println("Exclusive fruit is: "+stringSet+"\n");

        HashMap<String, Integer> doubleFruits = new HashMap<>();
        Integer doubleFruit;
        for (String i : fruits) {

            doubleFruit = doubleFruits.get(i);
            doubleFruits.put(i, doubleFruit == null ? 1 : doubleFruit + 1);
        }

        System.out.println(doubleFruits);
    }
}
