package lesson5;

public class Main {

    public static void main(String[] args) {
// 1.
        Employee e = new Employee("Dimitriy", "Andreevich",
                "Carrol", "8(951)078-91-29",
                "developer", 83000, "friend@gmail.com", 1997);

// 3. Вывести при помощи методов ....
        System.out.println(" Welcome " + e.getPosition() + ", " +
                e.getSecondName() + " " + e.getName() + " " + e.getSurname() + ", " + e.getPhone() +
                ", " + e.getSalary() + ", " + e.getSalary() + ", " + e.getemail() + ", " + e.getAge() + ".");


// 4. Создать массив из 5 сотрудников.


        Employee[] employees = {
                e,
                new Employee("Ann", "Antonovna",
                        "Duff", "8(495)678-92-33",
                        "assistant", 48000, "ololo@gmail.com", 1989),
                new Employee("Irene", "Viktorovna",
                        "Dubilyachka", "8(911)678-37-24",
                        "marketing manager", 84000, "kykyshka@mail.ru", 1979),
                new Employee("Anton", "Pavlov",
                        "Chehov", "8(921)793-34-05",
                        "director", 90000, "dir@yahoo.com", 1989),
                new Employee("Andrew", "Nikolaevich",
                        "Dyb", "8(789)444-95-13",
                        "accountant", 60000, "dyb@mail.ua", 1970)
        };
// 5.
        System.out.println("Employees over 40:");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40)
                System.out.println(employees[i].getFullInfo());
        }


        System.out.println("-------Full-------------------------------------------------");
        for (int i = 0; i < employees.length; i++)
            System.out.println(employees[i].getFullInfo());

    }
    }
