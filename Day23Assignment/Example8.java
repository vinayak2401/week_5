import java.util.Scanner;
class Loan{
  Scanner s=new Scanner(System.in);
  double loanAmount;
  double interestRate;
  int timePeriod;
  Loan(double loanAmount,double interestRate){
    this.loanAmount=loanAmount;
    this.interestRate=interestRate;
  }

  void paymentPeriod(){
    System.out.println("Enter amount how much you are going to pay Monthly");
    int emi=s.nextInt();
    int count=0;
    double interest=loanAmount*interestRate/100;
    loanAmount=loanAmount+interest;
    while(loanAmount>0){
      loanAmount=loanAmount-emi;
      count=count+1;
    }
    timePeriod=count;
    System.out.println("The time period required for your loan amount is "+timePeriod+" Months.");
  }
}
    class BankLoan{
        public static void main(String args[]){
          Scanner s=new Scanner(System.in);
          System.out.println("enter the Loan Amount");
          double loanAmount=s.nextInt();
          System.out.println("enter the Interest Rate");
          double interestRate=s.nextDouble();
          Loan obj=new Loan(loanAmount,interestRate);
          obj.paymentPeriod();
        }
    }