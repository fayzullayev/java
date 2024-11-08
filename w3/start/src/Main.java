// https://www.w3schools.com/java/java_data_types_characters.asp

// time 12th 30:12;

import car.Car;

class Main {

  static void maximum(int a, int b, int c) {
    String str;
    if (a > b && a > c) {
      System.out.println(a + " is greater than b and c");
    } else if (b > a && b > c) {
      System.out.println(b + " is greater than a and c");
    } else if (c > a && b < c) {
      System.out.println(c + " is greater than b and a");
    } else {
      System.out.println("Teng");
    }
    str = "ddd";
    System.out.println(str);
  }

  public static void main(String[] args) {
    String max = (4 > 5) ? "qwertyu" : "uytrewq";

    System.out.println(max);
  }
}
