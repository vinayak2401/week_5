/*Create a class called Vehicle with attributes make and model. Create two subclasses, Car and Truck, that both inherit from Vehicle. Add an attribute num_doors to Car and an attribute payload_capacity to Truck. Create a method in Car called rev_engine() that prints out "Vroom!". Create a method in Truck called load_payload() that adds weight to the payload capacity.*/

class Vehicle {
  String make, model;
  int year;
}

class Car extends Vehicle {
  String colour;
  int num_doors;

  void rev_engine() {
    System.out.println("Vrooommmm....");
  }

  void get_info() {
    System.out.println("Make:" + make);
    System.out.println("Model:" + model);
    System.out.println("Year:" + year);
    System.out.println("Colour:" + colour);
    System.out.println("No of doors:" + num_doors);
  }
}

class Truck extends Vehicle {
  int pay_load_capacity;

  void load_payload() {
    int load = 100;
    System.out.println(pay_load_capacity = load);
  }
}

class InheritanceVehicle {
  public static void main(String args[]) {
    Truck obj = new Truck();
    obj.load_payload();
  }
}