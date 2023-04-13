/*
Create a base class Teacher and a sub class ComputerTeacher.
     class ComputerTeacher extends the designation and collegename properties and work() method from base Teacher class,
     you need not declare these properties and method in ComputerTeacher sub class .
     Try accessing these properties using child class object in Main method.
     Sample Output:
     Designation       CollegeName
     ComputerTeacher      IIT

*/

class Teacher {
  String designation;
  String college_name;
}

class ComputerTeacher extends Teacher {

  void work() {
    System.out.println("Designation:" + designation);
    System.out.println("College name:" + college_name);
  }
}

class Main {
  public static void main(String args[]) {
    ComputerTeacher obj = new ComputerTeacher();
    obj.designation = "Computer Teacher";
    obj.college_name = "IIT";
    obj.work();
  }
}