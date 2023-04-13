
import java.util.Scanner;

class PersonDemo {

  String name;
  int age;
  String gender;

  PersonDemo() {
    this.name = "Vinayak";
    this.age = 22;
    this.gender = "Male";
    display();

  }

  void birthYear() {
    Scanner s = new Scanner(System.in);
    System.out.println("Want to know your Birth year?? (Press 1 for 'Yes' or 2 for 'No')");
    int check = s.nextInt();
    if (check == 1) {
      int give = 2023 - age;
      System.out.println("Your Birth year is: " + give);

    } else {
      System.out.println("Thank you!!");

    }
  }

  void display() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Gender: " + gender);
    birthYear();
  }
}

class Person {
  public static void main(String args[]) {
    PersonDemo obj = new PersonDemo();
    obj.display();
  }
}