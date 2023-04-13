import java.util.Scanner;
class Circle
{
  int radius,diameter;

  Circle(int r){
    radius=r;
    diameter=2*r;
  }
  void area()
  {
    System.out.println("The diameter of the circle is "+diameter);
    double area=3.14*radius*radius;
    System.out.println("Area of the circle is:"+area);
  }
  
}
class CircleProg{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the radius of the circle");
    Circle r=new Circle(sc.nextInt());
    
   
    r.area();
}
}