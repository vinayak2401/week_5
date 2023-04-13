class CarDemo {
  String make;
  String model;
  int year;

  CarDemo() {
    make = "TATA";
    model = "Nexon";
    year = 2010;
  }

  void display() {
    System.out.println("Make: " + make);
    System.out.println("Model: " + model);
    System.out.println("Year: " + year);
  }
}

class Car {
  public static void main(String args[]) {
    CarDemo obj = new CarDemo();
    obj.display();
  }
}