class Vehicle {
  String make, model;
  int year;
}

class Car extends Vehicle {
  String colour;
  int num_doors;

  void get_info() {
    System.out.println("Make:" + make);
    System.out.println("Model:" + model);
    System.out.println("Year:" + year);
    System.out.println("Colour:" + colour);
    System.out.println("No of doors:" + num_doors);
  }
}

class InheritanceCar {
  public static void main(String args[]) {
    Car obj = new Car();
    obj.make = "Tata";
    obj.model = "Nexon";
    obj.year = 2001;
    obj.colour = "Gold";
    obj.num_doors = 4;
    obj.get_info();
  }
}