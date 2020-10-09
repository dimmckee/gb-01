package lesson6;

public class Dog extends Animal{
    private int maxDistance = 1;
    private int maxLength = 250;
    private int maxLengthSwim = 10;


    @Override
    public void jump(int distance){
        boolean isJump = distance<= maxDistance;
        System.out.println("Result jump: " + isJump);
    }
    @Override
    public void run(int length) {
        boolean isRun = length <= maxLength;
        System.out.println("Result length: " + isRun);
    }
        @Override
        public void swim(int lengthSwim) {
            boolean isSwim = lengthSwim <= maxLengthSwim;
            System.out.println("Result lengthSwim: " + isSwim);
    }
    @Override
    public String toString(){
        return "Dog{" +
                "maxDistance=" + maxDistance +
                "maxLength=" + maxLength +
                "maxLengthSwim=" + maxLengthSwim +
                "name='" + name + '\'' +
                '}';
    }
}


