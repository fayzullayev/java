package human;

import car.Car;
import bank_account.BankAccount;

public class Human {
  public String name;
  public Car car;
  public BankAccount bankAccount;

  public Human(String name, Car car, BankAccount bankAccount) {
    this.name = name;
    this.car = car;
    this.bankAccount = bankAccount;
  }

  public void info() {
    System.out.println(
        "Name: " + name + "\nCar color: " + car.color + "\nBalance: " + bankAccount.balance);
  }
}
