

class StudentDemo {
  String name;
  int rollno;
  String branch;

  StudentDemo(String n,int r,String b) {

    name=n;
    rollno=r;
    branch=b;
    
  }

  void display() {
    System.out.println(name + " " + rollno + " " + branch);
  }
}

class Student {

  public static void main(String[] args) {
    StudentDemo obj = new StudentDemo("Vinayak",001,"ECE");
    obj.display();
  }

}