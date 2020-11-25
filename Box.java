package J3.HomeWork_1;

import java.util.ArrayList;

public class Box <T extends Fruit>{

        private ArrayList<T> fruits;
        private float totalWeight;

        public Box() {
            fruits = new ArrayList<>();
        }

        public Box(ArrayList<T> fruits) {
            this.fruits = fruits;
        }

        public Box(T fruit) {
            fruits = new ArrayList<>();
            fruits.add(fruit);

        }

        public ArrayList<T> getFruits() {
            return fruits;
        }

        public void setFruits(ArrayList<T> fruits) {
            this.fruits = fruits;
        }


        public float getTotalWeight() {
            if (fruits.size() != 0) {
                int i = 0;
                totalWeight = fruits.size() * fruits.get(i).getWeight();
            } else {
                System.out.println("Fruit box empty ");
            }
            return totalWeight;
        }

        public boolean compare(Box<?> otherBox) {
            return getTotalWeight() == otherBox.getTotalWeight();
        }
        public void replaceAllFruitsToOtherBox(Box<T> otherBox) {
            otherBox.fruits.addAll(fruits);
            fruits.clear();
        }

        public void addFruit(T fruitToAdd) {
            fruits.add(fruitToAdd);
        }
    }

