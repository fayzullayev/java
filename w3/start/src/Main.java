// https://www.w3schools.com/java/java_data_types_characters.asp

// time 4 th lesson 31:37

import bank_account.BankAccount;

class Main {

  public static void main(String[] args) {
    BankAccount ba = new BankAccount(1, "Mirodil", 66.66);
    System.out.println(ba);

    BankAccount ba2 = ba;
    System.out.println(ba2);
  }
}
