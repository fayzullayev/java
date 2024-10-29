package employee;

public class Employee {
    int id;
    String surName;
    int age;
    double salary;
    String department;

    Employee(int id2, String surname2, int age2) {
        id = id2;
        surName = surname2;
        age = age2;
    }

    Employee(String surname2, int age2) {
        surName = surname2;
        age = age2;
    }

    Employee(int id2, String surname2, int age2, String department2) {
        id = id2;
        surName = surname2;
        age = age2;
        department = department2;

    }


}


class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "Mirodil", 25, "IBDS");

        System.out.println(emp.id);
        System.out.println(emp.surName);
        System.out.println(emp.age);
        System.out.println(emp.salary);
        System.out.println(emp.department);

    }
}