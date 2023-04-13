import java.util.Scanner;
 class Example1 {
  Scanner s=new Scanner(System.in);
  Student std=new Student();
  public void setStudentDetails() {
          System.out.println("Enter student id");
          std.setStudent_id(s.nextInt());
    System.out.println("Enter Student name");
    std.setSname(s.next());
          System.out.println("Enter email id");
          std.setEmail(s.next());
          System.out.println("Enter city");
          std.setCity(s.next());
          System.out.println("Enter mobile");
          std.setMobile(s.nextLong());
        }
  public void getStudentDetails() {
          System.out.println("Student id: "+std.getStudent_id());
          System.out.println("Student name: "+std.getSname());
          System.out.println("Student email: "+std.getEmail());
          System.out.println("Student city: "+std.getCity());
          System.out.println("Student mobile: "+std.getMobile());
        }
  public static void main(String args[]) {
      Example1 obj=new Example1();
      obj.setStudentDetails();
      obj.getStudentDetails();
    }
}

class Student {
  private int student_id;
               private String sname, email, city;
               private long mobile;
               public int getStudent_id() {
      return student_id;
    }
               public void setStudent_id(int student_id) {
      this.student_id = student_id;
    }
               public String getSname() {
      return sname;
    }
               public void setSname(String sname) {
      this.sname = sname;
    }
               public String getEmail() {
      return email;
    }
               public void setEmail(String email) {
      this.email = email;
    }
               public String getCity() {
      return city;
    }
               public void setCity(String city) {
      this.city = city;
    }
               public long getMobile() {
                 return mobile;
               }
               public void setMobile(long mobile) {
      this.mobile = mobile;
    }
              }
