package lesson7;

public class KittyCat {
    private String name;
    private int appetite;
    private boolean satiety;

    KittyCat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }

    private String getName() {
        return name;
    }

    private int getAppetite() {
        return appetite;
    }

    private boolean isSatiety() {
        return satiety;
    }

    void info() {
        System.out.printf("\nCat %s is hungry %d%% \n", getName(), getAppetite());
        System.out.printf("Cat %s %s", getName(), isSatiety() ?
                "finished eating.\n" : "not enough food\n");
    }

    void eat(Bowl x) {
        if (!isSatiety() && x.counterFood(getAppetite())) {
            satiety = true;
        }
    }
}
