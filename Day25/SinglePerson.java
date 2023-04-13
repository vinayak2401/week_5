import java.util.Scanner;

class Person {
  String name;
  String gender;
  int age;
  String address;

}

class Student extends Person {
  Scanner s = new Scanner(System.in);
  int id;
  int total = 0;

  float avg = 0;
  double percent = 0;

  void display() {
    System.out.println("Name: " + name);
    System.out.println("Gender: " + gender);
    System.out.println("Age: " + age);
    System.out.println("Id: " + id);
    isaddress();
    System.out.println("Enter sub1,sub2,sub3 marks");
    int sub1 = s.nextInt();
    int sub2 = s.nextInt();
    int sub3 = s.nextInt();
    total = sub1 + sub2 + sub3;
    avg = total / 3;
    percent = avg / 100 * 100;

    System.out.println("Total is: " + total);
    System.out.println("Average is: " + avg);
    System.out.println("Percentage is: " + percent + "%");
  }

  void isaddress() {
    System.out.println("Address is: Karnataka");
  }
}

public class InheritancePerson {
  public static void main(String args[]) {
    Student obj = new Student();
    obj.name = "Vinayak";
    obj.gender = "Male";
    obj.age = 23;
    obj.id = 1;
    obj.isaddress();

    obj.display();

  }
}
