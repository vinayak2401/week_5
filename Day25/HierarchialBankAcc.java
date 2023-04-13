/*Create a class called BankAccount with attributes balance and interest_rate. Create two subclasses, CheckingAccount and SavingsAccount, that both inherit from BankAccount. Add an attribute transaction_fee to CheckingAccount and an attribute min_balance to SavingsAccount. Create a method in CheckingAccount called withdraw() that subtracts an amount from the balance and also subtracts the transaction fee. Create a method in SavingsAccount called add_interest() that adds interest to the balance.*/
import java.util.Scanner;
class BankAccount{
  double balance=10000;
  double interestRate=5.0;
}
class CheckingAccount extends BankAccount{
  Scanner s=new Scanner(System.in);
  int transaction_fees;
  void withDraw(){
    System.out.println("enter amount to withdraw");
    int amount=s.nextInt();
    balance=balance-amount-transaction_fees;
   System.out.println("The account balance is "+balance);
  }
}

class SavingsAccount extends BankAccount{
  int minBalance=500;
  void add_interest(){
    double interest=balance*interestRate/100;
    balance=balance+interest;
    System.out.println("After adding interest balance is "+balance);
  }
}

class BankDetails{
  public static void main(String args[]){
    CheckingAccount check=new CheckingAccount();
    check.withDraw();
    SavingsAccount save=new SavingsAccount();
    save.add_interest();
  }
}