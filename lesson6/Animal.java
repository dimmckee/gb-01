package lesson6;

public abstract class Animal {
    protected String name;

    public abstract void jump(int distance);
    public abstract void run(int length);
    public abstract void swim(int lengthSwim);

@Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
   }
}
