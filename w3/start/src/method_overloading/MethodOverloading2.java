package method_overloading;

public class MethodOverloading2 {

  public int sum(int a, int b) {
    return a + b;
  }

  protected String sum(int a, short b) {
    return a + " " + b;
  }
}
