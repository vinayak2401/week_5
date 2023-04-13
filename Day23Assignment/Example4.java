import java.util.Scanner;

class BankDemo {
  int balance;
  int acc_number;

  BankDemo() {
    balance = 0;
    acc_number = 1202242901;
  }

  void display() {
    System.out.println("Hello user");
    System.out.println("Acc-no: " + acc_number);
    veiwOptions();
  }

  void veiwOptions() {
    Scanner s = new Scanner(System.in);
    System.out.println("1.Display Balance");
    System.out.println("2.Deposit");
    System.out.println("3.Cash withdrawl");
    System.out.println("0.Exit");
    System.out.println("Choose your option");
    int option = s.nextInt();
    switch (option) {
      case 1: {
        displayBal();
        break;
      }
      case 2: {
        deposit();
        break;
      }
      case 3: {
        cash();
        break;
      }
      case 0: {
        System.out.println("Thank you!!!");
        break;
      }
    }
  }

  void displayBal() {
    System.out.println("Account balance is:" + balance);
    veiwOptions();
  }

  void deposit() {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter amount to deposit");
    int take = s.nextInt();
    balance = balance + take;
    System.out.println("Account balance is:" + balance);
    veiwOptions();
  }

  void cash() {
    Scanner s = new Scanner(System.in);
    if (balance > 500) {
      System.out.println("Enter amount to withdraw:");
      int amount = s.nextInt();
      if(amount>100){
      int five = amount / 500;
      amount = amount % 500;
      int two = amount / 200;
      amount = amount % 200;
      int one = amount / 100;
      amount = amount % 100;
      System.out.println("Minimum number of notes:");
      int sum = five + two + one;
      System.out.println(sum);
      System.out.println("500 notes: " + five);
      System.out.println("200 notes: " + two);
      System.out.println("100 notes: " + one);
      }else{
        System.out.println("Enter only multiples of 100");
      }
    } else {
      System.out.println("Insufficient funds!!!");
    }
    veiwOptions();

  }
}

class BankAccount {
  public static void main(String args[]) {
    BankDemo obj = new BankDemo();
    obj.display();
  }
}