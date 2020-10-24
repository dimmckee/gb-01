package HomeWork1;

public class Human implements Treadmill,Wall {
        public String runSkill;
        public String jumpSkill;

        public Human(String runSkill,String jumpSkill){
            this.runSkill = runSkill;
            this.jumpSkill = jumpSkill;
        }


    public void runTreadmill() {
        System.out.println("Human is  "+this.runSkill + " on a treadmill");
    }
    public void jumpOverWall() {
        System.out.println("Human is " +this.jumpSkill +" over the wall");
    }


}


