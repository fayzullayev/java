package references;

class Student {
  String name;
  int course;
  double grade;

  Student(String name, int course, double grade) {
    this.name = name;
    this.course = course;
    this.grade = grade;
  }

  public static void swap(Student a, Student b) {
    Student temp = a;
    a = b;
    b = temp;
  }

  public static void changeName(Student s) {
    int t = "Mirodil".length() > 5 ? 0 : 1;
  }

  public static void main(String[] args) {
    Student a = new Student("John Doe", 3, 9.5);

    System.out.println(a.name);

    Student.changeName(a);

    System.out.println(a.name);
  }
}
