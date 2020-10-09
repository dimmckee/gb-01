package lesson6;

public abstract class Animal {
    protected String name;

    public abstract void jump(int distance);
    public abstract void run(int length);
    public abstract void swim(double lengthSwim);

@Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
   }
}
