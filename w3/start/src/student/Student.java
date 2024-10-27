package student;

public class Student {
  int studentId;
  String name;
  String surName;
  int course;
  double mathAverageGrade;
  double economicsAverageGrade;
  double foreignLanguageAverageGrade;

  double averageGrade() {
    return (mathAverageGrade + economicsAverageGrade + foreignLanguageAverageGrade + summa(1, 2, 3))
        / 3;
  }

  int summa(int a, int b, int c) {
    int sum = a + b + c;
    return sum;
  }
}

class StudentTest {
  public static void main(String[] args) {
    Student s1 = new Student();

    System.out.println(s1.studentId);
    System.out.println(s1.name);
    System.out.println(s1.surName);
    System.out.println(s1.course);
    System.out.println(s1.mathAverageGrade);
    System.out.println(s1.economicsAverageGrade);
    System.out.println(s1.foreignLanguageAverageGrade);

    System.out.println("----------------------");
    s1.studentId = 1;
    s1.name = "John Doe";
    s1.surName = "John Doe";
    s1.course = 1;
    s1.mathAverageGrade = 3;
    s1.economicsAverageGrade = 4;
    s1.foreignLanguageAverageGrade = 5;
    System.out.println(s1.averageGrade());
  }
}
