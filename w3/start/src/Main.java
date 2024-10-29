// https://www.w3schools.com/java/java_data_types_characters.asp

// time 6th lesson 35:26

import bank_account.BankAccount;
import car.Car;
import math.Math;
import human.Human;
import method_overloading.*;

import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    MethodOverloading2 m = new MethodOverloading2();

    var uu = m.sum(1, 2);
    System.out.println("uu = " + uu);

    var ss = m.sum("mirodil", "fayzullayev");
    System.out.println("ss = " + ss);
    ;
  }
}
