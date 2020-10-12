package lesson1;

public class homework {
        public static void main(String[] args) {

            System.out.println("Task 2. \n");

            byte b1 = 120;
            short s1 = 267;
            int i1 = 4579;
            long l1 = 7546L;
            float h1 = 8.67f;
            double d1 = 7.567890;
            char c1 = 'C';

            System.out.println("Значение инициализированных переменных:");
            System.out.println("byte b1 = " + b1 + ";\n" + "short s1 = " + s1 + ";");
            System.out.println("int i1 = " + i1 + ";\n" + "long l1 = " + l1 + ";\n");
            System.out.println("float h1 = " + h1 + ";\n" + "double d1 = " + d1 + ";\n");
            System.out.println("char c1 = " + c1 + ";\n");
        }

        // Задание 3
        static float calculate( float a, float b, float c, float d,){
            System.out.println("/n Task 3.");
            return a * (b + (c / d));
        }
        // Задание 4
        public static boolean task10and20(int x1, int x2) {
            int inputAB ( int x1, int x2){
                int sum = x1 + x2;
                if (sum >= 10 && sum <= 20) {
                    return true;
                } else {
                    return false;
                }

            }
        }
        // Задание 5
        public static void isPositiveOrNegative(int x) {
            if (x >= 0) {
                System.out.println("Число " + x + " Положительное");
            } else {
                System.out.println("Число " + x + " Отрицательное");
            }
        }
        // Задание 6

        public static boolean isNegative(int x) {
            if (x < 0) {
                return true;
            } else {
                return false;
            }
        }
        // Задание 7
        public static void greetings(String name) {
            System.out.println("Привет, " + name + " !");
        }
    }



