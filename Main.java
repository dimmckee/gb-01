package J3.HomeWork_04;

public class Main {
        public static void main(String[] args) {
            ABC();
        }

        public static void ABC() {
            ABC t = new ABC();
            new Thread(() -> t.printA()).start();
            new Thread(() -> t.printB()).start();
            new Thread(() -> t.printC()).start();
        }
}
