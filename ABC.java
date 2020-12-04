package J3.HomeWork_04;

public class ABC {
    private final Object obj = new Object();
    private volatile char letter = 'A';

    public void printA() {
        synchronized (obj) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (letter != 'A')
                        obj.wait();
                    System.out.print("A");
                    letter = 'B';
                    obj.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printB() {
        synchronized (obj) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (letter != 'B')
                        obj.wait();
                    System.out.print("B");
                    letter = 'C';
                    obj.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printC() {
        synchronized (obj) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (letter != 'C')
                        obj.wait();
                    System.out.print("C");
                    letter = 'A';
                    obj.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
