package method_overloading;

public class MethodOverloading {

  public void show(int i1) {
    System.out.println("i1: " + i1);
  }

  public void show(int i1, int i2) {
    System.out.println("i1: " + i1);
    System.out.println("i2: " + i2);
  }

  public void show(double i1) {
    System.out.println("i1: " + i1);
  }

  public void show(boolean i1) {
    System.out.println("i1: " + i1);
  }

  public void show(String s1, int i1) {
    System.out.println("string: " + s1 + " int: " + i1);
  }

  public void show(int i1, String i2) {
    System.out.println("Hello");
  }
}
