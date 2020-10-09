package lesson6;

public class Cat extends Animal {
    private int maxDistance = 2;
    private int maxLength = 200;

    @Override
    public void jump(int distance) {
        boolean isJump = distance <= maxDistance;
        System.out.println("Result jump: " + isJump);
    }
        @Override
        public void run(int length){
            boolean isRun = length<= maxLength;
            System.out.println("Result length: " + isRun);
    }
    @Override
    public void swim(double distance) {
        System.out.println("Cats can't swim");
    }

    @Override
    public String toString(){
        return "Cat{" +
                "maxDistance=" + maxDistance +
                "maxLength=" + maxLength +
                 "name='" + name + '\'' +
                '}';
    }
}
