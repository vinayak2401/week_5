import java.util.Scanner;

class CarDemo {
  int model;
  int year;
  String colour;

  CarDemo() {

    Scanner s = new Scanner(System.in);
    model = s.nextInt();
    year = s.nextInt();
    colour = s.next();
  }

  void display() {
    System.out.println(model + " " + year + " " + colour);
  }
}

class Car {

  public static void main(String[] args) {
    CarDemo obj = new CarDemo();
    obj.display();
  }

}