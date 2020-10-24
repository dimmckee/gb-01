package HomeWork1;

public class Robot implements Treadmill,Wall {
    public String runSkill;
    public String jumpSkill;

    public Robot(String runSkill,String jumpSkill){
        this.runSkill = runSkill;
        this.jumpSkill = jumpSkill;
    }


    public void runTreadmill() {
        System.out.println("Robot is "+this.runSkill +" on a treadmill");
    }
    public void jumpOverWall() {
        System.out.println("Robot is " +this.jumpSkill + " over the wall");
    }




}
