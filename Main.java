package J3.HomeWork_1;

public class Main {

    public static void main(String[] args) {

        // Task 1

        GenericClass<String> carsBrands = new GenericClass<String>(new String[]{"BMW", "Mercedes"});
        GenericClass<Integer> carsAges = new GenericClass<Integer>(new Integer[]{2, 1});
        GenericClass<Double> carsEngineVolume = new GenericClass<Double>(new Double[]{4.4, 6.0});

        System.out.println("\nType of the array:");
        carsBrands.showType();
        carsAges.showType();
        carsEngineVolume.showType();

        System.out.println("\nCreate a list of arrays with original item positions");
        carsBrands.createArrayList();
        carsAges.createArrayList();
        carsEngineVolume.createArrayList();


        System.out.println("\nCreate the array with new positions of elements");
        carsBrands.changePositionOfElementsInArray();
        carsAges.changePositionOfElementsInArray();
        carsEngineVolume.changePositionOfElementsInArray();

        // Task 2

        Box<Apple> appleBox = new Box<>();
        Apple a1 = new Apple();
        Apple a2 = new Apple();
        Apple a3 = new Apple();

        appleBox.addFruit(a1);
        appleBox.addFruit(a2);
        appleBox.addFruit(a3);


        System.out.println("\nThe total weight of the apple box is " + appleBox.getTotalWeight());


        Box<Orange> orangeBox = new Box<>();
        Orange o1 = new Orange();
        Orange o2 = new Orange();
        Orange o3 = new Orange();

        orangeBox.addFruit(o1);
        orangeBox.addFruit(o2);
        orangeBox.addFruit(o3);

        System.out.println("The total weight of the orange box is " + orangeBox.getTotalWeight());

        System.out.println("Comparison of boxes " + appleBox.compare(orangeBox));

        Box<Apple> newAppleBox = new Box<>();
        appleBox.replaceAllFruitsToOtherBox(newAppleBox);

        Apple a4 = new Apple();
        newAppleBox.addFruit(a4);
        System.out.println("The total weight of the new apple box is " + newAppleBox.getTotalWeight());
    }
}

