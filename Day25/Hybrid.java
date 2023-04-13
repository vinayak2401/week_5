/*Create a class called Person with attributes name and age. Create a subclass called Employee that inherits from Person and adds attributes salary and position. Create two subclasses, Manager and Engineer, that both inherit from Employee. Add an attribute num_reports to Manager and an attribute specialization to Engineer. Create a method in Manager called hire_employee() that increments the num_reports attribute. Create a method in Engineer called solve_problem() that prints out "Problem solved!".*/
class Person {
  String name = "Vinayak";
  int age = 23;
}

class Employee extends Person {
  long salary = 15000;
  String position = "Technical Lead";
}

class Manager extends Employee {
  int num_reports = 5;

  void hire_employee() {
    num_reports++;
  }
}

class Engineer extends Employee {
  String specialization;

  void solve_problem() {
    System.out.println("Problem solved");
  }
}

class Hybrid {
  public static void main(String args[]) {
    Engineer obj = new Engineer();

    obj.solve_problem();
  }
}