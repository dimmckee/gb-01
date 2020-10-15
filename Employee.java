package lesson5;

public class Employee {
        private static final int CURRENT_YEAR = 2020;

        private String surname;
        private String secondName;
        private String name;
        private String position;
        private String phone;
        private float salary;
        private String email;

        private int birthYear;

        // 2. Конструктор класса должен заполнять эти поля при создании объекта;
        Employee (String name,
                  String secondName,
                  String surname,
                  String phone,
                  String position,
                  float salary,
                  String email,
                  int birthYear) {
            this.birthYear = birthYear;
            this.name = name;
            this.surname = surname;
            this.secondName = secondName;
            this.position = position;
            this.phone = phone;
            this.salary = salary;
            this.email = email;
        }

        // 3. Внутри класса «Сотрудник» написать метод...
        int getAge() {
            return CURRENT_YEAR - birthYear;
        }

        int getSalary() {
            return (int)salary;
        }


        String getSecondName() {
            return secondName;
        }

        String getName() {
            return name;
        }

        String getSurname() {
            return surname;
        }

        String getPosition() {
            return position;
        }

        String getPhone() {
            return phone;
        }

        String getemail() {
            return email;
        }


        String getFullInfo() {
             return this.name + " " +
                    this.secondName + " " +
                    this.surname + ", " +
                    this.getAge() + " years old, " +
                    this.position + ". Email: " +
                    this.email + ". Phone number: " +
                    this.phone + ". Salary is " +
                    this.getSalary() + " RUB.";
        }

}




