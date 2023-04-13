/*
Create a class called Vehicle with attributes make and model. Create a subclass called Car that inherits from Vehicle and adds an attribute num_doors. Create a subclass called SportsCar that inherits from Car and adds an attribute top_speed. Create a method in SportsCar called rev_engine() that prints out "Vroom!".*/
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

class SportsCar extends Car {
  int top_speed;

  void rev_engine() {
    System.out.println("Vrooommmm....");
  }
}

class InheritanceCar {
  public static void main(String args[]) {
    SportsCar obj = new SportsCar();
    obj.make = "Tata";
    obj.model = "Nexon";
    obj.year = 2001;
    obj.colour = "Gold";
    obj.num_doors = 4;
    obj.top_speed = 140;
    obj.get_info();
    obj.rev_engine();
  }
}
