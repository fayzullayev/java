package switchs;

public class Test {
}

class Student {
    double grade;

    Student(double grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student s1 = new Student(99);

        switch ((int) s1.grade) {
            case 1:
                System.out.println(s1.grade);
                break;
            case 2:
                System.out.println(s1.grade);
                break;
            case 3:
                System.out.println(s1.grade);
                break;
            default:
                System.out.println(0);

        }

        if (s1.grade == 2) {
            System.out.println("Ikkichi");
        } else if (s1.grade == 3) {
            System.out.println("Uchchi");
        } else if (s1.grade == 4) {
            System.out.println("Bo'ladi");
        } else if (s1.grade == 5) {
            System.out.println("Yaxshi");
        } else {
            System.out.println("neto");
        }
    }

}
