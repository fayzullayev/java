package employee;

public class Employee {
    int id;
    public String surname;
    private double salary;


    public void showId() {
        System.out.println(id);
    }

    public void showSurname() {
        System.out.println(surname);
    }

    public void showSalary() {
        System.out.println(salary);
    }

    Employee(int id) {
        this.id = id;
    }

    private Employee(String surname) {
        this.surname = surname;
    }

    public Employee(double salary) {
        this.salary = salary;
    }
}
