package bank_account;

public class BankAccount {

  public int id;
  public String name;
  public double balance;
  public char c;

  public BankAccount(int id, String name, double balance) {
    this.id = id;
    this.name = name;
    this.balance = balance;
  }

  public BankAccount(double balance) {
    this.balance = balance;
  }

  BankAccount() {}
}
