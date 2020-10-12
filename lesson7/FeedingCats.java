package lesson7;

public class FeedingCats {
    public static void main(String[] args) {
        KittyCat[] cats = {
                new KittyCat("Nash", 15),
                new KittyCat("Ohman", 48),
                new KittyCat("Christina", 80),
        };

        System.out.println("The cats are hungry");
        Bowl Bowl = new Bowl(95);

        for (KittyCat KittyCat : cats) {
            Bowl.info();
            KittyCat.eat(Bowl);
            KittyCat.info();
        }
        Bowl.addFood(25);
        Bowl.info();
        System.out.println();
    }
}
