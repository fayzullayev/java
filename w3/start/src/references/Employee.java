package references;

class Employee {
    String name;
    double salary;


    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    double doubleNumber(double a) {
        a *= 2;
        return a;
    }

    void doubleSalary() {
        this.salary *= 2;
    }
}


class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", 100.55);
        System.out.println(emp1.salary);
        emp1.doubleSalary();
        System.out.println(emp1.salary);
    }
}