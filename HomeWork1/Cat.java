package HomeWork1;

public class Cat implements Treadmill,Wall{

    public String runSkill;
    public String jumpSkill;

    public Cat(String runSkill,String jumpSkill){
        this.runSkill = runSkill;
        this.jumpSkill = jumpSkill;
    }


    public void runTreadmill() {
        System.out.println("Cat is "+this.runSkill +" on a treadmill");
    }
    public void jumpOverWall() {
        System.out.println("Cat is " +this.jumpSkill +" over the wall");
    }



}
