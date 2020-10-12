package lesson7;

public class Bowl {
    private int food;

    Bowl(int food) {
        this.food = food;
    }

    public boolean counterFood(int i) {
        int delta = food - i;
        if (delta < 0) {
            return false;
        }
        food -= i;
        return true;
    }

    public void info() {
        System.out.printf("\nThe plate contains %d%%. food", food);
    }

    public void addFood(int add) {
        System.out.printf("\nRefilling food on the plate +  %d%%.", add);
        food += add;
    }
}
