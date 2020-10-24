package HomeWork1;

public class HomeWork1 {
    public static void main(String[] args) {
        Human human = new Human("runing","jumping");
        Robot robot = new Robot("runing","not jumping");
        Cat cat = new Cat("runing","jumping");



        human.runTreadmill();
        human.jumpOverWall();



        robot.runTreadmill();
        robot.jumpOverWall();

        cat.runTreadmill();
        cat.jumpOverWall();


    }
}
